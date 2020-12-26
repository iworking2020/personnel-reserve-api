package ru.iworking.personnel.reserve;

public interface MessageProvider {
    void sendMessage(String text);
    void sendMessageWithAction(String text, MessageAction messageAction);
}
