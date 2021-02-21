package trainTicketGeneration;

import java.sql.Date;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.TreeMap;

public class Ticket {

	private int counter;
	private String pnr;
	private LocalDate date;
	private Train train;

	//TreeMap<Passenger, Integer> t=new TreeMap<Passenger, Integer>();

	private HashMap<Passenger, Double> passengers;

	public Ticket(LocalDate date, Train train) {
		super();
		this.date = date;
		this.train = train;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public String getPnr() {
		return pnr;
	}

	public void setPnr(String pnr) {
		this.pnr = pnr;
	}
 
	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Train getTrain() {
		return train;
	}

	public void setTrain(Train train) {
		this.train = train;
	}

	public HashMap<Passenger, Double> getPassengers() {
		return passengers;
	}

	public void setPassengers(HashMap<Passenger, Double> passengers) {
		this.passengers = passengers;
	}

	double calcPassengerFare(Passenger passenger)
	{ 

		if(passenger.getAge()<=12)
			return train.getTicketPrice()*0.5;
		else if(passenger.getAge()>=54)
			return train.getTicketPrice()*0.6;
		else if (passenger.getAge()=='f')
			return train.getTicketPrice();
	return counter;

	}

	void addPassenger(Passenger passenger)
	{
		passengers = new HashMap<Passenger, Double>();
		passengers.put(new Passenger(passenger.getName(), passenger.getAge(), passenger.getGender()), calcPassengerFare(passenger));

	}




	public void display() {
		// TODO Auto-generated method stub
		System.out.println("values "+passengers);
	}







}
