package com.example.thymeleafjade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {
    static Logger logger = LoggerFactory.getLogger(Controller.class);
    @RequestMapping(value="/index")
    public String index() {
        logger.info("test slf4j log4j");
        return "index";
    }
}
