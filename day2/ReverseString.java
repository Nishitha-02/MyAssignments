package week3.day2;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		java.lang.String input = "Testleaf";
	char[] character=input.toCharArray();
	int strLength=input.length();
	for(int i=0;i<strLength;i++) {
		if('e'==character[i]) {
			count++;
		}
	}
	
		System.out.println("The no of e characters"+count);		
				
	}

}
