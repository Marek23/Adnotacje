package pl.com.home.config;

import lombok.Data;

@Data
public class Currency {
	private String type;
	private String name;
	private float  factor;
}
