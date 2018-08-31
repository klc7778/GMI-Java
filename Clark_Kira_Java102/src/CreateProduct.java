import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CreateProduct {
	
	List<Product> products;
	
	public List<Product> createProduct(BufferedReader reader) throws IOException
	{
		products = new ArrayList<>();
		
		String str = "";
		
		int initializor = 0;
		
		try {
			while((str = reader.readLine()) != null)
			{
				// skip first line in file
				if(initializor > 0)
				{
					String[] details = str.split(",");
					products.add(new Product(details));
				} // end if statement
				
				else 
				{
					initializor ++; 
				}
			} // end loop 
		} // end try 
		
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		return products;
	} // end createProduct 

}
