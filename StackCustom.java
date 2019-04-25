package code;

public class StackCustom {

	int size;
	int arr[];
	int top;

	public StackCustom(int size) {
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
	}

	public boolean isFull() {
		return (size - 1 == top);
	}

	public void push(int pushElement) {
		if (!isFull()) {
			top++;
			arr[top] = pushElement;
			System.out.println(pushElement + " is pushed onto the stack. ");
		} else {
			System.out.println("Stack is full!!");
		}
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public int pop() {
		if (!isEmpty()) {
			int returnedTop = top;
			top--;
			System.out.println(arr[returnedTop] + " is popped out from the stack.");
			return arr[returnedTop];
		} else {
			System.out.println("Stack is Empty!!");
			return -1;
		}
	}

	public static void main(String[] args) {
		StackCustom stack = new StackCustom(5);
		stack.pop();
		stack.push(31);
		stack.push(12);
		stack.push(54);
		stack.push(19);
		stack.push(91);
		stack.push(23);
		stack.pop();
		stack.pop();

	}
}
