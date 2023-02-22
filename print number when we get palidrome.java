import java.util.*;
public class Main
{
    static int reverse(int n){
        
        int r,rev=0;
        while(n>0){
            r=n%10;
        rev=rev*10+r;
        n=n/10;
        }
        return rev;
    }
    
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int rev;
        while(true){
            rev=reverse(n);
            if(n == rev)
            break;
            n=n+rev;
        }
        System.out.println(n);
	    }
	
	}
