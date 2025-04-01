// import java.lang.classfile.instruction.SwitchCase;
import java.util.*;
class Dqueue
{
    int front =-1,rear=-1;
    int MAXSIZE=10;
    int mydqueue[]=new int[MAXSIZE];
    Scanner scan=new Scanner(System.in);
    void insertFront()
    {
        int n;
        if((front==0 && rear==MAXSIZE-1) ||(front==rear+1))
        {
            System.out.println("Queue is overflow");
        }  
        else
        {
            System.out.println("Enter an element for insert front");
            n=scan.nextInt();
            if(front==-1 && rear==-1)
            {
                front=rear=0;
                mydqueue[front]=n;
            }
            else if(front==0)
            {
                front=MAXSIZE-1;
                mydqueue[front]=n;
            }
            else
            {
                front --;
                mydqueue[front]=n;
            }
        }
    }

    void insertRear()
    {
        int n;
        if((front==0 && rear ==MAXSIZE-1) ||(front==rear+1))
        {
            System.out.println("Queue is overflow");
        }
        else
        {
            System.out.println("Enter an element for insert from rear");
            n=scan.nextInt();
            if(front==-1 && rear==-1)
            {
                front=rear=0;
                mydqueue[rear]=n;
            }
            else if(rear==MAXSIZE-1)
            {
                rear=0;
                mydqueue[rear]=n;
            }
            else{
                rear++;
                mydqueue[rear]=n;
            }
        }
    }

    void deleteFront()
    {
        if(front==-1 && rear==-1)
        {
            System.out.println("DQueue is empty");
        }
        else{
            if(front==rear)
            {
                front=rear=-1;
                
            }
            else if(front==MAXSIZE-1)
            {
                System.out.println("Deleted Element is: "+mydqueue[front]);
                front=0;
            }
            else {
                System.out.println("Deleted Element is: "+mydqueue[front]);
                front++;
            }
        }
    }
    void deleteRear()
    {
        if(front==-1 && rear==-1)
        {
            System.out.println("DQueue is mepty");
        }
        else{
            if(front==rear)
            {
                front=rear=-1;
            }
            else if(rear==0)
            {
                System.out.println("Deleted Element is: "+mydqueue[rear]);
                rear=MAXSIZE-1;
            }
            else 
            {
                System.out.println("Deleted Element is: "+mydqueue[rear]);
                rear--; 
            }
        }
    }
    void display()
    {
        if(front==-1 && rear==-1)
        {
            System.out.println("Dqueue is empty");
        }
        else{
            int i;
            i=front;
            while (i!=rear) {
                System.out.print(mydqueue[i]+" ");
                i=(i+1)%MAXSIZE;
            }
            System.out.print(mydqueue[rear]);
        }
        System.out.println();
    }
}


class TestDqueue
{
    public static void main(String[] args)
    {
        int choice;
        Scanner scan=new Scanner(System.in);
        Dqueue dq=new Dqueue();
         
        do {
            System.out.println("--------------Dqueue Menu----------------");
        System.out.println("1.Insert Front");
        System.out.println("2.Insert Rear");
        System.out.println("3.Delete Front");
        System.out.println("4.Delete Rear");
        System.out.println("5.Display");
        System.out.println("6.Exit");
        System.out.println("------------------------------------------");
        System.out.println("Enter your choice: ");
        choice=scan.nextInt();
        switch (choice) {
            case 1:dq.insertFront(); break;

            case 2:dq.insertRear();break;

            case 3:dq.deleteFront();break;
            case 4:dq.deleteRear();break;
            case 5:dq.display(); break;
            case 6:break;
            default:System.out.println("INVALID CHOICE");

        }
    
        } while (choice !=6);

    }
        
}