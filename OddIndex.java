import java.util.ArrayList;
import java.util.Scanner;

public class OddIndex
{
	public static void main(String[]args)
	{
		ArrayList<Integer> numbers = new ArrayList<>();
		Scanner keyboard = new Scanner(System.in);
		int arrayNum, index, sum = 0;
		double remainderIndex, remainderNum;
		boolean addNum = true;
		
		System.out.println("Please enter numbers until you are ready. Then enter -1");
		
		do
		{
			System.out.println("Please enter a number.");
			arrayNum = keyboard.nextInt();
			if(arrayNum != -1)
			{
				numbers.add(arrayNum);
				addNum = true;
			}
			else
			{
				addNum = false;
			}
		}while(addNum == true);
			
		for(index = 0; index < numbers.size(); index++)
		{
			remainderIndex = (index % 2);
			
			if(remainderIndex == 0)
			{
				remainderNum = (numbers.get(index) % 2);
				if(remainderNum == 1)
				{
					sum += numbers.get(index);
				}
			}
			else
			{
				remainderNum = (numbers.get(index) % 2);
				if(remainderNum == 0)
				{
					sum += numbers.get(index);
				}
			}
		}
		
		
			System.out.println("The total of the odd numbers in even indexes and even numbers in odd indexes is " + sum);
	}
}
