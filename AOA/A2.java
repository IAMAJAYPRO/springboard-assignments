import java.util.ArrayDeque;
import java.util.Deque;

class Tester {

    public static Deque<Character> updateStack(Deque<Character> inputStack) {
		Deque<Character> tmp= new ArrayDeque<Character>();
        for (int i=0;i<3;i++){
            tmp.push(inputStack.removeLast());
        }
        while(!inputStack.isEmpty()){
            tmp.addLast(inputStack.pop());
        }
        return tmp;
	}
	
	public static void main(String[] args) {
		
		Deque<Character> inputStack = new ArrayDeque<Character>();
		inputStack.push('E');
		inputStack.push('D');
		inputStack.push('C');
		inputStack.push('B');
		inputStack.push('A');
		
		Deque<Character> resultStack = updateStack(inputStack);
		
		System.out.println("The alphabets in updated stack are:");
		for(Character alphabet: resultStack)
		    System.out.println(alphabet);
	}
}