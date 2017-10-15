package com.osmar.foursquare.rest;

import java.util.List;

import org.springframework.stereotype.Component;

import com.osmar.foursquare.model.User;
import com.osmar.foursquare.properties.AuthenticationFS;

import fi.foyt.foursquare.api.FoursquareApi;
import fi.foyt.foursquare.api.FoursquareApiException;
import fi.foyt.foursquare.api.entities.Checkin;

public class RecentVenueCheckinFriendsRest {

	public List<Checkin> getListRecentVenueFriends(User user) {

		List<Checkin> listCheckin = null;
		FoursquareApi foursquareApi = new FoursquareApi(
				AuthenticationFS.CLIENT_ID, AuthenticationFS.CLIENT_SECRET,
				AuthenticationFS.CALL_BACK_URL);

		try {
			Checkin[] checkinList = foursquareApi.checkinsRecent("23.32,46.38",40, 2888000l).getResult();

			if (null != checkinList) {
				System.out.println("Total: " + checkinList.length);

				for (int i = 0; i < checkinList.length; i++) {
					listCheckin.add((Checkin) checkinList[i]);
				}
				return listCheckin;
			}
		} catch (FoursquareApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}
}
