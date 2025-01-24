import java.awt.Image;
import javax.swing.ImageIcon;
import java.lang.Integer;
import java.util.Random;

/**
 * Representa os veiculos da simulacao.
 * @author David J. Barnes and Michael Kolling and Luiz Merschmann
 */
public class Cliente {
    private Integer tempoPasso;
    private Integer tempoAtendimento;
    private Localizacao localizacaoAtual;
    private Localizacao localizacaoDestino;
    private Image imagem;

    public Cliente(Localizacao localizacao) {
        this.localizacaoAtual = localizacao;
        localizacaoDestino = null;


        String[] imagens = {
            "Imagens/ClienteComumMasculino.png",
            "Imagens/ClienteComumFeminino.png",
            "Imagens/Cadeirante.png",
            "Imagens/Gestante.png",
            "Imagens/Idoso.png"
        };

        Random rand = new Random();
        int num = rand.nextInt(5); // Gera numero entre 0 e 4

        switch (num) {
            case 0:
                imagem = new ImageIcon(getClass().getResource(imagens[num])).getImage();
                break;
            case 1:
                imagem = new ImageIcon(getClass().getResource(imagens[num])).getImage();
                break;
            case 2:
                imagem = new ImageIcon(getClass().getResource(imagens[num])).getImage();

                break;
            case 3:
                imagem = new ImageIcon(getClass().getResource(imagens[num])).getImage();

                break;
            case 4:
                imagem = new ImageIcon(getClass().getResource(imagens[num])).getImage();

                break;
        }

        
    }

    public Localizacao getLocalizacaoAtual() {
        return localizacaoAtual;
    }

    public Localizacao getLocalizacaoDestino() {
        return localizacaoDestino;
    }
    
    public Image getImagem(){
        return imagem;
    }

    public void setLocalizacaoAtual(Localizacao localizacaoAtual) {
        this.localizacaoAtual = localizacaoAtual;
    }

    public void setLocalizacaoDestino(Localizacao localizacaoDestino) {
        this.localizacaoDestino = localizacaoDestino;
    }
    
    public void executarAcao(){
        Localizacao destino = getLocalizacaoDestino();
        if(destino != null){
            Localizacao proximaLocalizacao = getLocalizacaoAtual().proximaLocalizacao(localizacaoDestino);
            setLocalizacaoAtual(proximaLocalizacao);
        }
    } 
}
