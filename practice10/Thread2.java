public class Thread2 extends Thread {

    private int answer;
    private int maxDivisors;

    
    @Override
    public void run() {
        
            
            
            maxDivisors = 0;
		    answer = 0;

		
		for (int n=50000; n<100000; n++) {
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
        return maxDivisors;
    }
}




