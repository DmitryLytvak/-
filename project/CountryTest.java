package my.project;

public class CountryTest {

    public static void main(String[] args) {
        Country FirstCountry = new Country();
        FirstCountry.name = "Ukraine";
        FirstCountry.capital = "Kyiv";
        FirstCountry.population =  41 167 336;

        Country SecondCountry = new Country();
        SecondCountry.name = "USA";
        SecondCountry.capital = "Washington";
        SecondCountry.population =  337 550 940;

        Country ThirdCountry = new Country();
        ThirdCountry.name = "Great Britain";
        ThirdCountry.capital = "London";
        ThirdCountry.population =  68 992 721;

        System.out.println("FirstCountry: name =" + FirstCountry.name + ", captal =" + FirstCountry.capital + ", population =" + FirstCountry.population);
        System.out.println("SecondCountry: name =" + SecondCountry.name + ", captal =" + SecondCountry.capital + ", population =" + SecondCountry.population);
        System.out.println("ThirdCountry: name =" + ThirdCountry.name + ", captal =" + ThirdCountry.capital + ", population =" + ThirdCountry.population);

        System.out.println("Static:" + FirstCountry.STATIC_NUMBER + ","
        + SecondCountry.STATIC_NUMBER + ","
        + ThirdCountry.STATIC_NUMBER; + "," + Country.STATIC_NUMBER);


    }
}
