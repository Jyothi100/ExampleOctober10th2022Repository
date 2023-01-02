package p1;

public class EvenNumbersDemo {

	public static void main(String[] args) {
		displayEvenNumbers();
	}
    public static void displayEvenNumbers()
    {
    	for(int i=1;i<=20;i++)
    	{
    		if(i%2==0)
    		{
    			System.out.println("Even Numbers :"+i);
    		}
    	}
    }
}
