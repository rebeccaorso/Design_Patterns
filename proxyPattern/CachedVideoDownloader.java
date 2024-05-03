package proxyPattern;

import java.util.HashMap;
import java.util.Map;

//Controlla l'accesso al servizio reale, implementa il caching per ridurre le operazioni di rete, e assicura che se un video è già stato scaricato non venga scaricato nuovamente.
public class CachedVideoDownloader implements VideoDownloader {

    private final VideoDownloader realDownloader;
    private final Map<String, Video> cache = new HashMap<>();

    public CachedVideoDownloader(VideoDownloader realDownloader) {
        this.realDownloader = realDownloader;
    }

    @Override
    public Video downloadVideo(String videoId) {
        if (!cache.containsKey(videoId)) {
            cache.put(videoId, realDownloader.downloadVideo(videoId));
        } else {
            System.out.println("Retrieving video from cache with ID: " + videoId);

        }
        return cache.get(videoId);
    }

}
