package ua.training.cronJobs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import ua.training.service.impl.UserService;

@Component
public class PrintTask {

    private static Logger Logger = LoggerFactory.getLogger(PrintTask.class);


    @Autowired
    UserService userService;

    public PrintTask() {
    }

    @Scheduled(fixedDelay=20000)
    void timesout(){

        Logger.info("logger prinmt");
        System.out.println("schedule sout");
    }
}
