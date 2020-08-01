package Ch02;

class Jv_2_x2 {
    public static void main(String[] args) {
        float k1, b1, y1, b3;
        double k2, b2, y2, b4;
        int s;

        k1 = 3.1415F;
        k2 = 3.1415D;
        b1 = .031415e2f;
        b2 = .031415e2;
        b3 = 314.15e-2f;
        b4 = 314.15e-2;
        y1 = 3.14150000000F;
        y2 = 3.14150000000d;
        s = (int) 3.1415;

        System.out.println("k1 = " + k1);
        System.out.println("k2 = " + k2 + "\n");

        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);
        System.out.println("b4 = " + b4 + "\n");

        System.out.println("y1 = " + y1);
        System.out.println("y2 = " + y2 + "\n");

        System.out.println("s = " + s + "\n");
    }
}