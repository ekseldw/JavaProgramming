package Ch03;

class Jv_3_6 {
    public static void main(String[] args) {
        int x = 7, y = 2;
        int a, b;
        a = 7;
        b = 2;

        System.out.println("* * * * * result * * * * *");
        System.out.println("x = " + x + ", y = " + y);
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("x += y -> " + (x += y) + ", a = a + b -> " + (a = a + b));
        System.out.println("x -= y -> " + (x -= y) + ", a = a - b -> " + (a = a - b));
        System.out.println("x /= y -> " + (x /= y) + ", a = a / b -> " + (a = a / b));
        System.out.println("x %= y -> " + (x %= y) + ", a = a % b -> " + (a = a % b));
    }    
}