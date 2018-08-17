package net.vvv;

public class giaithua {
	public static void main(String[] agrs) {
	int	a=5;
	int b=6;
	int c=7;
	System.out.println("giai thua cua a:"+ tinhgiaithua(a));
	System.out.println("giai thua cua b:"+ tinhgiaithua(b));
	System.out.println("giai thua cua c:"+ tinhgiaithua(c));
		}
	public static long tinhgiaithua(int n) {
		if(n>0) {
			return n*tinhgiaithua(n-1);
		}
		else {
			return 1;
		}
	}

}
