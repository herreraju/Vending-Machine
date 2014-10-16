public class ProductManager
	{
	static int quantity;
	static boolean vendItem = true;
	static String product;
	public ProductManager(String pr, int q)
		{
		q = quantity;
		pr = product;
		}

	public int getQuantity()
		{
		return quantity;
		}

	public static void incrementItemCode()
		{
		while()

		}
	public static boolean vendItem() 
		{
		if(quantity < 0)
			{
			return false;
			}
		else 
			{
			quantity--;
			return true;
			}
		}
	public static boolean isInStock()
	{
	if(quantity > 0)
		{
		return true;
		}
	else
		{
		return false;
		}
	}
	public void getProduct()
		{
		
		}
	}
