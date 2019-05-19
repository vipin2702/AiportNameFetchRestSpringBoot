package com.etc.BootWeb;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.stereotype.Service;

@Service
public class AirportFetchService {

	public String airportname(String latitude2, String longitude2) throws IOException {
		File file = new File(
				"F:\\spring-tool-suite-3.9.7.RELEASE-e4.10.0-win32-x86_64\\sts-bundle\\sts-3.9.7.RELEASE\\spring\\SpringBootMVC-2\\jb.csv");

		BufferedReader br = new BufferedReader(new FileReader(file));

		String line;

		while ((line = br.readLine()) != null) {

			String lat = line.split(",")[5];
			String longi = line.split(",")[6];

			if (longitude2.equalsIgnoreCase(longi) && latitude2.equalsIgnoreCase(lat)) {
				return ("Airport name is: " + line.split(",")[1]);

			}

		}
		return "No airports found with such information provided";
	}

}
