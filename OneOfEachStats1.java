/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int T = Integer.parseInt(args[0]);
		double average = 0;
		int twoChildren = 0;
		int threeChildren = 0;
		int fourOrMoreChildren = 0;
		int sumOfAllChildren = 0;
		String mostCommon = "The most common number of children is ";
		for (int i = 0; i < T; i++) {
			int boyOrGirl = (int)((Math.random()) *2+1);
			boolean girl = false;
			boolean boy = false;
			int count = 0;
			while (!girl || !boy) {
				count++;
				if (boyOrGirl==1){
					girl = true;
				}
				else{
					boy = true;
				}
				boyOrGirl = (int)((Math.random()) *2+1);
			}
			if (count==2){
				twoChildren++;
			}
			else if(count==3){
				threeChildren++;
			}
			else{
				fourOrMoreChildren++;
			}
			sumOfAllChildren += count;
		}

	
		average = sumOfAllChildren/(double)T;
		System.out.println("Average: " + average + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + twoChildren);
		System.out.println("Number of families with 3 children: " + threeChildren);
		System.out.println("Number of families with 4 or more children: " + fourOrMoreChildren);

		if (twoChildren>threeChildren) {
			if (twoChildren>fourOrMoreChildren) {
				mostCommon += "2";
			}
		}
		else if (threeChildren>fourOrMoreChildren) {
			mostCommon += "3";
		}
		else{
			mostCommon += "4";
		}
		System.out.println(mostCommon);

	}
}
