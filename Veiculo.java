public class Veiculo {
    protected String placa;
    protected int anoFabricacao;
    protected final String TIPO;

    public Veiculo(String placa, int anoFabricacao, String tipo) {
        this.placa = placa;
        this.anoFabricacao = anoFabricacao;
        this.TIPO = tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getTIPO() {
        return TIPO;
    }

    @Override
    public String toString() {
        return "Veículo [Placa: " + placa + ", Ano de Fabricação: " + anoFabricacao + ", Tipo: " + TIPO + "]";
    }
}
