
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StockController {
	
	@RequestMapping(value= "/stock",method = RequestMethod.GET)
	public String getMainStock(ModelMap pModel){
		model.addAttribute("message", "Hello Spring MVC Framework!");
		return "Stock Controller";
	}

}
