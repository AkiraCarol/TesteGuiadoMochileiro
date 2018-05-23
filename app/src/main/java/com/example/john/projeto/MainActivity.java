package com.example.john.projeto;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static EditText usuario, senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cadastrarUsuario(View view) {
        Intent cadastrarUsuario = new Intent(this, Cadastrar.class);
        startActivity(cadastrarUsuario);
    }
    public void loginUsuario(View view) {

        EditText edUsuario = (EditText) findViewById(R.id.etUsuario);
        EditText edSenha = (EditText) findViewById(R.id.etSenha);
        String usuario = edUsuario.getText().toString();
        String senha = edSenha.getText().toString();

        if(edUsuario.getText().length() == 0){
            edUsuario.setError("Campo vazio");
        }
        if(edSenha.getText().length() == 0){
            edSenha.setError("Campo vazio");
        }

        if((usuario.equals("adm")) && (senha.equals("adm"))){
            Context contexto = getApplicationContext();
            String texto = "Login efetuado sucesso";
            int duracao = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(contexto, texto,duracao);
            toast.show();

            Intent login = new Intent(this, Inicio.class);
            startActivity(login);
        }
        else{
            Context contexto = getApplicationContext();
            String texto = "Login ou senha invalido";
            int duracao = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(contexto, texto,duracao);
            toast.show();
        }
    }
}
