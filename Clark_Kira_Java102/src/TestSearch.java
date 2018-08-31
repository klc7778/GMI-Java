import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestSearch {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String prodName = "Headphones"; 
		List<String> prodList = new ArrayList<>();
		/*
		 * Call execute to start up multiple threads in threadpool
		 * -- used if multiple people would like to order at the same time
		 */
		ExecutorService execute = Executors.newFixedThreadPool(1);
		ProductReader pr = new ProductReader("C:\\Users\\kirclark\\Desktop\\Product_SuperStore.txt"); 
		List<Product> pList = pr.readFile();
		
		try {
			pList = pr.readFile();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		try {
			pList = pr.readFile();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		for(int i = 0; i < 1; i++)
		{
			Callable search = new Order(prodName);
			Future futures = execute.submit(search);
			
			PrintInfo pi = new PrintInfo();
			pi.printInfo(pList, prodName);
			
			try
			{
				pList = (List<Product>) futures.get();
			} // end try 
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			catch(ExecutionException e)
			{
				e.printStackTrace();
			}
			
			pi.checkProd(pList, prodList);
		} // end for loop here 
		
		execute.shutdown();
	}

}
