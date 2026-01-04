package java_logical;

public class Count_even_no_given_no {

	public static void main(String[] args) 
	{
		int no=12345;
		int sum=0;
		int count=0;
		while(no!=0)
		{
			int rem=no%10;
			if(rem%2==1)
			{
				sum=sum+rem;
				count++;
			}
			no =no/10;
		}
		
   System.out.println(count);
   System.out.println(sum);
	}

}
