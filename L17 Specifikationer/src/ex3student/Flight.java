package ex3student;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 * Model a flight with an airline between airports.
 */
public class Flight {
	    private String flightNumber;
	    private String destination;
	    private LocalDateTime departure;
	    private LocalDateTime arrival;
	    private final ArrayList<Passenger> passengers = new ArrayList<>();

	/**
	 * Create a flight.<br/>
	 * Pre: flightNumber is not empty, destination is not empty.
	 */
	public Flight(String flightNumber, String destination) {
		// TODO
		this.flightNumber = flightNumber;
		this.destination = destination;
	}

	/**
	 * Return the destination.
	 */
	// TODO

	public String getDestination() {
		return destination;
	}


	/**
	 * Return the flight number.
	 */
	// TODO

	public String getFlightNumber() {
		return flightNumber;
	}


	/**
	 * Return the date and time of departure.<br/>
	 */
	// TODO


	public LocalDateTime getDeparture() {
		return departure;
	}

	/**
	 * Set the date and time of departure.<br>
	 */
	public void setDeparture(LocalDateTime departure) {
		// TODO
		this.departure = LocalDateTime.of(LocalDate.now(), LocalTime.now());
	}

	/**
	 * Return the date and time of arrival.<br/>
	 */
	// TODO
	public LocalDateTime getArrival() {
		return arrival;
	}

	/**
	 * Set the date and time of arrival.<br/>
	 * Pre: Arrival date and time is after departure date and time.
	 */
	public void setArrival(LocalDateTime arrival) {
		// TODO
		this.arrival = LocalDateTime.of(LocalDate.now().plusDays(1),LocalTime.now().plusHours(2));

	}
	/**
	 * Return a copy of the passenger list.
	 */
	// TODO
	public ArrayList<Passenger> getP() {
		return passengers;
	}

	/**
	 * Create and return a passenger added to the passenger list.<br/>
	 * Pre: name is not empty, age >= 0.
	 */
	public Passenger addPassenger(String name, int age) {
		// TODO
		return null;
	}

	/**
	 * Remove a named passenger from the passenger list.<br/>
	 * Return true, if the passenger is removed from the passenger list.<br/>
	 * Pre: name is not empty.
	 */
	public boolean removePassenger(String name) {
		// TODO
		return false;
	}

	/**
	 * Return the duration of the flight measured in hours.<br/>
	 */
	public double durationInHours() {
		// TODO
		return 0.0;
	}

	/**
	 * Return true if the flight time overlaps
	 * midnight of the day of departure.<br/>
	 */
	public boolean midnightFlight() {
		// TODO
		return false;
	}

	/**
	 * Return the average age of all the passengers.<br/>
	 * Pre: The passenger list is not empty.
	 */
	public double averagePassengerAge() {
		// TODO
		return 0.0;
	}

}
