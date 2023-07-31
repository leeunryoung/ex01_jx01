package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.StringJUnit4ClassRunner;
//import lombok.Setter;
//import lombok.Setter.AnyAnnotation;

public class SampleTests {

	public static void main(String[] args) {
	@Setter(onMethod= {(AnyAnnotation)@Autowired})
	private Restaurant restaurant;
	
	@test
	public void testExist() {
		assertNotnull(restaurant);
		log.info(restaurant);
		log.info("---------------------------");
		log.info(restaurant.getChef());
	}
	}


