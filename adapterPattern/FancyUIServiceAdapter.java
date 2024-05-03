package adapterPattern;

// Implementa l'interfaccia IMultiRestoApp e incapsula una istanza di FancyUIService.
// L'adapter converte i dati da XML a JSON e poi chiama il metodo render del servizio di terze parti. Questa classe
// agisce come un ponte tra MultiRestoApp e FancyUIService, consentendo loro di collaborare nonostante le loro interfacce incompatibili.
public class FancyUIServiceAdapter implements IMultiRestoApp {
    private FancyUIService fancyUIService;

    public FancyUIServiceAdapter(FancyUIService fancyUIService) {
        this.fancyUIService = fancyUIService;
    }

    @Override
    public void displayData(String xmlData) {
        String jsonData = convertXMLtoJSON(xmlData);
        fancyUIService.render(jsonData);
    }
    private String convertXMLtoJSON(String xmlData){
        return "{\"data\": \"" + xmlData + "\"}";
    }
}
