package com.osmar.foursquare.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.osmar.foursquare.model.Login;
import com.osmar.foursquare.properties.AuthenticationFS;

import fi.foyt.foursquare.api.FoursquareApi;

@Controller
public class LoginController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home() {
		
	    ModelAndView mav = new ModelAndView("login");
	    mav.addObject("login", new Login());
		
		return mav;
	}
	
	@RequestMapping(value="/loginAuthFS", method= RequestMethod.POST)
	public void loginFoursquare(HttpServletRequest request, HttpServletResponse response){
		
	    FoursquareApi foursquareApi = new FoursquareApi(AuthenticationFS.CLIENT_ID, AuthenticationFS.CLIENT_SECRET, 
	    		AuthenticationFS.CALL_BACK_URL);
	    try {
	      // First we need to redirect our user to authentication page. 
	      response.sendRedirect(foursquareApi.getAuthenticationUrl());
	    } catch (IOException e) {
	      // TODO: Error handling
	    }
	}

}
