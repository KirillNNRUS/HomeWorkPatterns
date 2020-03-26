package ent.pks.builder;

import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Setter
@ToString
public class EmailMessage {
    List<Recipient> recipientsMessage; // получатели
    Recipient sender; // отправитель
    String body; // текст письма
    String subject; // тема письма
}
