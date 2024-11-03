package controller;

import android.content.SharedPreferences;
import android.util.Log;

import androidx.annotation.NonNull;

import model.Combustivel;
import view.GasEtaActivity;

public class CombustivelController {

    SharedPreferences preferences;

    SharedPreferences.Editor dadosPreferences;

    public static final String NOME_PREFERENCES = "pref_gaseta";

    public CombustivelController(GasEtaActivity activity){
        preferences = activity.getSharedPreferences(NOME_PREFERENCES, 0);
        dadosPreferences = preferences.edit();
    }
    public void salvar(Combustivel combustivel){

        dadosPreferences.putString("combustivel", combustivel.getNomeDoCombustivel());
        dadosPreferences.putFloat("precoDoCombustivel",(float)combustivel.getPrecoDoCombustivel());
        dadosPreferences.putString("recomendacao", combustivel.getRecomendacao());
        dadosPreferences.apply();

    }
    public void limpar(){

        dadosPreferences.clear();
        dadosPreferences.apply();
    }
}
