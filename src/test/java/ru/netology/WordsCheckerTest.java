package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordsCheckerTest {
    @Test
    void wordCheckedTrue() {
        WordsChecker wordsChecker = new WordsChecker("text tree three");
        assertTrue(wordsChecker.hasWord("text"));
    }

    @Test
    void wordCheckedFalse() {
        WordsChecker wordsChecker = new WordsChecker("text tree three");
        assertFalse(wordsChecker.hasWord("eee"));
    }

    @Test
    void wordAdded() {
        WordsChecker wordsChecker = new WordsChecker("text");
        assertEquals("text current", wordsChecker.addText(" current"));
    }
}
