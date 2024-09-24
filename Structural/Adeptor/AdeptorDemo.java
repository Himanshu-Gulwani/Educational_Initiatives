//client interface
interface MediaPlayer{
    public void play(String type,String filename);
}

class BasicMediaPlayer implements MediaPlayer{

    MediaAdepter ma = new MediaAdepter();
    
    public void play(String type, String filename) {
        ma.play(type, filename);
        
    }

}

//Adeptee
class AdvancedMediaPlayer{
    public void playmp3(String filename){
        System.out.println("Playing mp3 " + filename + " file");
    }
    public void playmp4(String filename){
        System.out.println("Playing mp4 " + filename + " file");
    }
    public void plaympAvi(String filename){
        System.out.println("Playing mpAvi " + filename + " file");
    }
    public void playvlc(String filename){
        System.out.println("Playing vlc " + filename + " file");
    }
}

//Adeptor
class MediaAdepter implements MediaPlayer{
    AdvancedMediaPlayer am = new AdvancedMediaPlayer();
   
    public void play(String type, String filename) {
        if(type.equalsIgnoreCase("mp3")){
            am.playmp3(filename);
        }
        else if(type.equalsIgnoreCase("mp4")){
            am.playmp4(filename);
        }
        else if(type.equalsIgnoreCase("avi")){
            am.plaympAvi(filename);
        }
        else if(type.equalsIgnoreCase("vlc")){
            am.playvlc(filename);
        }
        else{
            System.out.println("File format is not supported");
        }
    }
}

public class AdeptorDemo {
   public static void main(String[] args) {
        MediaPlayer mp = new BasicMediaPlayer();
        mp.play("vlc", "Song");
        mp.play("mp3", "Song2");
    
   } 
}
