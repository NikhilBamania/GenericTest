package org.generics.test;

import java.util.Collection;

import lombok.NoArgsConstructor;

@NoArgsConstructor

public class AddNum <A extends Number, B extends Number>{
	
	public double add(A a, B b)
	{
		return a.doubleValue() + b.doubleValue();
	}
	
	//? - Wildcard, extends - upperBound 
	public double sum(Collection<? extends Number> list)
	{
		double sum = 0;
		for(Number number : list)
		{	
			sum += number.doubleValue();
		}
		return sum;
	}
	
	//super - LowerBound 
	public double sum1(Collection<? super Number> list)
	{
		double sum = 0;
		for(Object number : list)
		{	
			sum += ((Number) number).doubleValue();
		}
		return sum;
	}

}
