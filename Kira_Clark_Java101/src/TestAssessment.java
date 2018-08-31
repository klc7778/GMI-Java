import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestAssessment {

	public static void main(String[] args) throws ParseException 
	{
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM-DD-YYYY"); 
		
		// TODO Auto-generated method stub
		// create a new book object of Data Analytics 
		Book da = new DataAnalytics("Data Analytics Part I", 5);
		
		// create new employee object passing the empName, bookObject they want to rent, and date they rent the book
		Employee emp = new Employee("Susan", da, dateFormat.parse("07-31-2018"));
		
		// Employee Susan, will now rent the book on July 31
		
		// Employee susan will not return book on August 21
		emp.returnBook(dateFormat.parse("08-21-2018"));
		
		/* create a new FeeCalculator obj
		 * That accepts the created employee object
		 * and the late Fee that is passed from the 
		 * Book class
		 */
		FeeCalculator cFee = new FeeCalculator(emp, Book.lateFee);
		
		/*
		 * Should calculate fee using the Employee.issueDate
		 * and the Employee.returnDate passed through 
		 * the default constructor
		 */
		cFee.calcFee();
		
	}

}
