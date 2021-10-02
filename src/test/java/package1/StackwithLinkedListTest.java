package package1;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.*;

import package1.StackwithLinkedList.Node;
public class StackwithLinkedListTest {
	@Test
	public void CheckPush()
	{
		StackwithLinkedList stack=new StackwithLinkedList();
		Stack<Integer> check=new Stack<Integer>();
		for(int i=0;i<8;i++)
		{
			stack.push(i*3);
			check.push(i*3);
		}
		//now checking the stack
		Node StackNode=stack.head;
		while(StackNode!=null)
		{
			assertEquals(check.pop().intValue(),StackNode.key);
			StackNode=StackNode.next;
		}
	}
	
	@Test
	public void CheckTop()
	{
		StackwithLinkedList stack=new StackwithLinkedList();
		Stack<Integer> check=new Stack<Integer>();
		for(int i=0;i<8;i++)
		{
			stack.push(i*3);
			check.push(i*3);
		}
		//now checking the stack
		Node StackNode=stack.head;
		while(StackNode!=null)
		{
			assertEquals(check.pop().intValue(),stack.top());
			stack.pop();
			StackNode=StackNode.next;
		}
	}
	
	@Test
	public void Checkpop()
	{
		StackwithLinkedList stack=new StackwithLinkedList();
		Stack<Integer> check=new Stack<Integer>();
		for(int i=0;i<8;i++)
		{
			stack.push(i*3);
			check.push(i*3);
		}
		//now checking the stack
		Node StackNode=stack.head;
		while(StackNode!=null)
		{
			assertEquals(check.pop().intValue(),stack.pop());
			StackNode=StackNode.next;
		}
	}
	
	@Test
	public void CheckGetSize()
	{
		StackwithLinkedList stack=new StackwithLinkedList();
		for(int i=0;i<8;i++)
		{
			stack.push(i*3);
		}
		//now checking the stack
		Node StackNode=stack.head;
		assertEquals(8,stack.getSize());
		stack.pop();
		assertEquals(7,stack.getSize());
		for(int i=0;i<7;i++)
			stack.pop();
		assertEquals(0,stack.getSize());
		stack.pop();
		assertEquals(0,stack.getSize());
	}
	
}
