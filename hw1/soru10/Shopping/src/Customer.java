import java.util.ArrayList;
import java.util.List;

class Customer {
	private static List<Customer> customers = new ArrayList<>();
	private String name;
	private int age;
	private List<Order> orders = new ArrayList<>();

	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
		customers.add(this);
	}

	public void addOrder(Order order) {
		orders.add(order);
	}

	public List<Order> getOrders() {
		return orders;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public static List<Customer> getCustomers() {
		return customers;
	}

	public static int getTotalCustomers() {
		return customers.size();
	}

	public static List<Customer> getCustomersByName(String name) {
		List<Customer> result = new ArrayList<>();
		for (Customer customer : customers) {
			if (customer.getName().equals(name)) {
				result.add(customer);
			}
		}
		return result;
	}
}