import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		Customer customer1 = new Customer("Cem", 28);
		Customer customer2 = new Customer("Ahmet", 35);
		Customer customer3 = new Customer("Cem", 40);
		Customer customer4 = new Customer("Mehmet", 30);

		Product product1 = new Product("Elektronik", 100, "USB", 10);
		Product product2 = new Product("Giyim", 175, "Kazak", 20);
		Product product3 = new Product("Ev Eşyaları", 450, "Blenderı", 15);
		Product product4 = new Product("Elektronik", 150, "Kulaklık", 10);
		Product product5 = new Product("Giyim", 100, "T-Shirt", 20);
		Product product6 = new Product("Küçük Ev Aletleri", 750, "Filtre Kahve Makiması", 15);
		Product product7 = new Product("Elektronik", 1000, "Oyun Konsolu Kolu", 10);

		Order order1 = new Order();
		order1.addProduct(product1);
		order1.addProduct(product2);

		Order order2 = new Order();
		order2.addProduct(product3);
		order2.addProduct(product4);

		Order order3 = new Order();
		order3.addProduct(product5);
		order3.addProduct(product6);

		Order order4 = new Order();
		order4.addProduct(product1);
		order4.addProduct(product4);
		order4.addProduct(product6);
		order4.addProduct(product7);

		customer1.addOrder(order1);
		customer1.addOrder(order2);

		customer2.addOrder(order1);
		customer2.addOrder(order2);

		customer3.addOrder(order1);

		customer4.addOrder(order3);
		customer4.addOrder(order4);

		System.out.println("Sistemdeki Müşteri Sayısı: " + Customer.getTotalCustomers());

		List<Customer> cemCustomers = Customer.getCustomersByName("Cem");
		int productCount = 0;
		for (Customer customer : cemCustomers) {
			for (Order order : customer.getOrders()) {
				productCount += order.getProducts().size();
			}
		}
		System.out.println("İsmi Cem olan Müşterilerin Aldıkları Ürün Sayısı: " + productCount);

		double totalPrice = 0;
		for (Customer customer : cemCustomers) {
			if (customer.getAge() > 25 && customer.getAge() < 30) {
				for (Order order : customer.getOrders()) {
					for (Product product : order.getProducts()) {
						totalPrice += product.getPrice();
					}
				}
			}
		}
		System.out.println("İsmi Cem Olup Yaşı 30’dan Küçük 25’ten Büyük Müşterilerin Toplam Alışveriş Tutarı: "
				+ totalPrice + " TL");

		List<Invoice> invoices = new ArrayList<>();
		for (Customer customer : Customer.getCustomers()) {
			Invoice invoice = new Invoice(customer);
			if (invoice.getTotalPrice() > 1500) {
				invoices.add(invoice);
			}
		}

		System.out.println("1500 TL Üzerindeki Faturalar: ");
		for (Invoice invoice : invoices) {
			System.out.println(invoice.getCustomer().getName() + " - " + invoice.getTotalPrice() + " TL");
		}
	}
}