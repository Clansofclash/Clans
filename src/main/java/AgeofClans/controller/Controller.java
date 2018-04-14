package AgeofClans.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import AgeofClans.dao.MainDAO;

@RestController
@EnableAutoConfiguration
public class Controller {

    //@Autowired
    MainDAO mainDAO;

    @RequestMapping("/abc")
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/db")
    String test()
    {
        return "from controller";
    }
}
