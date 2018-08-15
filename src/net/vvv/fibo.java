package net.vvv;

public class fibo {
	public static void main(String[] agrs) {
		int i;
		System.out.println("day so fibonaci");
		for(i=0;i<10;i++) {
			System.out.println(fibonaci(i)+"");
		}
		
	}
 public static int fibonaci(int n) {
	 if(n<0) {
		 return -1;
	 }
	 else if(n==0 ||n==1) {
		 return	n;
	 }
	 else {
		 return fibonaci(n-1)+fibonaci(n-2);
	 }	
	}

}
