class Q3Stack{
	int size;
	int top1;
	int top2;
	int arr[] = null;
	Q3Stack(int z){
		this.size = z;
		this.arr =new int[size]; 
		
		top1 = size/2+1;
		top2 = size/2;
	}
	
	void push1(int x){
		if(top1>0){
			top1--;
			arr[top1]=x;
		
		}
		else
		{
			System.out.println("stack oveflow due to "+x);
			return;
		}
	}
	
	void push2(int x){
		if(top2<size-1){
			top2++;
			arr[top2]=x;
			
		}
		else{
			System.out.println("stack oveflow due to "+x);
			return;
		}
	}
	
	int pop1(){
		if(top1<=size/2){
			int x = arr[top1];
			top1++;
			return x;
		}
		else{
			System.out.println("UNDERFLOW");
		
			
		}
		return 0;
		
	}
	
	int pop2(){
		if(top2>size/2+1){
			int x = arr[top2];
			top2--;
			return x;
		}
		else{
			System.out.println("UNDERFLOW");
			
		}
		return 1;
		
	}
	
	public static void main(String args[]){
		
		Q3Stack ss = new Q3Stack(10);
		ss.push1(15);
		ss.push2(10);
		ss.push1(11);
		ss.push2(7);
		ss.push2(40);
		System.out.println("POPPED element from stack1 "+ss.pop1());
		System.out.println("popped element from stack 2 "+ss.pop2());
		
	}
	
}