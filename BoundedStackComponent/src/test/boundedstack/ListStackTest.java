package test.boundedstack; 

import boundedstack.ListStack;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.Stack;

/** 
* ListStack Tester. 
* 
* @author <Authors name> 
* @since <pre>9? 6, 2021</pre> 
* @version 1.0 
*/ 
public class ListStackTest {

    private Stack<String> stack_empty_3;
    // private Stack<String> stack_ABC_6;

    @Before
    public void setUp() {
        stack_empty_3 = new ListStack<>(3);
    }



@After
public void after() throws Exception { 
} 

/** 
* 
* Method: push(E element) 
* 
*/ 
@Test
public void testPush() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: pop() 
* 
*/ 
@Test
public void testPop() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: depth() 
* 
*/ 
@Test
public void testDepth() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: capacity() 
* 
*/ 
@Test
public void testCapacity() throws Exception { 
//TODO: Test goes here... 
} 


} 
