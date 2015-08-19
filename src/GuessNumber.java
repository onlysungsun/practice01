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
			System.out.print("1~100 숫자를 입력하세요 : ");
			input = s.nextInt(); 
			if(input==answer){
				System.out.println("정답입니다");
				System.out.print("끝내겠습니까? (y/n) :");
				end = sc.next();
				if(end=="y"){
					break;
					//종료를 못함(반복)
				}
				else if(end=="n"){
				}
				
			}
			   else if(input<answer){ 
				    System.out.println("큰수를 입력하세요.\n");
				   }
				   else if(input>answer){ 
				    System.out.println("작은수를 입력하세요.\n");
				   }
		}while(count<100);
			System.out.println("종료합니다");

		}
	}
