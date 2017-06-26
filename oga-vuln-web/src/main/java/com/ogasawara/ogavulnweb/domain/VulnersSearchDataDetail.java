package com.ogasawara.ogavulnweb.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class VulnersSearchDataDetail {

	private String _index;
	private String _type;
	private String _id;
	private Double _score;
	private VulnersDataSource _source;
	private List<Double> sort;
	private String flatDescription;

}
