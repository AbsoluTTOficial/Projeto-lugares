package br.com.vini.usjt_ccp1an_bua_primeiro_projeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class ExibeMensagemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exibe_mensagem);
        TextView mensagemTextView = findViewById(R.id.mensagemTextView);
        Intent origemIntent = getIntent();
        String mensagem = origemIntent.getStringExtra("msg");
        mensagemTextView.setText(mensagem);

    }
}