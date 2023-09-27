package DAD.CodeSignal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;

import org.junit.Test;

public class palindromeTest {
	private Palindrome Palindrome;
		
	@Before
	public void setup() {
		Palindrome = new Palindrome();
	}
	
	@Test 
	public void test1 () {
		assertEquals(true,Palindrome.solution("aabaa"));
	}
	
	@Test
	public void test2 () {
		assertEquals(false,Palindrome.solution("abac"));
	}
	
	@Test
	public void test3 () {
		assertEquals(true,Palindrome.solution("a"));
	}
	
	@Test
	public void test4 () {
		assertEquals(false,Palindrome.solution("az"));
	}
	
	@Test
	public void test5 () {
		assertEquals(true,Palindrome.solution("abacaba"));
	}
	
	@Test
	public void test6 () {
		assertEquals(true,Palindrome.solution("z"));
	}
	
	@Test
	public void test7 () {
		assertEquals(false,Palindrome.solution("aaabaaaa"));
	}
	
	@Test
	public void test8 () {
		assertEquals(false,Palindrome.solution("zzzazzazz"));
	}
	
	@Test
	public void test9 () {
		assertEquals(true,Palindrome.solution("hlbeeykoqqqqokyeeblh"));
	}
	
	@Test
	public void test10 () {
		assertEquals(true,Palindrome.solution("hlbeeykoqqqokyeeblh"));
	}

}
