
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		int boyOrGirl = (int)((Math.random()) *2+1);
		boolean girl = false;
		boolean boy = false;
		int count = 0;
		while (!girl || !boy) {
			count++;
			if (boyOrGirl==1){
				System.out.print("g ");
				girl = true;
			}
			else{
				System.out.print("b ");
				boy = true;
			}
			boyOrGirl = (int)((Math.random()) *2+1);
		}
			System.out.println( "\nYou made it... and you now have " + count +" children.");
	}
}
