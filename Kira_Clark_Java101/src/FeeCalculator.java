
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 
 */
public class FeeCalculator extends Employee {
	
	static Date issueDate;
	static Date returnDate;
	static SimpleDateFormat dateFormat = new SimpleDateFormat("MM-DD-YYYY"); 
	static long countDay;
	static float daysBetween;
	static int lateFee;
	Employee empObj;
	
    public FeeCalculator(Employee emp, int fee) 
    {
		super(empName, book, issueDate);
		this.empObj = emp;  
		this.lateFee = fee;
		// TODO Auto-generated constructor stub
	} // end FeeCalculator constructor 

	/**
     * @param issueDate 
     * @param returnDate 
     * @return
     */
    
	public int calcFee() 
	{
        // TODO implement here
    	
    	/*count the number of days from issue date and subtract from return date
    	 * These dates are taken from Employee Object 
		*/
   	 try {
   		 
   		 	issueDate = empObj.getIssueDate();
   	       
   	        returnDate = empObj.getReturnDate();
   	       
   	      System.out.println(issueDate);
   	      // System.out.println(returnDate);
   	       
   	       countDay = returnDate  - issueDate.getTime();
   	       //System.out.println(countDay);
   	       
   	       daysBetween = (countDay / (1000*60*60*24));
   	       
   	       //System.out.println("Days between = " + daysBetween);
   	 	 }
   	 
    finally 
    {
    	if(daysBetween <= 7)
   	 	{
   	 		lateFee = 0;
    		System.out.println("No Late Fee!");
   	 	}
        
    	else if(daysBetween > 7)
    	{
    		System.out.println("The late fee that is owed is: " + Book.lateFee);
    	
    	}
    	
    		return lateFee; 
    } // end finally
    	
  } // end calcFee method
   	 	
} // end Class FeeCalculator