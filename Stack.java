public class Stack{
  private Node top;
  public Stack(){
    top = null;
  }
  public void setTop(Node first){
    this.top = first;
  }
  public Node getTop(){
    return this.top;
  }
  public void add(int index, String str){
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
  
  public void remove(Node node){
    Node temp1 = node.getNext();
    Node temp2 = node.getPrev();
    temp1.setPrev(temp2);
    temp2.setNext(temp1);

  }
  public void destory(){
    top = null;
  }
  
 public boolean isEmpty() {
    return this.top==null;
 } 
}
    
    