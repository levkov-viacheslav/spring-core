package levkov;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
        player.playMusic(Genres.ROCK);
        player.playMusic(Genres.CLASSICAL);
        player.playMusic(Genres.RAP);

        User user = context.getBean("user", User.class);
        System.out.println(user.getUserInfo());
        context.close();
    }
}
