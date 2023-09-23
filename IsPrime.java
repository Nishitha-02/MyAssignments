package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		int n=11;
		boolean flag = false;
	    for(int i=2; i<n/2; ++i) {
			if (n % i ==0) {
				flag = true;
				break;
			}
	    }
			if (!flag) {
				System.out.println("it is a prime number");
			}
			else {
				System.out.println("it is  not a prime number");
			}
		}

	}



