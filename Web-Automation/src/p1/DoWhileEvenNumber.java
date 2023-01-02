package p1;

public class DoWhileEvenNumber {

	public static void main(String[] args) {
	   DisplayEvenNumbers();

	}
    public static void DisplayEvenNumbers()
    {
    	int i=0;
    	do
    	{
    		if(i%2==0)
    		{
    			System.out.println("Even Number:"+i);
    		}
    		i++;
    	}while(i<=20);
    		
    }
}
