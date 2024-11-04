package devandroid.kevin.calculadoradeco2;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    Controller calculadoraEmissao;
    Calculadora calculadora;

    public List listaCombustivel;

    public List getListaCombustivel() {

        List listaCombustivel = new ArrayList<Calculadora>();

        listaCombustivel.add(new Calculadora("Gasolina Comum", 2.31));
        listaCombustivel.add(new Calculadora("Gasolina Aditivada", 2.31));
        listaCombustivel.add(new Calculadora("Gasolina Premium", 2.31));
        listaCombustivel.add(new Calculadora("Gasolina Formulada", 2.31));
        listaCombustivel.add(new Calculadora("Etanol/Gasolina Flex", 2.07));

        return listaCombustivel;
    }

    public ArrayList<String> dadosSpinner() {

        ArrayList<String> dados = new ArrayList<>();

        for (int i = 0; i < getListaCombustivel().size(); i++) {

            Calculadora objeto = (Calculadora) getListaCombustivel().get(i);
            dados.add(objeto.getTipoGasolina());
        }

        return dados;
    }



    }

