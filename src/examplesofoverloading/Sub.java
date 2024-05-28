package examplesofoverloading;

public class Sub {
	int sub(int x,int y)
	{
		int a= x-y;
		System.out.println("Substraction of two numbers :"+a);
		return a;
	}
	double sub(double x,double y)
	{
		double b = x-y;
		System.out.println("Substraction of two numbers:"+b);
		return b;
	}
	public static void main(String[]args)
	{
		Sub s = new Sub();
		s.sub(6,5);
		s.sub(20.8,10.9);
	}

}
