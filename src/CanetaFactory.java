import java.util.HashMap;

public class CanetaFactory {
    private static final HashMap<String, Caneta> canetasMap = new HashMap<>();

    public static Caneta getCanetaPontaGrossa(String cor)
    {
        String chave = cor + "-GROSSA";

        Caneta caneta = canetasMap.get(chave);

        if(caneta != null) {
            return caneta;
        } else {
            caneta = new CanetaPontaGrossa();
            caneta.setCor(cor);
            canetasMap.put(chave, caneta);
        }

        return caneta;
    }

    public static Caneta getCanetaPontaFina(String cor)
    {
        String chave = cor + "-FINA";

        Caneta caneta = canetasMap.get(chave);

        if(caneta != null) {
            return caneta;
        } else {
            caneta = new CanetaPontaFina();
            caneta.setCor(cor);
            canetasMap.put(chave, caneta);
        }

        return caneta;
    }

    public static Caneta getCanetaPontaMedia(String cor)
    {
        String chave = cor + "-MEDIA";

        Caneta caneta = canetasMap.get(chave);

        if(caneta != null) {
            return caneta;
        } else {
            caneta = new CanetaPontaMedia();
            caneta.setCor(cor);
            canetasMap.put(chave, caneta);
        }

        return caneta;
    }
}
