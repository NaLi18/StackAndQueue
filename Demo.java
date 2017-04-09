import java.util.Scanner;
/*
 * Name:Na Li
 * Lab: 2:45pm - 3:40pm, Monday
 */
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
   /*
   ////Test the stackToQueue method
   Queue hue = new Queue();
   stackToQueue(color,hue);
   System.out.println("The items of Queue is:");
   hue.print();
   */
   /*
   //Test the dequeue method of the Queue class
   System.out.print("Remove the item :");
   hue.dequeue().print();
   System.out.println("The new list is:");
   hue.print();
   */
   Stack color2 = new Stack();
   /*
   //Test the queueToStack method
   queueToStack(color2,hue);
   System.out.println("The items of Stack2 is:");
   color2.print();
   */
   //Test the stackToStack method
   stackToStack(color2,color);
   System.out.println("The items of Stack2 is:");
   color2.print();
  }
  /*
   * The stackToQueue method move all the content of stack to queue
   * @param st the stack which content will be moved.
   * @param que the empty queue.
   */
  private static void stackToQueue(Stack st, Queue que){
    //Test the enqueue method of Queue class
     while(!st.isEmpty()){
        que.enqueue(st.pop());
     }
   }
  /*
   * The queueToStack move all the content of queue to stack
   * @param st the empty stack
   * @param que the queue which content will be moved
   */
  private static void queueToStack(Stack st, Queue que){
    Stack temp = new Stack();
    while(!que.isEmpty()){
      temp.push(que.dequeue());
    }
    while(!temp.isEmpty()){
      st.push(temp.pop());
    }
    temp.destory();
  }
  /*
   * The stackToStack method move all the content of stack1 to stack2
   * @param st1 the empty Stack.
   * @param st2 the Stack which content will be moved
   */
  private static void stackToStack(Stack st1, Stack st2){
    Stack temp = new Stack();
    while(!st2.isEmpty()){
      temp.push(st2.pop());
    }
    while(!temp.isEmpty()){
      st1.push(temp.pop());
    }
    temp.destory();
  }
}