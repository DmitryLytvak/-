package my.project;

public class CarTest {

    public static void main(String[] args) {
        Car clientFirstCar = new Car();
        clientFirstCar.number = 77;
        clientFirstCar.color = "green";
        clientFirstCar.door = 4;

        Car clientSecondCar = new Car();
        clientSecondCar.number = 88;
        clientSecondCar.color = "white";
        clientSecondCar.door = 2;

        Car clientThirdCar = new Car();
        clientThirdCar.number = 99;
        clientThirdCar.color = "black";
        clientThirdCar.door = 5;

        System.out.println("clientFirstCar: number =" + clientFirstCar.number + ", color =" + clientFirstCar.color + ", door =" + clientFirstCar.door);
        System.out.println("clientSecondCar: number =" + clientSecondCar.number + ", color =" + clientSecondCar.color + ", door =" + clientSecondCar.door);
        System.out.println("clientThirdCar: number =" + clientThirdCar.number + ", color =" + clientThirdCar.color + ", door =" + clientThirdCar.door);

        System.out.println("Static:"+clientFirstCar.);
    }
}
