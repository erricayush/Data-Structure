import java.util.*;
public class TestLinkedList{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        LinkedList<Integer>mylist=new LinkedList<Integer>();
        int choice;
        do {

            System.out.println("\n---------------------------Linked List--------------------------------");
            System.out.println("1.Create");
            System.out.println("2.Insert First");
            System.out.println("3.Insert Middle");
            System.out.println("4.Insert Last");
            System.out.println("5.Delete First");
            System.out.println("6.Delete Middle");
            System.out.println("7.Delete Last");
            System.out.println("8.Display");
            System.out.println("9.Exit");
            System.out.println("\n----------------------------------------------------------------------");
            System.out.println("Enter the choice :");
            choice =scan.nextInt();
            switch (choice) {
                case 1: {   // for creating linkedlist
                    int n;
                    String ch;
                    System.out.println("Enter an element ");
                    n=scan.nextInt();
                    mylist.add(n);
                    System.out.println("Want to continue");
                    ch=scan.next();
                    while (ch.toUpperCase().equals("YES")) {
                        System.out.println("Enter an element :");
                        n=scan.nextInt();
                        mylist.add(n);
                        System.out.println("Want to Continue");
                        ch=scan.next();
                    }
                }   break;

                case 2:{   // for insert the element in linkedlist
                    int n;
                    if(mylist.isEmpty())
                       System.out.println("List is Empty");
                    else{
                        System.out.println("Enter an element for Insert at First:");
                        n=scan.nextInt();
                        mylist.addFirst(n);
                    }
                    break;
                }

                case 3:{  //for insert the element at middle 
                    int n;
                    int pos;
                    if(mylist.isEmpty())
                       System.out.println("List is Empty");
                    else{
                       System.out.println("Enter an element for insert at Middle");
                       n=scan.nextInt();
                       System.out.println("Enter the position where you want to enter the elemetn :");
                       pos=scan.nextInt();
                       if(pos>mylist.size())
                          System.out.println("Invalid position please inter between :1 - "+mylist.size());
                        else{
                            mylist.add(pos,n);
                        }
                      
                    }
                    break;
                }
                case 4:{   // for insert the element at last in linkedlist
                    int n;
                    if(mylist.isEmpty())
                       System.out.println("List is Empty");
                    else{
                        System.out.println("Enter an element for Insert at Last:");
                        n=scan.nextInt();
                        mylist.addLast(n);
                    }
                    break;
                }

                case 5:{ //delete the element at the position first
                   if(mylist.isEmpty()){
                    System.out.println("list is mepty");
                   }
                   else{
                     System.out.println("Deleted node is: "+ mylist.removeFirst());
                   }

                   break;
                }

                case 6:{    //delete at middle 
                   if(mylist.isEmpty()){
                    System.out.println("List is empty");
                   }
                   else{
                      int pos;
                      System.out.println("Enter the positio where you want to delete the element  ");
                      pos=scan.nextInt();
                      if(pos>mylist.size()){
                        System.out.println("Invalid position");
                      }
                      else{
                       System.out.println("deleted node is: "+ mylist.remove(pos));
                      }
                   }
                   break;
                }

                case 7:{ // delete the element at the last
                   if(mylist.isEmpty()){
                    System.out.println("list is empty");
                   }       
                   else{
                    System.out.println("Deleted node is :"+mylist.removeLast());
                   }

                   break;
                }

                case 8:{  // for the display of linkedlist element 
                    if(mylist.isEmpty())
                       System.out.println("List is Empty");
                    else{
                        for(Integer I:mylist){
                            System.out.print("  "+I);
                        }
                    }

                    break;
                    
                }
                    
                case 9:break;
                   
            
                default:System.out.println("Invalid choice Enter in between 1 to 9");
                   
            }
            
        } while (choice !=9);
       

    }
}