package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class CountryDao {

	private static List<CountryDetails> list = new ArrayList<CountryDetails>();

	static {
		list.add(new CountryDetails(1, "India"));
		list.add(new CountryDetails(2, "Nepal"));
		list.add(new CountryDetails(3, "China"));
		list.add(new CountryDetails(4, "USA"));
		list.add(new CountryDetails(5, "Russia"));

	}

	public List<CountryDetails> country() {
		return list;
	}

	public CountryDetails countryById(int id) {
		for (CountryDetails c : list) {
			if (c.getCid() == id) {
				return c;
			}
		}
		return null;
	}

}
