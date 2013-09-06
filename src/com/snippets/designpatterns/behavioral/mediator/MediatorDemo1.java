package com.snippets.designpatterns.behavioral.mediator;

import java.util.Timer;
import java.util.TimerTask;

public class MediatorDemo1 {

    private Timer timer;

    public MediatorDemo1(int delayInSeconds) {

        // mediates some logic between these two objects.
        FirstTask firstTask = new FirstTask();
        FinalTask finalTask = new FinalTask();

        Timer timer = new Timer();
        timer.schedule(firstTask, delayInSeconds*1000);
        timer.schedule(finalTask, delayInSeconds*1000 + 2000);
    }

    class FirstTask extends TimerTask {

        @Override
        public void run() {
            System.out.println("First task called.");
        }
    }

    class FinalTask extends TimerTask {

        @Override
        public void run() {
            System.out.println("Final task called.");
        }
    }
}
