package package1;

import static org.junit.Assert.*;

import org.junit.Test;

public class DequeueImplementationTest {
	
	@Test
	public void checkingAddLeft()
	{
		DequeueImplementation qu=new DequeueImplementation(10);
		for(int i=0;i<10;i++)
			qu.addLeft(i*3);
		for(int i=9;i>=0;i--)
			assertEquals(i*3,qu.array[i]);
	}
	@Test
	public void checkingAddRight()
	{
		DequeueImplementation qu=new DequeueImplementation(10);
		for(int i=0;i<10;i++)
			qu.addRight(i*3);
		int j=9;
		for(int i=0;i<10;i++)
		{
			assertEquals(i*3,qu.array[j]);
			j--;
		}
			
	}
	
}
