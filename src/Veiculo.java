public class Veiculo {
    private boolean motor;
    private boolean volante;
    private int passageiros;
    private int portas;
    private int rodas;
    private boolean ehCarga;
    private double capacidade;
    private Combustivel combustivel;

    public Veiculo(boolean motor, boolean volante, int passageiros, int portas, int rodas, boolean ehCarga, double capacidade, Combustivel combustivel) {
        this.motor = motor;
        this.volante = volante;
        this.passageiros = passageiros;
        this.portas = portas;
        this.rodas = rodas;
        this.ehCarga = ehCarga;
        this.capacidade = capacidade;
        this.combustivel = combustivel;
    }

    public boolean isMotor() {
        return motor;
    }

    public void setMotor(boolean motor) {
        this.motor = motor;
    }

    public boolean isVolante() {
        return volante;
    }

    public void setVolante(boolean volante) {
        this.volante = volante;
    }

    public int getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    public boolean isEhCarga() {
        return ehCarga;
    }

    public void setEhCarga(boolean ehCarga) {
        this.ehCarga = ehCarga;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    public String getCombustivel() {
        if (combustivel.isGasolina()) {
            return "Gasolina";
        } else if (combustivel.isAlcool()) {
            return "Álcool";
        } else if (combustivel.isDiesel()) {
            return "Diesel";
        } else if (combustivel.isEletricidade()) {
            return "Eletricidade";
        } else if (combustivel.isHumano()) {
            return "Humano";
        } else if (combustivel.isAnimal()) {
            return "Animal";
        } else {
            return "Desconhecido";
        }
    }

    public void setCombustivel(boolean gasolina, boolean alcool, boolean diesel, boolean eletricidade, boolean humano, boolean animal) {
        this.combustivel = new Combustivel(gasolina, alcool, diesel, eletricidade, humano, animal);
    }

    @Override
    public String toString() {
        return "\nCaracterísticas do seu veículo: \n" +
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
