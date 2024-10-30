package apoio;

public class UtilGasEta {

    public static void metodoNaoEstatico(){}

    public void metodoEstatico(){}

    public static String mensagem(){
        return "Qualquer Mensagem";
    }

    public static double preco(){
        return  9.99;
    }
    public static String calcularMelhorOpcao(double gasolina, double etanol){

        double precoIdeal = gasolina * 0.70;
        String mensagemDeRetorno;

        if(etanol<=precoIdeal){
            mensagemDeRetorno = "Abastecer com Etanol";
        }else{
            mensagemDeRetorno = "Abastecer com Gasolina";
        }
        return mensagemDeRetorno;

    }
}
