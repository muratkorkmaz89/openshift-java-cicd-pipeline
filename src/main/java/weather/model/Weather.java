package weather.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Weather implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	private String key;
	
	private String shortDescription;
	private String description;

	public Weather() {
	}

	public Weather(String shortDescription, String description) {
		this.shortDescription = shortDescription;
		this.description = description;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public String getDescription() {
		return description;
	}

}
