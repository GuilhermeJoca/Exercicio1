public class CartaoDeCredito {
    Integer numero;
    double totalFatura;

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public Integer getNumero() {
        return numero;
    }

    public void setTotalFatura(Double totalFatura) {
        this.totalFatura = totalFatura;
    }
    public double getTotalFatura() {
        return totalFatura;
    }

    @Override
    public String toString(){
        return "Número cartão: " + numero + ", Total Fatura: " + totalFatura;
    }
  
    
}