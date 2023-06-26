public class Bicicleta extends Veiculo {
    private boolean eletrica;
    private boolean temBagageiro;

    public Bicicleta(boolean motor, boolean volante, int passageiros, int portas, int rodas, boolean ehCarga, double capacidade, Combustivel combustivel, boolean eletrica, boolean temBagageiro) {
        super(motor, volante, passageiros, portas, rodas, ehCarga, capacidade, combustivel);
        this.eletrica = eletrica;
        this.temBagageiro = temBagageiro;
    }

    public boolean isEletrica() {
        return eletrica;
    }

    public void setEletrica(boolean eletrica) {
        this.eletrica = eletrica;
    }

    public boolean isTemBagageiro() {
        return temBagageiro;
    }

    public void setTemBagageiro(boolean temBagageiro) {
        this.temBagageiro = temBagageiro;
    }

    @Override
    public String toString() {
        return "\nCaracterísticas da sua bicicleta: \n" +
                "Eletrica: " + eletrica + "\n" +
                "Tem bagageiro: " + temBagageiro + "\n" +
                "Motor: " + isMotor() + "\n" +
                "Volante: " + isVolante() + "\n" +
                "Passageiros: " + getPassageiros() + "\n" +
                "Portas: " + getPortas() + "\n" +
                "Rodas: " + getRodas() + "\n" +
                "Carga: " + isEhCarga() + "\n" +
                "Capacidade: " + getCapacidade() + "KG\n" +
                "Combustivel: " + getCombustivel();
    }
}
