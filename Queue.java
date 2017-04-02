public class Queue{private Node top;
  public Queue(){
    top = null;
  }
 public void enqueue(int index, String str){
    Node newNode = new Node(str);
      if(this.isEmpty()){
        this.top = newNode;
      }
      //add to the fornt of node list
      else if (index == 0) {
        newNode.setNext(top);
        top.setPrev(newNode);
        this.top = newNode;
      }
      //add to the end of node list
        Node temp = this.top;
        for(int i = 0; i < index - 1; i++) {
          temp = temp.getNext();
        }
        Node temp2 = temp.getNext();
        temp.setNext(newNode);
        newNode.setPrev(temp);
        newNode.setNext(temp2);
        temp2.setPrev(newNode); 
  }
  
  public Node dequeue(Node node){
    //return and delete the top node of the stack
   return this.top;

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