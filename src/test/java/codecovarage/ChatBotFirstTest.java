package codecovarage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ChatBotFirstTest {

    FirstChatBot bot;

    @BeforeEach
    void setUp() {
        bot = new FirstChatBot(List.of("alpha", "bravo", "charlie", "delta", "echo"));
    }

    @Test
    void testHi() {
        String answer = bot.chat("Hi");
        assertEquals("Hello", answer);
    }

    @Test
    void testBye() {
        String answer = bot.chat("Bye");
        assertEquals("See you!", answer);
    }

    @Test
    void testAnotherMessage() {
        String answer = bot.chat("Good morning");
        assertNotNull(answer);
    }
}