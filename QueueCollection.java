import java.util.*;
public class QueueCollection {
    public static void main(String args[])
    {
        Queue<Integer>queue=new PriorityQueue<Integer>(); 
        Scanner scan=new Scanner(System.in);
        int choice,n;
        do {
            System.out.println("---------------QUEUE MANU--------------");
        System.out.println("1.Insert");
        System.out.println("2.Delete");
        System.out.println("3.Display");
        System.out.println("4.Exit");
        System.out.println("-----------------------------------------");
        System.out.println("Enter your choice");
        choice =scan.nextInt();
        switch (choice) {
            case 1:
            {
              System.out.println("Enter an element in Queue");
              n=scan.nextInt();
              queue.offer(n);
                break;
            }
            case 2:
            {    if(queue.isEmpty())
                    System.out.println("Queue is empty");
                 else
                 {
                    n=queue.poll();
                    System.out.println("Removed element is: "+n);
                 }

                break;
            }
            case 3:
            { 
                 
                if(queue.isEmpty())
                    System.out.println("Queue is empty");
                else{
                    System.out.println("Queue elements");
                    for(Integer I:queue)
                    {
                        System.out.print(I+" ");
                    }
                }
                System.out.println();   //for new line only
                break;
            }
                
               
        
            default:System.out.println("Invalid choice");
                
        }
        } while (choice!=4);
    }
}
