package basics.learnObjects;

public class BuildACar {

    public static void main(String[] args) {
        Tesla modelS = new Tesla();
        Tesla model3 = new Tesla();
        Tesla modelY = new Tesla();

        modelS.model = "Model S";
        model3.model = "Model 3";
        modelY.model = "Model Y";

        System.out.println("This Car Is A " + Tesla.manufacture + " " + modelS.model);
        System.out.println("This Car Is A " + Tesla.manufacture + " " + model3.model);
        System.out.println("This Car Is A " + Tesla.manufacture + " " + modelY.model);




    }






}
