public class FindMaxNumberRev {
    /** Returns the maximum value from m using a for loop. */
    public static int forMax(int[] m) {
        int max = m[0];
        for (int n = 0; n < m.length; n = n + 1) {
            if (max < m[n]) {
                max = m[n];
            }    
        }
        return max;
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.println(forMax(numbers));
    }
}
