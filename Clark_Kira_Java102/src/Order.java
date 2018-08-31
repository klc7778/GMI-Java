import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class Order implements Callable{
	
	String prodName;
	String brandName;
	String quantity;
	List<String> prodList;
	
	public Order(String prodName)
	{
		super();
		this.prodName = prodName;
	} // end Order constructor
	
	@Override
	public List<String> call()
	{
		prodList = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		brandName = scan.nextLine();
		quantity = scan.nextLine();
		
		prodList.add(brandName);
		prodList.add(quantity);
		
		return prodList;
	}
	
}
