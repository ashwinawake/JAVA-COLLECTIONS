package blame;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PracCollection {

    private static Scanner input = new Scanner(System.in);
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Collection<String> namelist = new ArrayList<>();    
		   Collection<String> removelist = new ArrayList<>();
		   
            //Enter the names
		    enterNames(namelist);           
            //Displaying the list of names entered.
            printNames(namelist);
            
            System.out.println("\n\nDo you want to remove items from the list:");
            System.out.println("y/n?");
            String answer;
            answer = input.next();
            
            if(answer.equals("y")){
            	enterNames(removelist);
            	removeNames(namelist, removelist);
            	printNames(namelist);
            }else if (answer.equals("n")){
            	System.out.println("Thank You. Have a nice day!");
            }else {
            	System.out.println("You've entered an invalid value.");
            } 
            	
       
	}
	
	//Entering names into a list
	public static Collection enterNames(Collection<String> names){
		
		 System.out.println("How many names do you want to enter?");
         int num;
         
         num = input.nextInt();
         
         for(int count = 0; count<num; count++){
         	String name;
         	System.out.println("Enter name "+(count+1));
         	name = input.next();
         	names.add(name.toUpperCase());
         }
		return names;
		
	}
	
	
	//Removing names from a list
	public static Collection removeNames(Collection<String> names, Collection<String> remove){
		
		Iterator<String> iterator = names.iterator();
		
		while(iterator.hasNext()){
			if(remove.contains(iterator.next())){
				iterator.remove();
			}
		}
		
		return names;		
	}

	//Printing out names
	public static void printNames(Collection<String> names){
		System.out.println("Total number of names in the list are: "+names.size());
        System.out.println("The list of names entered are");
        for(String name: names){
        	System.out.printf("%s ",name);
        }
	}
}
