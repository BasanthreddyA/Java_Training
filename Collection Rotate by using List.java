import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   /* Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int a[]=new int[a];
	    for(int i=0;i<a;i++){
	        a[i]=sc.nextInt()
	    }
		System.out.println("Hello World");*/
		
		
		ArrayList<Integer> a=new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(50);
		a.add(60);
		a.add(70);
		a.add(100);
		
		int r=5;
		Collections.rotate(a,-r);
		System.out.println(a);
		
	}
}


//Rotate fuction are used to rotate the array when we used negative value it will goes l>>>R, When it willl be  +r it will goes r>>l
