class Jv_2_x3 {
    public static void main(String[] args) {
        byte b_a;
        short s_a;
        long l_a;
        int a, h_a, o_a;
        float f_a, f_b;
        double d_a, d_b;

        b_a = 45;
        s_a = 45;
        l_a = 45L;
        System.out.println("*** 정수형 출력 ***");
        System.out.println("45 (byte) = " + b_a + " byte");
        System.out.println("45 (short) = " + s_a + " short");
        System.out.println("45 (long) = " + l_a + " long \n");
        
        a = 45;
        h_a = 0x45;
        o_a = 045;
        System.out.println("* * * 10진수, 16진수, 8진수의 10진수 출력 * * *");
        System.out.println("45 (int decimal) = " + a + " int decimal");
        System.out.println("0x45 (int hexadecimal) = " + h_a + " int decimal");
        System.out.println("045 (int octal) = " + o_a + " int decimal \n");

        f_a = 45.0F;
        d_a = 45.0;
        f_b = .45e2f;
        d_b = 4500e-2;
        System.out.println("=== 실수형 출력 ===");
        System.out.println("45.0F (float) = " + f_a + " float");
        System.out.println("45.0 (double) = " + d_a + " double");
        System.out.println("0.45e2F (float) = " + f_b + " float");
        System.out.println("4500e-2 (dobule) = " + d_b + " double \n");
    }
}