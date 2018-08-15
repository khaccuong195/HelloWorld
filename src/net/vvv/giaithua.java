package net.vvv;

public class giaithua {
	public static void main(String[] agrs) {
	int	a=5;
	int b=6;
	int c=7;
	
	System.out.println("giai thua cua a:"+ giaithua(a));
	System.out.println("giai thua cua b:"+ giaithua(b));
	System.out.println("giai thua cua c:"+ giaithua(c));
		
	}
	public static long giaithua(int n) {
		if(n>0) {
			return n*giaithua(n-1);
		}
		else {
			return 1;
		}
	}

}
