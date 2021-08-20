package Lesson1;

public class CharAndString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message ="Welcome to Java ";
		message = message + " and HTML";
		System.out.println(message.charAt(message.length() - 1));
		for (int i= 0; i< message.length()-1 ;i++) {
			System.out.println(message.charAt(i));
		}
		

	}

}
