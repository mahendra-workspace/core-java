package Multiple_Inheritance;

interface Camera {
    default void takePhoto(){
        System.out.println("Taking a Photo");
    }
}