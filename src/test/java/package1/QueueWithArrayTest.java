package package1;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.Queue;
import java.util.*;
public class QueueWithArrayTest {

	@Test
	public void CheckEnqueue() {
		QueuewithArray qArray=new QueuewithArray(10);
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
	public void CheckDequeue() 
	{
		QueuewithArray qArray=new QueuewithArray(10);
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
	//function fails to input value at index 0 after filling up an array
	@Test
	public void CheckEnqueue2Fail() 
	{
		QueuewithArray qArray=new QueuewithArray(5);
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

}
