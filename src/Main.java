public class Main {
    public static void main(String[] args) {
        String s = "I love you";
        String s1 = " forever";

        String s2 = s + s1;
        System.out.println("s2 ="+s2);

        String s3 = s.substring(0,8);
        System.out.println("s3 ="+s3);

        //cách 1
        String s4 = s.substring(0,2);
        String s5 = s.substring(2,6);
        s5 = "hate";
        String s6 = s.substring(6,10);
        String s7 = s4 + s5 + s6;
        System.out.println("s7 ="+s7);
        //cách 2 dùng replace
        String s8 = s.replace("love", "hate");
        System.out.println("s8 ="+s8);
    }
}
