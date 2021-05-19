//Evan White
import java.util.Scanner;
	import java.io.*;
	import java.util.ArrayList;
	
  public class MailingList {
	
	private String name;
	private int ssNumber;
	private String department;
	private String address;
	private String cityState;
	private int zipcode;
	private double mailingCost;
	
	
	
		//=========================================================

				MailingList()			            // Constructor (default)
				{
					name = "";
					ssNumber = 0;
					department = "";
					address = "";
					cityState = "";
					zipcode = 0;
					mailingCost = 0.0;
				}
				
				
				MailingList(String nam, int ssN, String dep, String add, String cit, int zip, double mai)
				{
					
					name = nam;
					ssNumber = ssN;
					department = dep;
					address = add;
					cityState = cit;
					zipcode = zip;
					mailingCost = mai;
					
				}
				
				
				public String getName()    // accessor "getter" methods
				{
					return name;
				}

				public int getSSNumber()
				{
					return ssNumber;
				}

				public String getDepartment()
				{
					return department;
				}

				public String getAddress()
				{
					return address;
				}
				
				public String getCityState()
				{
					return cityState;
				}

				public int getZipcode()
				{
					return zipcode;
				}
				
				public double getMailingCost()
				{
					return mailingCost;
				}
}