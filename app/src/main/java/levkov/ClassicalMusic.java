package levkov;

import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ClassicalMusic implements Music {
    private List<String> musicPlaylist;

    public ClassicalMusic() {
        this.musicPlaylist = List.of("Mozart – Eine kleine Nachtmusik", "Beethoven – Für Elise",
                "Puccini – 'O mio babbino caro' from Gianni Schicchi");
    }

    @Override
    public List<String> getPlaylist() {
        return musicPlaylist;
    }
}
