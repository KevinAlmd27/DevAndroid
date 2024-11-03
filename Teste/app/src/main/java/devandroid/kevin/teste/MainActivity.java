package devandroid.kevin.teste;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import devandroid.kevin.empresa.Empresa;


public class MainActivity extends AppCompatActivity {

    Empresa empresa;
    Empresa outraEmpresa;

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

        empresa = new Empresa();
        empresa.setEmpresa("Magazine Luiza");
        empresa.setNomeVendador("Vinicius");
        empresa.setCargo("Vendedor");
        empresa.setId("22554477");
        empresa.setProduto("Abajur");


        outraEmpresa = new Empresa();
        outraEmpresa.setEmpresa("CasasBahia");
        outraEmpresa.setNomeVendador("Claudio");
        outraEmpresa.setCargo("Consultor de Vendas");
        outraEmpresa.setId("55487565");
        outraEmpresa.setProduto("Telefone");


        Log.i("Empresas","Objeto Empresa: "+empresa.toString());
        Log.i("Empresas","Objeto outraEmpresa: "+outraEmpresa.toString());


    }
}