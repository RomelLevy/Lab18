import java.util.ArrayList;

public class MyArrayListlab {

	public static void main(String[] args) {

	public static void  insertAt () {
		
		
		 ArrayList<Integer> arrlist = new ArrayList<Integer>(5);

	      arrlist.add(15);
	      arrlist.add(22);
	      arrlist.add(30);
	      arrlist.add(40);

	      // adding element 25 at third position
	      arrlist.add(2,25);
	        
	      // let us print all the elements available in list
	      for (Integer number : arrlist) {
	         System.out.println("Number = " + number);
	      }  

	}
	
	

	public static  void removeAt() {

		// create an empty array list with an initial capacity
		ArrayList<Integer> arrlist = new ArrayList<Integer>(5);

		// use add() method to add elements in the deque
		arrlist.add(20);
		arrlist.add(15);
		arrlist.add(30);
		arrlist.add(45);

		System.out.println("Size of list: " + arrlist.size());

		// let us print all the elements available in list
		for (Integer number : arrlist) {
			System.out.println("Number = " + number);
		}

		// Removes element at 3rd position
		arrlist.remove(2);

		System.out.println("Now, Size of list: " + arrlist.size());

		// let us print all the elements available in list
		for (Integer number : arrlist) {
			System.out.println("Number = " + number);
		}
	}


}
}