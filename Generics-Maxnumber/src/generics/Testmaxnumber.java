package generics;

public class Testmaxnumber {
	public void maxInt(Integer first, Integer second, Integer third) {
		if (first.compareTo(second) >= 0 && first.compareTo(third) >= 0) {
			System.out.println("Maximum Number Is At First Position");
		} 
		else if (second.compareTo(first) >= 0 && second.compareTo(third) >= 0) {
			System.out.println("Maximum Number Is At Second Position");
		} 
		else {
			System.out.println("Maximum Number Is At Third Position");
		}
	}
}
