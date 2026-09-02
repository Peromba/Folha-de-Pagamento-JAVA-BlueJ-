import java.util.List;
public class FolhaPagamento {
    public double calcularTotalFolha(List<Funcionario> lista) {
        double total = 0;
        for (Funcionario f : lista) {

            f.calcularSalario(); 
            total += f.getSalarioBase();
        }
        return total;
    }
}