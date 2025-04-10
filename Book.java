
public class Book {
	 	String title;
	    boolean isBorrow;
	    
	    public Book(String title){
	        this.title = title;
	        this.isBorrow = false;
	    }
	    
	    public void borrowBook(){
	        this.isBorrow = true;
	    }
	    
	    public void returnBook(){
	        this.isBorrow = false;
	    }
	    
	    public String getTitle(){
	        return this.title;
	    }
	    
	    public boolean isBorrowed(){
	        return this.isBorrow;
	    }
	    
	}

