package screenSaver;

import org.springframework.context.annotation.*;

import java.awt.*;
import java.util.Random;

@Configuration
@ComponentScan
public class ScreenSaverConfig {
    private Random random = new Random();


    @Bean
    public ColorFrame colorFrame(){
        ColorFrame colorFrame = new ColorFrame() {
            @Override
            protected Color getColorBean() {
                return randomColor();
            }
        };
        return colorFrame;
    }

    @Bean
    @Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
    public Color randomColor() {
        Color color = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
        return color;
    }

}
