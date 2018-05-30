package com.plash.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Hotel_Details")
public class HotelDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GenericGenerator(name = "gen", strategy = "increment")
	@GeneratedValue(generator = "gen")
	private int id;
	private String hotelName;
	private String city;
	private int roomsAvilable;
	private boolean WiFi;
	private int ratingOutOfTen;
	private double rentPerDay;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getRoomsAvilable() {
		return roomsAvilable;
	}
	public void setRoomsAvilable(int roomsAvilable) {
		this.roomsAvilable = roomsAvilable;
	}
	public boolean isWiFi() {
		return WiFi;
	}
	public void setWiFi(boolean wiFi) {
		WiFi = wiFi;
	}
	public int getRatingOutOfTen() {
		return ratingOutOfTen;
	}
	public void setRatingOutOfTen(int ratingOutOfTen) {
		this.ratingOutOfTen = ratingOutOfTen;
	}
	public double getRentPerDay() {
		return rentPerDay;
	}
	public void setRentPerDay(double rentPerDay) {
		this.rentPerDay = rentPerDay;
	}
	@Override
	public String toString() {
		return "HotelDetails [id=" + id + ", hotelName=" + hotelName + ", city=" + city + ", roomsAvilable="
				+ roomsAvilable + ", WiFi=" + WiFi + ", ratingOutOfTen=" + ratingOutOfTen + ", rentPerDay=" + rentPerDay
				+ "]";
	}
	
}
