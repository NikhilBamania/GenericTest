package org.generics.test;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Quad <P, Q, R, S>{
	private P var1;
	private Q var2;
	private R var3;
	private S var4;
	
	public String append()
	{
		return var1.toString() + var2.toString() + var3.toString() + var4.toString();
	}
	
}
