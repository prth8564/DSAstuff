import java.util.*;

public class Main {
    public static void main(String[] args) {
      String exp = "a+b*(c^d-e)^(f+g*h)-i";
      Stack<Character> stack = new Stack<>();
      String result = "";
      for(char ch:exp.toCharArray()){
        if(ch == '('){
          stack.push(ch);
          continue;
        }
        else if(ch == '+' || ch=='-'||ch == '/'|| ch == '*' || ch == '^'){
          if(stack.isEmpty()){
            stack.push(ch);
            continue;
          }
          char exTop = stack.peek();
          if((exTop != '(')&& precedence(exTop) == precedence(ch) || precedence(exTop) > precedence(ch)){
              char popped = stack.pop();
            if(popped !='(' && popped!=')'){
              result += popped;
            }
          }
          stack.push(ch);
        }
        else if(ch == ')'){
          while((!stack.isEmpty()) && stack.peek() != '('){
            char popped = stack.pop();
            if(popped !='(' && popped!=')'){
              result += popped;
            }
          }
        }
        else{
          result += ch;
        }
      }
      System.out.println(result);
  }
  static int precedence(char ch){
    if(ch == '+' || ch== '-'){
      return 1;
    }
    if(ch == '*' || ch == '/'){
      return 2;
    }
    if(ch == '^'){
      return 3;
    }
    else {
      return -1;
    }
  }
}
