package view;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import apoio.UtilGasEta;
import devandroid.kevin.appgaseta.R;
import model.Combustivel;

public class GasEtaActivity extends AppCompatActivity {

    Combustivel combustivelGasolina;
    Combustivel combustivelEtanol;

    TextView txtResultado;

    EditText editGasolina;
    EditText editEtanol;

    Button btnCalcular;
    Button btnSalvar;
    Button btnLimpar;
    Button btnFinalizar;

    double precoGasolina;
    double precoEtanol;
    String recomendacao;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Combustivel combustivel = new Combustivel();

        setContentView(R.layout.activity_gaseta);

        //  utilGasEta.metodoEstatico();
        //    utilGasEta.metodoNaoEstatico();

        Toast.makeText(GasEtaActivity.this,
                UtilGasEta.calcularMelhorOpcao(5.12, 3.39),
                Toast.LENGTH_LONG).show();


        txtResultado = findViewById(R.id.txtResultado);

        editEtanol = findViewById(R.id.editEtanol);
        editGasolina = findViewById(R.id.editGasolina);

        btnCalcular = findViewById(R.id.btnCalcular);
        btnFinalizar = findViewById(R.id.btnFinalizar);
        btnLimpar = findViewById(R.id.btnLimpar);
        btnSalvar = findViewById(R.id.btnSalvar);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                boolean isDadosOk = true;

                if (TextUtils.isEmpty(editGasolina.getText())) {
                    editGasolina.setError("* Obrigatorio");
                    editGasolina.requestFocus();
                    isDadosOk = false;
                }
                if (TextUtils.isEmpty(editEtanol.getText())) {
                    editEtanol.setError("* Obrigatorio");
                    editEtanol.requestFocus();
                    isDadosOk = false;
                }
                if (isDadosOk) {

                    precoGasolina = Double.parseDouble(editGasolina.getText().toString());
                    precoEtanol = Double.parseDouble(editEtanol.getText().toString());

                    recomendacao = UtilGasEta.calcularMelhorOpcao(precoGasolina, precoEtanol);

                    txtResultado.setText(recomendacao);

                } else {
                    Toast.makeText(GasEtaActivity.this, "Por Favor Digite os Dados Obrigatorios", Toast.LENGTH_LONG).show();
                }

            }
        });
        btnFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(GasEtaActivity.this, "Volte Sempre", Toast.LENGTH_LONG).show();
                finish();
            }
        });
        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editEtanol.setText("");
                editGasolina.setText("");

            }
        });
        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //TODO: Desabilitar o botão salvar.
                combustivelGasolina = new Combustivel();
                combustivelEtanol = new Combustivel();

                combustivelGasolina.setNomeDoCombustivel("Gasolina");
                combustivelGasolina.setPrecoDoCombustivel(precoGasolina);

                combustivelEtanol.setNomeDoCombustivel("Etanol");
                combustivelEtanol.setPrecoDoCombustivel(precoEtanol);

                combustivelGasolina.setRecomendacao(UtilGasEta.calcularMelhorOpcao(precoGasolina, precoEtanol));
                combustivelEtanol.setRecomendacao(UtilGasEta.calcularMelhorOpcao(precoGasolina, precoEtanol));

                int parada = 0;
            }
        });

    }
}

