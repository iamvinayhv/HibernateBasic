package com.plash.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.plash.model.HotelDetails;
import com.plash.service.TaskService;

@RestController
public class TaskController {
	
	@Autowired
	private TaskService taskService;

	@RequestMapping(value="addHotel",method=RequestMethod.POST)
	public @ResponseBody ResponseEntity<String> test(@RequestBody HotelDetails hotel){
		
		try{
			taskService.addHotel(hotel);
			return new ResponseEntity<String>("Data Added Successfully",HttpStatus.OK);
			
		}catch (Exception e) {
			return new ResponseEntity<String>("Not Added", HttpStatus.NOT_ACCEPTABLE);
		}
		
	}

	
	@RequestMapping(value="getDetails",method=RequestMethod.POST)
	public ResponseEntity<List<HotelDetails>> hotelDetails(){
		
		try{
			List<HotelDetails> hotels = taskService.hotelDetails();
			System.out.println(hotels);
			return new  ResponseEntity<List<HotelDetails>>(hotels,HttpStatus.OK);
		}catch (Exception e) {
			return new  ResponseEntity("Please check",HttpStatus.BAD_REQUEST);
		}
		
	}
	
	@RequestMapping(value="update",method=RequestMethod.POST)
	public ResponseEntity<String> updateHotel(@RequestBody HotelDetails hotel){
		try{
			taskService.updateHotel(hotel);
			return new ResponseEntity<String>("Updated successfully", HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<String>("Not Updated",HttpStatus.BAD_GATEWAY);
		}
		
	}
	
	@RequestMapping(value="delete",method=RequestMethod.POST)
	public ResponseEntity<String> deleteHotel(@RequestBody HotelDetails hotel){
		try{
			taskService.deleteHotel(hotel);
			return new ResponseEntity<String>("deleted successfully", HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<String>("Not deleted",HttpStatus.BAD_GATEWAY);
		}
		
	}
	
}
