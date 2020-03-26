package ent.pks.builder;

import java.util.ArrayList;

public class EmailMessageBuilder {

   private EmailMessage emailMessage;

    void createEmailMessage() {
        emailMessage = new EmailMessage();
    }

    void buildRecipients(Recipient... recipients) {
        ArrayList<Recipient> recipientArrayList = new ArrayList<>();
        for (Recipient r : recipients) {
            recipientArrayList.add(r);
        }
        emailMessage.setRecipientsMessage(recipientArrayList);
    }

    void buildSender(Recipient recipient) {
        emailMessage.setSender(recipient);
    }

    void buildBody(String body) {
        emailMessage.setBody(body);
    }

    void buildSubject(String subject) {
        emailMessage.setSubject(subject);
    }

    EmailMessage getEmailMessage() {
        return emailMessage;
    }
}
