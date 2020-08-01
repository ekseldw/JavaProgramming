class Jv_2_b1 {
    public static void main(String[] args) {
        char c;
        char b = 'B', a = 'A', s = 'S', i = 'I';
        char f = 'F', o = 'O', r = 'R', t = 'T', n = 'N';
        char l = 'L';
        char j = 'J', v = 'V';

        String C = "C\n";
        String BASIC = "B A S I C\n";
        String FORTRAN = "F O R T R A N\n";
        String COBOL = "C O B O L\n";
        String JAVA = "J A V A\n";

        c = 'C';

        System.out.print("=== 문자형 출력 ===\n");
        System.out.print(c + "\n");
        System.out.print(b + " " + a + " " + s + " " + i + " " + c + "\n");
        System.out.print(f + " " + o + " " + r + " " + t + " " + r + " " + a + " " + n + "\n");
        System.out.print(c + " " + o + " " + b + " " + o + " " + l + "\n");
        System.out.print(j + " " + a + " " + v + " " + a + "\n");

        System.out.print("\n=== 문자열 출력 ===\n");
        System.out.print(C);
        System.out.print(BASIC);
        System.out.print(FORTRAN);
        System.out.print(COBOL);
        System.out.print(JAVA);
    }
}