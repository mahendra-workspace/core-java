package Multiple_Inheritance;

public class SmartPhone implements Camera, GPS, MusicPlayer  {
    

    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone();
        myPhone.takePhoto();
        myPhone.getLocation();
        myPhone.playMusic();
    }
}
