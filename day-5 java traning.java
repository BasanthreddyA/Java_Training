
java Traning day-5

//printing the programe for ascii values of lalphabetics and numbers
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    System.out.println();
	    char ch1,ch2,ch3;
	    for(ch1='a',ch2='A',ch3='0';ch1<='z' && ch2<='Z' && ch3<='9';ch1++,ch2++,ch3++){
	        System.out.println(ch1+" "+(int)ch1+" ");
	         System.out.println(ch2+" "+(int)ch2+" ");
	          System.out.println(ch3+" "+(int)ch3+" ");
	    }
	    //IntStream.range(1,101).forEach(e->System.out.print(e+" "));
		//System.out.println(print(1));
	}
	
	/*static int print(int i){
	     if(i<=100)
	     
	     return i++;
	     return i;
	}*/
}
