package levkov;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        MusicPlayer player = context.getBean("musicPlayerBean", MusicPlayer.class);
        try {
            player.playMusic();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        context.close();
    }

    public static void testPrototypeScope(MusicPlayer  player, MusicPlayer player2) {
        //must be false
        System.out.println(player == player2);
        //hashcode must be different
        System.out.println(player);
        System.out.println(player2);
        // first player's volume should not change
        player2.setVolume(10);
        System.out.println(player.getVolume());
    }
}
