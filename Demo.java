import java.util.Scanner;

public class Demo{
  public static void main(String[] args){
    /*
     //test the default constructor of Node class.
    Node myNode = new Node();
    System.out.println(myNode.getValue());
    System.out.println(myNode.getNext());
    */
    /*
     //test the constructor and print method 
    Node myOtherNode = new Node("Frank");
    System.out.println(myOtherNode.getValue());
    System.out.println(myOtherNode.getNext());
    myOtherNode.print();
    */
    Stack linkedList = new Stack();
    /*
     //test the constructor
    System.out.println(linkedList);
    System.out.println(linkedList.getHead());
    System.out.println(linkedList.size());
    linkedList.setHead(new Node("Frank"));
    System.out.println(linkedList.getHead());
    System.out.println(linkedList.getSize());
    */
    /*
     //test the isEmpty is work
     linkedList.setHead(new Node("Carol"));
     */
    // test adding to font of list
    linkedList.add(0,"Alex");
    linkedList.add(0,"Frank");
    linkedList.add(0,"Peter");
    linkedList.add(0,"Carol");
    linkedList.add(3,"Cat");
    linkedList.add(5, "Micheal");
    linkedList.add(6, "Bobby");
    /*
     //test the forward and backward method
    linkedList.forward();
    linkedList.backward();
    */
    /*
     //test the insert method
    linkedList.insert("Lina");
    linkedList.forward();
    linkedList.insert("Tina");
    linkedList.forward();
    */
    /*
     //test the remove method
    Node newNode = linkedList.found("Cat");
    if(newNode != null)
    linkedList.remove(newNode);
    linkedList.forward();
    */
     //test the destory method.
    linkedList.destory();
  }
}