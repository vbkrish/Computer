package org.computer.test.com;

public class Deskstop extends Computer{
	public void deskstopSize() {
		System.out.println(" DeskStop Size Is : 21.5 Inchesh");
		

	}
	public static void main(String[] args) {
		
		Deskstop d1 = new Deskstop();
		d1.deskstopSize();
		d1.computerModel();
	}

}
