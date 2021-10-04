package codecovarage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ChatBotThirdTest {

    RefactoredChatBot bot;
    List<String> botMessages = List.of("alpha", "bravo", "charlie", "delta", "echo");

    @BeforeEach
    void setUp() {
        bot = new RefactoredChatBot(botMessages);
    }

    @Test
    @Tag("younger")
    void testHiYoungerThanEighteen() {
        String answer = bot.chat("Hi", 17);
        System.out.println(answer);
        assertEquals("Hello", answer);
    }

    @Test
    void testHiOlderThanEighteen() {
        String answer = bot.chat("Hi", 19);
        System.out.println(answer);
        assertEquals("Hello", answer);
    }

    @Test
    @Tag("younger")
    void testByeYoungerThanEighteen() {
        String answer = bot.chat("Bye", 17);
        System.out.println(answer);
        assertEquals("See you!", answer);
    }

    @Test
    void testByeOlderThanEighteen() {
        String answer = bot.chat("Bye", 19);
        System.out.println(answer);
        assertEquals("See you!", answer);
    }

    @Test
    @Tag("younger")
    void testAnotherMessageYoungerThanEighteen() {
        String answer = bot.chat("Good morning", 17);
        System.out.println(answer);
        assertEquals("I’m not allowed to chat with you, sorry.", answer);
    }

    @Test
    void testAnotherMessageOlderThanEighteen() {
        String answer = bot.chat("Good morning", 19);
        System.out.println(answer);
        assertTrue(botMessages.contains(answer));
    }
}