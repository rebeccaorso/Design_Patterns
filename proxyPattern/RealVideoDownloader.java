package proxyPattern;


// Implementa l'interfaccia e fornisce la funzionalità effettiva del servizio, come scaricare video.
public class RealVideoDownloader implements VideoDownloader {
    public Video downloadVideo(String videoId){
        System.out.println("Downloading video with ID: " + videoId);
        return new Video(videoId);
    }

}
