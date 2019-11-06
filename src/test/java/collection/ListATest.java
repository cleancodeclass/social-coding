package collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;  
import org.junit.Test;  
   
public class ListATest {

	private ListA list;

	@Before
	public void setUp() {
		list = new ListA();
	}
	
	@Test
	public void returnTrueWhenAddElementSucceed() {

		// arrange
		
		// act
		list.add("apple");
		
		// assert
		assertNotNull(list);
	}
	  
	@Test
	public void returnFalseWhenReadOnlyIsTrue() {
		
		// arrange
		list.readOnly= true;
		
		// act
		list.add("apple");
		
		// assert
		assertTrue(list.readOnly );
	}   
     
	@Test
	public void whenAddElementCountIsOver10ThenArrayLengthIs20() {
		
		// arrange
		list.add("apple");
		list.add("grape");
		list.add("pear");
		list.add("mango");
		list.add("watermelon");
		list.add("banana");
		list.add("strawberry");
		list.add("lemon");
		list.add("pineapple");
		list.add("melon");
		
		// act
		list.add("orange");
		
		// assert
		assertEquals(20, list.elements.length);
		
	}    
	 
	@Test
	public void setReadOnlyReturnTrueWhenInputParameterIsTrue() {
		
		// arrange
		
		// act
		list.setReadOnly(true);
		
		// assert
		assertTrue(list.readOnly);
	}
	
	@Test
	public void setReadOnlyReturnFalseWhenInputParameterIsFalse() {
		
		// arrange
		
		// act
		list.setReadOnly(false);
		
		// assert
		assertFalse(list.readOnly);
	}
}
