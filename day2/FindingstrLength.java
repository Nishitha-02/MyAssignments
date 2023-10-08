package week3.day2;

public class FindingstrLength {
	public static void main(String[] args) {
		String input = "Hello Everyone";
		String[] split = input.split(" ");
		
		int strLength = split.length;
		System.out.println("The length of the string: "+strLength);
		
		System.out.println("The word Everyone length is: "+split[strLength-1].length());
		
	}

}
