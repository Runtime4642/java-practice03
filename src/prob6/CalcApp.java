package prob6;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while( true ) {
			
			System.out.print( ">> " );
			String expression = scanner.nextLine();

			/*  코드를 완성 합니다 */
			if(expression.equals("quit"))
				break;
			String a[] = expression.split(" ");
			Calculator calc;
			if(a[1].equals("+"))
				calc=new Add();
			else if(a[1].equals("-"))
				calc=new Sub();
			else if(a[1].equals("*"))
				calc=new Mul();
				else if(a[1].equals("/"))
					calc=new Div();
				else
					calc = new Add();
			calc.setValue(Integer.parseInt(a[0]), Integer.parseInt(a[2]));
			System.out.println(calc.calculate());

		}
	}
}
