package TCs;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.Iterator;

public class JSONReaderAssignmentFile {

    public static void main(String[] args) {
        try {
            String filePath = "C:\\Users\\harip\\eclipse-workspace\\QA_Practice\\QA_JSON_Data\\data.json";
            ObjectMapper objectMapper = new ObjectMapper();

           
            JsonNode rootNode = objectMapper.readTree(new File(filePath));

//            String storeNameToSearch = "Store1";
            String productCodeToSearch = "Prod1";

            Iterator<JsonNode> storesIterator = rootNode.elements();
            while (storesIterator.hasNext()) {
                JsonNode storeNode = storesIterator.next();

                JsonNode productsNode = storeNode.get("products");
                if (productsNode.isArray()) {
                    Iterator<JsonNode> productsIterator = productsNode.elements();
                    while (productsIterator.hasNext()) {
                        JsonNode productNode = productsIterator.next();

                        String productCode = productNode.get("code").asText();

                        if (productCode.equals(productCodeToSearch)) {
                            displayDetails( productCode,
                                    productNode.get("sellingPrice").asDouble());
                            displayStockdetails(productCode, productNode.get("stockCount").asDouble());
                            return;
                        }
                    }
                }
            }
          
            System.out.println("No suhc code");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void displayDetails(String productCode, double sellingPrice) {
//       
        System.out.println("Product Code: " + productCode);
        System.out.println("Selling Price: " + sellingPrice);
      
    }

       private static void displayStockdetails(String productCode,double stockCount) {
//    	System.out.println("Product Code:"+ productCode);
    	System.out.println("Stock count:"+ stockCount);
    }
}
