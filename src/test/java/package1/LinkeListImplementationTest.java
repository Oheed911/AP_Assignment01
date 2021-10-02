package package1;

import static org.junit.Assert.*;

import org.junit.Test;

import package1.LinkedList.Node;

import java.util.ArrayList;
public class LinkeListImplementationTest {

	@Test
	public void Checkingadd()
	{
		ArrayList<Integer> check = new ArrayList<Integer>();
		LinkedListImplementation list=new LinkedListImplementation();
		
		for(int i=0;i<2;i++)
		{
			list.add(i*3);
			check.add(i*3);
		}
		
		LinkedListImplementation tempnode=new LinkedListImplementation();
		tempnode=list.headPointer;
		int ii=0;
		while(tempnode!=null)
		{
			assertEquals(check.get(ii).intValue(), tempnode.data);
			ii++;
			tempnode=tempnode.nextPointer;
			
		}
	}
	@Test
	public void CheckingPushFront()
	{
		ArrayList<Integer> check = new ArrayList<Integer>();
		LinkedListImplementation list=new LinkedListImplementation();
		

		list.pushFront(6);
		check.add(6);
		check.add(0);
		check.add(3);
		LinkedListImplementation tempnode=new LinkedListImplementation();
		tempnode=list.headPointer;
		int ii=0;
		while(ii!=3)
		{
			assertEquals(check.get(ii).intValue(), tempnode.data);
			ii++;
			tempnode=tempnode.nextPointer;
		}
	}
	@Test
	public void checkTopFront() throws Exception
	{
		ArrayList<Integer> check = new ArrayList<Integer>();
		LinkedListImplementation list=new LinkedListImplementation();
		list.pushFront(12);
		LinkedListImplementation tempnode=new LinkedListImplementation();
		assertEquals(12,list.topFront());
	}
	@Test
	public void CheckingPopFront() throws Exception
	{
		ArrayList<Integer> check = new ArrayList<Integer>();
		LinkedListImplementation list=new LinkedListImplementation();
		list.pushFront(10);
		list.pushFront(8);
		//8 is popped out
		list.popFront();
		check.add(10);
		check.add(6);
		check.add(0);
		check.add(3);
		LinkedListImplementation tempnode=new LinkedListImplementation();
		tempnode=list.headPointer;
		int i=0;
		while(i!=4)
		{
			assertEquals(check.get(i).intValue(),tempnode.data);
			tempnode=tempnode.nextPointer;
			i++;
		}
		list.display();
	}
	@Test
	public void CheckingPushBack()
	{
		LinkedListImplementation list=new LinkedListImplementation();
		ArrayList<Integer> check = new ArrayList<Integer>();
		int i=0;
		while(i!=2)
		{
			list.pushBack(i*3);
			i++;
		}
		check.add(10);
		check.add(6);
		check.add(0);
		check.add(3);
		check.add(0);
		check.add(3);
		LinkedListImplementation tempnode=new LinkedListImplementation();
		tempnode=list.headPointer;
		int ii=0;
		while(ii!=6)
		{
			System.out.println(check.get(ii).intValue()+" "+tempnode.data);
			assertEquals(check.get(ii).intValue(), tempnode.data);
			ii++;
			tempnode=tempnode.nextPointer;
			
		}
	}
	@Test
	public void CheckTopBack() throws Exception
	{
		LinkedListImplementation list=new LinkedListImplementation();
		assertEquals(3,list.topBack());
		
	}
	@Test
	public void checkSize() throws Exception
	{
		LinkedListImplementation list=new LinkedListImplementation();
		int c=0;
		LinkedListImplementation tempnode=new LinkedListImplementation();
		tempnode=list.headPointer;
		while(tempnode!=null)
		{
			c++;
			tempnode=tempnode.nextPointer;
		}
		assertEquals(c,list.size());
	}
	
	
}
