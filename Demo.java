import java.util.Scanner;

public class Demo{
  public static void main(String[] args){
    //Test the push and print method of the Stack class
   Stack color = new Stack();
   color.push("Black");
   color.push("White");
   color.push("Green");
   color.push("yellow");
   color.push("Orange");
   color.push("Grey");
   color.push("Brown");
   color.print();
   //Test the pop method
   System.out.print("Remove the item :");
   color.pop().print();
   System.out.println("The new list is:");
   color.print();
   //Test the peek method
   System.out.print("Now, the top item is:");
   color.peek().print();
  }
}