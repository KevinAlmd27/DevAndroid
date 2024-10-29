package controller;

import android.content.SharedPreferences;
import android.util.Log;

import androidx.annotation.NonNull;

import model.Pessoa;
import view.MainActivity;

public class PessoaController {

    SharedPreferences preferences;
    SharedPreferences.Editor listaVip;

    public static final String NOME_PREFENCES = "pref_listavip";

    public PessoaController(MainActivity mainActivity) {
        preferences = mainActivity.getSharedPreferences(NOME_PREFENCES, 0);
        listaVip = preferences.edit();

    }

    @NonNull
    @Override
    public String toString() {
        return super.toString();
    }

    public void salvar(Pessoa pessoa) {
        Log.i("MVC_Controller", "Salvo: " + pessoa.toString());

        listaVip.putString("primeiroNome", pessoa.getPrimeiroNome());
        listaVip.putString("sobrenome", pessoa.getSobrenome());
        listaVip.putString("nomeCurso", pessoa.getCursoDesejado());
        listaVip.putString("telefoneContato", pessoa.getTelefoneContato());
        listaVip.apply();
    }

    public Pessoa buscar(Pessoa pessoa) {

        pessoa.setPrimeiroNome(preferences.getString("primeiroNome", "NA"));
        pessoa.setSobrenome(preferences.getString("sobrenome", "NA"));
        pessoa.setCursoDesejado(preferences.getString("nomeCurso", "NA"));
        pessoa.setTelefoneContato(preferences.getString("telefoneContato", "NA"));
        return pessoa;
    }

    public void limpar() {
        listaVip.clear();
        listaVip.apply();
    }
}

