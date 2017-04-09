/*
 * Name:Na Li
 * Lab: 2:45pm - 3:40pm, Monday
 */
public class Stack{
  //Declare the variables
  private Node top;
  //Default constructor
  public Stack(){
    top = null;
  }
 /*
  * The push method add a node to the Stack
  * @param str 
  */
 public void push(String str){
   Node newNode = new Node(str);
   newNode.setNext(top);
   this.top = newNode; 
 }
  /*
  * The push method add a node to the Stack
  * @param n 
  */
 public void push(Node n){
   n.setNext(top);
   this.top = n;
 }
  /*
  * The pop method retuen and delete a node of the Stack
  * @return the top node of stack 
  */
 public Node pop(){
    //return and delete the top node of the stack
   Node newNode = top;
   this.top = this.top.getNext();
   return newNode;
  }
 /*
  * The peek method return the top node of the Stack
  * @return the top node of stack 
  */
 public Node peek(){
    return this.top;
  }
 /*
  * The destory method destory the Stack
  */
  public void destory(){
    top = null;
  }
 /*
  * The print method which print all content of the Stack
  */
  public void print(){
    if(isEmpty()){
      System.out.println("The stack is empty");
    }
    else{
      Node newNode = this.top;
      while(newNode.getNext()!=null){
        newNode.print();
        newNode = newNode.getNext();
      }
      newNode.print();
    }
  }
 /*
  * @return 
  */
 public boolean isEmpty() {
    return this.top==null;
 } 
}
    
    