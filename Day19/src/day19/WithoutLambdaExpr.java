

//Program to demonstrate Lambda expression without parameters
package day19;

public class WithoutLambdaExpr {

	public static void main(String[] args) {
		IStatement s = () -> {return "Hello World!!";};
		System.out.println(s.show());

	}

}
