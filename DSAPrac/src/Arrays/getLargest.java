package Arrays;



public class getLargest {

	//time complexity O(n^2) and linear if largest element is at 0th index
	 static int getlrgst(int arr[],int n ){ //{5,15,13,10,20}
			
		 for(int i = 0;i<n;i++) { /* for one value of outer loop inner loop is traversing whole 
		 							array until the condition is satisfied	*/
			 boolean flag = true;
			 for(int j =0;j<n;j++) {
				 if(arr[j]>arr[i]) {
				 
				 flag=false;
				 break;
				 }
			 }
			 if(flag==true)
				 return arr[i];
		 }
		 return -1;
		 
		}
	 
	 
	 // time complexity is O(n)
	 static int getlrgstnaive(int []arr,int n) { /*here we are updating the value of 
		                             the current index to the largest element found in every
		 							iteration*/
		 
		 int res=0; 
		 for(int i=0;i<n;i++) {
			 if(arr[i]>arr[res]) {
				 res=i;
			 }
		 }
		 return arr[res];
		 
	 }
	
	 
	 static int getTarget(int[]arr, int target) {
		 for(int i = 0;i<arr.length;i++) {
			 if(arr[i]==target) {
				 return i;
			 }
		 }
		 return -1;
	
	 }
	
	
	public static void main(String[] args) {
		int []arr = {5,10,20,15,25};
		System.out.println(getlrgst(arr,5));
		System.out.println(getlrgstnaive(arr,5));
		System.out.println(getTarget(arr, 20));
	}

}
