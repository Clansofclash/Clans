package AgeofClans.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import AgeofClans.dao.MainDAO;

import java.net.URISyntaxException;
import java.sql.SQLException;

@RestController
@EnableAutoConfiguration
public class Controller {


    @RequestMapping("/abc")
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/db")
    String test()
    {
        MainDAO mainDAO = new MainDAO();
        return mainDAO.test();
    }

    @RequestMapping("/db/drop/table/{tableName}")
    String dropTable(@PathVariable String tableName) throws URISyntaxException, SQLException {
        MainDAO mainDAO = new MainDAO();
        return mainDAO.dropTable(tableName);
    }
}
