//Evan White
    import java.util.Scanner; 
    import java.io.*;
	import java.util.ArrayList;
 public class MailingListTesterEW {

	public static void main(String[] args) throws IOException{
			
			Scanner input = new Scanner(new File("mailingList.txt"));
			
			String name = " ";
			int ssNumber= 0;
			String department = " ";
			String address = " ";
			String cityState = " ";
			int zipcode = 0;
			double mailingCost = 0.0;
			
			 
	         ArrayList <MailingList> mailList = new ArrayList <MailingList> ();
	         
	         while(input.hasNext())
	         {
	        	 String line = "";
	        	 String[] s = line.split("\\s+");
	        	 
	        	 name = s[0] + " " + s[1] ;
	        	 ssNumber =  Integer.parseInt(s[3]);
	        	 input.hasNextLine();
	        	 
	        	 department = s[4];
	        	 input.nextLine();
	        	 
	        	 address = s[0] ;
	        	 input.nextLine();
	        	 
	        	 cityState = s[1] ;
	        	 input.nextLine();
	        	 
	        	 zipcode = Integer.parseInt(s[3]);
	        	 input.nextLine();
	        	 
	        	 mailingCost = Double.parseDouble(s[2]);
	        	 input.nextLine();
	        	 
	        	 mailList.add(new MailingList());
	        	 line = input.nextLine();
	         }
	         
	         
	         
	         
	}

}
