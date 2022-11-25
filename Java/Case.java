import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    System.out.println("Napisz stop kiedy chcesz przestac ");
	    Scanner Obq = new Scanner(System.in);
	    int aa = 0;
	    int aaa = 0;
	    int aa1 = 0;
	    int summ = 0;
	while(aaa == 0){    
	    System.out.println("what points do you resieve");
	    String str = Obq.nextLine();

		switch (str.toLowerCase()) {
        case "one":
 
            System.out.println("one");
            aa+=1;
            aa1++;
            break;
 
        case "two":
 

            System.out.println("two");
            aa+=2;
            aa1++;
            break;
 
        case "three":
 
                    System.out.println("three");
                    aa+=3;
                    aa1++;
            break;
        case "four":
 
                    System.out.println("four");
                    aa+=4;
                    aa1++;
                    break;
        case "five":
 
                    System.out.println("five");
                    aa+=5;
                    aa1++;
                    break;
        case "six":
 
                    System.out.println("six");
                    aa+=6;
                    aa1++;
            break;
            
        case "1":
 
            System.out.println("one");
            aa+=1;
            aa1++;
            break;
            
        case "2":
 
            System.out.println("two");
            aa+=2;
            aa1++;
            break;
            
        case "3":
 
            System.out.println("three");
            aa+=3;
            aa1++;
            break;
            
        case "4":
 
            System.out.println("four");
            aa+=4;
            aa1++;
            break;
            
        case "5":
 
            System.out.println("five");
            aa+=5;
            aa1++;
            break;
            
        case "6":
 
            System.out.println("six");
            aa+=6;
                aa1++;
            break;
            case "stop":
 
            System.out.println("you just stopped?");
            aaa = 1;
            break;
            
 
                default:
 
                    System.out.println("no points you have resieved?");
        }
    }
	
	    System.out.println("middle of points that you've resieved : "+aa/aa1);
	}
}
