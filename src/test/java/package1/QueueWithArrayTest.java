package package1;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.Queue;
import java.util.LinkedList;
public class QueueWithArrayTest {

	@Test
	public void CheckEnqueue() {
		QueuewithArray qArray=new QueuewithArray(10);
		Queue<Integer> queueCheck=new LinkedList<Integer>();
		for(int i=0;i<10;i++)
		{
			qArray.enqueue(i*3);
			queueCheck.add(i*3);
		}
		int ii=qArray.removePointer;
		while(ii!=qArray.size)
		{
			assertEquals(queueCheck.remove().intValue(),qArray.array[ii]);
			ii++;
		}
	}
	@Test
	public void CheckDequeue() 
	{
		QueuewithArray qArray=new QueuewithArray(10);
		Queue<Integer> queueCheck=new LinkedList<Integer>();
		for(int i=0;i<10;i++)
		{
			qArray.enqueue(i*3);
			if(i!=0)
				queueCheck.add(i*3);
		}
		qArray.dequeue();
		int ii=qArray.removePointer;
		while(ii!=qArray.size)
		{
			assertEquals(queueCheck.remove().intValue(),qArray.array[ii]);
			ii++;
		}
	}

}
