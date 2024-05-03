package proxyPattern;


//Utilizza l'interfaccia VideoDownloader per richiedere servizi senza sapere se sta interagendo con il proxy o con il servizio reale.
public class Client {
    public static void main(String[] args) {
        VideoDownloader downloader = new CachedVideoDownloader(new RealVideoDownloader());
        downloader.downloadVideo("video123");
        downloader.downloadVideo("video123"); // Questa volta verrà recuperato dalla cache
    }
}

//Questo esempio illustra come il Proxy Pattern può essere utilizzato per aggiungere funzionalità come
// il caching in modo trasparente rispetto al codice cliente, seguendo il principio di open-closed per estendere
// le funzionalità del sistema senza modificare il codice esistente.