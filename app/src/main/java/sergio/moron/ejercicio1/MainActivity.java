package sergio.moron.ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtFrase;
    private Button btnContarCaracteres;
    private Button btnContarPalabras;
    private int caracteres;
    private int palabras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializarVista();
        btnContarCaracteres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caracteres = txtFrase.getText().length();
                Intent intent = new Intent(MainActivity.this, ContarActivity.class);
                Bundle bundle = new Bundle();
                bundle.putInt("caracteres", caracteres);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        btnContarPalabras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                palabras = txtFrase.getText().toString().split(" ").length;
                Intent intent = new Intent(MainActivity.this, ContarActivity.class);
                Bundle bundle = new Bundle();
                bundle.putInt("palabras", palabras);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }

    private void inicializarVista() {
        txtFrase = findViewById(R.id.txtFraseMain);
        btnContarCaracteres = findViewById(R.id.btnContarCaracteresMain);
        btnContarPalabras = findViewById(R.id.btnContarPalabrasMain);
    }
}