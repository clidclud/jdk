package hw2Сontinuation;

import hw2Сontinuation.client.ClientController;
import hw2Сontinuation.client.ClientGUI;
import hw2Сontinuation.server.FileStorage;
import hw2Сontinuation.server.ServerController;
import hw2Сontinuation.server.ServerWindow;

public class Main {
    public static void main(String[] args) {
        ServerController serverController = new ServerController(new ServerWindow(), new FileStorage());

        new ClientController(new ClientGUI(), serverController);
        new ClientController(new ClientGUI(), serverController);
    }
}
