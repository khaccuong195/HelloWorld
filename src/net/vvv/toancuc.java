package net.vvv;

public class toancuc {
	public String ten;
	private int tuoi;
	public toancuc(String ten) {
		this.ten=ten;
	}
	public void settuoi(int tuoi) {
		this.tuoi=tuoi;
	}
public void showstudent() {
	System.out.println("ten :"+ten);
	System.out.println("tuoi :"+tuoi);
}
public static void main(String[] agrs) {
	toancuc sv =new toancuc("tran teo");
	sv.settuoi(21);
	sv.showstudent();
}
	
}
