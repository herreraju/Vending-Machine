import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Product
	{
	private String name;
	static int[] price;
	

	public Product(String n, int[] p)
		{
		n = name;
		p = price;
		}
	public String getName()
		{
		return name;
		}

	public int[] getPrice()
		{
		return price;
		}
	}
