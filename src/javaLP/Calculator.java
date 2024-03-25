package javaLP;

public class Calculator
{
	/*
	No Distructor posible => Garbage Collector
	Initialization of Field Variables inside the constructor or on member fields 
	*/
	
	Calculator()
	{
		System.out.println("Constructor for Calculator");
		m_fieldValue = 33;
		m_fieldValue2 = 494;
		
		System.out.println(m_fieldValue);
		System.out.println(m_fieldValue2);
	}
	
	int sum(int lw, int rw)
	{
		int result = lw + rw;
		return result;
	}
	
	public static String calculateIBAN(String country, String bankCode, String accountNumber)
	{
		String countryCode = convertCountryCode(country);
		String intermediateValue = bankCode + accountNumber + countryCode + "00";
		long modulo = calculateModulo(intermediateValue);
		int checkDigit = (int) (98 - modulo);
		return country + String.format("%02d", checkDigit) + " " + 
		bankCode.substring(0, 4) + " " + 
		bankCode.substring(4) + " " + 
		accountNumber.substring(0, 4) + " " +
		accountNumber.substring(4) + " " + 
		String.format("%02d", checkDigit);
	}
	
	public static String convertCountryCode(String country)
	{
		StringBuilder countryCode = new StringBuilder();
		for(char c : country.toCharArray())
		{
			int numericValue = Character.getNumericValue(c);
			countryCode.append(numericValue > 9 ? numericValue : "0" + numericValue);
		}
		return countryCode.toString();
	}
	
	public static long calculateModulo(String value)
	{
		long remainder = 0;
		for (int i = 0; i < value.length(); i += 7)
		{
			long number = Long.parseLong(remainder + value.substring(i, Math.min(i + 7, value.length())));
			remainder = number % 97;
		}
		return remainder;
	}

	
	private int m_fieldValue;
	private int m_fieldValue2;
}