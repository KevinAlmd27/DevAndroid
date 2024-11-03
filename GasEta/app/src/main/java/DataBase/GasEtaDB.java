package DataBase;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class GasEtaDB extends SQLiteOpenHelper {

    public static final String DB_NAME = "gaseta.db";

    public static final int  DB_VERSION = 1;

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

    //Criar métodos para implemetar um CRUD
    // C = Creat criar o banco de daodos e as tabelas
    // Create database nome_do_banco_de_dados.db(SQL)
    //1 - Nome do Banco de Dados
    //2- Versão do Banco de Dados


    // Create table

    // R = Retrieve recuperar os dados salvos as tabelas
    // select * from table(SQL)

    // U = Update alterar os dados que já existem em um registro na tabela
    // Update from table(SQL)

    //D = Delete deletar os dados/registros de uma tabela
    // Delete from (SQL)

}
