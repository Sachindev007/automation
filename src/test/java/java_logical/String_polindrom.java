package java_logical;

public class String_polindrom {

	public static void main(String[] args) 
	{
		String s="moma";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
		rev=rev+s.charAt(i);
		}
		if(s.equals(rev))
		{
			System.out.println("yes it is polindrom");
		}
		else
		{
			System.out.println("no it is not");
		}
	}

}
