package ent.pks.builder;

public class MainEmail {
    public static void main(String[] args) {
        Recipient recipient = new Recipient.RecipientBuilder("user@server.com").setName("user").build();
        System.out.println(recipient);
    }
}
