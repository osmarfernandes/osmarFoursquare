package com.osmar.foursquare.model;

import java.util.List;

import fi.foyt.foursquare.api.entities.CompactUser;

public class User extends CompactUser {

	private static final long serialVersionUID = 8732433094009820577L;

	private List<Checkin> listCheckinUser = null;

	public List<Checkin> getListCheckinUser() {
		return listCheckinUser;
	}

	public void setListCheckinUser(List<Checkin> listCheckinUser) {
		this.listCheckinUser = listCheckinUser;
	}

}