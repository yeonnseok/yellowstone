package yeonseok.yellowstone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class YellowstoneApplication {

	@GetMapping("/")
	public String home() {
		return "Welcome YellowStone!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(YellowstoneApplication.class, args);
	}

}
