package assignment;

public class HalfPyramid {

	public static void main(String[] args) {
		System.out.println("Half pyramid: ");
		
		for (int i = 1; i <= 7; ++i) {
			for (int j = 1; j <= i; ++j) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("Inverted half pyramid: ");
		for (int i = 7; i >= 1; --i) {
			for (int j = 1; j <= i; ++j) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}