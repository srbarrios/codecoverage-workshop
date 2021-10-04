package codecovarage;

import java.util.List;
import java.util.Random;

public class ChatBot {

    List<String> randomMessages;
    Random random;

    public ChatBot(List<String> randomMessages) {
        this.randomMessages = randomMessages;
        random = new Random();
    }

    String chat(String message, int age) {
        if (message.equals("Hi")) {
            return "Hello";
        } else if (message.equals("Bye")) {
            return "See you!";
        } else {
            if (age > 18) {
                return randomMessages.get(random.nextInt(randomMessages.size()));
            } else {
                return "I’m not allowed to chat with you, sorry.";
            }
        }
    }

}
