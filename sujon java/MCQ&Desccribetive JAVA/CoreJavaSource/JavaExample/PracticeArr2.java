import java.util.Scanner;
public class PracticeArr2{
	
	public static void main(String[] args){
		int[] p = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<5; i++){
			System.out.print("Enter first value ");
			p[i] = sc.nextInt(); 
			
		}
			
			
		System.out.println(p[0]+","+p[1]+","+p[2]+","+p[3]+","+p[4]);
		
	
	}
	
}