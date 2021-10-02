package package1;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

import package1.LinkedList.Node;
public class LinkedListTest {

	@SuppressWarnings({ "static-access" })
	@Test
	public void CheckPushFront()
	{
		LinkedList list=new LinkedList();
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
		LinkedList list=new LinkedList();
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
	public void CheckPopfront()
	{
		LinkedList list=new LinkedList();
		ArrayList<Integer> check = new ArrayList<Integer>();
		int i=1;
		while(i!=5)
		{
			list.pushBack(i*3);
			i++;
		}
		//calling the pop function
		list.popFront();
		check.add(6);
		check.add(9);
		check.add(12);
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
	public void CheckPopBack()
	{
		LinkedList list=new LinkedList();
		ArrayList<Integer> check = new ArrayList<Integer>();
		int i=1;
		while(i!=5)
		{
			list.pushBack(i*3);
			i++;
		}
		//calling the pop function
		list.popBack();
		check.add(3);
		check.add(6);
		check.add(9);
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
	public void CheckPopIndex()
	{
		LinkedList list=new LinkedList();
		ArrayList<Integer> check = new ArrayList<Integer>();
		ArrayList<Integer> check2 = new ArrayList<Integer>();
		int i=1;
		while(i!=5)
		{
			list.pushBack(i*3);
			i++;
		}
		//calling the pop function
		list.pop(0);
		check.add(6);
		check.add(9);
		check.add(12);
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
