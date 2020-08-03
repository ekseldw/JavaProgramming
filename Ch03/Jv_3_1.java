package Ch03;

class Jv_3_1 {
    public static void main(String[] args) {
        int ken = 10, yoo = -20, boo;
        boo = -yoo;
        System.out.println("* * * * * result * * * * *");
        System.out.println("ken = " + ken + ", yoo = " + yoo + ", boo = " + boo);
        System.out.println("++ken = " + (++ken) + ", ken = " + ken);
        System.out.println("ken++ = " + (ken++) + ", ken = " + ken);
        System.out.println("--boo = " + (--boo) + ", boo = " + boo);
        System.out.println("boo-- = " + (boo--) + ", boo = " + boo);
    }
}