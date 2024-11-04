package devandroid.kevin.calculadoradeco2;

devandroid.kevin.calculadoradeco2.Controller;

import java.util.List;

public class Calculadora {

    List<String> combustivel;
    public void Calculadora() {
    }

    private String tipoGasolina;
    private double fatorEmissao;
    private double litros;
    private double quilometros;

    public Calculadora(String tipoGasolina, double fatorEmissao) {
        this.fatorEmissao = fatorEmissao;
        this.tipoGasolina = tipoGasolina;
    }

    public double getFatorEmissao() {
        return fatorEmissao;
    }

    public void setFatorEmissao(double fatorEmissao) {
        this.fatorEmissao = fatorEmissao;
    }

    public String getTipoGasolina() {
        return tipoGasolina;
    }

    public void setTipoGasolina(String tipoGasolina) {
        this.tipoGasolina = tipoGasolina;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public double getQuilometros() {
        return quilometros;
    }

    public void setQuilometros(double quilometros) {
        this.quilometros = quilometros;
    }

    public void Calcular(double litros, double quilometros) {

    }

    public double emissaoCO2(String tipoCombustivel, double litros) {


    }
}