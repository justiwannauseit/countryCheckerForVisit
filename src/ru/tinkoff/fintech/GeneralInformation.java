package ru.tinkoff.fintech;

public enum GeneralInformation {
    NAME("Name"),
    EDUCATION("Education"),
    EMAIL("Email"),
    PROFESSION("Profession"),
    PHONE("Phone");

    private final String textRepresentation;

    private GeneralInformation(String textRepresentation) {
        this.textRepresentation = textRepresentation;
    }

    @Override public String toString() {
        return textRepresentation;
    }
}
