package proxyPattern;

//Definisce le operazioni comuni che il proxy e il servizio reale devono implementare.
public interface VideoDownloader {
    Video downloadVideo(String videoId);
}
