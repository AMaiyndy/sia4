package com.internship.sia4.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.internship.sia4.soundsystem")
public class CDPlayerConfig {
    @Bean(name = "lonelyHeartsClubBand")
    public CompactDisc sgtPeppers() {
        return new SqtPeppers();
    }

    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }
}
