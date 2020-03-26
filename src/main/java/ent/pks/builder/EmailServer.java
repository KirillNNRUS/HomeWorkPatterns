package ent.pks.builder;

import java.util.List;

public class EmailServer {
    EmailMessage emailMessage;

    public EmailServer(EmailMessage emailMessage) {
        this.emailMessage = emailMessage;
    }

    void send() {
        if (emailMessage.getRecipientsMessage() == null || emailMessage.getRecipientsMessage().size() == 0) {
            System.out.println("Не указаны получатели");
            return;
        }
        for (Recipient r : emailMessage.getRecipientsMessage()) {
            System.out.println("Отсылаю письмо: " + r.toString());
            System.out.println("Тема: " + emailMessage.getSubject());
            System.out.println("Текст письма: " + emailMessage.getBody());
        }
    }

    void receive(EmailMessage emailMessage, String address) {
        if (emailMessage.getRecipientsMessage() == null || emailMessage.getRecipientsMessage().size() == 0) {
            System.out.println("Писем на указанный адрес нет");
            return;
        }

        List<Recipient> temp = emailMessage.getRecipientsMessage();
        for (Recipient r : emailMessage.getRecipientsMessage()) {
            if (r.getAddress().equalsIgnoreCase(address)) {
                System.out.println("Вам пришло письмо от " + emailMessage.getSender().toString());
                System.out.println("Тема: " + emailMessage.subject);
                System.out.println("Текст письма: " + emailMessage.getBody());

                return;
            }
        }
        System.out.println("Писем на указанный адрес нет");
    }

}
