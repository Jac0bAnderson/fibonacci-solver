package fibController;

public class FibController 
{
public void start()
{
	Fibonacci(1);
}
	public 	void Fibonacci(int num)
	{
		if(num <= 20)
		{
		int prevNum = 0;
		int newNum = num + prevNum;
		prevNum = num;
		num = newNum;
		System.out.println(newNum);
		Fibonacci(num);
		}
		else
			System.out.println("Reached 55");
		
	}
}
