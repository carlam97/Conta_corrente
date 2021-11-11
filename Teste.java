public class Teste {
    public static void main(String[] args) {

        ContaCorrente conta=new ContaCorrente();
        conta.setSaldo(100);
        conta.deposita(1100);
        conta.saca(2000);

        System.out.println("Saldo atual: "+conta.getSaldo());
        System.out.println("Limite utilizado: "+conta.getLimite());
        if(conta.getLimite()<0){
            System.out.println("Cheque especial");      
        } else{
            System.out.println("Saldo azul");
        }
        
        
    }
    
}

