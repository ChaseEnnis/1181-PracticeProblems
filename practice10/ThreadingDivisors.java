
public class ThreadingDivisors  {
	public static void main(String[] args) throws InterruptedException{
		long start = System.currentTimeMillis();


		Thread1 Thread1 = new Thread1();
		Thread2 Thread2 = new Thread2();

		Thread1.start();
		Thread2.start();


		Thread1.join();
		Thread2.join();


	if (((Thread1)Thread1).getAnswer()> ((Thread2)Thread2).getAnswer()){
	System.out.println(((Thread1)Thread1).getAnswer() + " has the most divisors (" + ((Thread1)Thread1).getDivisors() + " )");
	}
	else{
		System.out.println(((Thread2)Thread2).getAnswer() + " has the most divisors (" + ((Thread2)Thread2).getDivisors() + " )");

	}
	long end = System.currentTimeMillis();

	System.out.println(end -start + " milliseconds");

	
}
}
