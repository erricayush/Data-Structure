//package Infix to postfix;
import java.util.*;
 class MyStack {
    char stack[]=new char[50];
    int top=-1;

    void push(char ch){
        stack[++top]=ch;

    }
    char pop(){
        if(top==-1)
           return (char)-1;
        else
           return stack[top--];
    }
   int priority(char ch )
   {
        if(ch =='(')
          return 0;
        if(ch=='+'||ch=='-')
          return 1;
        if(ch=='*'||ch=='/')
          return 2;
        return 0;
    }
}

public class InfixToPostfix {
  public static void main(String[] args) {
      String expr,e;
      MyStack M=new MyStack();
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter an expression");
      expr=scan.next();
      e=expr;
      char ch,x;
      int i;
      for(i=0;i<e.length()-1;i++){
        ch=e.charAt(i);
        if(Character.isLetterOrDigit(ch))
        {
          System.out.print(ch);
        }
        else if(ch=='(')
        {
          M.push(ch);
        }
        else if(ch==')')
        {
          while ((x=M.pop())!='(') {
            if(x=='(')
            {
              break;
            }
             
            System.out.print(x);
          }
        }
        else
        {
          while (M.priority(M.stack[M.top])>=M.priority(ch)) {
            System.out.print(M.pop());
           
          }
          M.push(ch);
        }
      }
      while (M.top!=-1) {
        System.out.print(M.pop());
      }

  }
  
}