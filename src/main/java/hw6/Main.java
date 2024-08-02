package hw6;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Map<String, Integer> gameResults = new HashMap<>();
        gameResults.put("Автомобили", 0);
        gameResults.put("Козы", 0);

        for (int i = 0; i < 1000; i++) {
            String[] doors = {"Коза", "Коза", "Коза"};
            int carPosition = random.nextInt(3);
            doors[carPosition] = "Автомобиль";

            int playerChoice = random.nextInt(3);

            int hostOpen = -1;
            for (int j = 0; j < 3; j++) {
                if (j != playerChoice && doors[j].equals("Коза")) {
                    hostOpen = j;
                    break;
                }
            }

            for (int j = 0; j < 3; j++) {
                if (j != playerChoice && j != hostOpen) {
                    playerChoice = j;
                    break;
                }
            }

            if (doors[playerChoice].equals("Автомобиль")) {
                gameResults.put("Автомобили", gameResults.get("Автомобили") + 1);
            } else {
                gameResults.put("Козы", gameResults.get("Козы") + 1);
            }
        }

        System.out.println("Итоговый счет после 1000 игр:");
        System.out.println("Автомобили: " + gameResults.get("Автомобили"));
        System.out.println("Козы: " + gameResults.get("Козы"));

        scanner.close();
    }
}
