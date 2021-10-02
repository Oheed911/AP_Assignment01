package package1;

import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Test;

public class StackImplementationTest {

	@Test
	public void CheckPush() throws Exception
	{
		StackImplementation tempstack=new StackImplementation(10);
		Stack<Integer> check=new Stack<Integer>();
		for(int i=0;i<10;i++)
		{
			tempstack.push(i*3);
			check.push(i*3);
		}
		//cheking the pushed numbers
		for(int i=9;i>=0;i--)
		{
			assertEquals(check.pop().intValue(),tempstack.arraytostoreStack[i]);
		}
	}
	@Test
	public void checkTop() throws Exception
	{
		StackImplementation tempstack=new StackImplementation(10);
		for(int i=0;i<10;i++)
		{
			tempstack.push(i*3);
		}
		assertEquals(27,tempstack.top());
	}
	@Test
	public void checkPop() throws Exception
	{
		StackImplementation tempstack=new StackImplementation(10);
		for(int i=0;i<10;i++)
		{
			tempstack.push(i*3);
		}
		for(int i=9;i>=0;i--)
			assertEquals(i*3,tempstack.pop());
	}
	@Test
	public void checkSize() throws Exception
	{
		StackImplementation tempstack=new StackImplementation(10);
		for(int i=0;i<10;i++)
		{
			tempstack.push(i*3);
		}
		assertEquals(10,tempstack.size());
	}

}
