package com.etc.BootWeb;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@Autowired
	private AirportFetchService afs;

	@RequestMapping("/")
	public String clientInput() {
		return "home.jsp";
	}

	@RequestMapping("/getAirport")
	public String fetchAirport() {

		return "response.jsp";
	}
	
	@ResponseBody
	@RequestMapping("/getAirportName")
	public String fetchAirportName(@RequestParam("latitude") String latitude, @RequestParam("longitude") String longitude) throws IOException {

		return afs.airportname(latitude,longitude);
		
	}
	
}
