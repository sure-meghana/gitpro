package practice;
import java.util.*;
public class concat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		String s="";
		if(s2.charAt(0)==s1.charAt(s1.length()-1)) {
		s=s+(s1.substring(0,1)).toUpperCase()+s1.substring(1, s1.length()-1)+s2.substring(0);
		}
		else
			s=s+(s1.substring(0,1)).toUpperCase()+s1.substring(1)+" "+(s2.substring(0,1)).toUpperCase()+s2.substring(1);
		System.out.println(s);
	}

}
