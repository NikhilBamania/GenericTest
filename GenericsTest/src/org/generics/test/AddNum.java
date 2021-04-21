package org.generics.test;

import lombok.NoArgsConstructor;

@NoArgsConstructor

public class AddNum <A extends Number, B extends Number>{
	
	public double add(A a, B b)
	{
		return a.doubleValue() + b.doubleValue();
	}

}
