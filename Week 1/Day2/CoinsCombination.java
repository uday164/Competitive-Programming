
import java.util.*;

class CoinsCombination
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int arr[] =  new int[n];

		for (int i = 0;i<n ;i++)
		{
			arr[i] = sc.nextInt();
		}

		int x = sc.nextInt();

		int arr1[] = new int[x+1];

		arr1[0] = 1;

		for (int j = 0;j<n;j++)
		{
			for (int k = 0;k<x+1;k++)
			{
				if (k>=arr[j])
				{
					arr1[k] += arr1[k - arr[j]];
				}	
			}
		}
		System.out.println(arr1[x]);	
	}
}
