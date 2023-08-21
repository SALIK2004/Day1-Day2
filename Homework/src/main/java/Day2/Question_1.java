package Day2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Question_1 {
	@Value("Welcome to Spring Tool Suite")
	public String name;
	@GetMapping("/ex")
public String diplay() {
	return "HEY!... "+name+" :)";
}
}
