package practice;
import java.util.Scanner;
import java.text.DecimalFormat;
public class time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df=new DecimalFormat("00");
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int h=t/3600;
		int r=t%3600;
		int m=r/60;
		int s=r%60;
		//System.out.printf("%d : %0,2d : %0,2d",h%24,m,s);
		
		System.out.printf(h%24+" : "+df.format(m)+" : "+df.format(s));
	}

}
