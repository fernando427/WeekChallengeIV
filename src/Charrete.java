public class Charrete extends Veiculo {
    public Charrete(boolean motor, boolean volante, int passageiros, int portas, int rodas, boolean temCarga, double capacidade, Combustivel combustivel) {
        super(motor, volante, passageiros, portas, rodas, temCarga, capacidade, combustivel);
    }

    @Override
    public String toString() {
        return "\nCaracterísticas da sua charrete: \n" +
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
