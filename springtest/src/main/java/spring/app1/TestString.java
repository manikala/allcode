package spring.app1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestString {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        Music music = context.getBean("musicBean", Music.class);

        MusicPlayer musicPlayer = new MusicPlayer (music);

        musicPlayer.playMusic();

        context.close();

    }
}
