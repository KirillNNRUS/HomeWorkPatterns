package ent.pks.builder;

public class MainBuilder {
    public static void main(String[] args) {
        Recipient recipient = new Recipient.RecipientBuilder("user@server.com").setName("user").build();
        System.out.println(recipient);

        EmailMessageBuilder emailMessageBuilder = new EmailMessageBuilder();
        emailMessageBuilder.createEmailMessage();
        emailMessageBuilder.buildBody("Test");
        emailMessageBuilder.buildSubject("Test subj");
        emailMessageBuilder.buildSender(recipient);
        emailMessageBuilder.buildRecipients(new Recipient.RecipientBuilder("user2@server.com").setName("user2").build(),
                new Recipient.RecipientBuilder("user3@server.com").setName("user3").build());
        EmailMessage emailMessage = emailMessageBuilder.getEmailMessage();
        System.out.println(emailMessage);
    }
}
