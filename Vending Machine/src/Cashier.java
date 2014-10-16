public class Cashier 
{
int userBalence = 0;
int ourMoney = 0;
public Cashier()
	{
	}
public int[] addMoney(int value)
	{
	userBalence = value;
	return currentValue();
	}
public int[] currentValue()
	{
	return new int[]{userBalence / 100, userBalence - ((userBalence / 100) * 100)};
	}
public static int toPennies(int[] value)
	{
	return ((value[0] * 100) + value[1]);
	}
public static String showCash(int[] money)
	{
	return ("$" + money[0] + "." + money[1]);
	}
public void purchase(int price)
	{
	ourMoney += price;
	userBalence -= price;
	}
public String returnChange(int[] money)
	{
	userBalence -= toPennies(money);
	return showCash(money);
	}
}