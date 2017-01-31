package br.teste.date;

import java.time.Clock;
import java.time.Instant;
import java.util.Date;

//Clock provides access to the current date and time. Clocks are aware of a timezone and may be
//used instead of System.currentTimeMillis() to retrieve the current milliseconds. 
//Such an instantaneous point on the time-line is also represented by the class Instant. 
//Instants can be used to create legacy java.util.Date objects.

public class PrincipalClock {

	public static void main(String[] args) {
		Clock clock = Clock.systemDefaultZone();
		long millis = clock.millis();

		Instant instant = clock.instant();
		Date legacyDate = Date.from(instant); // legacy java.util.Date
	}
}
