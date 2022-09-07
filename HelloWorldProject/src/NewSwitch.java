
public class NewSwitch {
	
	public static void main(String[] args) {
	
	 String month= "June";
	 int year= 2022;
	  
	  switch(month)
	  {
	  case "Jan","March","May","July","Aug","Oct","Dec"->System.out.println("No.of days are 31");
	  case "April","June","Sep","Nov"->System.out.println("No. of days are 30");
	  case "Feb"->{
		            if(year%4==0)
		            	System.out.println("Leap Year & Number of days are 29");
		            else
		            	System.out.println("Number of days are 28");
	               }
	  default->System.out.println("Invalid month");
	    }
    }
}	 


