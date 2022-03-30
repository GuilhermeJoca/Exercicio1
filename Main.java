import java.util.Scanner;

public class Main {
    private static Banco banco = null;
    private static Cliente cliente = null;
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        banco = new Banco("Atividade2");
        cliente = new Cliente(null, null);
            boolean exit = false;
        while(!exit){
            System.out.print("ESPM>");
            String input = scan.nextLine().trim().toLowerCase();

            if("".equals(input)){

            
            }else if("sair".equals(input)){
                exit = true;
            }else if("menu".equals(input)){
                menu();
            }else if ("con".equals(input)){
                addConta(banco);
                addCliente(banco);
                System.out.println("Quantos cartões essa pessoa terá? -> ");
                Integer valor = scan.nextInt();
                for(int i = 0; i < valor; i++ ){
                    addCartao(cliente);
                }
            }else if ("lis".equals(input)){
                listCliente(banco);;

            }else if ("aumentarsalario".equals(input)){
                System.out.println("Em porcentagem, quanto deseja aumentar o salário dos funcionários?");
                double porcentagem = scan.nextDouble();
                Funcionario.aumentarSalario(porcentagem);
            }else if ("ajustarvale".equals(input)){
                System.out.println("Em porcentagem, quanto deseja aumentar o Vale Refeição dos funcionários?");
                double porcentagem = scan.nextDouble();
                Funcionario.ajustarValeRefeicao(porcentagem);
            }else if ("consultardados".equals(input)) {
                Conta.retornarDados();
            
            } else {
                System.out.println("O Comando inválido");
            }
        
        }

    }
    private static void addCartao(Cliente cliente2) {
    }
    private static void menu(){
        System.out.println("Banco Sistema de Clientes");
        System.out.println("------------------------");
        System.out.println("con -> Adicionar Conta, Cliente e Cartão");
        System.out.println("fun -> Adicionar Funcionário");
        System.out.println("lisFun -> Listar Funcionário");
        System.out.println("lisCli -> Listar Cliente");
        System.out.println("AumentarSalario -> Aumentar Salário de Funcionários em porcentagem");
        System.out.println("AjustarVale -> Ajustar Vale Refeição de Funcionários em porcentagem");
        System.out.println("ConsultarDados -> Consultar dados da Conta");


        System.out.println();
        System.out.println("sair -> Sair do Sistema");
    }
    public static void addConta(Banco banco){
        Scanner scan = new Scanner(System.in);

        System.out.print("Número da Conta é: ");
         int numero = scan.nextInt();

        System.out.print("Saldo da Conta é: ");
         double saldo = scan.nextDouble();

        System.out.println("Limite da Conta é: ");
        double limite = scan.nextDouble();

         Conta c = new Conta();
         c.setNumero(numero);
         c.setLimite(limite);
         c.setSaldo(saldo);
         Banco.addConta(c);
     }
    public static void addCliente(Banco banco){
        Scanner scan = new Scanner(System.in);

        System.out.print("Nome: ");
         String nome = scan.nextLine();

        System.out.print("CPF: ");
         String cpf = scan.nextLine();

         Cliente c = new Cliente(nome, cpf);
         c.setNome(nome);
         c.setCpf(cpf);
         Conta.addCliente(c);
     }
    public static void addFuncionario(Banco banco){
        Scanner scan = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = scan.nextLine();

        System.out.print("CPF: ");
        String cpf = scan.nextLine();

        System.out.print("Salário: ");
        double salario = scan.nextDouble();

        Funcionario f = new Funcionario();
            f.setNome(nome);
            f.setCpf(cpf);
            f.setSalario(salario);
            banco.addFuncionario(f);
     }

     public static void addCartaoCredito(Cliente cliente){
        Scanner scan = new Scanner(System.in);

        System.out.print("Número: ");
        int numero = scan.nextInt();

        System.out.print("Total Fatura: ");
        Double totalFatura = scan.nextDouble();

        CartaoDeCredito cc = new CartaoDeCredito();
            cc.setNumero(numero);
            cc.setTotalFatura(totalFatura);
            cliente.addCartao(cc);
     }
     public static void listCliente(Banco banco){
         Conta.getClientes().forEach(c -> System.out.println(c));
     }
     
}