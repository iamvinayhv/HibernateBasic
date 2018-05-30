package com.plash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.plash.dao.TaskDao;
import com.plash.model.HotelDetails;

@Service
public class TaskServiceImpl implements TaskService {

	@Autowired
	private TaskDao taskDao;
	
	@Transactional
	public void addHotel(HotelDetails hotel) {
		System.out.println("ok");
		taskDao.addHotel(hotel);
		
	}

	@Transactional
	public List<HotelDetails> hotelDetails() {
		return taskDao.hotelDetails();
	}

	@Transactional
	public void updateHotel(HotelDetails hotel) {
		taskDao.updateHotel(hotel);
		
	}

	@Transactional
	public void deleteHotel(HotelDetails hotel) {
		taskDao.deleteHotel(hotel);
		
	}

}
