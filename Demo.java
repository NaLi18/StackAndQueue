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
   //Move the contents of a stack to a queue
   Queue hue = new Queue();
   stackToQueue(color,hue);
   System.out.println("The items of Queue is:");
   hue.print();
   /*
   //Test the dequeue method of the Queue class
   System.out.print("Remove the item :");
   hue.dequeue().print();
   System.out.println("The new list is:");
   hue.print();
   */
   Stack color2 = new Stack();
   queueToStack(color2,hue);
   System.out.println("The items of Stack2 is:");
   color2.print();
  }
  private static void stackToQueue(Stack st, Queue que){
    //Test the enqueue method of Queue class
     while(!st.isEmpty()){
        que.enqueue(st.pop());
     }
   }
  private static void queueToStack(Stack st, Queue que){
    Stack temp = new Stack();
    while(!que.isEmpty()){
      temp.push(que.dequeue());
    }
    while(!temp.isEmpty()){
      st.push(temp.pop());
    }
  }
  
}