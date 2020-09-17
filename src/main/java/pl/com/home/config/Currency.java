package pl.com.home.config;

import lombok.Data;

import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement
@NoArgsConstructor
public class Currency {
	private String type;
	private String name;
	private float  factor;
}
