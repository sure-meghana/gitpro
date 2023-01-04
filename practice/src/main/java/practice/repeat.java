package practice;
import java.util.*;
public class repeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String s=str.substring(0, 2);
		String a="";
		int l=str.length();
		for(int i=0;i<l;i++)
			a+=s;
		a=a+str.substring(2, str.length());
		System.out.println(a);
	}

}
