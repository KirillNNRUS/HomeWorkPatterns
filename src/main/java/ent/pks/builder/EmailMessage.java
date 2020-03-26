package ent.pks.builder;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class EmailMessage {
    List<Recipient> recipientsMessage; // получатели
    Recipient sender; // отправитель
    String body; // текст письма
    String subject; // тема письма
}
