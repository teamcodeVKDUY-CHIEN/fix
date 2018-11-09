package developGame;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;


public class sound {
    AudioStream audios;
     void OpenFileMusic(String path) throws InterruptedException{
        InputStream music; 
        try{

            music = new FileInputStream(new File(path)); 
            audios = new AudioStream(music); 
            AudioPlayer.player.start(audios); 

        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    void CloseMusic(){
        AudioPlayer.player.stop(audios);
    }
    public static void main(String[] args){
        sound S = new sound();
        try{
            S.OpenFileMusic("04_Level 1.wav");
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
        S.CloseMusic();
    }
}
