package com.plash.dao;

import java.util.List;

import com.plash.model.HotelDetails;

public interface TaskDao {

	public void addHotel(HotelDetails hotel);

	public List<HotelDetails> hotelDetails();

	public void updateHotel(HotelDetails hotel);

	public void deleteHotel(HotelDetails hotel);
}
