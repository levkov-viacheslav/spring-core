package levkov;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    @Override
    public String playSong() {
        return "Metallica - One";
    }
}
