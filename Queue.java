public class Queue{
  private Node front;
  private Node back;
  public Queue(){
    front = null;
    back = null;
  }
 public void enqueue(String str){
    Node newNode = new Node(str);
      if(this.isEmpty()){
        this.front = newNode;
        back = newNode;
      }
      else{
        back.setNext(newNode);
        back = newNode;
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
  }
  public String print(){
    return "";
  }
 public boolean isEmpty() {
    return this.front==null;
 } 
}