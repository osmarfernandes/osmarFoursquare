package com.osmar.foursquare.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.osmar.foursquare.properties.AuthenticationFS;

import fi.foyt.foursquare.api.FoursquareApi;
import fi.foyt.foursquare.api.FoursquareApiException;


@Controller
public class CallBackController {
	
	@RequestMapping(value="/callBack", method= RequestMethod.GET)
	public ModelAndView callBackFoursquare(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		ModelAndView mav = null ;
		
		// After user has logged in and confirmed that our program may access
		// user's Foursquare account
		// Foursquare redirects user back to callback url.
		FoursquareApi foursquareApi = new FoursquareApi(AuthenticationFS.CLIENT_ID, AuthenticationFS.CLIENT_SECRET, 
				AuthenticationFS.CALL_BACK_URL);
		
		// Callback url contains authorization code
		String code = request.getParameter("code");
		
		try {
			// finally we need to authenticate that authorization code
			foursquareApi.authenticateCode(code);
			// ... and voilà we have a authenticated Foursquare client
			
			response.sendRedirect("recentVenueList");
			
		} catch (FoursquareApiException e) {
			 mav = new ModelAndView("login");
		}
	
		return mav;
	}
}