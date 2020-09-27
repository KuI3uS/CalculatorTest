package java;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();

		System.out.println(calculator.add(""));
		System.out.println(calculator.add("3"));
		System.out.println(calculator.add("4,2,6,32,5"));
		System.out.println(calculator.add("4,7,2,-5,4,-1"));
		System.out.println(calculator.add("4,a,7,5,e,9"));
	}

	public int add(String numbers) {
		if (numbers.isEmpty()) return 0;

		if (numbers.length() == 1 && Character.isDigit(numbers.charAt(0)))
			return Integer.parseInt(numbers);
		else if (numbers.length() == 1)
			return 0;

		int sum = 0;
		List<String> incorrectData = new ArrayList<>();
		String[] strings = numbers.split(",");

		for (String s : strings) {
			try {
				int value = Integer.parseInt(s);
				if (value > 0) sum += value;
			} catch (NumberFormatException e) {
				incorrectData.add(s);
			}
		}

		if (!incorrectData.isEmpty()) System.out.println("Incorrect data: " + incorrectData);
		return sum;
	}
}
