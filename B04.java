import java.util.*;
public class B04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double tax = 0;
		System.out.print("연봉을 월단위로 입력하세요 ");
		int money = scanner.nextInt();
		if(money < 10000000)
			tax = money * (9.5/100);
		else if(money>=10000000 && money<40000000)
			tax = money * (19/100);
		else if(money >= 40000000 && money < 80000000)
			tax = money * (28/100);
		else if(money >= 80000000)
			tax = money * (37/100);
		System.out.println("연봉 금액에 대한 소득세는 "+tax+"입니다");
		
		
	}

}
