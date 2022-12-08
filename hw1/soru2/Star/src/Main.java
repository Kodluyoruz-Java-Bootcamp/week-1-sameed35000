public class Main {
    public static void main(String[] args) {
        int k = 11;
        for (int i = 1; i < 6; i++) {
            printStars(i);

            printSpaces(k);

            printStars(i);

            System.out.println("");
            k -= 2;
        }
    }

    public static void printStars(int numberOfStars) {
        for (int i = 0; i < numberOfStars; i++) {
            System.out.print("*");
        }
    }

    public static void printSpaces(int numberOfSpaces) {
        for (int i = 0; i < numberOfSpaces; i++) {
            System.out.print(" ");
        }
    }
}
