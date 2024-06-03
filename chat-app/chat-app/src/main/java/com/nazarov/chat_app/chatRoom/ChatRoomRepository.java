package com.nazarov.chat_app.chatRoom;

import com.nazarov.chat_app.chat.ChatMessage;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface ChatRoomRepository extends MongoRepository<ChatRoom, String> {

    Optional<ChatRoom> findBySenderIdAndRecipientId(String senderId, String recipientId);


}
