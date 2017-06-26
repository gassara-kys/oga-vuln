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
public class VulnersDataSource {

	private String lastseen;
	private List<String> references;
	private String description;
	private Integer edition;
	private String reporter;
	private String published;
	private String title;
	private String type;
	private String objectVersion;
	private String bulletinFamily;
	private List<String> cvelist;
	private List<String> scanner;
	private String modified;
	private List<String> cpe;
	private String id;
	private String href;
	private VulunersCvss cvss;
	private String hash;
	private String vhref;
}
