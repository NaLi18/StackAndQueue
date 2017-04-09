/*
 * Name:Na Li
 * Lab: 2:45pm - 3:40pm, Monday
 */
public class Queue{
  // Declare variables 
  private Node front;
  private Node back;
  //The default constructor
  public Queue(){
    front = null;
    back = null;
  }
  /*
   * The enqueue method which add the new node to the queue 
   * @param n the new node which will add to the queue 
   */
  public void enqueue(Node n){
    if(this.isEmpty()){
      this.front = n;
      back = n;
    }
    else{
      back.setNext(n);
      back = n;
    }
  }
  /*
   * The dequeue method which return and delete the node of queue
   * @return the end of queue
   */
  public Node dequeue(){
    Node newNode = front;
    front = front.getNext();
    if(front == null)
      back = null;
    return newNode;
  }
  /*
   * The peek method which return the node of queue
   * @return the enf of queue
   */
  public Node peek(){
    return this.front;
  }
  /*
   * The destory method which destory the queue
   */
  public void destory(){
    front = null;
    back = null;
  }
  /*
   * The print method which display the content of queue
   */
  public void print(){
    if(isEmpty()){
      System.out.println("The stack is empty");
    }
    else{
      Node newNode = this.front;
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
    return this.front==null;
  } 
}