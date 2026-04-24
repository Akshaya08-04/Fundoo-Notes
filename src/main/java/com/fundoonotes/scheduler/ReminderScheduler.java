package com.fundoonotes.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ReminderScheduler {

    @Scheduled(fixedRate = 60000)
    public void checkReminders() {
        System.out.println("Checking reminders every 60 seconds...");
    }
}
