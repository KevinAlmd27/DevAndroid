package DataBase;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

import model.Combustivel;

public class GasEtaDB extends SQLiteOpenHelper {

    private static final String DB_NAME = "gaseta.db";

    private static final int  DB_VERSION = 1;

    Cursor cursor;

    SQLiteDatabase db;

    public GasEtaDB(Context context) {
        super(context, DB_NAME, null, DB_VERSION);

        db = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        // QUERY SQL para Criar uma tabela
        String sqlTabelaCarro
                = "CREATE TABLE veiculo (id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "nomeDoCarro TEXT, " +
                "placa TEXT)";

        String sqlTabelaCombustivel
                = "CREATE TABLE Combustivel (id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "nomeDoCombustivel TEXT, " +
                "precoDoCombustivel REAL, " +
                "recomendacao TEXT)";


            db.execSQL(sqlTabelaCombustivel);
            db.execSQL(sqlTabelaCarro);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {}

    public void salvarObjeto(String tabela, ContentValues dados){

        db.insert(tabela,null,dados);

    }

    public List<Combustivel> listarDados(){

        List<Combustivel> lista = new ArrayList<>();

        //represents um registro que está salvo na tabela
        //Combustivel do Banco de Dados da Aplicação
        Combustivel registro

        String querySQL = "SELECT*FROM Combustivel";

        
        return lista;
    }

}
