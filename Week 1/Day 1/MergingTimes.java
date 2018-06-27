
import java.util.*; 

class Bubble
{
   void BubbleSort(int arr[])
   {
       int n = arr.length;
        for (int i = 0; i < n-2; i+=2)
            for (int j = 0; j < n-i-2; j+=2)
                if (arr[j] > arr[j+2])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+2];
                    arr[j+2] = temp;

                    int temp1 = arr[j+1];
                    arr[j+1] = arr[j+3];
                    arr[j+3] = temp1;
                }
   }
}


public class MergingTimes
{  
   public static void main(String args[])
   {  
      Scanner sc = new Scanner(System.in);

      Bubble obj = new Bubble();

      int x = sc.nextInt();

      int arr[] = new int[2 * x];

      for (int i = 0;i< (2 * x) ;i++)
      {
         arr[i] = sc.nextInt();  
      }

      obj.BubbleSort(arr);

      for (int j = 0;j< (2 * x) ;j+=2)
      {
         int comp = arr[j+1];

         int even = j+2;

         int naya = Integer.MIN_VALUE;

         int nindex = 0; 

         for (int k = even;k<(2 * x);k+=2)
         {
            if (arr[k] <= comp && arr[k+1] > comp)
            {
               if (arr[k+1] > naya)
               {
                  naya = arr[k+1];
                  nindex = k+1;   
               }                      
            }
         }

         if (naya == Integer.MIN_VALUE)
         {
            System.out.println(arr[j] + " "+ arr[j+1]);           
         } 

         else
         {
            System.out.println(arr[j] + " "+ naya);
            j = nindex - 1;

         }        
      }
   }      
}  
