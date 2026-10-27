package td_1;
import java.util.Scanner;
public class ex5 {
	
	public static void main(String[] arg) {
	
	Scanner sc = new Scanner(System.in) ;
	System.out.print("donner n :");
	int n = sc.nextInt();
	int f= 1;
	for(int i=1;i<=n;i++) {f=f*i;}
	System.out.print("le factorielle de "+ n +" = "+ f);
	
	}
	
	
	

}
