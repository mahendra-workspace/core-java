package Multiple_Inheritance;

interface MusicPlayer {
    default void playMusic(){
        System.out.println("Playing Music");
    }
}
