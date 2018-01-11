package log;


import org.apache.log4j.xml.DOMConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

/**
 * Created by wdq on 2018/1/8.
 */
public class LogSend {
    private static Logger logger = LoggerFactory.getLogger(LogSend.class);
    public static void main(String[] args){
        String path = new File("resources").getAbsolutePath() + File.separator;
        DOMConfigurator.configure("log/src/main/resources/" + "log4j.xml");
        logger.info("dddd");
    }
}
