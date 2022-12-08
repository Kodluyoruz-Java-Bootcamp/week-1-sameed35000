public class MyList {

	private String[] list;
	private int size;
	private int capacity;

	public MyList() {
		this.list = new String[5];
		this.size = 0;
		this.capacity = 5;
	}

	public void add(String str) {
		if (str.charAt(0) == 'C') {
			if (this.size == this.capacity) {
				this.capacity += 7;
				String[] newList = new String[this.capacity];
				for (int i = 0; i < this.size; i++) {
					newList[i] = this.list[i];
				}
				this.list = newList;
			}
			this.list[this.size] = str;
			this.size++;
		}
	}

	public void print() {
		for (int i = 0; i < this.size; i++) {
			System.out.println(this.list[i]);
		}
	}
	public void size() {
		System.out.println(list.length);
	}

}