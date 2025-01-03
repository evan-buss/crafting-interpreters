package com.evanbuss;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ScannerTest {

    @Test
    @DisplayName("Can parse something")
    public void canParseSomething() {
        String source = "({})";
        Scanner scanner = new Scanner(source);
        List<Token> tokens = scanner.scanTokens();

        assertAll("Parses correct tokens",
                () -> assertEquals(TokenType.LEFT_PAREN, tokens.get(0).type),
                () -> assertEquals(TokenType.LEFT_BRACE, tokens.get(1).type),
                () -> assertEquals(TokenType.RIGHT_BRACE, tokens.get(2).type),
                () -> assertEquals(TokenType.RIGHT_PAREN, tokens.get(3).type)
        );
    }

}