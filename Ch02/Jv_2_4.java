package Ch02;

class Jv_2_4 {
    public static void main(String[] args) {
        int i = 65;
        short j = 65;
        float x = 65.0F;
        double y = 65.0;

        System.out.println("* * * 데이터형 변환 (data type conversion) * * *");
        System.out.println("<정수형에서 실수형으로 변환>");
        System.out.println("int i = " + i);
        System.out.println("(float) i = " + (float)i);
        System.out.println("short j = " + j);
        System.out.println("(double) j = " + (double)j);
        System.out.println("<실수형에서 정수형으로 변환>");
        System.out.println("float x = " + x);
        System.out.println("(int) x = " + (int)x);
        System.out.println("double y = " + y);
        System.out.println("(short) y = " + (short)y);
    }
}