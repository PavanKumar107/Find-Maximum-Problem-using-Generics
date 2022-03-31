package generics;

public class Maximum {

    public Maximum(Integer third1, Integer third12, Integer third13) {
		// TODO Auto-generated constructor stub
	}
	public Maximum(String third, String third2, String third3) {
		// TODO Auto-generated constructor stub
	}
	public Maximum() {
		// TODO Auto-generated constructor stub
	}
	public void maxInt(Integer first1, Integer second1, Integer third1) {
        if (first1.compareTo(second1) >= 0 && first1.compareTo(third1) >= 0) {
            System.out.println("First Element is Greatest");
        } else if (second1.compareTo(first1) >= 0 && second1.compareTo(third1) >= 0) {
            System.out.println("Second Element is Greatest");
        } else {
            System.out.println("Third Element is Greatest");
        }
    }
public class Maximum <T> extends Comparable<T> {

    public void maxFloat(Float first, Float second, Float third) {
        if (first.compareTo(second) >= 0 && first.compareTo(third) >= 0) {
            System.out.println("First Element is Greatest");
        } else if (second.compareTo(first) >= 0 && second.compareTo(third) >= 0) {
            System.out.println("Second Element is Greatest");
        } else {
            System.out.println("Third Element is Greatest");
        }
    }
    T first;
    T second;
    T third;

    public void maxString(String first, String second, String third) {
        if (first.compareTo(second) >= 0 && first.compareTo(third) >= 0) {
            System.out.println("First Element is Greatest");
        } else if (second.compareTo(first) >= 0 && second.compareTo(third) >= 0) {
            System.out.println("Second Element is Greatest");
        } else {
            System.out.println("Third Element is Greatest");
        }
    }

    public <T extends Comparable<T>> void findMax(T first, T second, T third) {
        if (first.compareTo(second) >= 0 && third.compareTo(second) >= 0) {
            System.out.println("First Element is Largest");
        } 
        else if (second.compareTo(first) >= 0 && second.compareTo(third) >= 0) {
        }
        else if (second.compareTo(first) >= 0 && second.compareTo(third) >= 0) {
            System.out.println("Second Element is Largest");
        }
        else {
            System.out.println("Third Element is Largest");
        }
    }

    public void findMax() {
        findMax(this.first, this.second, this.third);
    }
    
    public Maximum(T first, T second, T third) {
        super();
        this.first = first;
        this.second = second;
        this.third = third;

    }
}
public void maxString(String first, String second, String third) {
	// TODO Auto-generated method stub
	}
public void findMax() {
	// TODO Auto-generated method stub
	
}
}