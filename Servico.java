import java.util.List;
import java.awt.Image;
import java.util.ArrayList;

public class Servico {
    
    public enum TipoServico {
        ATENDIMENTO, CAIXA
    };

    private Localizacao localizacao;
    private List<Cliente> fila;
    private TipoServico tipoServico;
    private boolean preferencial;
    private Image imagem;

    public Servico() {

        fila = new ArrayList<Cliente>();
    }

    public void moverPessoas() {

    }
}
