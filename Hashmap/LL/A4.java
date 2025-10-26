
import java.util.LinkedList;
import java.util.List;

class Tester {

	public static void main(String arga[]){
		Queue queue= new Queue(5);
		
		queue.enqueue("Emily");
		queue.enqueue("Lily");
		queue.enqueue("Rachel");
		queue.enqueue("Rose");
		
		queue.dequeue();
		queue.dequeue();
	
		System.out.println(queue.getQueue());
	}
}
class Queue {
	private List<String> queue;
    private int maxSize;
    Queue(int maxSize) {
        queue=new LinkedList<String>();
        this.maxSize=maxSize;
    }
    public void enqueue(String data){
        queue.add(data);
    }
    public String dequeue(){
        return queue.removeFirst();
    }
    public List<String> getQueue(){
        return new LinkedList<String>(this.queue);
    }
    public boolean isFull(){
        return this.queue.size()>=this.maxSize;
    }
    public boolean isEmpty(){
        return this.queue.size()==0;
    }
}
