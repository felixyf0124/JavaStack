package stack.test;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

import org.junit.Test;

public class TestStack {

	@Test
	public void test() {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		System.out.println("Push and Pop");
		System.out.println(stack.peek());
		assertEquals(3, stack.pop().intValue());
		System.out.println(stack.peek());
		assertEquals(2, stack.pop().intValue());
		System.out.println(stack.peek());
		assertEquals(1, stack.pop().intValue());
		
		assertTrue(stack.isEmpty());
		
	}
	
	@Test
	//a characterization test
	public void testStackIterator() {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		System.out.println("Iterator");
		//Iterator is broken on stack it behaves like a queue
		int val = 1;
		for (Integer i : stack) {
			System.out.println(i);
			assertEquals(val, i.intValue());
			val ++;	
		}
		
		//Iterator just looks at elements, no pops
		assertFalse(stack.isEmpty());
	}
	
	@Test
	public void testStackIteratorType() {
		Stack<Integer> stack = new Stack<Integer>();
		Iterator it = stack.iterator();
		System.out.println("Iterator is of type " 
				+ it.getClass().getName());
		Vector vec = new Vector<>();
		assertEquals(it.getClass(), vec.iterator().getClass());
	}

}
