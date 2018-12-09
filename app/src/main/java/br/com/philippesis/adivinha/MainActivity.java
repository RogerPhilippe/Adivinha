package br.com.philippesis.adivinha;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button btn_jogar;
    private TextView txt_num_sort;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_jogar = (Button) findViewById(R.id.id_btn_jogar);
        txt_num_sort = (TextView) findViewById(R.id.id_txt_num_sort);

        btn_jogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Sortear um número de 0 á 10 e exibir na tela atraves do textView txt_num_sort
                Random sorteio = new Random();
                Integer numeroSorteado = sorteio.nextInt(10) + 1;
                txt_num_sort.setText("Numero Sorteado: "+numeroSorteado);

            }
        });

    }
}
