import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {

	private static MyComparator instance;

	public static MyComparator getInstance() {
		if (instance==null){
			instance=new MyComparator();
		}
		return instance;
	}

	public int getNumberOfComparisons() {
		return numberOfComparisons;
	}

	private int numberOfComparisons;

	private MyComparator(){
		resetCounter();
	}

	public void resetCounter(){
		numberOfComparisons=0;
	}

	@Override
	public int compare(Integer o1, Integer o2) {
		numberOfComparisons++;
		return o1-o2;
	}
}
