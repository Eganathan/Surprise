import java.util.ArrayList;
import java.util.List;

public class ArrayPairs {

	/*
	 * i = 0 -> n
	 * 
	 */
	List<String> start(List<Integer> arr, int k) {

		List<String> result = new ArrayList<String>();

		for (int i = 0; i < arr.size(); i++) {
			for (int j = i; j < arr.size(); j++) {

				if ((arr.get(i) + arr.get(j)) % k == 0 && i != j)
					result.add(" " + arr.get(i) + " & " + arr.get(j) + " ");
			}
		}

		return result;
	}

}
