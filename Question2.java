/*Write a function which will returns the maximum number of words in a sentence. 
Given text can be divided into sentences by splitting it at dots, question marks 
and exclamation marks.*/

package splitstring;

public class SplittingDemo {

	public static void main(String[] a) {
		// TODO Auto-generated method stub

			      
			      //split sentence by using dot
			       String sampleSentence = "We test coders. Give us a try?";
				   String[] words = sampleSentence.split("\\.+");
				   int itemCount = words.length;
				   System.out.println("The number of words is: " + itemCount);
				   System.out.println("Split sentence by using dot: ");
				   for (int i = 0; i < itemCount; i++) {
				      String word = words[i];
				      System.out.println(word);
				      
			      
			      
				       //split sentence by using question mark
				       /*String sampleSentence = "We test coders. Give us a try?";
					   String[] words = sampleSentence.split("\\?+");
					   int itemCount = words.length;
					   System.out.println("The number of words is: " + itemCount);
					   System.out.println("Split sentence by using question mark: ");
					   for (int i = 0; i < itemCount; i++) {
					      String word = words[i];
					      System.out.println(word);*/
					      
					      
					      //split sentence by using exclmentry marks
					       /*String sampleSentence = "We! test coders. Give us a try?"; 
						   String[] words = sampleSentence.split("\\!+");
						   int itemCount = words.length;
						   System.out.println("The number of words is: " + itemCount);
						   System.out.println("Split sentence by using exclmentary marks: ");
						   for (int i = 0; i < itemCount; i++) {
						      String word = words[i];
						      System.out.println(word);*/
		
		                 //split sentence by using whitspace
		                 /*String sampleSentence = "We! test coders. Give us a try?"; 
		                 String[] words = sampleSentence.split("\\s+");
		                 int itemCount = words.length;
		                 System.out.println("The number of words is: " + itemCount);
		                 System.out.println("Split sentence by using whitspace: ");
		                 for (int i = 0; i < itemCount; i++) {
		                     String word = words[i];
		                      System.out.println(word);*/
			   }
			}

	}
//=================OUTPUT====================

/*The number of words is: 2
Split sentence by using dot: 
We test coders
 Give us a try?*/

/*The number of words is: 1
Split sentence by using question mark: 
We test coders. Give us a try*/

/*The number of words is: 1
Split sentence by using question mark: 
We test coders. Give us a try*/

/*The number of words is: 7
Split sentence by using whitspace: 
We!
test
coders.
Give
us
a
try?*/
