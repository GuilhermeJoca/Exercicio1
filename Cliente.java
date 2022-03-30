import java.util.ArrayList;
import java.util.List;

public class Cliente {
    
    public String nome;
    public String cpf;
    CartaoDeCredito cartaoDeCredito;

    public static List<CartaoDeCredito> cartao;
    public static Object toString;

    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        Cliente.cartao = new ArrayList<>();
    }


    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCpf() {
        return cpf;
    }

    public void addCartao(CartaoDeCredito cc){
        Cliente.cartao.add(cc);
    }

    @Override
    public String toString(){
        return "nome: " + nome + "  |  cpf: " + cpf + " | cartão: " + cartao;
       
    }

}
