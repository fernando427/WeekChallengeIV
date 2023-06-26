public class Caminhao extends Veiculo {
    private int eixos;

    public Caminhao(boolean motor, boolean volante, int passageiros, int portas, int rodas, boolean ehCarga, double capacidade, Combustivel combustivel, int eixos) {
        super(motor, volante, passageiros, portas, rodas, ehCarga, capacidade, combustivel);
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    @Override
    public String toString() {
        return "\nCaracterísticas do seu caminhão: \n" +
                "Eixos: " + eixos + "\n" +
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
