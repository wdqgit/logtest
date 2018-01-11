package ecs.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wdq on 2018/1/10.
 */
@RestController
@RequestMapping("/log")
public class LogDemoController {
    private Logger logger = LoggerFactory.getLogger(LogDemoController.class);

    @RequestMapping("/send")
    public String send(){
        logger.info("info send");
        logger.debug("debug send");
        logger.error("error send");
        return "sucess";
    }
}
