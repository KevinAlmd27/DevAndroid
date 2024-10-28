package controller;

import android.util.Log;

import androidx.annotation.NonNull;

import model.Pessoa;

public class PessoaController {

    @NonNull
    @Override
    public String toString() {

        Log.d("MVC_Controler","Controller iniciada");
        return super.toString();
    }

    public void salvar(Pessoa pessoa) {
        Log.i("MVC_Controler","Salvo: "+pessoa.toString());
    }
}
