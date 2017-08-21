package com.internship.sia4.soundsystem;

import org.springframework.stereotype.Component;

@Component("lonelyHeartsClub")
public class SqtPeppers implements CompactDisc {
    public String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.print("Playing " + title + " by " + artist + '\n');
    }
}
