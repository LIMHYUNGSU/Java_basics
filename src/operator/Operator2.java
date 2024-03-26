package operator;

public class Operator2 {
    public static void main(String[] args) {
        String result1 = "hello" + "world";
        System.out.println(result1);

        //문자열과 문자열 더하기2
        String s1 = "string1";
        String s2 = "string2";
        String result2 = s1 + s2;
        System.out.println(result2);

        //문자열과 숫자 더하기1
        String result3 = "a + b = " + 10; //자바가 '문자랑 숫자를 더했네?' 그럼 10을 문자열로 인식하고 실행
        //"10" (int -> String) 숫자를 문자열로 변경
        //쉽게 이야기해서 문자열에 더하는것은 전부 문자열이 된다.
        System.out.println(result3);

        //문자열과 숫자 더하기2
        int num =20;
        String str= "a + b = ";
        String result4 = str+num;
        System.out.println(result4);
    }
}
