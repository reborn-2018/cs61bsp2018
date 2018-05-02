public class DrawingTriangle1a {
    public static void main(String[] args){
        int col = 0;
        int row = 2;
        int SIZE = 5;
        System.out.println("*");
        col = col + 1;
        while (row <= SIZE) {
            while (col < row) {
                System.out.print("*");
                col = col + 1;
                }
            System.out.println("*");
            row = row + 1;
            col = 1;
        }
    }
}
