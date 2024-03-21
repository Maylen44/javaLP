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
	
	private int m_fieldValue;
	private int m_fieldValue2;
}