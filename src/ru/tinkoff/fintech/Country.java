package ru.tinkoff.fintech;


public enum Country {
    RUSSIA("Россия", true),
    USA("США", true),
    BELARUS("Белорусь", false),
    UKRAINE("Украина", false),
    POLAND("Польша", true);

    private final String ruName;
    private final boolean isOpen;

    Country(final String ruName, final boolean isOpen) {
        this.ruName = ruName;
        this.isOpen = isOpen;
    }


    public static Country getByRuName(final String choiceCountryInRuName) throws NoSuchCountryException {
        Country country;
        for (Country t : Country.values()) {
            if (t.ruName.equals(choiceCountryInRuName)) {
                country = t;
                return country;
            }
        }
        throw new NoSuchCountryException("Страны " + choiceCountryInRuName + " не существует");
    }


    public boolean isOpen() {
        return isOpen;
    }

    @Override
    public String toString() {
        return name() + " (" + ruName + ")";
    }
}
