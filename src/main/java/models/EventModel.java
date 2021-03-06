package models;

public class EventModel {
	public static enum EventType {
		HEART, ASTHMA, ALLERGY, EMERGENCY;
	}
	
	private double latitude;
	private double longitude;
	private int userID;
	private EventType type;
	
	public EventModel(double latitude, double longitude, int userID, EventType type) {
		this.latitude = latitude;
		this.longitude = longitude;
		this.userID = userID;
		this.type = type;
	}
	
	
}
