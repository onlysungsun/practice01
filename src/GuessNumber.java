import java.util.Random;

public class GuessNumber {
	public static void main(String[] args) {
		
		int answer = (int)(Math.random()*100)+1;
		int input = 0;
		int count = 0;
		String end;
	
		java.util.Scanner s = new java.util.Scanner(System.in);
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		
		do{
			count++;
			System.out.print("1~100 ���ڸ� �Է��ϼ��� : ");
			input = s.nextInt(); 
			if(input==answer){
				System.out.println("�����Դϴ�");
				System.out.print("�����ڽ��ϱ�? (y/n) :");
				end = sc.next();
				if(end=="y"){
					break;
					//���Ḧ ����(�ݺ�)
				}
				else if(end=="n"){
				}
				
			}
			   else if(input<answer){ 
				    System.out.println("ū���� �Է��ϼ���.\n");
				   }
				   else if(input>answer){ 
				    System.out.println("�������� �Է��ϼ���.\n");
				   }
		}while(count<100);
			System.out.println("�����մϴ�");

		}
	}
