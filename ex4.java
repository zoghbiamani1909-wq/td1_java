package td_1;
import java.util.Scanner;
public class ex4 {
	
	public static void main(String[] args) {
        
		//String ch = args[0];
        //int n = Integer.parseInt(args[1]);
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Donner une chaîne : ");
        String ch = sc.nextLine();

        System.out.print("Donner le nombre de répétitions : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(ch);
        }
    } 
	

}
