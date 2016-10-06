package palindrome;

/*
 * Implement a reference based queue
 */
public class Queue<E> {
	
	private Node<E> front;
	private Node<E> back;
        private int size;

	public Queue() {
		this.front = null;
		this.back  = null;
                this.size = 0;
	}
	
	
	/*
	 * places element in the back of the Queue
	 */
	public void enqueue(E element){

            Node<E> node = new Node(element);
            if(size==0){
                front = node;
                back = node;
                size++;
            }
            else{
                back.next = node;
                back = node;
                size++;
            }
	}
	
	/*
	 * remove the front node of the queue and return it
	 */
	public E dequeue(){
		Node<E> removed = front;
                front = front.next;
                size--;
		return removed.getElement();
	}
	
	/*
	 * Look at the front of the queue and return it, without removing
	 */
	public E peek(){
            if(front==null){
                return null;
            }
		return front.getElement(); //replace
	}
	
	//returns the size of the queue
	public int size(){
		return size;  //replace
	}
        
        public String toString(){
            String output = "";
            Node<E> target = front;
            while(target!=null){
                output += target.getElement() + "==>";
                target = target.next;
            }
            return output;
        }

}