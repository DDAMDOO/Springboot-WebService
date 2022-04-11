package springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springboot.web.dto.MainResponseDto;

@RestController
public class MainController {

    @GetMapping("/main")
    public String main() {
        return "main";
    }

    @GetMapping("main/dto")
    public MainResponseDto mainDto(@RequestParam("name") String name, @RequestParam("amount") int amount) {
        return new MainResponseDto(name, amount);
    }
}
