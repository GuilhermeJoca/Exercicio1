public class Funcionario {

    String nome;
    String CPF;
    static double salario;
    static double valeRefeicao = 550;

    public String retornarDados(){

        return "Nome: " + nome + ", CPF: " + CPF + ", Salário: R$" + salario;
    }

    public static void aumentarSalario(double porcentagem){

        salario += salario * (porcentagem/100);
        System.out.println("Atualização de Salário: R$" + String.format("%.2f", salario));
    }
    
    public static void ajustarValeRefeicao(double porcentagem){

        valeRefeicao += valeRefeicao * (porcentagem/100);
        System.out.println("Atualização de Vale Refeição: R$" + String.format("%.2f", valeRefeicao));
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCpf(String cpf){
        this.CPF = cpf;
    }
    public void setSalario(Double salario){
        this.salario = salario;
    }
}
