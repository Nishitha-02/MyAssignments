package org.system;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("My desktop size is 15inches");
	}
   public void desktopColour() {
	   System.out.println("My desktop colour is black");
   }
	public static void main(String[] args) {
		Desktop system = new Desktop();
		system.desktopSize();
		system.desktopColour();
		system.computerModel();
		system.computerRam();

	}

}
