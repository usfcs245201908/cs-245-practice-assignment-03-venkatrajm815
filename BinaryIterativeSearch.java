public class BinaryIterativeSearch implements Practice03Search
{
	
	public int search(int [] arr, int target)
	{
		//creates two integers
		//low is set to 0 as it is the index of the first element of the array
		//high is set to arr.length-1 as it is the index of the last element of the array
		int low = 0;
		int high = arr.length-1;

		//while loop to iterate until low is greater than high
		while(low<=high)
		{
			//mid is set to index of the middle of the array
			int mid = (low+high)/2;
			//if element in the middle array is EQUAL to target, it returns mid
			if( arr[mid] == target)
			{
				return mid;
			}
			//if element in the middle array is GREATER THAN target, the new high is 1 less than the old mid
			if( arr[mid] > target )
			{
				high = mid - 1;
			}

			//if element in the middle array is LESS THAN target, the new low is one more than old mid
			if( arr[mid] < target )
			{
				low = mid + 1;
			}

		}
		//if number is not in the array, it returns -1
		return -1;

	}

	//function to return name of the search
	public String searchName()
	{
		return "Binary iterative search";
	}







}