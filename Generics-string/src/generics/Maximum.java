package generics;

import java.util.Scanner;

public class Maximum {
	public void maxFloat(String first, String second, String third) {
	}
	public void maxString(String first, String second, String third) {
		if (first.compareTo(second) >= 0 && first.compareTo(third) >= 0) {
			System.out.println("First Element is Greatest");
		} else if (second.compareTo(first) >= 0 && second.compareTo(third) >= 0) {
			System.out.println("Second Element is Greatest");
		} else {
			System.out.println("Third Element is Greatest");
		}
	}
}