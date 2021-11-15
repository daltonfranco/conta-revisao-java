public class ContaC {
    
    private String nome;
    private double saldo;
    private boolean especial;
    private double limite;


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public boolean isEspecial() {
        return especial;
    }
    public void setEspecial(boolean especial) {
        this.especial = especial;
    }
    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }


    public void depositar(double deposito){

        if(this.especial == false){

            if( (deposito+this.saldo) > this.limite){
                System.out.println("Erro, voce passou seu limite!!!! ");
            }else{
                this.saldo = this.saldo + deposito;
            }


        }else{
            this.limite = this.limite + 100.00;

            if((deposito+this.saldo) > this.limite){
                System.out.println("Erro, voce passou seu limite!!! ");

            }else{
                this.saldo = this.saldo + deposito;
            }
        }

    }


    public void sacar(double saque){

        if(this.especial == false){
            int linMenos = 0;

            if((saque+this.saldo) < linMenos){
                System.out.println("Erro, voce nao tem mais saldo, nao tem como sacar!!!");
                
            }else{
                this.saldo = this.saldo - saque;

            }

        }else{
            int linMenos = -200;

            if((saque+this.saldo) < linMenos){
                System.out.println("Erro, voce nao tem mais saldo, nao tem como sacar!!!! ");
            }else{
                this.saldo = this.saldo - saque;
            }
        }

    }

    public void verificaCartaoEspecial(){
        if(this.especial == true){
            System.out.println("Voce tem o cartao especial do nosso banco.");
        }else{
            System.out.println("Voce nao tem o cartao especial do nosso banco.");
        }
    }

    public void verSaldo(){
        System.out.println(this.saldo);
    }

}
