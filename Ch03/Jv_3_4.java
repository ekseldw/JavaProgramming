package Ch03;

class Jv_3_4 {
    public static void main(String[] args) {
        boolean x = true, y = true, z = false;

        System.out.println("* * * * * result * * * * *");
        System.out.println("boolean x= true, y = true, z = false");
        System.out.println("--- logical AND ---");
        System.out.println("x && y ->" + (x && y));
        System.out.println("y && z ->" + (y && z));
        System.out.println("--- logical OR ---");
        System.out.println("x || y ->" + (x || y));
        System.out.println("y || z ->" + (y || z));
        System.out.println("--- logical NOT ---");
        System.out.println("!x     ->" + (!x));
        System.out.println("!y     ->" + (!y));
        System.out.println("!z     ->" + (!z));
    }
}