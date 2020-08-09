import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		while (num <= 20){
			if(num%15 == 0){
				System.out.println(num);
				break;
			}
		}
	}	
}