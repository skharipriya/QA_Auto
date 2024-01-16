package TCs;
/*This class is dedicated to store, which hold store attributes; data types and constructor*/
public class store {
	
		String sname;
		String address;
		String contact;
	 ArrayList<Product> products;

		store(String sname, String address, String contact) {
			this.sname = sname;
			this.address = address;
			this.contact = contact;
			this.products = new ArrayList<Product>();
		}
		public void addProd(Product e) {
			this.products.add(e);
		}
	}

