package net.class101.server1;

public class Client {
    private String name;
    private String phoneNumber;

    public Client(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Client(String name) {
        this.name = name;
    }

    public String complain(String content) {
        return content;
    }
}
