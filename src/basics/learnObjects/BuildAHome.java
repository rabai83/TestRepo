package basics.learnObjects;

public class BuildAHome {
    public static void main(String[] args) {

        House house1 = new House();
        House house2 = new House();
        House house3 = new House();
        House house4 = new House();

        house1.color = "White";
        house2.color = "Blue";
        house3.color = "Red";
        house4.color = "Green";

        System.out.println(house1.color);
        System.out.println(house2.color);
        System.out.println(house3.color);
        System.out.println(house4.color);

        house1.numOfFloors = 2;
        house2.numOfFloors = 4;
        house3.numOfFloors = 1;
        house4.numOfFloors = 85;

        System.out.println(house1.numOfFloors);
        System.out.println(house2.numOfFloors);
        System.out.println(house3.numOfFloors);
        System.out.println(house4.numOfFloors);




    }





}
