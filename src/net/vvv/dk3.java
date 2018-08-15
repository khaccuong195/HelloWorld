package net.vvv;

public class dk3 {
	public static void main(String[] agrs) {
		int mark =95;
	if(mark < 50) {
		System.out.println("tach");
	}
	else if(mark >=50 && mark<60 ) {
	System.out.println("xep loai D");
	}
	else if (mark >= 60 && mark <70) {
		System.out.println("xep loai C");
	}
	else if (mark >= 70 && mark <85) {
		System .out.println("xep loai B");
	}
	else if(mark>=85 && mark <=100) {
		System.out.println("xep loai a");
	}
	else {
		System.out.println("gia tri khong hop le");
	}
	}
}
