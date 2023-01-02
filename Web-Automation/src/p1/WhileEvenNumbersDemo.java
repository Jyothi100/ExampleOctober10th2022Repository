package p1;

public class WhileEvenNumbersDemo {

	public static void main(String[] args) {
		EvenNumbers();
	}
	public static void EvenNumbers()
	{
		int i=1;
		while(i<=20)
		{
			if(i%2==0)
			{
				System.out.println("Even number :"+i);
				
			}
			i++;
		}
	}

}
