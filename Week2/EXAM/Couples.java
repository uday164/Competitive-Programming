
import java.util.*;

class Couples
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int arr[] = new int[n];

		int count = 0;

		for (int i = 0;i<n ;i++ )
		{
			arr[i] = sc.nextInt();
		}

		for (int j = 0;j<n-1 ;j+=2 )
		{
			if (arr[j]%2 != 0)
			{
				if (arr[j+1] != arr[j] - 1)
				{
					for (int k = 0;k<n ;k++ )
						{
							if (arr[k] == (arr[j] - 1))
							{
								int temp = arr[k];
								arr[k] = arr[j+1];
								arr[j+1] = temp;
								count++;
							}
						}

						
				}
					
			}

			else
			{
				if (arr[j+1] != arr[j] + 1)
				{
					for (int k = 0;k<n ;k++ )
						{
							if (arr[k] == (arr[j] + 1))
							{
								int temp = arr[k];
								arr[k] = arr[j+1];
								arr[j+1] = temp;
								count++;
							}
						}			
				}

			}			
		}
		System.out.println(count);
		}	
	}
