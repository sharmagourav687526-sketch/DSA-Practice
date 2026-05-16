package patterns;
public class halfPyramid {
    public static void main(String[] arg) {
        int rows = 5;

        //here we need two
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}