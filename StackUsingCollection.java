import java.util.*;
 class StackUsingCollection{
    public static void main(String args[]){
        int choice =0;
        Scanner scan=new Scanner(System.in);
        Stack<Integer> mystack=new Stack<Integer>();
        int n;
        do{
            System.out.println("------------Stack Menu-----------");
            System.out.println("1.push");
            System.out.println("2.pop");
            System.out.println("3.display");
            System.out.println("4.peek");
            System.out.println("5.search");
            System.out.println("6.exit");
            System.out.println("---------------------------------");
            System.out.println("Enter your choice");
            choice=scan.nextInt();
            switch(choice){
                case 1: // PUSH CODE---------- 
                {
                    System.out.println("Enter the element for push");
                    n=scan.nextInt();
                    mystack.push(n);
                    break;
                }
                case 2: //POP CODE-------
                {
                    if(mystack.isEmpty())
                        System.out.println("Stack is empty");
                    else{
                       n= mystack.pop();
                       System.out.println("poped element is: "+n);

                    }
                    break;
                }
                case 3: // DISPLAY CODE------------
                {
                    if(mystack.isEmpty())
                        System.out.println("Stack is empty");
                    else{
                        System.out.println("--------Stack element--------");
                        ListIterator I=mystack.listIterator(mystack.size());
                        while(I.hasPrevious())
                        {
                            System.out.println(I.previous());
                        }
                        // for(Integer I:mystack)
                        //    System.out.println(I);
                    }
                    break;
                }
                case 4:
                {
                    if(mystack.isEmpty())
                        System.out.println("Stack is empty");
                    else{
                        System.out.println("peeked element is:"+mystack.peek());


                    }
                    break;
                }
                
                case 5:
                {
                    System.out.println("Enter an element for search:");
                   int  s=scan.nextInt();
                    if(mystack.search(s) !=-1)
                        System.out.println("Searching is Successs");
                    else{
                        System.out.println("Searching is not Success");
                    }
                    break;
                }
                
                case 6: break;
            }

        }while(choice!=6);

    }
}