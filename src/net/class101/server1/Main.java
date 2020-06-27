package net.class101.server1;

public class Main {

    public static void main(String[] args) {
        Client blackMember = new Client("domning", "010-3331-9631");
        Macdonald jyDt = new Macdonald();
        String burger = jyDt.order(blackMember, "불고기버거", 1);
    }
}