
public class RownanieKwadratowe {

	private int a;
	private int b;
	private  int c;
	

	public RownanieKwadratowe(int a, int b, int c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public String rozwiąż()
	{
		String rozwiązanie = "";
		double delta;
		
		delta = (b*b-4*a*c);
		if (delta>0)
		{
			
			delta=Math.sqrt(delta);
			double x1=(-b-delta)/(2*a);
			double x2=(-b+delta)/(2*a);
			rozwiązanie = "Równanie posiada dwa pierwiastki rzeczywiste: " + x1 + " + " + x2;
			String pierwiastekx1 = Double.toString(x1);
			String pierwiastekx2 = Double.toString(x2);
			
//			System.out.println(pierwiastekx1);
//			System.out.println(pierwiastekx2);
//			
		}
		else if (delta==0)
		{
			
			delta=Math.sqrt(delta);
			double x0=-b/(2*a);
			rozwiązanie = "Równanie posiada jeden pierwiastek rzeczywisty: " + x0;
			String pierwiastekx0 = Double.toString(x0);
			
//			System.out.println(pierwiastekx0);
		}
		else
		{
			rozwiązanie = "Brak pierwiastów rzeczywistych";
		}
		
		return rozwiązanie;
	}
	
	
	public String toString()
	{
		return "Równanie kwadratowe: " + a + "x^2 + " + b + "x + " + c;
		
	}
	
	public void setA(int a)
	{
		this.a = a;
	}
	
	public void setB(int b)
	{
		this.b = b;
	}
	
	public void setC(int c)
	{
		this.c = c;
	}
	
	public static void main(String[] args) 
	{
		RownanieKwadratowe równanie = new RownanieKwadratowe(1, 4, -2);
		System.out.println(równanie.rozwiąż());
	}
}
