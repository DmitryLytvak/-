package my.project;

public class CountryTest {

    public static void main(String[] args) {
        Country firstCountry = new Country();
        firstCountry.name = "Ukraine";
        firstCountry.capital = "Kyiv";
        firstCountry.population = 41167336;

        Country secondCountry = new Country();
        secondCountry.name = "USA";
        secondCountry.capital = "Washington";
        secondCountry.population = 337550940;

        Country thirdCountry = new Country();
        thirdCountry.name = "Great Britain";
        thirdCountry.capital = "London";
        thirdCountry.population = 68992721;

        System.out.println("firstCountry: name =" + firstCountry.name + ", captal =" + firstCountry.capital + ", population =" + firstCountry.population);
        System.out.println("secondCountry: name =" + secondCountry.name + ", captal =" + secondCountry.capital + ", population =" + secondCountry.population);
        System.out.println("thirdCountry: name =" + thirdCountry.name + ", captal =" + thirdCountry.capital + ", population =" + thirdCountry.population);

        System.out.println("Static:" + firstCountry.STATIC_NUMBER + ","
                + secondCountry.STATIC_NUMBER + ","
                + thirdCountry.STATIC_NUMBER +"," + Country.STATIC_NUMBER);

        Country.STATIC_NUMBER = Country.STATIC_NUMBER + 1;

        System.out.println("Static:" + firstCountry.STATIC_NUMBER + "," + secondCountry.STATIC_NUMBER + ","
                + thirdCountry.STATIC_NUMBER + "," + Country.STATIC_NUMBER);


    }
}
