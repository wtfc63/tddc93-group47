package triangle;

public class TriangleProgram {

	public int triangleType(int[] sides) {
		if (sides.length != 3) {
			throw new IllegalArgumentException("Not a triangle.");
		}

		int[] s = (int[]) sides.clone();
		if (s[0] > s[1]) {
			swap(s, 0, 1);
		}
		if (s[0] > s[2]) {
			swap(s, 0, 2);
		}
		if (s[1] > s[2]) {
			swap(s, 1, 2);
		}

		if (s[0] <= 0 || s[2] - s[0] >= s[1]) {
			throw new IllegalArgumentException("Not a triangle.");
		}

		if (s[0] == s[2]) {
			return TriangleType.EQUILATERAL;
		} else if (s[0] == s[1] || s[1] == s[2]) {
			return TriangleType.ISOSCELES;
		} else {
			return TriangleType.SCALENE;
		}
	}

	private void swap(int[] s, int i, int j) {
		int tmp = s[i];
		s[i] = s[j];
		s[j] = tmp;
	}
}
