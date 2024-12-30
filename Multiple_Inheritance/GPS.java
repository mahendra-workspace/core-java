package Multiple_Inheritance;

interface GPS {
    default void getLocation(){
        System.out.println("Getting Currunt Location");
    }
}
