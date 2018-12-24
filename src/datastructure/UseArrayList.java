package datastructure;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) throws Exception {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		List<String> studentList = new ArrayList<String>();
		studentList.add("Tom");
		studentList.add("Ron");
		studentList.add("Adam");
		studentList.add("Abdul");
		studentList.add("Bo");


		Iterator iterator = studentList.iterator();
		System.out.println("List of students: " );
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}

		studentList.remove("Bo");
		studentList.remove(3);
		System.out.println("\nStudents after removal:" );
		for (String strings : studentList) {
			System.out.println(strings);
		}
		//Database connection established
		ConnectToSqlDB connect = new ConnectToSqlDB();

		//Database created and added
		connect.arraylistToTable(studentList,"ArrayList", "ArrayData");

		//Data reader added
		List<String> numbers = connect.readDataBase("ArrayList", "ArrayData");
		for(String student:numbers) {
			System.out.println(student);
		}
	}
}
