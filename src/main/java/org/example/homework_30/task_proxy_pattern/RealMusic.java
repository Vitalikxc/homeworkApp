package org.example.homework_30.task_proxy_pattern;

public class RealMusic implements Music {
    private String songTitle;

    public RealMusic(String songTitle) {
        this.songTitle = songTitle;
        loadSong();
    }

    private void loadSong(){
        System.out.println("Загрузка");
    }

    @Override
    public void play() {
        System.out.println("Играет: " + songTitle);
    }
}
