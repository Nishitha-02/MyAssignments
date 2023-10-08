package week3.day2;

public class ReverseEvenWords {
	public static void main(String[] args) {

	String test = "I am a software tester"; 
	String[] words =test.split(" ");
	
	
    for(int i=0;i<words.length;i++){
    	if(i%2==1) {
    		char[] chars = words[i].toCharArray();
    		for (int j=chars.length-1;j>=0;j--) {
    			System.out.println(chars[j]);
    		}
    	}else {
    		System.out.println(words[i]);
    		
    		
    		
    	}
    	
    System.out.println(" ");
		

	}
	
}
}
	
	
