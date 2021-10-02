package package1;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class ArrayInsertionTest {

	//Not Filling full array
	@Test
	public void testArrayInsertion() {
		ArrayInsertion arr=new ArrayInsertion();
		int[] ArrayTosend=new int[5];
		int[] expectarr=new int[5];
		for(int i=0;i<4;i++)
		{
			arr.insert(ArrayTosend, i*3, i);
			expectarr[i]=i*3;
		}
		for(int i=0;i<4;i++)
		{
			Assert.assertArrayEquals(expectarr, ArrayTosend);
		}
	}
	
	@Test
	public void testArrayFullInsertion() {
		ArrayInsertion arr=new ArrayInsertion();
		int[] ArrayTosend=new int[5];
		int[] expectarr=new int[5];
		for(int i=0;i<5;i++)
		{
			arr.insert(ArrayTosend, i*3, i);
			expectarr[i]=i*3;
		}
		for(int i=0;i<5;i++)
		{
			Assert.assertArrayEquals(expectarr, ArrayTosend);
		}
	}
}
