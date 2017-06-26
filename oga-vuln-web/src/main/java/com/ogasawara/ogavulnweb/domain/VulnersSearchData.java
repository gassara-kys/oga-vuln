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
public class VulnersSearchData {

	private Boolean exactMatch;

	private Boolean references;

	private Integer total;

	private List<VulnersSearchDataDetail> search;
}
