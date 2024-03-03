package javatraining;
sadadsdsada
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
//Made this change from main branch. 
public class ExceptionHandlingExample {
	//Added a comment after staging.
	//Added a commet for staging. 
	// You as a programmer are telling the future colleagues that this method may
	// throw ArithmeticException
	public static void main(String[] args) throws ArithmeticException, IOException {
		// TODO Auto-generated method stub
//		List firstList = new ArrayList(); //raw list, Object

		int p,q,r;
		p = 10;
		q = 11;
		r = 5;

		int d;
		try {
			d = c / (a - b);
			Thread.sleep(4000);
			c = d + 100;
			System.out.println("Value of d is " + d);
			System.out.println("Value of c is " + c);
		} catch (ArithmeticException e) {
			System.out.println("Make sure value of a and be are not same.");
			// throw e;
		} catch (InterruptedException e) {
			System.out.println();
		} finally {
			System.out.println("I will always be displayed whether there is an exception or not");
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			// sleep method throws InterruptedException which is checked
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			a = Integer.parseInt(br.readLine());

			b = Integer.parseInt(br.readLine());
			System.out.println("Sum is :" + (a + b));

		}

	}
}
