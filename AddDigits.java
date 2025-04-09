public class AddDigits {
    public static int addDigits(int num) {
         return (num - 1) % 9 + 1;
    }

    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }
}