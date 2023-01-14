package levkov;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        MusicPlayer player = context.getBean("musicPlayerBean", MusicPlayer.class);
        player.playMusic();
        context.close();
    }
}
