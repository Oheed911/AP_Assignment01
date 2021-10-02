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
		
		for(int i=0;i<5;i++)
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
		
		for(int i=0;i<5;i++)
		{
			list.pushFront(i*3);
		}
		for(int i=4;i>=0;i--)
		{
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
	
	
}