public class BreakContinue {
    public static void windowPosSum(int[] a, int n) {
        /** replace each element a[i] with the sum of a[i] through a[i + n], but only if a[i] is positive valued */
        for (int i = 0; i < a.length; i = i + 1) {
            if (a[i] < 0) {
                continue;
            }
            else {
                for (int m = 1; m <= n; m = m +1) {
                    if (i + m > a.length - 1) {
                        break;
                    }
                    else {
                    a[i] = a[i] + a[i + m];
                    }
                }
            }        
        }                            
    }
    public static void main(String[] args) {
        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
        windowPosSum(a, n);   
        System.out.println(java.util.Arrays.toString(a));
    }
}
