import java.util.*;
class rp3_1{

	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	int max_num = 0;
	int min_num = 0;
	System.out.print("첫번째 숫자를 입력하세요 ");
	int num1 = scanner.nextInt();
	System.out.print("두번째 숫자를 입력하세요 ");
	int num2 = scanner.nextInt();
	System.out.print("세번째 숫자를 입력하세요 ");
	int num3 = scanner.nextInt();

	if(num1<num2)
	{
		if(num2<num3)
		{
			max_num = num3;
			min_num = num1;
		}	
		else
		{
			max_num = num2;
			min_num = num1;
		}	
	}
	else if(num1<num3)
	{
		max_num = num3;
		min_num = num2;
	}
	else if(num2<num3)
	{
		max_num = num1;
		min_num = num2;
	}
	else
	{	
		max_num = num1;
		min_num = num3;
	}
	System.out.println("가장 큰 수는  "+max_num+" 이고, 가장 작은 수는 "+min_num+" 입니다.");
	}
}	
