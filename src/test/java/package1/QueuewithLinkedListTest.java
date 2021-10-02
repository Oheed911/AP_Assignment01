package package1;

import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.Queue;
import org.junit.Test;

import package1.QueuewithLinkedList.Node;
public class QueuewithLinkedListTest {

	@Test
	public void CheckEnqueue()
	{
	      Queue<Integer> queueCheck= new LinkedList<Integer>();
	      QueuewithLinkedList quelist=new QueuewithLinkedList();
	      //now 
	      for(int i=0;i<100;i++)
	      {
	    	  quelist.enqueue(i*3);
	    	  queueCheck.add(i*3);
	      }
	      Node queNode=quelist.head;
	      for(int i=0;i<100;i++)
	      {
	    	assertEquals(queueCheck.remove().intValue(),queNode.key);
	    	queNode=queNode.next;
	      }
	      

		
	}

}
