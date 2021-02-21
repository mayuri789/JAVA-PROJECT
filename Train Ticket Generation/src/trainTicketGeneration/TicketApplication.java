package trainTicketGeneration;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TicketApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ticket appplication...");
		DateTimeFormatter pattern=DateTimeFormatter.ofPattern("dd/MM/yyyy");  
		
		TrainDAO trainDao =new TrainDAO();
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("ENTER THE TRAIN NUMBER");
		int trainNumber =sc.nextInt();
		System.out.println("ENTER THE TRAVEL DATE :");
		String travelDate =sc.next();
		
		
		
		//calling findTrain() method passing train number as parameter which return train object
		
		Train train=trainDao.findTrain(trainNumber);
		//System.out.println(" train name :"+train.getTrainName()+"price :"+train.getTicketPrice());
		
		if(train==null)
		
		 System.out.println("train not found ..");
		
		LocalDate myTravelDate =LocalDate.parse(travelDate,pattern);
		System.out.println("your travel date is : "+myTravelDate);
		System.out.println("your travel date is with givaen pattern : "+myTravelDate.format(pattern));
	
		Ticket ticket=new Ticket(myTravelDate, train);
	    System.out.println("enter the number of passenger : ");
	    int noOfPassenger=sc.nextInt();
		
	    for(int i=0;i<noOfPassenger;i++)
	    {
	    	System.out.println("enter name: ");
	    	String name=sc.next();
	    	
	    	System.out.println("enter age: ");
	    	int age=sc.nextInt();
	    	
	    	System.out.println("enter gender: ");
	    	char gender=sc.next().charAt(0);
	    	
	    	ticket.addPassenger(new Passenger(name, age, gender));
	    	
	    	
	    }
	    ticket.display();			
	}

}
