package td_1;

public class ex7 {

public static void main(String[] args) {
        

        int m = Integer.parseInt(args[0]);
        int nb = 0;
        for(int i = 2 ;i < m; i++) {
        	
        	if (m % i == 0) {nb = nb + 1;}
}
        if(nb != 0) {System.out.print("premier");}
        else {System.out.print("non premier");
        }
}
}
