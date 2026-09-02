public abstract class Funcionario {
    private String id;
    private String nome;
    private double salarioBase;

    public Funcionario(String id, String nome, double salarioBase) {
        this.id = id;
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id; 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();
}