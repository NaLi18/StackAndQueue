public class Stack{
  private Node top;
  public Stack(){
    top = null;
  }
 public void push(String str){
   Node newNode = new Node(str);
   newNode.setNext(top);
   this.top = newNode; 
 }
  
 public Node pop(){
    //return and delete the top node of the stack
   Node newNode = top;
   this.top = this.top.getNext();
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
    
    