public class BinaryRecursiveSearch implements Practice03Search
{
	
	public int search(int [] arr, int target)
	{
		//overloading to call another function with same name with more parameters
		return search(arr, target, 0, arr.length-1);

	}

	public int search(int [] arr, int target, int low,int high)
	{
		//the middle of the array is found by taking the average of low and high
		int mid = (low+high)/2;

		//base case: if low is greater than high, returns -1
		if(low>high)
		{
			return -1;
		}
		
		// if the element in arr[mid] is EQUAL to target,returns mid
		if(arr[mid] == target)
		{
			return mid;	
		}		
		// if the element in arr[mid] is GREATER THAN target,recursively calls the function with the new high as one less than the mid
		if(arr[mid] > target)
		{	
			return search(arr,target,low,mid-1);
		}
		// if the element in arr[mid] is LESS THAN target,recursively calls the function with the new low as one more than the mid.
		if(arr[mid] < target)
		{
			return search(arr,target,mid+1,high);
		}
		
		
	}

	//function to return name of the search
	public String searchName()
	{
		return "Binary recursive search";
	}







}