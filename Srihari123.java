import java.util.*;
class Srihari123 
{
	public static void main(String [] args)
	{
		ArrayList al=new ArrayList();
		al.add(80);
		al.add(10);
		al.add(2);
		al.add(143);
		al.add(21);
		System.out.println("Before shuffling"+al);
		Collections.shuffle(al);
		System.out.println("after shuffling"+al);
	}
}