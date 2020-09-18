package pl.com.home.config;

import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Currency {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	private String type;
	private String name;
	private float  factor;
}
