import java.util.ArrayList;
import java.util.List;

public class Conta {
   
    static Integer numero;
    static double saldo;
    static double limite;
    
    public static List<Cliente> clientes;
    public List<Conta> contas;

    public Conta(Integer numero, double saldo, double limite){
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        this.clientes = new ArrayList<>();
        Cliente.cartao = new ArrayList<>();
    } 

    public Conta() {
    }

    public void setNumero(Integer numero){
        this.numero = numero;
    }
    public void setSaldo(Double saldo){
        this.saldo = saldo;
    }
    public void setLimite(Double limite){
        this.limite = limite;
    }
    
    public static List<Cliente> getClientes(){
        return clientes;
    }
    public static void addCliente(Cliente c){
        clientes.add(c);
    }


    public void sacar(double valor){
        if(valor > saldo){
            System.out.println("Você não possui saldo o suficiente! Pobre");
        }else{
            saldo = saldo - valor;
        System.out.println("Você sacou -> " + valor);
        System.out.println("Seu novo Saldo -> " + saldo);
        }
    }

    public void depositar(double valor){
        if(valor + saldo > limite){
            System.out.println("Não é possível depositar essa quantidade, pois ultrapassa o seu limite");
        }else{
            saldo = saldo + valor;
        System.out.println("Você depositou -> " + valor);
        System.out.println("Seu novo Saldo -> " + saldo);
        }
    }

    public double consultarSaldo(){
        return saldo;
    }

    public static String retornarDados(){
        return "numero: " + numero + " | saldo: " + saldo + " | limite: " + limite ;

    }

    public String gerarExtrato() {
		String extrato = "";

		extrato += "Saldo da conta -> R$" + saldo;
		extrato += "\nMovimentação dos últimos 7 dias";

        return extrato;
    }

    public String gerarExtrato(int dias){
		String extrato = "";

		extrato += "Saldo da conta -> R$ " + saldo;
		extrato += "\nMovimentação dos últimos "+ dias + " dias";

        return extrato;
    }

    public void transferir(Conta destino, double valor){
		this.saldo -= valor;
		destino.saldo += valor;
	}
}
