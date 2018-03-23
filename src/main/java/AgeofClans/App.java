package AgeofClans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@RestController
@EnableAutoConfiguration
public class App 
{
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/abc")
    String homertr() {
        return "Hello World!hhhhhhhhhhh";
    }

    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
        //System.out.println( "Hello World!" );
    }
}
