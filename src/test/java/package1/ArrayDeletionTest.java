package package1;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class ArrayDeletionTest 
{

	@Test
	public void testArrayDeletion() {
		ArrayDeletion arrdel=new ArrayDeletion();
		int[] ArrayToBeDeleted=new int[6];
		int[] expectedarr=new int[6];
		for(int i=0;i<6;i++)
		{
			ArrayToBeDeleted[i]=i*3;
			expectedarr[i]=i*3;
		}
		expectedarr[5]=-1;
		arrdel.delete(ArrayToBeDeleted,5);
		Assert.assertArrayEquals(expectedarr, ArrayToBeDeleted);
		
		arrdel.delete(ArrayToBeDeleted,3);
		expectedarr[3]=12;
		expectedarr[4]=-1;
		Assert.assertArrayEquals(expectedarr, ArrayToBeDeleted);
	}

}
