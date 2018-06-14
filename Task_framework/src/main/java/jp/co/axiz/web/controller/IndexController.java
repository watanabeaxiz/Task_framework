package jp.co.axiz.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.axiz.web.entity.AdminForm;
@Controller
public class IndexController {



	@RequestMapping(value="/index",method = RequestMethod.GET)
	public String start(@ModelAttribute("command") AdminForm fm, BindingResult bindingResult, Model model) {
		return "index";
	}


	@RequestMapping(value="/menu",method = RequestMethod.GET)
	public String returnMenu(@ModelAttribute("command") AdminForm fm, BindingResult bindingResult, Model model) {
		return "menu";
	}
}
