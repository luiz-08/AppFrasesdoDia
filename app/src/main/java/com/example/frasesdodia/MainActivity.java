package com.example.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){  //Crio um método gerarnovafrase e chamo ele no meu botão


        String [] frases = {  //Array (lista) que contem as minhas frases
                "Marcos 11:24  \n Por isso, vos digo que tudo o que pedirdes, orando, crede que o recebereis e tê-lo-eis.",

                "Jó 42:5  \n Meus ouvidos já tinham\n" +
                        "ouvido a teu respeito,\n" +
                        "mas agora os meus olhos te viram.",

                "1 Pedro 5:8  \n Estejam alertas e vigiem. O Diabo, o inimigo de vocês, anda ao redor como leão, rugindo e procurando a quem possa devorar.",

                "Isaías 43:2  \n Quando passares pelas águas estarei contigo, e quando pelos rios, eles não te submergirão; quando passares pelo fogo, não te queimarás, nem a chama arderá em ti."

        };

        int numero = new Random().nextInt(4);  // Gera um numero aleatorio de 0 a 4 e armaneza a minha variavel Numero

        TextView texto = findViewById(R.id.textResultado);
        texto.setText(frases[numero]); //o textview seta o valor da variavel Numero que corresponde a uma frase (posição) da minha lista

    }


}