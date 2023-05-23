
package Principal;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;

public class Sound {
     public static void musica(String path){
        try{
            AudioInputStream InputStream = AudioSystem.getAudioInputStream(new File(path));
            Clip clip = AudioSystem.getClip();
            clip.open(InputStream);
            clip.loop(0);
        }catch(UnsupportedAudioFileException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }catch(LineUnavailableException e){
            e.printStackTrace();
        }
    } 
}
