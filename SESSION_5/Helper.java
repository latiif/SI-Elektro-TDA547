import java.util.Arrays;
import java.util.Random;

public class Helper {

	public static Integer[] createRandomArray(int length){
		Integer[] res = new Integer[length];

		Random rand = new Random();

		for (int i=0;i<length;i++) {
			res[i] = rand.nextInt()%length;
		}
		return res;
	}


	public static void printArray(Integer[] array){
		System.out.println(Arrays.toString(array));
	}
}
