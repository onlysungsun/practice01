import java.util.Scanner;

public class MultipleOfTree {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է��Ͻÿ� : ");
		int num = sc.nextInt();
		
		if(num%3==0)
			System.out.println("3�ǹ�� �Դϴ�.");
		else{
			System.out.println("3�ǹ���� �ƴմϴ�.");
		}
	}
}
