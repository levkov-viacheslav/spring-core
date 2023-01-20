package levkov;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class User {
    private String nickname;
    Setting userSetting;

    @Autowired
    public User(@Value("${user.nickname}") String nickname, Setting userSetting) {
        this.userSetting = userSetting;
        this.nickname = nickname;
    }

    public String getUserInfo() {
        return nickname + ", volume: " + userSetting.getVolume();
    }

    @PostConstruct
    public void initMethod() {
        System.out.println("Looking the music for user " + nickname);
    }
    @PreDestroy
    public void destroyMethod() {
        System.out.println("exit...");
    }
}
