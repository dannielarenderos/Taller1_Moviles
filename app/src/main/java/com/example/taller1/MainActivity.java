package com.example.taller1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvEntran;
    private TextView tvSalen;
    private Button entran;
    private Button salen;
    private int contadorEntran=0;
    private int contadorSalen=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvEntran= (TextView)findViewById(R.id.contador_entran_textview);
        entran=(Button)findViewById(R.id.botonEntran);
        tvSalen= (TextView)findViewById(R.id.contador_salen_textview);
        salen=(Button)findViewById(R.id.botonSalen);

        entran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorEntran++;
                tvEntran.setText(contadorEntran+"");
            }
        });

        salen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorSalen++;
                tvSalen.setText(contadorSalen+"");
            }
        });
    }

}
