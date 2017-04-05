public class Queue{
  private Node front;
  private Node back;
  public Queue(){
    front = null;
    back = null;
  }
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
  
  public Node dequeue(){
    //return and delete the front node of the stack
    Node newNode = front;
    front = front.getNext();
    if(front == null)
      back = null;
   return newNode;
  }
  public Node peek(){
    return this.front;
  }
  public void destory(){
    front = null;
    back = null;
  }
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
    }
  }
 public boolean isEmpty() {
    return this.front==null;
 } 
}