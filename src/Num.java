public class Num {
    public static void main(String[] args) {
        int i = 1;
        byte b = 1;
        short s = 1;
        long l =2147483648L; // L 을 붙여주 로그라는걸 알려줌

        char c = '힌'; // char 같은 문자형  primitive type 은 '' 을 쓴다
        String s1 = "dd"; // String 은 "" 을 쓴다

        //실수는 기본 더블형
        //var 선언  var 을 사용 하여 변수 를 선언가능
        var v =10; // int v = 10;
        var d =1.23; // = double d = 1.23;
        var q="str"; // = String q = "srt";

        System.out.println(Integer.MAX_VALUE); //int 의 max 값을 보여줌
        System.out.println(Long.MAX_VALUE);

        final int X=34; // 상수 constant 는 변하지 않은 값  대문자로 선언 X는 다른 숫자나 문자열이 못옴
    }
}
