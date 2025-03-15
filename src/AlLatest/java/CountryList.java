package AlLatest.java;

import java.util.Locale;

public class CountryList {
    public static void main(String[] args) {
        String[] countryCodes = Locale.getISOCountries();

        System.out.println("List of Countries:");
        for (String countryCode : countryCodes) {
            Locale locale = new Locale("", countryCode);
            System.out.println(locale.getDisplayCountry());
        }
    }
}