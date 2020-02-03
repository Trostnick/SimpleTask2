package com.company;

public class Main {

    public static void main(String[] args) {

        Game game = new Game();
        BoardGame boardGame = new BoardGame();
        StreetGame streetGame = new StreetGame();
        QuestRoom questRoom = new QuestRoom();
        Game gameAndBoardGame = new BoardGame();
        Game gameAndStreetGame = new StreetGame();
        Game gameAndQuestRoom = new QuestRoom();
        QuestRoom equalsQuestRoom = new QuestRoom();
        QuestRoom notEqualsQuestRoom = new QuestRoom();

        questRoom.setName("True QuestRoom");
        equalsQuestRoom.setName("True QuestRoom");
        notEqualsQuestRoom.setName("Fake QuestRoom");

        System.out.println("questRoom equals equalsQuestRoom : " + questRoom.equals(equalsQuestRoom));
        System.out.println("questRoom equals notEqualsQuestRoom : " + questRoom.equals(notEqualsQuestRoom));

        System.out.println("questRoom hashCode = " + questRoom.hashCode());
        System.out.println("equalsQuestRoom hashCode = " + equalsQuestRoom.hashCode());
        System.out.println("notEqualsQuestRoom hashCode = " + notEqualsQuestRoom.hashCode());

        System.out.println("game.toString() = " + game.toString());
        System.out.println("boardGame.toString() = " + boardGame.toString());
        System.out.println("streetGame.toString() = " + streetGame.toString());
        System.out.println("questRoom.toString() = " + questRoom.toString());
        System.out.println("gameAndBoardGame.toString() = " + gameAndBoardGame.toString());
        System.out.println("gameAndStreetGame.toString() = " + gameAndStreetGame.toString());
        System.out.println("gameAndQuestRoom.toString() = " + gameAndQuestRoom.toString());

        System.out.println("game.startGame() = " + game.startGame());
        System.out.println("boardGame.startGame() = " + boardGame.startGame());
        System.out.println("streetGame.startGame() = " + streetGame.startGame());
        System.out.println("questRoom.startGame() = " + questRoom.startGame());
        System.out.println("gameAndBoardGame.startGame() = " + gameAndBoardGame.startGame());
        System.out.println("gameAndStreetGame.startGame() = " + gameAndStreetGame.startGame());
        System.out.println("gameAndQuestRoom.startGame() = " + gameAndQuestRoom.startGame());



    }
}
