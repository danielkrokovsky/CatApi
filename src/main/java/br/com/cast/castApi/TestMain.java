package br.com.cast.castApi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class TestMain {
	
	
	public static void main(String args[]) {
		
		String startDate = "2016 01 02";
		String passedDate = "2019 01 22";

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
		LocalDate date1 = LocalDate.parse(startDate, formatter);
		LocalDate date2 = LocalDate.parse(passedDate, formatter);
		
		
		System.out.println(ChronoUnit.YEARS.between(date1, date2));

	}

}
