import java.util.Scanner;

public class TestR�wnania {

	public static void main(String[] args) 
	{
		System.out.println("Podaj parametry a, b i c");
		Scanner skaner = new Scanner(System.in);
		int a = skaner.nextInt();
		int b = skaner.nextInt();
		int c = skaner.nextInt();

		RownanieKwadratowe r = new RownanieKwadratowe(a, b, c);
		System.out.println(r.rozwi��());
		System.out.println(r);
		
	}

}
