 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kadava_quiz3;

import java.util.Scanner;

       
public class Kadava_Quiz3 {
    static int MAX = 10;
    private int[]data=new int[MAX];
    private int front;
    private int rear;
    
 
 
    
 public void insert(int index) throws Exception {
     if ((front == 0 && rear == MAX - 1)||(rear + 1 == front)){
         throw new Exception("full");
     }
     
     if (rear == MAX - 1){
         rear = 0;
     }else if (front==1){
         front=0;
         
     }else{
         data[rear++]=index;
     }
 }
 private void display()throws Exception{
     if (front == -1){
         throw new Exception("mali");
         
     }
     if (rear< front){
         
         
         for (int i = 0 ;i <= MAX-1; i ++){
             System.out.println(data[i]+"");
         }
         for (int i = 0 ;i <rear; i ++){
             System.out.println(data[i]+"");
         }
         
     }else {
         for (int i = front ;i < rear; i ++){
             System.out.println(data[i]+"");
     }
 }
     System.out.println("full");
 }
 
    public static void main(String[] args) throws Exception {
      
Scanner scanner = new Scanner(System.in);
Kadava_Quiz3 account= new Kadava_Quiz3();
        while (true) {
            System.out.println("Options:");
            System.out.println("1. Linear queue");
            System.out.println("2. Question Number 2 ");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                   account.insert(1);
                    account.insert(2);
                     account.insert(3);
                      account.insert(4);
                       account.insert(5);
                        account.insert(6);
                         account.insert(7);
                          account.insert(8);
                           account.insert(9);
                           
                      account.display();
                    break;
                case 2:
                   
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            
        }
    }
    
}

    


