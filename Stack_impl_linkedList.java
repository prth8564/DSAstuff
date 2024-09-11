import java.util.*;

//define the stack class
class Main{
    public static void main(String[] args){
        stack newStack = new stack();
        
        newStack.stackPush(2);
        
        newStack.stackPush(8);
       
        newStack.stackPrint();
    }
}
class stack{
    public class stackNode{
        int value; stackNode next;
        
        stackNode(int value){
            this.value = value; next = null;
        }
    }
    stackNode top; int size = 0;
     stack(){
            this.top = null;
            size = 0;
        }
    public void stackPush(int value){
      stackNode ele = new stackNode(value);
      ele.next = top;
      top = ele;
      size++;
      System.out.println(top.value);
    }
    public int stackPop(){
      if(top == null){
        return -1;
      }
      int val = top.value;
      top = top.next;
      size--;
      System.out.println(val+" removed");
      return val;
    }
    public int stackSize(){
      System.out.println(size+" is the size");
      return size;
    }
    public void stackPrint(){
      stackNode curr = top;
      while(curr != null){
        System.out.print(curr.value + " ");
        curr = curr.next;
      }
    }
}
