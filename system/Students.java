package org.system;

public class Students {
           
	public void getStudentInfo(int id) {
		System.out.println(id);
		}
	
	public void getStudentTnfo(int id,String name) {
		System.out.println(id+name+ " ");
	}
	
	public void getStudentInfo(String email,String phoneNumber) {
		System.out.println(email+ " " +phoneNumber);
	}
	public static void main(String[] args) {
		Students details = new Students();
		details.getStudentInfo(124);
		details.getStudentTnfo(124," Testleaf");
		details.getStudentInfo("Testleaf123@gmail.com ", "ph.No:9005577771");

	}

}
