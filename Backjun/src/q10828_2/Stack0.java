package q10828_2;

public class Stack0 {
	private int [] arr;	
	private int top;
	
	
	public Stack0(int [] arr) {
		this.arr = arr;
		this.top = -1;
	}
	
	public void push(int x) {
		arr [++top] = x;
	}
	
	public void pop() {
			
		if(this.top == -1) {
			System.out.println(this.top);
		}
		else {
			System.out.println(arr[top--]);
		}
	}
	
	
	public void size() {
		System.out.println(top + 1);
	}
	
	public void empty() {
		if(this.top == -1) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
	}
	
	public void top() {
		if(this.top == -1) {
			System.out.println(-1);
		}
		System.out.println(arr[top]);
	}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}
	
	
	
}