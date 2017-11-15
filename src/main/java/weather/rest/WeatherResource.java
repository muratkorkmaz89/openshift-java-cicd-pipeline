package weather.rest;

import javax.validation.constraints.NotNull;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import weather.model.Weather;

@Path("/weather")
public class WeatherResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/today/{city}")
	public Weather getWeatherFor(@PathParam("city") @NotNull String city) {
		System.out.println("Weather requested for: " + city);
		return new Weather(String.format("Heute ist es in %s Leicht bewölkt", city), "Heute überwiegend sonnig mit leichter Bewölkung in den Abendstunden");
	}

}
