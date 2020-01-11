/**
 * 
 */
package apComputreScienceA;

import java.util.ArrayList;
import java.util.List;

/**
 * @author asus
 *
 */
public class Question3 {

	/**
	 * @param args
	 */
	// TODO Auto-generated method stub

	public static void main (String [] agrs) {
		
		List<Integer> nums = new ArrayList<Integer>(8);

		nums.add(0);//indice k=0
		nums.add(0);//indice k=1
		nums.add(4);//indice k=2
		nums.add(2);//indice k=3
		nums.add(5);//indice k=4
		nums.add(0);//indice k=5
		nums.add(3);//indice k=6
		nums.add(0);//indice k= 7
		

		
		for (int k = 0; k<nums.size();k++) {

			if (nums.get(k).intValue()==0)
			{


				nums.remove(k);
				System.out.println(nums);
			}
		}
	

	//	mystery(nums);

	

	}

	public static void mystery( List<Integer> numss) {

		/* Arpès avoir éxécuté la fonction mystery() les indices sont les suivants :
		 * 
		 * 
		 */
		Integer nums;
		
		for (int k = 0; k<numss.size();k++) {

			if (numss.get(k).intValue()==0)
			{


				nums= numss.remove(k);
				System.out.println(nums);
			}
		}
	}






}






