package com.ogasawara.ogavulnweb.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ogasawara.ogavulnweb.domain.VulnersSearchResult;
import com.ogasawara.ogavulnweb.service.VulnersService;

/**
 * Vulners.com Controller
 * @author ogasawara_kiyoshi
 *
 */
@Controller
@RequestMapping("vulners")
public class VulnersController {

	@Autowired
	VulnersService vulnersService;
	
	@ModelAttribute
	VulnersForm setUpForm(){
		return new VulnersForm();
	}
	
	/**
	 * Vulners情報取得
	 * @param model
	 * @return
	 */
	@GetMapping
	public String list(Model model) {
		VulnersSearchResult vulns = vulnersService.search("(type:cve AND cvss.score:[6 TO 10])&order:published&last 1 day");
		model.addAttribute("result", vulns.getResult());
		return "vulners/list";
	}
	
}
