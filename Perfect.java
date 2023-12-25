/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int number = Integer.parseInt(args[0]);
		int sum = 0;
		String perfectNumberString = number + " is a perfect number since " + number +" = 1";
		for (int i = 1; i < number; i++) {
			if (number%i==0) {
				System.out.println(i);
				sum += i;
				perfectNumberString +=" + " + i ;
			}
		}
		if (sum==number) {
			System.out.println(perfectNumberString);
		}
		else{
			System.out.println(number + " is not a perfect number");
		}
		//// Put your code here
	}
}
