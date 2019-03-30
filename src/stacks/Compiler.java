package stacks;

import java.util.Stack;

public class Compiler {

	public static void main(String[] args) {
		String s = "{[()}]";
		System.out.println(compile(s));

	}
	
	public static boolean compile(String s) {
		int l = s.length();
		boolean flag = true;
		Stack<Character> stack = new Stack<>();
		for(int i = 0;i<l;i++) {
			char c = s.charAt(i);
			switch(c) {
			case '{':
				stack.push('}');
				break;
			case '[':
				stack.push(']');
				break;
			case '(':
				stack.push(')');
				break;
			default:
				if(c != stack.pop())
					flag = false;
				break;
			}
		}
		return flag;
	}
}
