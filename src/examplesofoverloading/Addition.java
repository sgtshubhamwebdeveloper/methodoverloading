package examplesofoverloading;

public class Addition {
	void sum(int a,int b,int c) 
	{
	int t = a+b+c;
	System.out.println("Sum of three numbers :"+t);
	}
public static void main(String[] args)
{
	Addition a = new Addition();
	a.sum(50,100,200);
}
}
