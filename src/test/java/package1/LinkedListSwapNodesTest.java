package package1;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import package1.LinkedListSwapeNodes.Node;

public class LinkedListSwapNodesTest {

	@SuppressWarnings({ "static-access" })
	@Test
	public void CheckPushFront()
	{
		LinkedListSwapeNodes list=new LinkedListSwapeNodes();
		ArrayList<Integer> check = new ArrayList<Integer>();
		
		int i=1;
		while(i!=5)
		{
			list.pushFront(i*3);
			i++;
		}
		i=4;
		while(i!=0)
		{
			check.add(i*3);
			i--;
		}
		Node tempnode=list.head;
		int ii=0;
		while(tempnode!=null)
		{
			assertEquals(check.get(ii).intValue(), tempnode.key);
			ii++;
			tempnode=tempnode.next;
			
		}
	}
	
	@Test
	public void CheckPushBack()
	{
		LinkedListSwapeNodes list=new LinkedListSwapeNodes();
		ArrayList<Integer> check = new ArrayList<Integer>();
		int i=1;
		while(i!=5)
		{
			list.pushBack(i*3);
			check.add(i*3);
			i++;
		}
		Node tempnode=list.head;
		int ii=0;
		while(tempnode!=null)
		{
			assertEquals(check.get(ii).intValue(), tempnode.key);
			ii++;
			tempnode=tempnode.next;
			
		}
	}
	
	@Test
	public void CheckSwap()
	{
		LinkedListSwapeNodes list=new LinkedListSwapeNodes();
		ArrayList<Integer> check = new ArrayList<Integer>();
		int i=1;
		while(i!=5)
		{
			list.pushBack(i*3);
			i++;
		}
		list.swap();
		check.add(12);
		check.add(6);
		check.add(9);
		check.add(3);
		Node tempnode=list.head;
		int ii=0;
		while(tempnode!=null)
		{
			assertEquals(check.get(ii).intValue(), tempnode.key);
			ii++;
			tempnode=tempnode.next;
			
		}
	}
}
