package hw5;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        int numberOfPhilosophers = 5;
        Philosopher[] philosophers = new Philosopher[numberOfPhilosophers];
        Lock[] forks = new ReentrantLock[numberOfPhilosophers];

        for (int i = 0; i < numberOfPhilosophers; i++) {
            forks[i] = new ReentrantLock();
        }

        for (int i = 0; i < numberOfPhilosophers; i++) {
            Lock leftFork = forks[i];
            Lock rightFork = forks[(i + 1) % numberOfPhilosophers];
            philosophers[i] = new Philosopher(i, leftFork, rightFork);
            philosophers[i].start();
        }
    }
}
