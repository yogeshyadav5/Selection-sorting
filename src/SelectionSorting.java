// import java.util.Scanner to take input 

import java.util.Scanner;
public class SelectionSorting {
    //Here , We use constructors to initialize the object with the initial state
    SelectionSorting()
    {
        
        Scanner sc = new Scanner(System.in);
        //Initializing array with its size.
        int ar[] = new int[5];
        // from here there are 3 steps which are most important and aglorithm of the program.
        
        //step 1 input
        //taking the input from the user 
        System.out.println("*********Enter the element : ************");
        
        //for loop for takind the more than two elements 
        for(int i=0; i<5;i++){
            ar[i] = sc.nextInt();
        }
        //step 2 process
        // in this step we use the loop for sorting element 
        // this loop is running in rows...if one element is sorted it will move to next row and ignoring sorted element.
        for(int r=0; r<4;r++)
        {
            // this loop is running in columns for comprering elemnets
            for(int c=r;c<=4;c++)
            {
                // Here, if is used to cpmpare elements
                if(ar[r]>ar[c])
                {
                   // decalring temporary element for swapping elements 
                   int temp = ar[r];
                   ar[r]=ar[c];
                   ar[c]=temp;
                }
            }
        }
        
        
        //step 3 output
        System.out.println(" --------------sorted-------------");
        // loop for printing sorted element 
        for(int i =0;i<5;i++){
            
            System.out.println(ar[i]);
        }
    }
    
    public static void main(String args[]){
        SelectionSorting obj = new SelectionSorting();
    }
    
}

