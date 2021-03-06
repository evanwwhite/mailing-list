//Evan White
import java.util.Scanner;
	import java.io.*;
	import java.util.ArrayList;
	
  public class MailingList {
	
	private String name;
	private String ssNumber;
	private String department;
	private String address;
	private String cityState;
	private String zipcode;
	private double mailingCost;
	
	
	
		//=========================================================

				MailingList()			            // Constructor (default)
				{
					name = "";
					ssNumber = "";
					department = "";
					address = "";
					cityState = "";
					zipcode = "";
					mailingCost = 0.0;
				}
				
				
				MailingList(String nam, String ssN, String dep, String add, String cit, String zip, double mai)
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

				public String getSSNumber()
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

				public String getZipcode()
				{
					return zipcode;
				}
				
				public double getMailingCost()
				{
					return mailingCost;
                }
//======================================================
                public void setName(String n)                // mutator "setter" methods
				{
					name = n;
                }

                public void setSSNumber(String s)                // mutator "setter" methods
				{
					ssNumber = s;
                }
                
				public void setDepartment(String d)
				{
					department = d;
                }
                
				public void setAddress(String a)
				{
					address = a;
                }

                public void setCityState(String c)                // mutator "setter" methods
				{
					cityState = c;
                }
                
				public void setZipcode(String z)
				{
					zipcode = z;
                }
                
				public void setMailingCost(double m)
				{
					MailingCost = m;
                }
                
				public String toString()
				{
					return String.format("%-15s %-10s %8.2f", getName(), 
							getZipcode(), getMailingCost());
				}
}
