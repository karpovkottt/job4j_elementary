package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class DummyBotTest {

    @Test
    void whenGreetBot() {
        String in = "Hi, Bot.";
        String expected = "Hi, SmartAss.";
        String result = DummyBot.answer(in);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenByeBot() {
        String in = "Bye.";
        String expected = "See you later.";
        String result = DummyBot.answer(in);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenUnknownBot() {
        String in = "Can you add two plus two?";
        String expected = "I don't know. Please, ask another question.";
        String result = DummyBot.answer(in);
        assertThat(result).isEqualTo(expected);
    }
}