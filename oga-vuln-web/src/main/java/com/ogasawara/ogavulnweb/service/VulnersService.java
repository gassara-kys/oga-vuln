package com.ogasawara.ogavulnweb.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ogasawara.ogavulnweb.domain.VulnersSearchResult;
 
@Service
public class VulnersService {

	/** API URL */
	private static final String URL = "https://vulners.com/api/v3/search/lucene/?query={query}";

	/**
	 * Vulners.com のREST_APIを実行します
	 * @param query
	 * @return
	 */
	public VulnersSearchResult search(String query) {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject(URL, VulnersSearchResult.class, query);
	}

}
