public class Thread1 extends Thread {
    private int answer;
    private int maxDivisors;

    
    @Override
    public void run() {
        

            maxDivisors = 0;
		    int answer = 0;


		
		for (int n=1; n<50000; n++) {
			int divisors = getNumDivisors(n);
			if (divisors > maxDivisors) {
				maxDivisors = divisors;
				answer = n;
			}
		}


    }

	
	public static int getNumDivisors(int n) {
		int numDivisors = 0;
		for (int i=1; i<=n; i++) {
			if (n % i == 0) {
				numDivisors++;
			}
		}
		return numDivisors;
	}


    public int getAnswer(){
        return this.answer;

    }


    public int getDivisors(){
        return this.maxDivisors;
    }



        
        
        
        
}







    
