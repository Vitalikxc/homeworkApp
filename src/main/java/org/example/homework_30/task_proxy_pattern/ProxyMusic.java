package org.example.homework_30.task_proxy_pattern;

public class ProxyMusic implements Music{
    private RealMusic realMusic;
    private String songTitle;

    public ProxyMusic(String songTitle) {
        this.songTitle = songTitle;
    }

    @Override
    public void play() {
        if (realMusic == null){
            realMusic = new RealMusic(songTitle);
        }
        realMusic.play();
    }
}
