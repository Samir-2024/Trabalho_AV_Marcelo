public class Veiculo {
    protected String placa;
    protected int anoFabricacao;
    protected final String TIPO;

    public Veiculo(String placa, int anoFabricacao, String tipo) {
        this.placa = placa;
        this.anoFabricacao = anoFabricacao;
        this.TIPO = tipo;
    }

    public final void descrever() {
        System.out.println("Veículo do tipo " + TIPO + ", placa " + placa + ", fabricado em " + anoFabricacao + ".");
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
}
