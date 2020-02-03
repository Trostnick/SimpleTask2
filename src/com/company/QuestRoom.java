package com.company;

public class QuestRoom extends Game {

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        QuestRoom otherQuestRoom;
        try {
            otherQuestRoom = (QuestRoom) object;
        } catch (ClassCastException ex) {
            return false;
        }

        if (!(this.getName().equals(otherQuestRoom.getName()))) {
            return false;
        }
        return true;

    }

    @Override
    public int hashCode() {

        int hashCode = 0;

        String thisQuestRoomName = this.getName();
        char currentLetter;

        for (int i = 0; i < thisQuestRoomName.length(); i++) {
            currentLetter = thisQuestRoomName.charAt(i);
            if (hashCode > 0 && (Integer.MAX_VALUE - hashCode) <= currentLetter) {
                hashCode = -hashCode;
            }
            hashCode += currentLetter;
        }

        return hashCode;
    }

    private String getQuestRoomString(){
        return "Money up front!!!!!";
    }

    @Override
    public String startGame(){
        return getQuestRoomString();
    }

    @Override
    public String toString() {
        return StringConstants.QUEST_ROOM_STRING;
    }
}
