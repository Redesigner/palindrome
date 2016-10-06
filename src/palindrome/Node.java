package palindrome;

import java.util.Scanner;

public class Node<E> {

	private E element;
	Node<E> next;
	
	
	
	public Node() {
		this.element = null;
		this.next = null;
		
	}
	
	public Node(E e) {
		this.element = e;
		this.next = null;
	}
	
	
	public E getElement() {
		return this.element;
	}
	
	
	public void setElement(E element) {
		this.element= element;
	}


        static final String IGNORE_CHARS = " +-',.?!";

	public static void main(String[] args) {
            Queue answers = new Queue();
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            
            while(!input.equals("quit")){
                //test if palindrome
                String inputL = input.toLowerCase();
                Stack inStack = new Stack();
                Queue inQueue = new Queue();
                
                for(int i = 0; i < (inputL.length()); i++) {
                    if(IGNORE_CHARS.indexOf(inputL.charAt(i))==-1) { //if there aren't any ignore chars, add it to the stack
                        inStack.push(inputL.charAt(i));
                        inQueue.enqueue(inputL.charAt(i));
                    }
                }
                
                while(inStack.size() > 0) {
                    if(inQueue.peek().equals(inStack.peek())){
                        inQueue.dequeue();
                        inStack.pop();
                    }
                    else {
                        break;
                    }
                }
                
                if(inStack.size()==0){
                    answers.enqueue(input);
                    System.out.println("It is a palindrome!");
                }
                else{
                    System.out.println("It is not a palindrome...");
                }
                input = scanner.nextLine();
            }
            
            System.out.println("~~~~~~~~~~~~~~~~~~~~\nAnswers:");
            while(answers.peek()!=null){
                System.out.println(answers.dequeue());
            }
	}

}