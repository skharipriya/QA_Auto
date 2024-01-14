package TCs;


/*This class is dedicated to products, which hold product attributes; data types and constructor*/
public class Product {
	String name;
	String code;
	String category;
	float costPrice;
	float sellingPrice;
	float taxPercent;
	int stockCount;

	Product(String name, String code, String category, float costPrice, float sellingPrice, float taxPercent,
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
