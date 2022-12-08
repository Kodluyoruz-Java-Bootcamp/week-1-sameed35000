class Product {
	private String category;
	private int price;
	private String name;
	private int stock;

	public Product(String category, int price, String name, int stock) {
		this.category = category;
		this.price = price;
		this.name = name;
		this.stock = stock;
	}

	public String getCategory() {
		return category;
	}

	public int getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

	public int getStock() {
		return stock;
	}
}
