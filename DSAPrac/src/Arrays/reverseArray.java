public class reverseArray {
	
	
	static List<Integer> revArray(List<Integer> a){ //{12,14,18,5,4}
	
		//while loop using collections
		int low = 0;
		int high = a.size()-1;
		
		while(low<high) {
			int temp = a.get(low);
			a.set(low, a.get(high));
			a.set(high, temp);
			
			low ++;
			high--;
			
		}
		
		//for loop
		for(int i = 0;i<a.size();i++) {
			int temp = a.get(i);
			a.set(i, a.get(a.size()-1));
			a.set(a.size()-1, temp);
		}
		
		return a;
		
		
		
		
	}
		

	public static void main(String[] args) {
		
	List<Integer>a = new ArrayList<>();
	a.add(1);
	a.add(2);
	a.add(3);
	a.add(4);
	a.add(5);
	
	System.out.println(revArray(a));
		

}

}
