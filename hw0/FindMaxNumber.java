public class FindMaxNumber {
    /** Returns the maximum value from m. */
    public static int max(int[] m) {
        int max = m[0];
        int n = 0; // count the postion in array
        while (n < m.length) {
            if (max < m[n]) {
                max = m[n];
            }
            n = n + 1;
        }
         
        return max;
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.println(max(numbers));
    }
}
