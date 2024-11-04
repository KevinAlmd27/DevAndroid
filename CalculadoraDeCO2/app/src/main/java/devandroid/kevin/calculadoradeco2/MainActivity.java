package devandroid.kevin.calculadoradeco2;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<String> combustiveis;

    Controller controller;

    private double distancia;
    private String tipoGasolina;
    private double litros;

    Spinner spinner;

    EditText editConsumoPorLitro;
    EditText editLitrosAbastecidos;

    Button btnCalcular;

    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        EditText editDistancia = findViewById(R.id.editConsumoPorLitro);
        EditText editLitroAbastecidos = findViewById(R.id.editLitrosAbastecidos);

        Button btnCalcular = findViewById(R.id.btn_Calcular);

        TextView txtResultado = findViewById(R.id.txtResultado);

        Controller  controller = new Controller();
        combustiveis = Controller.();
        spinner = findViewById(R.id.spinner);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,
                controller.dadosSpinner());
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_1);

        spinner.setAdapter(adapter);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

              boolean isDadosOk = true;


                if(TextUtils.isEmpty(editDistancia.getText())){
                editDistancia.setError(" Obrigatorio");
                editDistancia.requestFocus();
                isDadosOk = false;
              }
              if(TextUtils.isEmpty(editLitrosAbastecidos.getText())){
                  editLitroAbastecidos.setText(" Obrigatorio");
                  editLitroAbastecidos.requestFocus();
                  isDadosOk = false;
              }
              if(isDadosOk){

                    distancia = Double.parseDouble(editDistancia.getText().toString());
                    litros = Double.parseDouble(editLitroAbastecidos.getText().toString());
                    tipoGasolina = spinner.getSelectedItem().toString();






              }


            }
        });

    }
}