package practice;
import java.util.*;
public class str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		StringBuilder sb=new StringBuilder(s);
		sb=sb.reverse();
		if(s.equals(sb.toString()))
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
	}

}
