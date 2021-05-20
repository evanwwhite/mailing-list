//Evan White
    import java.util.Scanner; 
    import java.io.*;
	import java.util.ArrayList;
 public class MailingListTesterEW {

	public static void main(String[] args) throws IOException{
			
			Scanner input = new Scanner(new File("mailingList.txt"));
			
			String name = " ";
			String ssNumber = " ";
			String department = " ";
			String address = " ";
			String cityState = " ";
			String zipcode = "";
			double mailingCost = 0.0;
			String line = " ";
			 
	         ArrayList <MailingList> mailList = new ArrayList <MailingList> ();
	         
	         while(input.hasNext())
	         {
	        	 line = input.nextLine();
	        	 String[] s = line.split("\\s+");
	        	 
	        	 name = s[0] + " " + s[1];
	        	 ssNumber = s[2];
	        	 //input.nextLine();
	        	 
	        	 department = input.nextLine();
	        	 
	        	 address = input.nextLine();
	        	 
	        	 //line = input.nextLine();
	        	 
	        	 cityState = s[0] + " " + s[1];
	        	 zipcode = s[2];
	        	 input.nextLine();
	        	 
	        	 input.nextLine();
	        	 
	        	 mailList.add(new MailingList());
	        	
	        	 if(zipcode.charAt(0) == '6')
	 	        	 mailingCost = 4.80; 
	 	         
	 	         else if(zipcode.charAt(0) == '8')
	 	        	 mailingCost = 5.15;
	 	         
	 	         else if(zipcode.charAt(0) == '9')
	 	        	 mailingCost = 5.70;
	 	         
	 	         else
	 	        	 mailingCost = 0.0;
	        	 
	        	  System.out.println(name);
		          System.out.println(zipcode);
	        	  System.out.println(mailingCost);
	        	  System.out.println(" ");
	              
	         }
	         
	       
	}

}
