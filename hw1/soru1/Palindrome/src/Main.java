public class Main {
	public static void main(String[] args) {
		int maxLength = 0;
		int numberWithLongestChain = 0;

		for (int i = 10; i <= 100; i++) {
			System.out.println(i + ". for");
			int currentNumber = i;
			int chainLength = 0;

			while (true) {
				System.out.println(isPalindrome(i));
				int reversedNumber = reverse(currentNumber);

				currentNumber += reversedNumber;

				chainLength++;

				if (isPalindrome(currentNumber)) {
					break;
				}
			}

			if (chainLength > maxLength) {
				maxLength = chainLength;
				numberWithLongestChain = i;
			}
		}

		System.out.println("En uzun zincir: " + numberWithLongestChain);
	}

	public static int reverse(int number) {
		int reversed = 0;

		while (number > 0) {
			reversed = reversed * 10 + (number % 10);
			number = number / 10;
		}

		return reversed;
	}

	public static boolean isPalindrome(int number) {
		return number == reverse(number);
	}
}