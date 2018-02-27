/*
A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward as forward, such as madam or racecar.


*/


public class Palindrome{


	private static boolean isPalindrome(String word){
		//TODO
		/*
		Use the datastructure queue to first enqueue the letters of the word, and the dequeue them and compare the output to the original word
		Example:
		word: madam
		enqueued: m-a-d-a-m
		dequeued: madam

		word = enqueued thus "madam" is a palindrome
		*/

		return false;
	}

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		String word;

		do{
			word=scanner.nextLine();
			System.out.println(isPalindrome(word));
		}while(!word.isEmpty())
		
	}
}