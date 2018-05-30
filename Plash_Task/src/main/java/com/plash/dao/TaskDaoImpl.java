package com.plash.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.plash.model.HotelDetails;

@Repository
public class TaskDaoImpl implements TaskDao {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void addHotel(HotelDetails hotel) {
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(hotel);
		transaction.commit();
	}

	
	public List<HotelDetails> hotelDetails( ) {
	
			Session session = sessionFactory.openSession();
			
			Query query=session.createQuery("from HotelDetails");
			List<HotelDetails> list =query.list();
			session.close();
			return list;
							 
		
	}


	public void updateHotel(HotelDetails hotel) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.update(hotel);
		transaction.commit();
	}


	public void deleteHotel(HotelDetails hotel) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.delete(hotel);
		transaction.commit();
		
	}
	

}
