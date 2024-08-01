package sem.Multithreading5.Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class Main {
    private static final int COUNT_RUNNERS = 3;

    public static void main(String[] args) {
        CountDownLatch readySignal = new CountDownLatch(COUNT_RUNNERS);
        CountDownLatch startSignal = new CountDownLatch(1);
        CountDownLatch finishSigna = new CountDownLatch(COUNT_RUNNERS);

        List<Runner> runners = new ArrayList<>(Arrays.asList(
                new Runner("Вася", readySignal, startSignal, finishSigna),
                new Runner("Петя", readySignal, startSignal, finishSigna),
                new Runner("Ваня", readySignal, startSignal, finishSigna)
        ));
        new Thread(new Race(readySignal, startSignal, finishSigna)).start();
        for (Runner runner : runners) {
            new Thread(runner).start();
        }
    }
}
