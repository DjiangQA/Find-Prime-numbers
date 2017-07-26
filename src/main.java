
public class main {
	
	static int num;
	static int count = 0 ;

	public static void main(String[] args) {
		
		long startTime;
		long endTime;
		
		startTime = System.currentTimeMillis();
		//int finishValue = 3000000;
		int finishValue = 2000000000;
		
		System.out.println("Prime numbers between 1 and " + finishValue);
		for (int i = 0; i < finishValue ; i ++)
		{
			//System.out.print(i);
			if (isPrime(i) == true)
			{
				System.out.println(" ");
				//System.out.println(isPrime(i));
			}
		}
		endTime = System.currentTimeMillis();
		System.out.println("Total execution time: " + ((double) (endTime - startTime) / 1000) + " seconds");
	}
	
	public static boolean isPrime(int num) {
		if (num > 2 && num % 2 == 0) {
			//System.out.print(num + " is not prime");
			return false;
		}
		int top = (int) Math.sqrt(num) + 1;
		for (int i = 3; i < top; i += 2) {
			if (num % i == 0) {
				//System.out.print(num + " is not prime");
				return false;
			}
		}
		//System.out.print(num + " is prime");
		count ++;
		System.out.println(count);
		return true;
	}

}
