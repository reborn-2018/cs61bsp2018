public class HelloNumbersModified {
    public static void main(String[] args) {
        int sum = 0;
        int x = 0;
        while (x < 10) {
            sum = sum + x;
            x = x + 1;
            System.out.print(sum + " ");
        }
    }
}
