package TCs;

import java.util.ArrayList;

class product1 {

	String name;
	String code;
	String category;
	float costPrice;
	float sellingPrice;
	float taxPercent;
	int stockCount;

	product1(String name, String code, String category, float costPrice, float sellingPrice, float taxPercent,
			int stockCount) {
		this.name = name;
		this.code = code;
		this.category = category;
		this.costPrice = costPrice;
		this.sellingPrice = sellingPrice;
		this.taxPercent = taxPercent;
		this.stockCount = stockCount;
	}
}

class store {
	String sname;
	String address;
	String contact;

	store(String sname, String address, String contact) {
		this.sname = sname;
		this.address = address;
		this.contact = contact;
	}
}

class AssignmentFinal {

	public static void main(String[] args) {

		ArrayList<product1> pl = new ArrayList();

		ArrayList<store> s = new ArrayList();

		ArrayList<String> outputList = new ArrayList<String>();

		for (int j = 1; j <= 2; j++) {
			String storename = "Store" + j;
			String address = "Banglore " + j + "Area";
			String contact = "99999" + j;

			store st = new store(storename, address, contact);
			s.add(st);

			if (j == 1) {

				for (int i = 1; i <= 10; i++) {
					String productName = "Store1_Product" + i;
					String productCode = "Store1_Prod" + i;
					String productCategory = "Category" + i;
					float costPrice = 10 * i;
					float sellingPrice = 20 * i;
					float taxPercent = 5 * i;
					int stockCount = 20 + i;

					// Creating a new Product and adding it to the ArrayList
					product1 product = new product1(productName, productCode, productCategory, costPrice, sellingPrice,
							taxPercent, stockCount);
					pl.add(product);
				}
			} else if (j == 2) {

				for (int i = 1; i <= 10; i++) {
					String productName = "Store2_Product" + i + j;
					String productCode = "Store2_Prod" + i + j;
					String productCategory = "Category" + i + j;
					float costPrice = 10 * i + j;
					float sellingPrice = 20 * i + j;
					float taxPercent = 5 * i + j;
					int stockCount = 20 + i + j;

					// Creating a new Product and adding it to the ArrayList
					product1 product = new product1(productName, productCode, productCategory, costPrice, sellingPrice,
							taxPercent, stockCount);
					pl.add(product);
				}
			} else {
				System.out.println("End");
			}

		}

		for (store stor : s) {

			System.out.println(stor.sname + "\t\t" + stor.address + "\t\t" + stor.contact);

			for (product1 pr : pl) {

				if (pr.name.contains(stor.sname)) {

					System.out.println(pr.name + "\t\t" + pr.code + "\t\t" + pr.category + "\t\t" + pr.costPrice
							+ "\t\t" + pr.sellingPrice + "\t\t" + pr.taxPercent + "\t\t" + pr.stockCount);

				}

			}

		}
				String storeNameToSearch = "Store1";
				String productCodeToSearch = "Store1_Prod9";

				float price = getPriceByCodeInStore(pl, storeNameToSearch, productCodeToSearch);
				int stockValue = getStockValueByCodeInStore(pl, storeNameToSearch, productCodeToSearch);

				System.out.println("Price of product " + productCodeToSearch + " in store " + storeNameToSearch + ": " + price);
				System.out.println("Stock value of product " + productCodeToSearch + " in store " + storeNameToSearch + ": " + stockValue);
			}

			// Function to get the price of a product by code in a store
			private static float getPriceByCodeInStore(ArrayList<product1> products, String storeName, String productCode) {
				for (product1 product : products) {
					if (product.name.contains(storeName) && product.code.equals(productCode)) {
						return product.sellingPrice;
					}
				}
				return -1; // Indicates that the product with the given code was not found in the specified store
			}

			// Function to get the stock value of a product by code in a store
			private static int getStockValueByCodeInStore(ArrayList<product1> products, String storeName, String productCode) {
				for (product1 product : products) {
					if (product.name.contains(storeName) && product.code.equals(productCode)) {
						return product.stockCount;
					}
				}
				return -1; // Indicates that the product with the given code was not found in the specified store
			}

	}


