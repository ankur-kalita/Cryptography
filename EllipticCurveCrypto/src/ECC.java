public class ECC {
    private double a;
    private double b;

    public ECC(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Point doubleAndAdd(int n, Point p) {
        Point temp = new Point(p.getX(), p.getY());
        String nBinary = Integer.toBinaryString(n);
        for (int i = 1; i < nBinary.length(); i++) {
            int actualBit = Integer.parseInt("" + nBinary.charAt(i));
            temp = pointAddition(temp, temp); // point doubling
            if (actualBit == 1) {
                temp = pointAddition(temp, p); // point addition
            }
        }
        return temp;
    }

    public Point pointAddition(Point p1, Point p2) {
        double x1 = p1.getX();
        double y1 = p1.getY();
        double x2 = p2.getX();
        double y2 = p2.getY();

        double m = 0;
        // sometimes we have to make point addition and if
        // p = q , we have to do point doubling
        if(Double.compare(x1, x2) == 0 && Double.compare(y1, y2) == 0) {
            // point doubling , p = q
            m = (3 * x1 * x1 + a) / (2 * y1);
        } else {
            m = (y2 - y1) / (x2 - x1);
        }
        // we can calculate the point R (x, y)
        double x3 = m * m - x1 - x2;
        double y3 = m * (x1 - x3) - y1;

        return new Point(x3, y3);

    }
}
