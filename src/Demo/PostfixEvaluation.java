package Demo;

import java.util.Stack;

public class PostfixEvaluation {
	static int evaluate(String expression) {
		Stack<Integer> Stack = new Stack<>();
		String[]  tokens = expression.split(" ");
		for(String token : tokens) {
			if(token.matches("//d+")) {
				stack.push(Integer.parseInt(token));
					
			}else {
				int b = stack.pop();
				int a = stack.pop();
				
				switch (token) {
				case "+":
					stack.push(a + b);
				case"-":
					stack.push(a - b);
					break;
				case"*":
					stack.push(a * b);
				case"/":
					stack.push( a / b);
					break;
					
				
				}
			}
		}
		return static void main(String[] args) {
			String expression = " 2 3"
			
			
			
			
			
			
		