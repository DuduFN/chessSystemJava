package org.example.application;

import org.example.chess.Match;

public class Program {
    public static void main(String[] args) {

        Match match = new Match();
        UI.printBoard(match.getPieces());
    }
}