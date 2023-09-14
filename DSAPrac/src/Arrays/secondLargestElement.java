package Arrays;

public class secondLargestElement {

	//naive approach 
	//in this approach array is being traversed twice in order to find largest and second largest
	//which is why it's time complexity is O(n^2)
	
	
	
	static int lrgstel(int arr[], int n) {
		int lrgst = 0;
		
		if (n < 2)
	    {
	        System.out.printf(" Invalid Input ");
	        
	    }
		
		for(int i =1; i<n; i++){  //{10,5,4,35,8} 
			if(lrgst < arr[i]) {
				lrgst = arr[i];
			}
		
		}
		return lrgst;
	}
	
	static int scndlrgst(int arr[], int n) {
		
		if (n < 2)
	    {
	        System.out.printf(" Invalid Input ");
	        
	    }
		
		int lrgst = lrgstel(arr, n);
		int scndlrgst = 0;
		
		for(int i=1; i<n; i++) {   //{10,5,4,35,8}
			
			if(scndlrgst<arr[i]) {
				
				if(arr[i]!= lrgst) {
					
					scndlrgst = i;
				}
				
			}
			
		}
		
		return arr[scndlrgst];
	}
	
	// Efficient Approach
   //  In this array is traversed once and time complexity is O(n).

	
	
	static int scndlrgstelnaive(int arr[], int n) { //{10,5,4,35,8}
		
		int res = -1;   // res is initialized with -1
		int lrgst = 0;
		
		if (n < 2)
	    {
	        System.out.printf(" Invalid Input ");
	        
	    }
		
		for(int i = 1; i<n; i++) { 
			
			if(arr[i] > arr[lrgst]) {
				
				res = lrgst;  //res is used to store the 2nd largest element
				lrgst = i;    // lrgst becomes 35
				
			}
			
			else if (arr[i] != arr[lrgst]) {
				if(res==-1 || arr[i]>arr[res]) {
					res = i;
				}
			}
			
		}
	
		return arr[res];
		
	}
	
	// third approach is sort the array and compare using the end indexes
	
	static int scndlrgstelidx(int arr[], int n) {
		return 0;
	}
	
	
	
	public static void main(String[] args) {
		int arr[] = {4,5,12,18};
		int n = arr.length;

		System.out.println(scndlrgstelnaive(arr, n));
		System.out.println(scndlrgst(arr, n));
	}

}
