package net.vvv;

public class hello {
	public static void main(String[] args) {
		double a=8;
		double b=12;
		double c=1;
		double x,x1,x2;
		double delta;
		delta = b*b-4*a*c;
		if(delta>0) {
        x1=(b-Math.sqrt(delta)/2*a);
        System.out.println("nghiem x1:"+x1);
        x2=(b+Math.sqrt(delta)/2*a);
        System.out.println("nghiem x2:"+x2);
         		}
		 else if(delta <0) {
			 System.out.println("phuong trinh vo nghiem");
		 }
		 else if(delta ==0) {
			 x=-b/2*a;
			 System.out.println("nghiem kep x:"+x);
		 }	
		}
	}


