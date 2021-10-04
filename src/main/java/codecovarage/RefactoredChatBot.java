package codecovarage;

import java.util.List;
import java.util.Random;

public class RefactoredChatBot {

    List<String> randomMessages;
    Random random;

    public RefactoredChatBot(List<String> randomMessages) {
        this.randomMessages = randomMessages;
        random = new Random();
    }

    String chat(String message, int age) {
        if (isGreeting(message)){
            return greetings(message);
        }
        return randomMessage(age);
    }

    private String randomMessage(int age) {
        if (age > 18) {
            return randomMessages.get(random.nextInt(randomMessages.size()));
        } else {
            return "I’m not allowed to chat with you, sorry.";
        }
    }

    private String greetings(String message) {
        if (message.contains("Hi")){
            return "Hello";
        } else {
            return "See you!";
        }
    }

    private boolean isGreeting(String message) {
        return message.contains("Hi") || message.contains("Bye");
    }
}
