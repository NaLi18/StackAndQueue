public class Queue{
  private Node top;
  private Node earlyInput;
  public Queue(){
    top = null;
    earlyInput = null;
  }
 public void enqueue(String str){
    Node newNode = new Node(str);
      if(this.isEmpty()){
        this.top = newNode;
        earlyInput = newNode;
      }
      else{
        newNode.setNext(top);
        top = newNode;
      }
 }
  
  public Node dequeue(){
    //return and delete the top node of the stack
    Node newNode = earlyInput;
    earlyInput = earlyInput.getPrev();
   return newNode;
  }
  public Node peek(){
    return this.top;
  }
  public void destory(){
    top = null;
  }
  public String print(){
    return "";
  }
 public boolean isEmpty() {
    return this.top==null;
 } 
}