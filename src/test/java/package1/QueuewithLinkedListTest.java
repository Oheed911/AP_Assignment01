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
	@Test
	public void CheckDequeue()
	{
	      Queue<Integer> queueCheck= new LinkedList<Integer>();
	      QueuewithLinkedList quelist=new QueuewithLinkedList();
	      //now 
	      for(int i=0;i<100;i++)
	      {
	    	  quelist.enqueue(i*3);
	      }
	      for(int i=1;i<100;i++)
	    	  queueCheck.add(i*3);
	      quelist.dequeue();
	      Node queNode=quelist.head;
	      for(int i=0;i<99;i++)
	      {
	    	assertEquals(queueCheck.remove().intValue(),queNode.key);
	    	queNode=queNode.next;
	      }	
	      for(int i=0;i<50;i++)
	    	  quelist.dequeue();
	      for(int i=51;i<100;i++)
	    	  queueCheck.add(i*3);
	      queNode=quelist.head;
	      for(int i=0;i<49;i++)
	      {
	    	assertEquals(queueCheck.remove().intValue(),queNode.key);
	    	queNode=queNode.next;
	      }	
	      
	}
	
	

}
