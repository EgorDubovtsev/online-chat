package egor.online.entity;

public interface User {
    public String getName();

    public void setName(String name);

    public String getLogin();

    public void setLogin(String login);

    public String getPassword();

    public void setPassword(String password);

    public Role getRole();

    public void setRole(Role role);

    public Status getStatus();

    public void setStatus(Status status);

    public int getAge();

    public void setAge(int age);
}
