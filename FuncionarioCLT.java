public class FuncionarioCLT extends Funcionario implements Beneficiavel {
    private double imposto;
    public FuncionarioCLT(String id, String nome, double salarioBase, double imposto) {
        super(id, nome, salarioBase);
        this.imposto = imposto;
    }
    
    @Override
    public double calcularSalario() {
        return getSalarioBase() - (getSalarioBase() * imposto);
    }
    
    public void concederBonus(double percentual) {
        double bonus = getSalarioBase() * percentual;
        setSalarioBase(getSalarioBase() + bonus);
    }
}