package com.pchudzik.blog.examples.bisect.dragon;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplyTest {
	@Test
	public void should_multiply_number() {
		assertEquals(6, new Multiply(2).times(3));
	}
}