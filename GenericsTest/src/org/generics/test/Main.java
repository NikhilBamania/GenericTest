package org.generics.test;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Main {

	public static final Logger logger = LogManager.getLogger(Main.class);

	public static void main(String[] args) {

		Quad<String, Double, Integer, Boolean> a = new Quad<>("abcd", 1.8, 22, true);
		logger.error(a.append());

		/*
		 * //type Mismatch error a.setVar1(18); a.setVar2("pqrs"); a.setVar3(false);
		 * a.setVar4(2.9);
		 */
		logger.error(a);
		a.setVar4(false);
		logger.error(a.append());

		AddNum<Number, Number> b = new AddNum<Number, Number>();
		Double d = b.add(18, 25);
		logger.error(d);
	}

}
