package egor.online.dto;

public interface MessageDto {
    int getId();

    void setId(int id);

    int getChatId();

    void setChatId(int chatId);

    String getSenderLogin();

    void setSenderLogin(String senderLogin);

    String getMessageText();

    void setMessageText(String messageText);

    String getSendTime();

    void setSendTime(String sendTime);
}
