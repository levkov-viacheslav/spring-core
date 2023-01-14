package levkov;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        Music person = context.getBean("classicalMusic", ClassicalMusic.class);
        MusicPlayer player = new MusicPlayer(person);
        player.playMusic();

        context.close();
    }
}
