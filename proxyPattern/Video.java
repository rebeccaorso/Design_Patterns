package proxyPattern;

public class Video {
    private String videoId;
    private String title;  // Titolo del video
    private int duration;  // Durata in secondi

    public Video(String videoId) {
        this.videoId = videoId;
        // Assumi che vengano eseguite altre inizializzazioni, come recuperare metadata dal server
        this.title = "Sample Video Title for " + videoId;
        this.duration = 300;  // durata esemplificativa di 5 minuti
    }

    // Getter per il videoId
    public String getVideoId() {
        return videoId;
    }

    // Getter per il titolo
    public String getTitle() {
        return title;
    }

    // Getter per la durata
    public int getDuration() {
        return duration;
    }

    // Metodo toString per stampare informazioni sul video
    @Override
    public String toString() {
        return "Video{" +
                "videoId='" + videoId + '\'' +
                ", title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }
}
