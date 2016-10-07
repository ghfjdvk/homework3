import java.util.*;
public class B04 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		double tax;
		System.out.print("연봉을 원단위로 입력하세요 ");
		int money = scanner.nextInt();
		if(money < 10000000)
			tax = money * 0.95;
		else if(money>=10000000 && money<40000000)
			tax = money * 0.19;
		else if(money >= 40000000 && money < 80000000)
			tax = money * 0.28;
		else
			tax = money * 0.37;
		System.out.printf("연봉 금액에 대한 소득세는 %.1f입니다",tax);
    }

}
