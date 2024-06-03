package com.nazarov.chat_app.chat;


public class IternalChatException extends Exception {
    public IternalChatException() {super(); }

    public IternalChatException(String message) {
        super("Chat room ID not found!");
    }
}
