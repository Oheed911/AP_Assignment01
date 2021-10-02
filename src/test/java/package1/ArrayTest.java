package package1;



import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayTest {
	Array arr=new Array();
	int[] exparr=new int[100];
	@SuppressWarnings("static-access")
	@Before 
	public void fillArray()
	{
		
	}
	@SuppressWarnings("static-access")
	@Test
	public void ArrayInsertTest() {
		for(int i=0;i<5;i++)
		{
			arr.insert(i*3, i);
		}
		for(int i=0;i<5;i++)
		{
			exparr[i]=i*3;
		}
		Assert.assertArrayEquals(exparr,arr.array);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void ArrayInsertTest2() 
	{
		arr.insert(0,0);
		arr.insert(12,4);
		arr.insert(6,2);
		arr.insert(9,3);
		arr.insert(3,1);
		for(int i=0;i<5;i++)
		{
			exparr[i]=i*3;
		}
		Assert.assertArrayEquals(exparr,arr.array);
	}
	@SuppressWarnings("static-access")
	//checking the delete function for 2nd last index
	@Test
	public void ArrayDeleteSecondLastIndex() 
	{
		for(int i=0;i<5;i++)
		{
			arr.insert(i*3, i);
		}
		Array.delete(4);
		exparr[0]=0;
		exparr[1]=3;
		exparr[2]=6;
		exparr[3]=9;
		exparr[4]=12;
		for (int i=0;i<5;i++)
		Assert.assertArrayEquals(exparr,arr.array);
		
	}
	@SuppressWarnings("static-access")
	//deleting the last index
	//last index deletion functionality is wrong
	@Test
	public void ArrayDeleteLastIndex() 
	{
		for(int i=0;i<5;i++)
		{
			arr.insert(i*3, i);
		}
		Array.delete(5);
		exparr[0]=0;
		exparr[1]=3;
		exparr[2]=6;
		exparr[3]=9;
		for (int i=0;i<5;i++)
		Assert.assertArrayEquals(exparr,arr.array);
		
	}
	@SuppressWarnings("static-access")
	@Test
	public void CheckLinearSearch()
	{
		for(int i=0;i<5;i++)
		{
			arr.insert(i*3, i);
		}
		for(int i=0;i<5;i++)
			Assert.assertTrue(arr.linearSearch(i*3));
	}
	@SuppressWarnings("static-access")
	//bubble sort 
	@Test
	public void CheckBubbleSort()
	{
		arr.insert(10, 0);
		arr.insert(5, 1);
		arr.insert(6, 2);
		arr.insert(11, 3);
		arr.insert(2, 4);
		arr.insert(1, 5);
		exparr[0]=1;
		exparr[1]=2;
		exparr[2]=5;
		exparr[3]=6;
		exparr[4]=10;
		exparr[5]=11;
		arr.bubbleSort();
		Assert.assertArrayEquals(exparr, arr.array);
	}
	@SuppressWarnings("static-access")
	//checking the binarysearch
	@Test
	public void CheckbinarySearch()
	{
		for(int i=0;i<5;i++)
		{
			arr.insert(i*3, i);
		}
		for(int i=0;i<5;i++)
			Assert.assertTrue(arr.binarySearch(i*3, 0, 5));
	}
	@Test
	public void CheckbinarySearchFail()
	{
		int j=0;
		for(int i=4;i>=0;i--)
		{
			arr.insert(i*3, j);
			j++;
		}
		Assert.assertTrue(arr.binarySearch(12, 0, 5));
	}
	
}
