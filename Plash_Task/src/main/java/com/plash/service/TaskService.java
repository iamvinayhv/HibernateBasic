package com.plash.service;

import java.util.List;

import com.plash.model.HotelDetails;

public interface TaskService {

	public void addHotel(HotelDetails hotel);

	public List<HotelDetails> hotelDetails();

	public void updateHotel(HotelDetails hotel);

	public void deleteHotel(HotelDetails hotel);
}
