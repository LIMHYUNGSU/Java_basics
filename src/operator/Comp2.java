package operator;

public class Comp2 {
    public static void main(String[] args) {
        //문자열 비교는 == 이를 사용하면 가끔 출력이 안될때가 있음...
        System.out.println("hello" == "hello");

        String str1 = "문자열1";
        String str2 = "문자열2";

        boolean result1 = "hello".equals("hello");//리터럴 비교
        boolean result2 =str1.equals("문자열1"); //문자열 변수, 리터럴 비교
        boolean result3 = str1.equals(str2);//문자열 변수 비교

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        //자동 세미 콜론 완성 단축키 Ctrl + Shift + Enter
        //줄 복사해서 바로 붙여넣는 Ctrl + D
    }
}
