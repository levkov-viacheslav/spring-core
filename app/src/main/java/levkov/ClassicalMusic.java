package levkov;

public class ClassicalMusic implements Music {

    private ClassicalMusic() {}
    // example of factory method
    public static ClassicalMusic getClassicalMusicInstance() {
        return new ClassicalMusic();
    }
    @Override
    public String playSong() {
        return "Mozart – Eine kleine Nachtmusik";
    }
}
