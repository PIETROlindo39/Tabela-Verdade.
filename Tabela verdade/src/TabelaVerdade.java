public class TabelaVerdade {
    public static void main(String[] args){
        double salarioAnual = 70000;
        double descontoImposto;
        double taxa1 = 0.0970;
        double taxa2 = 0.3735;
        double taxa3 = 0.4950;
        if(salarioAnual < 34711){
            descontoImposto = salarioAnual * taxa1;
        }else if(salarioAnual >= 34713 && salarioAnual <= 68507){
            descontoImposto = salarioAnual * taxa2;
        }else{
            descontoImposto = salarioAnual * taxa3;
        }
        System.out.println(descontoImposto);
    }
}
