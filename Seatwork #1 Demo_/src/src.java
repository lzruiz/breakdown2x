/**
 * @author lorenzonoelmenor
 *	Flowchart Tracer Exercise 
 *	Permitted for personal use.
 */

public class src {

	public static void main(String[] args) {
		//This is to validate my flowchart tracking
		
		//Change these values to your liking to practice flowchart tracing
		int A = 10; 
		int N = 1; 
		int E = 2; 
		int T = 5; 
		int H = 0;
		
		//array to hold values and change as we go
		//this will be our catalyst for the print tracking
		int[] arr= new int[] {A,N,E,T,H};
		
		//the first do-while loop based on the flowchart
		
	/*
		do {
			
			A = (T + A) * 2;
			E = E + A;
			H = H + 2;
			
		} while(H <= 10);
		 
	*/
		
		System.out.println("A\tN\tE\tT\tH");
		
		for(int i = 0; i < 5; i++) 
			System.out.printf("%d\t|", arr[i]);
		
		System.out.println("");	
		
		do{
			
			arr[0] = (arr[3] + arr[0]) * 2;
			arr[2] = arr[2] + arr[0];
			arr[4] = arr[4] + 2;
			
			for(int i = 0; i < 5; i++) 
				System.out.printf("%d\t|", arr[i]);
			
			System.out.println("");			
		}while(arr[4] <= 10);
		
		
	/*
	    do {
			
			N = N * 3 + H;
			T = T + 10;
			H = H - 2;
			System.out.print("");
			
		} while(H > 2);
	 */
		
		
		do {
			arr[1] = arr[1] * 3 + arr[4];
			arr[3] = arr[3] + 10;
			arr[4] = arr[4] - 2;
			
			for(int i = 0; i < 5; i++) 
				System.out.printf("%d\t|", arr[i]);
			
			System.out.println("");	
		}while(arr[4] > 2);
		
		
		//System.out.println(A+" "+N+" "+E+" "+T+" "+H);
		
		System.out.println("-----------------------------------------");
		
		System.out.printf("A = %d\nN = %d\nE = %d\nT = %d\nH = %d",arr[0],arr[1], arr[2], arr[3], arr[4]);
	}

}
