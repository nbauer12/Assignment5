package assignment5;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

class HolidayBonusTestStudent {

	double[][] dataSet1 = {{1,2,3},{2,3,4}};
	double[][] dataSet2 = {{1},{2},{3},{4}};
	double[][] dataSet3 = {{1,2,3,4,5}};
	
	private double[] result1 = {4000, 7000};
	private double[] result2 = {1000, 2000, 3000, 4000};
	private double[] result3 = {15000};

	private static final double TOLERANCE = 0.00001;

	@Before
	void setUp() throws Exception {
	}

	@After
	void tearDown() throws Exception {
	}

	@Test
	void testCalculateHolidayBonusA() {
		assertArrayEquals(result1, HolidayBonus.calculateHolidayBonus(dataSet1), TOLERANCE);
	}

	@Test
	void testCalculateHolidayBonusB() {
		assertArrayEquals(result2, HolidayBonus.calculateHolidayBonus(dataSet2), TOLERANCE);
	}

	@Test
	void testCalculateHolidayBonusC() {
		assertArrayEquals(result3, HolidayBonus.calculateHolidayBonus(dataSet3), TOLERANCE);
	}

	@Test
	void testCalculateTotalHolidayBonus() {
		assertEquals(11000, HolidayBonus.calculateTotalHolidayBonus(dataSet1), TOLERANCE);
		assertEquals(10000, HolidayBonus.calculateTotalHolidayBonus(dataSet2), TOLERANCE);
		assertEquals(15000, HolidayBonus.calculateTotalHolidayBonus(dataSet3), TOLERANCE);
	}
}

