package package1;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class QueueImplementationTest {

	@Test
	public void CheckEnqueue() throws Exception
	{
		QueueImplementation qArray=new QueueImplementation(10);
		List<Integer> queueCheck=new ArrayList<Integer>();
		for(int i=0;i<10;i++)
		{
			qArray.enqueue(i*3);
			queueCheck.add(i*3);
		}
		int ii=qArray.removePointer;
		while(ii!=qArray.array.length-1)
		{
			assertEquals(queueCheck.get(ii).intValue(),qArray.array[ii]);
			ii++;
		}
	}
	@Test
	public void CheckDequeue() throws Exception
	
	{
		QueueImplementation qArray=new QueueImplementation(10);
		List<Integer> queueCheck=new ArrayList<Integer>();
		for(int i=0;i<10;i++)
		{
			qArray.enqueue(i*3);

				queueCheck.add(i*3);
		}
		for(int i=0;i<10;i++)
			qArray.dequeue();
		qArray.enqueue(1*3);
		queueCheck.add(1*3);
		int ii=qArray.removePointer;
		assertEquals(3,qArray.array[ii]);
	}
	@Test
	public void CheckEnqueue2Fail() throws Exception
	{
		QueueImplementation qArray=new QueueImplementation(5);
		List<Integer> queueCheck=new ArrayList<Integer>();
		for(int i=0;i<5;i++)
		{
			qArray.enqueue(i*3);
		}
		qArray.dequeue();
		qArray.enqueue(10);
		queueCheck.add(10);
		queueCheck.add(3);
		queueCheck.add(6);
		queueCheck.add(9);
		queueCheck.add(12);
		qArray.display();
		int ii=0;
		while(ii!=5)
		{
			System.out.println(ii);
			assertEquals(queueCheck.get(ii).intValue(),qArray.array[ii]);
			ii++;
		}
	}
	@Test
	public void CheckEmpty() throws Exception
	{
		QueueImplementation qArray=new QueueImplementation(10);
		assertTrue(qArray.empty());
		qArray.enqueue(6);
		assertFalse(qArray.empty());
	}
	@Test
	public void CheckSize() throws Exception
	{
		QueueImplementation qArray=new QueueImplementation(10);
		for(int i=0;i<10;i++)
			qArray.enqueue(3*i);
		assertEquals(10,qArray.size());
	}
	

}
