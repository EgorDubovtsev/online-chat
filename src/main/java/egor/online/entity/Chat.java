package egor.online.entity;

public class Chat {
    private String userLogin;
    private String interlocutorLogin;
    private int chatId;

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getInterlocutorLogin() {
        return interlocutorLogin;
    }

    public void setInterlocutorLogin(String interlocutorLogin) {
        this.interlocutorLogin = interlocutorLogin;
    }

    public int getChatId() {
        return chatId;
    }

    public void setChatId(int chatId) {
        this.chatId = chatId;
    }
}
