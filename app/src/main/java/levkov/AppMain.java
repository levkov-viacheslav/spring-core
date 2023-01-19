package levkov;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
        player.playMusic(Genres.ROCK);
        player.playMusic(Genres.CLASSICAL);
        player.playMusic(Genres.RAP);
        context.close();
    }
}
