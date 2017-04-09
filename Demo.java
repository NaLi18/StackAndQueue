import java.util.Scanner;

public class Demo{
  public static void main(String[] args){
    //Test the push and print method of the Stack class
   Stack color = new Stack();
   color.push("Red");
   color.push("Blue");
   color.push("Green");
   color.push("yellow");
   color.push("Orange");
   color.push("Indigo");
   color.push("Purple");
   System.out.println("The items of Stack is:");
   color.print();
   /*
   //Test the pop method
   System.out.print("Remove the item :");
   color.pop().print();
   System.out.println("The new list is:");
   color.print();
   //Test the peek method
   System.out.print("Now, the top item is:");
   color.peek().print();
   */
   Queue hue = new Queue();
   stackToQueue(color,hue);
   System.out.println("The items of Queue is:");
   hue.print();
  }
  private static void stackToQueue(Stack list1, Queue list2){
     while(!list1.isEmpty()){
        list2.enqueue(list1.pop());
     }
   } 
  }