package controller;

import model.person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping("/person")
public class personController {
	
	@RequestMapping("/createPerson")
	public ModelAndView createPerson() {
		
		return new ModelAndView("personview");
		
	}
}
