package com.ogasawara.ogavulnweb.web;

import lombok.Data;

/**
 * 脆弱性画面Forms
 * @author a14541
 *
 */
@Data
public class ValnerabilityForm {

	private String id;

	private String name;

	private String type;

	private String cveNo;

	private String description;

	private String score;

}
