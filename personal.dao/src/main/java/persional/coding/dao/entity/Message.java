package persional.coding.dao.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "message")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Message extends BaseEntity {
    @Enumerated(EnumType.STRING)
    @Column(name = "message_type")
    private MessageType messageType;

    @Column(name = "chat_id")
    private Long chatId;

    @Column(name = "sender_id")
    private Long senderId;

    @Column(name = "recipient_id")
    private Long recipientId;

    @Column(name = "content")
    private String content;

    @Column(name = "sender")
    private String sender;

    @Column(name = "receiver")
    private String receiver;

    @Column(name = "total_message")
    private Long totalMessage;

    @Enumerated(EnumType.STRING)
    @Column(name = "message_status")
    private MessageStatus messageStatus;
}
