public class CallByReference {
    int m =2;
    public static void main(String[] args) {
        int i =1; // int 는 소문자로 시작하여 primitive type 임으로 i를 콜 할 떄는 1 값이 그대로 간다
        System.out.println("i1=" + i);

        change1(i); //
        System.out.println("i2=" + i);
        CallByReference call1 =new CallByReference(); // 클래스 속 안에 클래스 생성
        System.out.println("call1="+call1.m);

        change2(call1);
        System.out.println("call2="+call1.m); // class 라는 컵에 2 라는 내용이 있었는데  비우고 100 으로 채움
    }

    public static void change1(int x) {
        System.out.println("x="+x); // int i 가 대로 전달

        x=100;
    }
    public static void change2(CallByReference call){
        call.m = 100; // m 에 100 을 채움
    }
}
