package com.company;

import java.lang.reflect.Field;

public class Game {

    private int minAge;
    private int maxAge;
    private int minPlayerCount;
    private int maxPlayerCount;
    private String name;

    public Game() {
        this.setMinAge(0);
        this.setMaxAge(99);
        this.setMinPlayerCount(1);
        this.setMaxPlayerCount(Integer.MAX_VALUE);
        this.setName("default game");

    }

    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public int getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(int maxAge) {
        this.maxAge = maxAge;
    }

    public int getMinPlayerCount() {
        return minPlayerCount;
    }

    public void setMinPlayerCount(int minPlayerCount) {
        this.minPlayerCount = minPlayerCount;
    }

    public int getMaxPlayerCount() {
        return maxPlayerCount;
    }

    public void setMaxPlayerCount(int maxPlayerCount) {
        this.maxPlayerCount = maxPlayerCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        Field[] fieldArray = this.getClass().getFields();


        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getName())
                .append(StringConstants.CLASS_NAME_SEPARATOR);

        for (Field field : fieldArray) {
            try {
                stringBuilder.append(field.getName())
                        .append(StringConstants.FIELD_NAME_SEPARATOR)
                        .append( (String) (field.get(this)))
                        .append(StringConstants.LINE_SEPARATOR);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        return stringBuilder.toString();
    }

    public String startGame() {
        return "The game is started";
    }
}
