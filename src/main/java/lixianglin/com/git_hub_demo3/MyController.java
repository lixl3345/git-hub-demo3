package lixianglin.com.git_hub_demo3;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller  
public class MyController {

	@RequestMapping("hello")
	@ResponseBody
	public String say() {
		return "hello world !";
	}
	 
}
