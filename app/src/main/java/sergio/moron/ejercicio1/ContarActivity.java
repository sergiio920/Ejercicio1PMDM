package sergio.moron.ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ContarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contar);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if (bundle != null) {
            int caracteres = bundle.getInt("caracteres");
            int palabras = bundle.getInt("palabras");

            TextView txtCaracteres = findViewById(R.id.txtCaracteresContar);
            txtCaracteres.setText(String.valueOf(caracteres));

            TextView txtPalabras = findViewById(R.id.txtPalabrasContar);
            txtPalabras.setText(String.valueOf(palabras));
        }
    }
}