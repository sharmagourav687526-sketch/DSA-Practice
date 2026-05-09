import java.util.logging.Logger;

import patterns;

public class halfPyramid {
    private static final Logger logger = Logger.getLogger(halfPyramid.class.getName());

    public static void main(String[] args) {
        int n = 5;
        for (int j = 1; j <= n; j++) {
            StringBuilder row = new StringBuilder();
            for (int i = 1; i <= j; i++) {
                row.append("* ");
            }
            logger.info(row.toString());
        }
    }
}
