package java_logical;

public class reverse_string {

	public static void main(String[] args) 
	{
		String arr="java";
		String rev="";
		for(int i=arr.length()-1;i>=0;i--)
		{
			rev=rev+arr.charAt(i);
		}
	System.out.println(rev);

	}

}
