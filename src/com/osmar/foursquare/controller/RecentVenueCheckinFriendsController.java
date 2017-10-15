package com.osmar.foursquare.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.osmar.foursquare.service.RecentCheckinFriendsService;

import fi.foyt.foursquare.api.entities.Checkin;

@Controller
public class RecentVenueCheckinFriendsController {
	
//	@Autowired
//	RecentCheckinFriendsService recentCheckinFriendsService;
	
	@RequestMapping(value="/recentVenueList", method= RequestMethod.GET)
	public ModelAndView recentVenueCheckinFriends(HttpServletRequest request, HttpServletResponse response){
		
		ModelAndView mav = null ;
		List<Checkin> listCheckin = null;
		
		// After user has logged in and confirmed that our program may access
		// user's Foursquare account
		// Foursquare redirects user back to callback url.

			mav = new ModelAndView("recentVenue");
//			mav.addObject("lists", recentCheckinFriendsService.getListRecentCheckinFriends(null));
			
			return mav;
			
//			response.sendRedirect(foursquareApi.checkinsRecent("23.32,46.38", 40, 21600l));
//			List<String> list = getList();

	}
	
	// teste
	private List<String> getList() {
		List<String> list = new ArrayList<String>();
		list.add("List A");
		list.add("List B");
		list.add("List C");
		list.add("List D");
		list.add("List 1");
		list.add("List 2");
		list.add("List 3");

		return list;
	}
	
}