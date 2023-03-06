//Anonymous Inner Class : using the Lamda Expressions , we use lamda Expression when there is only one method


import java.util.*;
interface AI{
    public void sum(int a,int b);
}

public class Main
{
	public static void main(String[] args) {
	    
		AI obj = (int a,int b) -> System.out.println(a+b);
		Scanner sc=new Scanner(System.in);
		obj.sum(sc.nextInt(),sc.nextInt());
		
	}
}
