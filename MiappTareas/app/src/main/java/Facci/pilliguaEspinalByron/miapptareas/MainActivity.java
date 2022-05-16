package Facci.pilliguaEspinalByron.miapptareas;

import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText txtFahrenheitClase;
    EditText txtCentigradosClase;
    Button buttonConversionCenti;
    Button buttonConversionFahre;
    Button btnBorrado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Mi_primerproyecto", "Byron_Pilligua");
        buttonConversionCenti = (Button) findViewById(R.id.buttonConversionC);
        buttonConversionFahre = (Button) findViewById(R.id.buttonConversionF);
        btnBorrado = (Button) findViewById(R.id.btnBorrar);
        txtFahrenheitClase = (EditText) findViewById(R.id.txtFahrenheit);
        txtCentigradosClase = (EditText) findViewById(R.id.txtCentigrados);

        buttonConversionCenti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float valor = Float.parseFloat(txtFahrenheitClase.getText().toString());
                txtCentigradosClase.setText(String.valueOf(ConverterUtil.convertFahrenheit_Celsius(valor)));

            }
        });
        buttonConversionFahre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float valor2 = Float.parseFloat(txtCentigradosClase.getText().toString());
                txtFahrenheitClase.setText(String.valueOf(ConverterUtil.convertCelsius_Fahrenheit(valor2)));
            }
        });
        btnBorrado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtFahrenheitClase.setText("");
                txtCentigradosClase.setText("");
            }
        });

    }

    public static class ConverterUtil {

        public static float convertFahrenheit_Celsius(float fahrenheit) {
            return ((fahrenheit - 32) * 5 / 9);
        }

        public static float convertCelsius_Fahrenheit(float celsius) {
            return ((celsius * 9) / 5) + 32;
        }
    }

}

