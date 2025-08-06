package org.example;

public enum Color {
    WHITE, BLUE, RED, GREEN, BLACK, YELLOW;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
