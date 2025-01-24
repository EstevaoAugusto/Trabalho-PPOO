public class ClientePreferencial extends Cliente {
    public enum TipoPrioritario {
        CADEIRANTE, IDOSO, GESTANTE
    }
    
    private TipoPrioritario prioritario;

    public ClientePreferencial(Localizacao localizacao){
        super(localizacao);
    }

    public TipoPrioritario getPrioritario() {
        return prioritario;
    }

    public void executarAcao() {
        
    }
}
