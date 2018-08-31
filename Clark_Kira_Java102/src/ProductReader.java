import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductReader {
	
	String absolutePath;
	List<Product> products;
	
	public ProductReader(String absolutePath) {
		super();
		this.absolutePath = absolutePath;
	}
	
	public List<Product> readFile() throws IOException
	{
		File prodFile = null;
		FileReader fReader = null;
		BufferedReader reader = null;
		
		products = new ArrayList<>();
		
		try
		{
			prodFile = new File(absolutePath);
			File[] files = prodFile.listFiles();
			
			for(File file : files)
			{
				fReader = new FileReader(file);
				reader = new BufferedReader(fReader);
				
				CreateProduct cp = new CreateProduct();
				products = cp.createProduct(reader);
				
			} // end for loop here
		} // end try 
		
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		return products;
	} // end readFile
	
	

	
} 
