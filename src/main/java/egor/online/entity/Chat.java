package egor.online.entity;

public class Chat {
    private String userLogin;
    private String interlocutorLogin;
    private int chatId;

    public String getUserLogin() {//TODO: add service to check what chat does not exist and create it and set id or set id from exist
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
