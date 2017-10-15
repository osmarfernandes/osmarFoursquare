package com.osmar.foursquare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.osmar.foursquare.model.User;
import com.osmar.foursquare.rest.RecentVenueCheckinFriendsRest;

import fi.foyt.foursquare.api.entities.Checkin;

public class RecentCheckinFriendsService {
	
//	@Autowired
//	RecentVenueCheckinFriendsRest recentVenueCheckinFriendsRest;
	
	public List<Checkin> getListRecentCheckinFriends(User user){
//		return recentVenueCheckinFriendsRest.getListRecentVenueFriends(user);
		return null;
	}

}
