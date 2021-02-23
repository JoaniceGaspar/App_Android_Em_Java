package com.janegasp.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

import static com.janegasp.sorteio.R.id.resultado;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void botaoSorteio(View v){
        int numeroSorteado = new Random().nextInt(21);
        TextView phrase = findViewById(resultado);
        phrase.setText("O número sorteado foi : " +numeroSorteado);

    }
}