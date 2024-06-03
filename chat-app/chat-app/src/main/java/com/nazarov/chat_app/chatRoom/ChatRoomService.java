package com.nazarov.chat_app.chatRoom;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ChatRoomService {

    private final ChatRoomRepository chatRoomRepository;

    public Optional<String> getChatRoomId(String senderId, String recipientId, boolean isRoomActivated){
        return chatRoomRepository.findBySenderIdAndRecipientId(senderId, recipientId).map(ChatRoom::getChatId).or(() -> {
            if (isRoomActivated){
                var chatId = createChatId(senderId, recipientId);
                return Optional.of(chatId);
            }
            return Optional.empty();
        });
    }

    //method for creating chat with same Id
    private String createChatId(String senderId, String recipientId) {
        var chatId = String.format("%s_%s", senderId, recipientId);
        ChatRoom senderRecipient = ChatRoom.builder().chatId(chatId).recipientId(recipientId).senderId(senderId).build(); //назначаем отправителя и получателя

        ChatRoom recipientSender = ChatRoom.builder().chatId(chatId).recipientId(senderId).senderId(recipientId).build(); //меняем местами отправителя и получателя

        //в итоге у нас получается 2 разные комнаты
        chatRoomRepository.save(senderRecipient);
        chatRoomRepository.save(recipientSender);
        return chatId;
    }

}
