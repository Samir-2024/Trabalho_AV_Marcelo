public class Moto extends Veiculo {
    protected String nome;
    protected String tipoFreio;

    public Moto(String nome, String placa, int anoFabricacao, String tipoFreio) {
        super(placa, anoFabricacao, "Moto");
        this.nome = nome;
        this.tipoFreio = tipoFreio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoFreio() {
        return tipoFreio;
    }

    public void setTipoFreio(String tipoFreio) {
        this.tipoFreio = tipoFreio;
    }

    @Override
    public String toString() {
        return "Moto [Nome: " + nome + ", " + super.toString() + ", Tipo de Freio: " + tipoFreio + "]";
    }
}
