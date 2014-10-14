public class ProductManager
	{
	static int quantity;
	static boolean vendItem = true;
	static String product;

	public ProductManager(int[] p, int q)
		{
		q = quantity;
		p = Product.price;
		}

	public int getQuantity()
		{
		return quantity;
		}

	public static void incrementItemCode()
		{
		for (int i = 0; i <= 10; i++)
			{
			
			}
		}
	public static boolean vendItem() 
		{
		if(quantity < 0)
			{
			return false;
			}
		else 
			{
			return true;
			}
		}
	}
