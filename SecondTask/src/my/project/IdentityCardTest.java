package my.project;

public class IdentityCardTest {

    public static void main(String[] args) {
        IdentityCard manIdentityCard = new IdentityCard();
        manIdentityCard.name = "Dmitry";
        manIdentityCard.surname = "Lytvak";
        manIdentityCard.cod = "00555";
        manIdentityCard.date = "14.10.1981";

        IdentityCard womanIdentityCard = new IdentityCard();
        womanIdentityCard.name = "Natalya";
        womanIdentityCard.surname = "Lytvak";
        womanIdentityCard.cod = "00777";
        womanIdentityCard.date = "15.10.1984";

        IdentityCard boyIdentityCard = new IdentityCard();
        boyIdentityCard.name = "Maximilian";
        boyIdentityCard.surname = "Lytvak";
        boyIdentityCard.cod = "00888";
        boyIdentityCard.date = "27.01.2018";

        System.out.println("manIdentityCard: name =" + manIdentityCard.name + ", surname =" + manIdentityCard.surname
                + ", cod =" + manIdentityCard.cod + ", date =" + manIdentityCard.date);
        System.out.println("womanIdentityCard: name =" + womanIdentityCard.name + ", surname =" + womanIdentityCard.surname
                + ", cod =" + womanIdentityCard.cod + ", date =" + womanIdentityCard.date);
        System.out.println("boyIdentityCard: name =" + boyIdentityCard.name + ", surname =" + boyIdentityCard.surname
                + ", cod =" + boyIdentityCard.cod + ", date =" + boyIdentityCard.date);

        System.out.println("Static:" + manIdentityCard.STATIC_NUMBER + ","
                + womanIdentityCard.STATIC_NUMBER + ","
                + boyIdentityCard.STATIC_NUMBER + "," + IdentityCard.STATIC_NUMBER);

        IdentityCard.STATIC_NUMBER = IdentityCard.STATIC_NUMBER + 1;

        System.out.println("Static:" + manIdentityCard.STATIC_NUMBER + "," + womanIdentityCard.STATIC_NUMBER + ","
                + boyIdentityCard.STATIC_NUMBER + "," + IdentityCard.STATIC_NUMBER);

    }
}
