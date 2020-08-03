package Ch03;

class Jv_3_7 {
    public static void main(String[] args) {
        int x = 10, y = 20, ken, boo, yoo, soo;
        ken = boo = 30;
        yoo = (ken == boo ? x : y);
        soo = (ken < boo ? x : y);

        System.out.println("* * * * * result * * * * *");
        System.out.println("yoo = " + yoo + ", soo = " + soo);
    }
}