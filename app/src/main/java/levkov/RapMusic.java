package levkov;

import org.springframework.stereotype.Component;

@Component
public class RapMusic implements Music {
    @Override
    public String playSong() {
        return "Future - WHAT FOR U";
    }
}
