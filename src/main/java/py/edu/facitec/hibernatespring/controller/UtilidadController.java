package py.edu.facitec.hibernatespring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UtilidadController {
	@RequestMapping("/comollegar")
	public String comollegar(){{
		
		
		System.out.println("llegamos");
		
		return "comollegar";
	}
}
}