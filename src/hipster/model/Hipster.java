package hipster.model;

public class Hipster
{
 private String name;
 private String[] hipsterPhrases;
 private Book [] hipsterBooks;
 
 public Hipster(){
	 this.name="";
	 this.hipsterPhrases=new String [4];
	 this.hipsterBooks=new  Book [3];
	 setupArray();
	 setupBooks();
	 
 }
 private void setupArray()
 {
	 hipsterPhrases[0] = "That is so mainstream";
	 hipsterPhrases[1] = "I don't mean to sound like a hipster, but, you're acting mainstream";
	 hipsterPhrases[2] = " Wow you're so cool";
	 hipsterPhrases[3] = " I was into hungergames before it was cool";
 }
  private void setupBooks()
  {
	  Book firstBook, secondBook, thirdBook;
	  firstBook=new Book();
	  firstBook.setAuthor("Rick rordan");
	  firstBook.setTitle("Mangus chase and the gods of Asguard: the sword of summer");
	  firstBook.setSubject("Fantasy");
	  firstBook.setPageCount(491);
	  firstBook.setPrice(11.99);
	  
	  secondBook=new Book();
	  secondBook.setAuthor("John Flangon");
	  secondBook.setTitle("The Ranger's Apprentice, the royal ranger");
	  secondBook.setSubject("Fantasy");
	  secondBook.setPageCount(448);
	  secondBook.setPrice(8.99);
	  
	  thirdBook=new Book();
	  thirdBook.setAuthor("Orson ScottCard ");
	  thirdBook.setTitle("Edners game");
	  thirdBook.setSubject("Science Fiction");
	  thirdBook.setPageCount(350);
	  thirdBook.setPrice(9.96);
	
	  hipsterBooks[0]=firstBook;
	  hipsterBooks[1]=secondBook;
	  hipsterBooks[2]=thirdBook;
  }
  public Hipster(String name)
  {
	  this.name=name;
  }
}
