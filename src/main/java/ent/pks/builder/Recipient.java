package ent.pks.builder;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Recipient {
    private final String name;
    private final String address;

    private Recipient(RecipientBuilder recipientBuilder) {
        this.name = recipientBuilder.name;
        this.address = recipientBuilder.address;
    }

    //найденный мною способ, через внутренний статический класс
    public static class RecipientBuilder {
        private String name;
        private final String address;

        public RecipientBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public RecipientBuilder(String address) {
            this.address = address;
            //address считаю обязательным
        }

        public Recipient build() {
            return new Recipient(this);
        }
    }

}
