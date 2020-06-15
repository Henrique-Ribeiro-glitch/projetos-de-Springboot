package junior.henrique.exemploHelloWorldRepositors.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Henrique Júnior
 * @version 1.0
 * @since 14/06/2020 15:00
 * @category Controller
 */
@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String index() {
        return "Hello World";
    }

}
