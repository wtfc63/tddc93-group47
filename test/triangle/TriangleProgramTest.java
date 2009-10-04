package triangle;

import static org.junit.Assert.*;

import org.junit.Test;

import triangle.TriangleProgram;
import triangle.TriangleType;

public class TriangleProgramTest {

	@Test
	public void testTriangleType() {
		TriangleProgram tp = new TriangleProgram();
		assertEquals(TriangleType.EQUILATERAL, tp.triangleType(new int[]{2,2,2}));
		assertEquals(TriangleType.ISOSCELES, tp.triangleType(new int[]{2,2,1}));
		assertEquals(TriangleType.ISOSCELES, tp.triangleType(new int[]{2,1,2}));
		assertEquals(TriangleType.ISOSCELES, tp.triangleType(new int[]{1,2,2}));
		assertEquals(TriangleType.SCALENE, tp.triangleType(new int[]{3,4,5}));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testNonTriangleFirst() {
		TriangleProgram tp = new TriangleProgram();
		assertEquals(TriangleType.SCALENE, tp.triangleType(new int[]{1,2,3}));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testNonTriangleSecond() {
		TriangleProgram tp = new TriangleProgram();
		assertEquals(TriangleType.SCALENE, tp.triangleType(new int[]{2,1,3}));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testNonTriangleThird() {
		TriangleProgram tp = new TriangleProgram();
		assertEquals(TriangleType.SCALENE, tp.triangleType(new int[]{2,3,1}));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testNonTriangleTwoSides() {
		TriangleProgram tp = new TriangleProgram();
		assertEquals(TriangleType.SCALENE, tp.triangleType(new int[]{1,2}));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testNonTriangleFourSides() {
		TriangleProgram tp = new TriangleProgram();
		assertEquals(TriangleType.SCALENE, tp.triangleType(new int[]{1,2,3,4}));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testNonTriangleNullSideFirst() {
		TriangleProgram tp = new TriangleProgram();
		assertEquals(TriangleType.SCALENE, tp.triangleType(new int[]{0,4,5}));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testNonTriangleNullSideSecond() {
		TriangleProgram tp = new TriangleProgram();
		assertEquals(TriangleType.SCALENE, tp.triangleType(new int[]{3,0,5}));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testNonTriangleNullSideThird() {
		TriangleProgram tp = new TriangleProgram();
		assertEquals(TriangleType.SCALENE, tp.triangleType(new int[]{3,4,0}));
	}
}
