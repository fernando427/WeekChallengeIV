public class Moto extends Veiculo {
    private boolean partidaEletrica;

    public Moto(boolean motor, boolean volante, int passageiros, int portas, int rodas, boolean ehCarga, double capacidade, Combustivel combustivel, boolean partidaEletrica) {
        super(motor, volante, passageiros, portas, rodas, ehCarga, capacidade, combustivel);
        this.partidaEletrica = partidaEletrica;
    }

    public boolean isPartidaEletrica() {
        return partidaEletrica;
    }

    public void setPartidaEletrica(boolean partidaEletrica) {
        this.partidaEletrica = partidaEletrica;
    }

    @Override
    public String toString() {
        return "\nCaracterísticas da sua moto: \n" +
                "Partida elétrica: " + partidaEletrica + "\n" +
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
