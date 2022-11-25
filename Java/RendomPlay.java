import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner Obq = new Scanner(System.in);
	    System.out.println("************************************");
	    System.out.println("         Lets Play a Game <3        ");
	    System.out.println("You must find a number in this range");
	    System.out.println("              Good Luck             ");
	    System.out.println("************************************");
	    System.out.println(" ");
	    
		int uB = 100;
		int lB = 1;
		int r = uB - lB + 1;
		int x = (int)(Math.random() * r) + lB;
        
        
       int a = 0;
        
        while(a != x){
        System.out.println("Enter a number from "+lB+" to "+uB);
        System.out.println("");
        a = Obq.nextInt();
        if (a > x){
            System.out.println(a +" more than x");
            System.out.println("");
        }
        else if (a < x){
            System.out.println(a +" less than x");
            System.out.println("");
        }
        else {  if (a == x){
            System.out.println("You win because x = "+a);
            System.out.println("");
        }}
        }
	}
}
