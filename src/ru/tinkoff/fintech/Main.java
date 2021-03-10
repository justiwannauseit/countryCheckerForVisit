package ru.tinkoff.fintech;

import java.util.EnumSet;
import java.util.Scanner;

public class Main {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (Country info : EnumSet.allOf(Country.class)) {
            System.out.println(info);
        }

        Country country = null;

        String input = scanner.nextLine();
        try {
            country = Country.valueOf(input);
        } catch (IllegalArgumentException ex) {
            System.out.println("Наименование страны на английском введено некорректно, проверяем русское название...");
        } catch (NullPointerException ex) {
            System.out.println("Обьекта " + input + " не существует");
        }

        if (null == country) {
            try {
                country = Country.getByRuName(input);
            } catch (NoSuchCountryException ex) {
                System.out.println("Страны " + input + " не существует");
            }
        }

        if (country != null) {
            if (country.isOpen()) {
                System.out.println("Страна " + country.toString() + " открыта для посещения");
            } else {
                System.out.println("Страна " + country.toString() + " закрыта для посещения");
            }
        } else {
            System.exit(0);
        }

    }
}
