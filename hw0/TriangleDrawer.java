public class TriangleDrawer {
    public static void drawTriangle(int N) {
        /* Print out a triangle, with total height N and each line increment in 1 until N */
        int col = 0; // count the column length
        int row = 2; // count the row length
        int SIZE = N; // the height of triangle
        System.out.println("*"); // print the first line
        col = col + 1;
        while (row <= N) {
            while (col < row) {
                System.out.print("*");
                col = col + 1;
                }
            System.out.println("*");
            row = row + 1;
            col = 1;
        }
    }

    public static void main(String[] args) {
        drawTriangle(10);
    }
}
