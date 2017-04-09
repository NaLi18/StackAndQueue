/*
 * Name:Na Li
 * Lab: 2:45pm - 3:40pm, Monday
 */
public class Node{
  String str;
  Node next;
  Node prev;
  /*
   * The constructor
   * @param name
   */
  public Node(String name){
    this.next = null;
    this.prev = null;
    this.str = name;
  }
  /*
   * The non-argument constructor
   */
  public Node(){
    this.str = null;
    this.prev = null;
    this.next = null;
  }
  /*
   * The setNext method which set the nextNode
   * @param node
   */
  public void setNext(Node node){ 
    this.next = node;
  }
  /*
   * The getNext method return the next node
   * @return 
   */
  public Node getNext(){
    return this.next;
  }
  /*
   * The setPrev method set the previou node
   * @param node
   */
  public void setPrev(Node node){
    this.prev = node;
  }
  /*
   * The getPrev method return the previou node
   * @return 
   */
  public Node getPrev(){
    return this.prev;
  }
  /*
   * The getValue method return the value of node
   * @return 
   */
  public String getValue(){
    return this.str;
  }
  /*
   * The setValue method set the value of node
   * @param x the string save in the node 
   */
  public void setValue(String x){
    this.str = x;
  }
  /*
   * The print method display the value of the node 
   */
  public void print(){
    System.out.println(this.str + " ");
  }
}
  