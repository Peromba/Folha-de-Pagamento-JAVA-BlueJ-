import java.util.ArrayList;
import java.util.List;

public class PrincipalApp {
    public static void main(String[] args) {
        List<Funcionario> equipe = new ArrayList<>();
        FuncionarioCLT funcClt = new FuncionarioCLT("CLT-01", "Carlos Silva", 5000.0, 0.11);
        funcClt.concederBonus(0.10);
        FuncionarioPJ funcPj = new FuncionarioPJ("PJ-02", "Gisele Tech LTDA", 160, 45.0);

        equipe.add(funcClt);
        equipe.add(funcPj);

        System.out.println("--- PROCESSAMENTO DA FOLHA ---");
        for (Funcionario f : equipe) {
            System.out.printf("Funcionário: %s | Salário Líquido: R$ %.2f%n",
                    f.getNome(), f.calcularSalario());
        }

        FolhaPagamento rh = new FolhaPagamento();
        double custoTotalEmpresa = rh.calcularTotalFolha(equipe);
       
        System.out.println("\n-----------------------------------------");
        System.out.printf("CUSTO TOTAL DA FOLHA DE PAGAMENTO: R$ %.2f%n", custoTotalEmpresa);
        System.out.println("-----------------------------------------");
    }
}