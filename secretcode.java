import java.util.*;
import java.io.*;
import java.math.*;
public class Main
{
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 BigInteger s=sc.nextBigInteger();
	 BigInteger n=sc.nextBigInteger();
	 BigInteger m=sc.nextBigInteger();
	 BigInteger ans,ans1,b1,b2;
	 ans = new BigInteger("10");
	 ans1 = new BigInteger("1000000007");
	 b1=s.pow(n.intValue());
	 b1=b1.mod(ans);
	 b2=b1.pow(m.intValue());
	 b2=b2.mod(ans1);
	 
	 System.out.print(b2);
	 
	 
	}
}
