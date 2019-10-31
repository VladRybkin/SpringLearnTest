package ua.training.cronJobs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import ua.training.service.impl.UserService;

@Component
public class PrintTask {

    @Autowired
    UserService userService;

    public PrintTask() {
    }

    @Scheduled(fixedDelay=20000)
    void timesout(){
        System.out.println("schedule sout");
    }
}
