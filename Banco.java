import java.util.ArrayList;
import java.util.List;

public class Banco {
    String nome;
    public List<Funcionario> funcionarios;
    public static List<Conta> contas;

    public Banco(String nome){
        this.nome = nome;
        Cliente.cartao = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
    }

    public void addFuncionario(Funcionario f){
        this.funcionarios.add(f);
    }

    public static void addConta(Conta c){
        contas.add(c);
    }

    public List<Funcionario> getFuncionarios(){
        return funcionarios;
    }
   
    
}
