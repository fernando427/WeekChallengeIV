public class Carro extends Veiculo {
    private boolean arcondicionado;
    private boolean radio;

    public Carro(boolean motor, boolean volante, int passageiros, int portas, int rodas, boolean ehCarga, double capacidade, Combustivel combustivel, boolean arcondicionado, boolean radio) {
        super(motor, volante, passageiros, portas, rodas, ehCarga, capacidade, combustivel);
        this.arcondicionado = arcondicionado;
        this.radio = radio;
    }

    public boolean isArcondicionado() {
        return arcondicionado;
    }

    public void setArcondicionado(boolean arcondicionado) {
        this.arcondicionado = arcondicionado;
    }

    public boolean isRadio() {
        return radio;
    }

    public void setRadio(boolean radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "\nCaracterísticas do seu carro: \n" +
                "Arcondicionado: " + arcondicionado + "\n" +
                "Radio: " + radio + "\n" +
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
