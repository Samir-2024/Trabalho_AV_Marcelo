public class Carro extends Veiculo {
    protected String nome;
    protected int numeroPortas;

    public Carro(String nome, String placa, int anoFabricacao, int numeroPortas) {
        super(placa, anoFabricacao, "Carro");
        this.nome = nome;
        this.numeroPortas = numeroPortas;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    @Override
    public String toString() {
        return "Carro [Nome: " + nome + ", " + super.toString() + ", Número de Portas: " + numeroPortas + "]";
    }
}
