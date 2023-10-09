import java.util.Scanner;

class Task2
{
	int math,eng,sci,history,geog;
	int total;
	double average,percentage;
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("\nEnter marks for Maths out of 100: ");
		math=sc.nextInt();
		System.out.println("\nEnter marks for English out of 100: ");
		eng=sc.nextInt();
		System.out.println("\nEnter marks for Science out of 100: ");
		sci=sc.nextInt();
		System.out.println("\nEnter marks for History out of 100: ");
		history=sc.nextInt();
		System.out.println("\nEnter marks for Geography out of 100: ");
		geog=sc.nextInt();
		
	}
	public void cal()
	{
		total=math+eng+sci+history+geog;
		System.out.println("\nTotal of Subject Marks are: "+total);
		average=total/5;
		System.out.println("\nAverage of Subject Marks are: "+average);
		percentage=(total*100)/500;
		System.out.println("\nPercentage of Subject Marks are: "+percentage);
	}
	public void grade()
	{
		if(average>=80)
		{
			System.out.println("Grade A");
		}
		else if(average>=60 && average<80)
			{
			System.out.println("Grade B");
		}
		else if(average>=40 && average<60)
		{
			
			System.out.println("Grade C");
		
		}
		else
		{
			System.out.println("Grade D");
		}
	}
	public static void main(String[] args) 
	{
		Task2 t2=new Task2();
		t2.input();
		t2.cal();
		t2.grade();
	}
}