public class App {
    public static void main(String[] args){
        
        ContaC conta = new ContaC();

        conta.setNome("Roberval Peres da Silva");
        conta.setEspecial(true);
        conta.setLimite(6000.00);
        conta.setSaldo(1000);


        conta.depositar(1000.00);
        conta.verSaldo();

        conta.depositar(4200);
        conta.verSaldo();

        conta.sacar(6000);
        conta.verSaldo();

        conta.sacar(500);
        conta.verSaldo();

        conta.sacar(500);
        conta.verSaldo();

        conta.sacar(100);
        conta.verSaldo();

        conta.verificaCartaoEspecial();



    }
}
