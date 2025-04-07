package chapter1.immutabledemo;

import java.util.Date;

//2. Immutable class with mutable fields
public class ImmutableEvent {

	private final String eventName;
	
	private final Date eventDate;
	

	public ImmutableEvent (String eventName, Date eventDate) {
		this.eventName = eventName;
		//deep copy of mutable object
		this.eventDate = new Date(eventDate.getTime());
	}


	public String getEventName() {
		return eventName;
	}


	public Date getEventDate() {
		//return a copy to prevent external modification
		return new Date(eventDate.getTime());
	}


	@Override
	public String toString() {
		return "ImmutableEvent [eventName=" + eventName + ", eventDate=" + eventDate + "]";
	}
	
	
	
}
