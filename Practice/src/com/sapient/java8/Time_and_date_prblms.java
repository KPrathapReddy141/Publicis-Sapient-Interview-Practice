package com.sapient.java8;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Time_and_date_prblms {

	public static void main(String[] args) {
		LocalDateTime from=LocalDateTime.now();
		DateTimeFormatter date=DateTimeFormatter.ofPattern("d-M-y");
		System.out.println(from.format(date));
		LocalDateTime to=LocalDateTime.now();
		Duration d=Duration.between(from, to);
		System.out.println(d.getSeconds());
		LocalDate olddate=LocalDate.of(2016, Month.AUGUST, 22);
		
		LocalDate nd=LocalDate.now();
		Period period=Period.between(olddate, nd);
		System.out.print(period.getYears()+"Years ");
		System.out.println(period.getMonths()+"Months "+period.getDays()+"Days");
		System.out.println(ChronoUnit.MONTHS.between(olddate, nd));
	}
}
