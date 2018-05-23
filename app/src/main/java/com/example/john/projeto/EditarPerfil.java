package com.example.john.projeto;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class EditarPerfil extends AppCompatActivity {

    public static EditText usuario, email, senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_perfil);

        EditText edUsuario = (EditText)findViewById(R.id.etUsuario);
        EditText edEmail = (EditText)findViewById(R.id.etEmail);
        EditText edSenha = (EditText)findViewById(R.id.etSenha);
        String usuario = edUsuario.getText().toString();
        String email = edEmail.getText().toString();
        String senha = edSenha.getText().toString();

        if(edUsuario.getText().length() == 0){
            edUsuario.setError("Campo vazio");
        }
        if(edEmail.getText().length() == 0) {
            edEmail.setError("Campo vazio");
        }
        if(edSenha.getText().length() == 0){
            edSenha.setError("Campo vazio");
        }

        if((usuario.length() > 2) && (email.length() > 2) && (senha.length() > 2) ) {
            Context contexto = getApplicationContext();
            String texto = "Usuário alterado com sucesso";
            int duracao = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(contexto, texto,duracao);
            toast.show();
            finish();
        }
    }
}
