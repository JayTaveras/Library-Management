import java.util.ArrayList;
import java.util.Scanner;
public class Library {
	 
	    public static ArrayList<Book> Books = new ArrayList<Book>();
	    
	    public static void addBook(){
	        Scanner scan = new Scanner(System.in);
	        System.out.println("What book would you like to add? ");
	            String string = scan.nextLine();
	            Book new_book = new Book(string);
	            Books.add(new_book);
	    } 
	    public static void borrowBook(){
	        Scanner scan = new Scanner(System.in);
	        System.out.println("What book do you want to borrow?");
	        String title = scan.nextLine();
	        
	        boolean exists = false;
	        for (int i = 0; i < Books.size(); i++) {
	        	if (Books.get(i).getTitle().equalsIgnoreCase(title)) { 
	        		exists = true;
	        		if (Books.get(i).isBorrow == false) {
		        		Books.get(i).borrowBook();
		        		System.out.println("Book has been borrowed");	        			
	        		}
	        		else {
	        			System.out.println("Book is already borrowed");
	        		}

	        		break;
	        	}
	        }
	        if (exists == false) {
	        	System.out.println("Book does not exist");
	        }
	        
	        
	    }
	    public static void returnBook (){
	        Scanner scan = new Scanner(System.in);
	        System.out.println("What book do you want to return?");
	        String title = scan.nextLine();
	        
	        boolean exists = false;
	        for (int i = 0; i < Books.size(); i++) {
	        	if (Books.get(i).getTitle().equalsIgnoreCase(title)) { 
	        		exists = true;
	        		if (Books.get(i).isBorrow == true) {
		        		Books.get(i).returnBook();
		        		System.out.println("Book has been returned");	        			
	        		}
	        		else {
	        			System.out.println("Book is already returned");
	        		}

	        		break;
	        	}
		        if (exists == false) {
		        	System.out.println("Book does not exist");
		        }	
	        }
	    } 
	    public static void displayBooks() {
	        
	        for (Book element : Books) {
	        	System.out.println(element.getTitle() + " ");
	        }
	        
	    }
	    
	    public static void libraryFunctions() {
	    	Scanner scan = new Scanner(System.in);
	    	System.out.println("What function would you like to do?");
	    	System.out.println("\nTo Add a Book, Press 1\nTo Borrow a Book, Press 2\nTo Return a Book, Press 3\nTo Display Available Books, Press 4\nTo Exit, Press 0");
	    	int selection = scan.nextInt();
	    	
	    	while (selection != 1 && selection != 2 && selection != 3 && selection != 4) {
	    		System.out.println("Invalid Input");
	    		int answer = scan.nextInt();
	    		selection = answer;
	    	}
	    	do {
	    		if (selection == 1) {
	    			addBook();
	    		}
	    		if (selection == 2) {
	    			borrowBook();
	    		}
	    		if (selection == 3) {
	    			returnBook();
	    		}
	    		if (selection == 4) {
	    			displayBooks();
	    		}
	    		
	    		System.out.println("For Another Function, press the corresponding numbers. To Exit, press 0");
	    		int new_select = scan.nextInt();
	    		selection = new_select;
	    		
	    	} while (selection != 0);
	    	
	    	
	    	
	    }
	    
	    
	}


