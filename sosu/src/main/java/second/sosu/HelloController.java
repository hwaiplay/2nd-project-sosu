package second.sosu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
	
	@GetMapping("/")
	public String hello(Model model) {
		
		logger.info("Welcome home!");
		
		model.addAttribute("data", "안녕하세요");
						
		return "hello";
	}
}
