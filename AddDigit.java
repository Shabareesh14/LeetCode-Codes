public class AddDigit {
    public static int addDigits(int num) {

        int sum = 0;
        while (num >= 10) {
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
            sum = 0;
        }
        return num;

    }
    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }
}