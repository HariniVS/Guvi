import java.lang.*;
import java.util.*;

public class FirstRepeat{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int no_of_elements=sc.nextInt();
         int arr_el[]=new int[no_of_elements];
         for(int i=0;i<no_of_elements;i++){
             arr_el[i]=sc.nextInt();
         }
         for(int i=0;i<no_of_elements;i++){
             for(int j=i+1;j<no_of_elements;j++){
                 if(arr_el[i]==arr_el[j])
                    {
                        System.out.println("First repeated element is "+arr_el[i]);
                        System.exit(0);                        
                    }
             }
         }
          System.out.println("Array doesn't contain any repeated elements");
     }
}
