package levkov;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        MusicPlayer player = context.getBean("musicPlayerBean", MusicPlayer.class);
        try{
        player.playMusic();}
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(player.getName());
        System.out.println(player.getVolume());
        context.close();
    }
}
