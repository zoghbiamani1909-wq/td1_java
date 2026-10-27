package td_1;

public class ex6 {
public static void main(String[] args) {
        

        int max = Integer.parseInt(args[0]);
        for(int i = 0; i< args.length ; i++ )
        {
        	int n = Integer.parseInt(args[i]);
        	if(max < n) {max = n; }
        }
        System.out.print("max =" + max);

}
}
