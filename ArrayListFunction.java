package collectioninjava;//created package as collectioninjava

/**
 * 
 * In this program i've Created a class named ArrayListFunction,and also created
 *  an object of ArrayList class and perform the following functions:
 *  Find the number of elements present in the array list.
 *  Check whether an element is present in ArrayList or not.
 *  Convert ArrayList into Array.
 *  Replace the third element of ArrayList with a given value.
 *  as mention in the question.
 *
 */
import java.util.ArrayList;//import keyword is used to import built-in and user defined package into our java source file. So that our class can refer a class that is in another package by directly 
import java.util.Iterator;//import keyword is used to import built-in and user defined package into our java source file. So that our class can refer a class that is in another package by directly

public class ArrayListFunction {
	public static void main(String[] args) {
		//Here public is a access modifier which defines who can access this method
				//Here static a keyword which identifies class related thing
				//void is used to define return type of the method,void means method wont return any value
				//main is name of method
				//declares method String[]
				//String[]args means arguments will be passed into main method and says that main() as a parameter
		/**
		 * In here created ArrayList object as mention in the question
		 * and than i've add some elements  in ElementList by 
		 * using add method and also used for loop 
		 * and than print the elements in the window console
		 */
		ArrayList<String> arrlist = new ArrayList<String>();
		// here we are Adding elements to ElementList
		// use add() method to add element
		arrlist.add("sai");
		arrlist.add("vamshi");
		arrlist.add("aleti");
		arrlist.add("krishna");
		arrlist.add("naresh");

		// let us print all the elements available in list
		for (String name : arrlist) {
			System.out.println("name = " + name);
		}

		// this will print the size of this list
		int numOfElements = arrlist.size();
		System.out.println("Size of list = " + numOfElements);

		// here we are applying boolean to check the element Present in the list
		// or not
		// we are using the contain Method for checking the element present in
		// the list or not

		boolean retval = arrlist.contains("kiran");
		// here we are applying the if condition to check the element

		if (retval == true) {
			System.out.println("element kiran is contained in the list");
		} else {
			System.out.println("element kiran  is not contained in the list");//system is used to return code
	        //out is a static member
		  	//Println is used to print text  and gives output
		}

		// here we are Converting the arraylist into the array
		// here we are using the toarray Method
		String[] elementListasArray = arrlist.toArray(new String[numOfElements]);
		
		System.out.println(elementListasArray[0]);//system is used to return code
        //out is a static member
	  	//Println is used to print text  and gives output

		// Here we are taking the element which i have to replace
		String replace = "aleti";
		int i = 0, j = 0;
		// here we are applying the iterator method to check the arraylist one
		// by one
		Iterator<String> itr = arrlist.iterator();
		while (itr.hasNext()) {
			// here i will increment
			i++;

			// here we are taking new string if the element will match
			// it will replaced by the new string
			String string = (String) itr.next();
			if (string.equals(replace)) {
				// here the previous element will be removed in the List
				itr.remove();
				j = i;
			}

		}
		// here we are adding the new element in the list
		// by the help of add method
		arrlist.add(j, "uday");
		for (String name : arrlist) {
			System.out.println(name);//system is used to return code
	        //out is a static member
		  	//Println is used to print text  and gives output

		}

	}
}

