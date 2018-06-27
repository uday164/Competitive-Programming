
import java.util.*;

class SortMerge
{
	public void MergeS(int[] A, int[] temp, int left, int right)
	{


		int mid = (left + right) / 2;

		if (right > left)
		{
			MergeS(A,temp,left,mid);
			MergeS(A,temp,mid+1,right);
			Merge(A,temp,left,mid+1,right);
		}


	}

	public void Merge(int[] A, int[] temp, int left, int mid, int right)
	{
		int i;
		int temp_pos;
		int left_end;
		int size;

		temp_pos = left;

		left_end = mid-1;

		size = right - left + 1;

		while((left<=left_end) && (mid<=right))
		{
			if (A[left] <= A[mid])
			{
				temp[temp_pos] = A[left];
				temp_pos++;
				left++;
			}

			else
			{
				temp[temp_pos] = A[mid];
				temp_pos++;
				mid++;
			}
		}

		while(left<=left_end)
		{
			temp[temp_pos] = A[left];
			temp_pos++;
			left++;
		}

		while(mid<=right)
		{
			temp[temp_pos] = A[mid];
			temp_pos++;
			mid++;
		}

		for (int j = 0;j<size;j++)
		{
			A[right] = temp[right];
			right--;	
		}
	}
}


class HighestProduct
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		SortMerge obj = new SortMerge();

		int n = sc.nextInt();
		int[] A = new int[n];

		int[] temp = new int[n];

		for (int i = 0;i<n ;i++ )
		{
			A[i] = sc.nextInt();
		}


		obj.MergeS(A,temp,0,n-1);
		System.out.println(Arrays.toString(A));

		int x = A[n-1] * A[n-2] * A[n-3];

		System.out.println(x);		
	}

}
