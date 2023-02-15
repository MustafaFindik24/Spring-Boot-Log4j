package com.java.logging.Log4j.Controller;

import org.apache.juli.logging.Log;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    private static final Logger logger = Logger.getLogger(IndexController.class);

    @GetMapping("/")
    public String index(){
        logger.debug("loading index page...");
        logger.fatal("fatal log message");
        logger.error("error log message");
        logger.warn("warn log message");
        logger.debug("debug log message");
        logger.trace("trace log message");
        logger.info("info log message");
        return "index";
    }
}
