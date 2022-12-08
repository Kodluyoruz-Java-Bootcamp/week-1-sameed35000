class Invoice {
	private Customer customer;

	public Invoice(Customer customer) {
		this.customer = customer;
	}

	public double getTotalPrice() {
		double totalPrice = 0;

		for (Order order : customer.getOrders()) {
			for (Product product : order.getProducts()) {
				totalPrice += product.getPrice();
			}
		}

		return totalPrice;
	}

	public Customer getCustomer() {
		return customer;
	}
}