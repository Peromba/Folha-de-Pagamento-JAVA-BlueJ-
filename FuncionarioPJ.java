public class FuncionarioPJ extends Funcionario {
    private int horasTrabalhadas;
    private double valorHora;

    public FuncionarioPJ(String id, String nome, int horasTrabalhadas, double valorHora) {
        super(id, nome, 0.0);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }
    
    @Override
    public double calcularSalario() {
        return horasTrabalhadas * valorHora;
    }
}