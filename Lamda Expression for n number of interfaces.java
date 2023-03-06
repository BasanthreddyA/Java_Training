//Anonymous Inner Class : using the Lamda Expressions , we use lamda Expression when there is only one method


import java.util.*;
interface AI{
    public void sum(int a,int b);
}

interface AI2{
    public void product(int a,int b);
}

interface AI3{
    public void subtraction(int a,int b);
}

public class Main
{
	public static void main(String[] args) {
	    
		AI obj = (int a,int b) -> System.out.println("The sum of Two Elements of interface class AI "+(a+b));
		AI2 o = (int a,int b) -> System.out.println("The product of Two Elements of interface class AI2 "+a*b);
		AI3 ob = (int a,int b) -> System.out.println("The subtraction of Two Elements of interface class AI3 "+ (a-b));
		Scanner sc=new Scanner(System.in);
		obj.sum(sc.nextInt(),sc.nextInt());
		o.product(sc.nextInt(),sc.nextInt());
		ob.subtraction(sc.nextInt(),sc.nextInt());
	}
}
