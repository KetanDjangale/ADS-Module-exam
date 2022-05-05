class Q1Sorting{
	
	void printArray(int [] arr){
		
		int n= arr.length;
		for(int i = 0;i<n;i++){
			System.out.println(arr[i]+" ");
		}
	}
	
	void sort(int [] arr){
		int n= arr.length;
		
		for(int i =1;i<n;i++){
			int temp = arr[i];
			int j = i -1;
			
			while(j>= 0 && arr[j]>temp){
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = temp;
			
			
		
		}
		
		
		
	}
	
	public static void main(String args[]){
		int [] a1 = new int[]{2,4,6,8,3};
		Q1Sorting s = new Q1Sorting();
		s.printArray(a1);
		
		System.out.println("After applying insertionsort");
		s.sort(a1);
		s.printArray(a1);
	}
	
	
	
	
	
	
	
	
	
	
}