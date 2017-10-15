package com.osmar.foursquare.dao;

import java.util.List;

import com.osmar.foursquare.model.User;

import fi.foyt.foursquare.api.entities.Checkin;

public interface CheckinDao {
	
	List<Checkin> getListCheckinFriends();
	List<Checkin> getListCheckinUser(User user);
	
	void registerCheckin(Checkin checkin);
	boolean deleteCheckin(Checkin checkin);

}