package devandroid.kevin.calculadoraco2;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    private List listaCombustivel;

    public List getListaCombustivel(){
        listaCombustivel = new ArrayList<Calculadora>();

        listaCombustivel.add(new Calculadora("Etanol"));
        listaCombustivel.add(new Calculadora("Diesel"));
        listaCombustivel.add(new Calculadora("Gasolina Comum"));
        listaCombustivel.add(new Calculadora("Gasolina Aditivada"));
        listaCombustivel.add(new Calculadora("Gasolina Reformulada"));
        listaCombustivel.add(new Calculadora("Gasolina Premium/alta Octanagem"));


        return listaCombustivel;
    }
    public ArrayList<String> dadosParaSpinner(){

        ArrayList<String> dados = new ArrayList<>();

        for (int i = 0; i < getListaCombustivel().size(); i++) {

            Calculadora objeto =(Calculadora)getListaCombustivel().get(i);
            dados.add(objeto.getCombustivel());

        }

        return dados;


    }
}
