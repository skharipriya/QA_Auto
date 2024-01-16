package TCs;

import java.util.ArrayList;

class AssignmentFinal {

	public static void main(String[] args) {

		ArrayList<Product> pl = new ArrayList();

		ArrayList<store> s = new ArrayList();

		ArrayList<String> outputList = new ArrayList<String>();

		// Creating two store objects and 10 products for each store
		for (int j = 1; j <= 2; j++) {
			String storename = "Store" + j;
			String address = "Banglore " + j + "Area";
			String contact = "99999" + j;

			store st = new store(storename, address, contact);
			s.add(st);

			if (j == 1) {

				for (int i = 0; i < 10; i++) {
					String productName = "Product" + (i+1);
					String productCode = "ProdCode" + (i+1);
					String productCategory = "Category" + (i+1);
					float costPrice = 10 * (i+1);
					float sellingPrice = 20 * (i+1);
					float taxPercent = 5 * (i+1);
					int stockCount = 20 + (i+1);

					// Creating a new Product and adding it to the ArrayList
					Product product = new Product(productName, productCode, productCategory, costPrice, sellingPrice,
							taxPercent, stockCount);
					pl.add(product);
				}
			} else if (j == 2) {

				for (int i = 0; i < 10; i++) {
					String productName = "Product" + (i+11);
					String productCode = "ProdCode" + (i+11);
					String productCategory = "Category" +(i+11);
					float costPrice = 10 * (i+11);
					float sellingPrice = 20 * (i+11);
					float taxPercent = 5 * (i+11);
					int stockCount = 20 + (i+11);

					// Creating a new Product and adding it to the ArrayList
					Product product = new Product(productName, productCode, productCategory, costPrice, sellingPrice,
							taxPercent, stockCount);
					pl.add(product);
				}
			} else {
				System.out.println("End");
			}

		}

		for (store stor : s) {

			System.out.println(stor.sname + "\t\t" + stor.address + "\t\t" + stor.contact);

			for (Product pr : pl) {

				if (pr.name.contains(stor.sname)) {

					System.out.println(pr.name + "\t\t" + pr.code + "\t\t" + pr.category + "\t\t" + pr.costPrice
							+ "\t\t" + pr.sellingPrice + "\t\t" + pr.taxPercent + "\t\t" + pr.stockCount);

				}

			}

		}
		
		

//		String storeNameToSearch = "Store1";
		String productCodeToSearch = "ProdCode11";

		float price = getPriceByCodeInStore(pl,productCodeToSearch);
		int stockValue = getStockValueByCodeInStore(pl, productCodeToSearch);

		System.out.println("Price of product " + productCodeToSearch + " in store "  + ": " + price);
		System.out.println(
				"Stock value of product " + productCodeToSearch + " in store " +  ": " + stockValue);
	}

	// Creating a function to get price of product by code in a store
	private static float getPriceByCodeInStore(ArrayList<Product> products, String productCode) {
		for (Product product : products) {
			if (product.code.equals(productCode)) {
				return product.sellingPrice;
			}
		}
		return -1; 
	}
	
	
	// Creating a function to get stock value of a product by code in a store
	
	private static int getStockValueByCodeInStore(ArrayList<Product> products,  String productCode) {
		for (Product product : products) {
			if (product.code.equals(productCode)) {
				return product.stockCount;
			}
		}
		return -1; 
	}

}
