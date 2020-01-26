package com.example.demo;

import java.util.List;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoutryResource {

	@Context
	UriInfo uriInfo;

	@Autowired
	private CountryDao countryDao;

	@GetMapping(path = "/getCountry")
	public List<CountryDetails> country() {
		return countryDao.country();
	}

	@GetMapping(path = "/getCountry/{id}")
	public CountryDetails countryById(@PathVariable int id) {
		CountryDetails obj = countryDao.countryById(id);
		String uri = uriInfo.getBaseUriBuilder().path(CoutryResource.class).path(Long.toString(obj.getCid())).build()
				.toString();
		obj.addLink(uri, "self");
		return obj;
	}
}
