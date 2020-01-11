package apComputreScienceA;

import java.util.ArrayList;
import java.util.List;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> animals= new ArrayList<String>();
		animals.add("dog");//index 0
		animals.add("cat"); //index 1
		animals.add("snake");//index 2
		animals.set(2, "lizard");//remplace lizard par snake
		animals.set(1, "fish");//remplace cat par fish
		animals.remove(3);
		System.out.println(animals);
	}

}
