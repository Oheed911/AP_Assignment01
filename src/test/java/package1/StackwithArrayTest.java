package package1;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.*;

public class StackwithArrayTest {
	@Test
	public void CheckPush()
	{
		StackwithArray stack=new StackwithArray();
		Stack<Integer> check=new Stack<Integer>();
		for(int i=0;i<100;i++)
		{
			stack.push(i*3);
			check.push(i*3);
		}
		
		//now checking the stack
		for(int i=99;i>=0;i--) {
			assertEquals(check.pop().intValue(),stack.array[i]);
		}
	}
	@Test
	public void CheckPop()
	{
		StackwithArray stack=new StackwithArray();
		Stack<Integer> check=new Stack<Integer>();
		for(int i=0;i<100;i++)
		{
			stack.push(i*3);
			check.push(i*3);
		}
		
		//now checking the stack
		for(int i=99;i>=0;i--) {
			assertEquals(check.pop().intValue(),stack.pop());
		}
	}
}
