package pl.com.home.config;

import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement
@NoArgsConstructor
@AllArgsConstructor
public class Currency {
	private String type;
	private String name;
	private float  factor;
}
