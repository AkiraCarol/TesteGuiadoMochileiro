package com.example.john.projeto;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class EditarComentario extends AppCompatActivity {

    private String[] avaliacao = new String[]{"★","★★","★★★","★★★★","★★★★★"};

    private Spinner sp;

    public static EditText comentario, dtvisita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_comentario);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, avaliacao);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        sp = (Spinner) findViewById(R.id.spinner2);
        sp.setAdapter(adapter);

        EditText edComentario = (EditText) findViewById(R.id.etComentario);
        EditText edDtvisita = (EditText) findViewById(R.id.edDtVisita);

        if(edComentario.getText().length() == 0){
            edComentario.setError("Campo vazio");
        }
        if(edDtvisita.getText().length() == 0){
            edDtvisita.setError("Campo vazio");
        }

        if((comentario.length() > 2) && (dtvisita.length() > 2)) {
            Context contexto = getApplicationContext();
            String texto = "Comentário alterado com sucesso";
            int duracao = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(contexto, texto,duracao);
            toast.show();
            finish();
        }
    }
}
