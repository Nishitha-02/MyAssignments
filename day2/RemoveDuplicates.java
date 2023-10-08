package week3.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";	
		String[] words =text.split(" ");
		int count = 0;
		for (int i=0;i<words.length;i++) {
			for(int j=0; j<words.length;j++) {
			if(i!=j && words[i].equals(words[j])) {
				count++;
			}
		     }
		
	if(count>1) {
		words[i] = " " ;
			
	}
	count =0;	
	}
    String result=String.join(" ", words);
    System.out.println( result);
	}

}
