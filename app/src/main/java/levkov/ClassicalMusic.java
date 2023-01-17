package levkov;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {

    @Override
    public String playSong() {
        return "Mozart – Eine kleine Nachtmusik";
    }
}
