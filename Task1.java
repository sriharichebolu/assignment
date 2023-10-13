class Task1 
{
	public int getvalue(char ch)
	{
		if(ch=='I')
		{
			return 1;
		}
		else if(ch=='V')
		{
			return 5;
		}
		else if(ch=='X')
		{
			return 10;
		}
		else if(ch=='L')
		{
			return 50;
		}
		else if(ch=='C')
		{
			return 100;
		}
		else if(ch=='D')
		{
			return 500;
		}
		else if(ch=='M')
		{
			return 1000;
		}
			return -1;
    }
	public int romanToInt(String s)
	{
		int sum=0;
		for (int i=0;i<s.length() ;i++ )
		{
			int currentvalue=getvalue(s.charAt(i));
			if(i<s.length()-1)
			{
				int nextvalue=getvalue(s.charAt(i+1));
				if(currentvalue<nextvalue)
				{
					sum=sum-currentvalue;
				}
				else
				{
					sum=sum+currentvalue;
				}
            }
			else
			{
				sum=sum+currentvalue;
			}
		}
			return sum;
	}
	public static void main(String[] args) 
	{
		String s="X";
		Task1 rao=new Task1();
		System.out.println(rao.romanToInt(s));
	}
}
