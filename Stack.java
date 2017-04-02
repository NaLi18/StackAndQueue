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
    }
  }
 public boolean isEmpty() {
    return this.top==null;
 } 
}
    
    