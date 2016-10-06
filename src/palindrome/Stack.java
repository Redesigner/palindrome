package palindrome;

/*
 * Implement a reference based stack
 */
public class Stack<E> {
	
	private Node<E> top;
        private int size;

	public Stack() {
		this.top = null;
                this.size = 0;
	}
	
	
	/*
	 * places element on the top of the stack
	 */
	public void push(E element){

            Node<E> node = new Node(element);
            if(top == null){
                top = node;
                size++;
            }
            else {
                node.next = top;
                top = node;
                size++;
            }
	}
	
	/*
	 * remove the top node and return its contents
	 */
	public E pop(){
		Node<E> removed = top;
                top = top.next;
                size--;
		return removed.getElement(); //replace
	}
	
	/*
	 * Look at the top element of the Stack and return it, without removing
	 */
	public E peek(){
		return top.getElement(); //replace
	}
	
	//returns the size of the stack
	public int size(){
		return size;  //replace
	}
        
        public String toString(){
            String output = "";
            Node<E> target = top;
            while(target!=null){
                output += target.getElement() + "==>";
                target = target.next;
            }
            return output;
        }
}