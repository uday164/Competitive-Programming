import java.util.*;

class BinarySearch
{
	int BSearch(int[] arr,int l, int r, int x)
	{
		if (r >= l)
		{
			int mid = l + (r-l)/2;

			if (arr[mid] == x)
			{
				return mid;
				
			}

			if (arr[mid] > x)
			{
				return BSearch(arr,1,mid-1,x);
				
			}

			else
			{
				return BSearch(arr,mid+1,r,x);
			}
			
		}

		return -1;
	}


}

class FindOrdered
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		BinarySearch obj = new BinarySearch();

		int n = sc.nextInt();

		int arr[] = new int[n];

		for (int i = 0;i<n ;i++ )
		{
			arr[i] = sc.nextInt();
		}
                                                      //The input given is already is in sorted order
		int x = sc.nextInt();                            

		int result = obj.BSearch(arr,0,n-1,x);

		if (result == -1)
		{
			System.out.println("Element not there");
		}

		else
		{
			System.out.println(x + " element is found at index "+ result);
		}
	}
}
