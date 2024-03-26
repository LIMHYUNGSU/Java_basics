package cond;
//조건이 서로 영향을 주지 않고 각각 수행해야 하는 경우에는 else if문을 사용하면 안되고
//대신에 여러 if문을 분리해서 사용해여 한다

//할인 시스템 예제
//한 사용자가 동시에 여러 할인을 받을 수 있다는
public class if5 {
    public static void main(String[] args) {
        int price = 10000; //아이템 가격
        int age =10;
        int discount =0;

        if(price >= 10000){
            discount=discount + 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        }

        if (age <=10){
            discount= discount + 1000;
            System.out.println("어린이 1000원 할인");
        }

        System.out.println("총 할인 금액 : "+discount+"원");
    }
}
//만약 else if를 쓰면, 첫 번째로 충족하는 조건만 할인이 적용되고 나머지는 무시된다.
//따라서 사용자는 나머지 할인을 놓칠 수 있다.