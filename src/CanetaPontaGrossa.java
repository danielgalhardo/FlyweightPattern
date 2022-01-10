public class CanetaPontaGrossa implements Caneta{

    final TamanhoPonta tamanho = TamanhoPonta.GROSSA;
    private String cor = null;

    @Override
    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String escreve(String desenho) {
        return "Escrevendo com a cor: " + this.cor + " com a caneta fina: " + desenho;
    }
}
