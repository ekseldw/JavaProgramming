package Ch02;

class Jv_2_2 {
    public static void main(String[] args) throws java.io.IOException {
        int ken;
        System.out.print("키보드로 문자 입력 요망: ");
        ken = System.in.read();
        System.out.println("입력한 문자의 10진수: " + ken);
    }
}