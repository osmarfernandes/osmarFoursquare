package com.osmar.foursquare.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.osmar.foursquare.model.User;

import fi.foyt.foursquare.api.entities.Checkin;

public class CheckinDaoImpl implements CheckinDao {

	@Override
	public void registerCheckin(Checkin checkin) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean deleteCheckin(Checkin checkin) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Checkin> getListCheckinFriends() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Checkin> getListCheckinUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}