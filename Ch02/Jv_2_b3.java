package Ch02;

class Jv_2_b3 {
    public static void main(String[] args) {
        int a = 123;
        int b = 0x123;
        int c = 0123;
        System.out.println("* * * 10진수, 16진수, 8진수의 10진수 출력 * * *");
        System.out.println("123(decimal) = " + a + "decimal");
        System.out.println("0x123(hexadecimal) = " + b + "decimal");
        System.out.println("0123(octal) = " + c + "decimal");
    }
}