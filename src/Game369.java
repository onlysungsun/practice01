

public class Game369 {
	public static void main(String[] args) {
		
		String jjak = "¦";
		int number = 0;
		
		for(int i = 0;i<58;i++){
			if(i/10 ==3 && (i%10==3|| i%10==6 || i%10==9)){
				System.out.println(i+"�ڼ� ¦¦");
			}
			else if(i%10==3 || i%10==6 || i%10==9){
				System.out.println(i+"�ڼ� ¦");	
			}
		}
	}
}