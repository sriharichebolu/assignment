class Task 
{
	public static void main(String[] args) 
	{
		String s="abcdefghijklmnopqrstuvwxyz";
		int [] check=new int[26];
		String str=s.toLowerCase();
		for (int i=0;i<str.length() ;i++ )
		{
			if(str.charAt(i)!=26 && str.charAt(i)>=97&& str.charAt(i)<=122)
			{
				check[str.charAt(i)-97]=1;
			}
		}
		for (int i=0;i<26;i++) 
		{
			if(check[i]!=1)
			{
				System.out.println("not pangram");
				System.exit(0);
			}
		}
		System.out.println("pangram");
	}
}
