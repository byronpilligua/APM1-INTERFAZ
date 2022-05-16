package com.example.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editTextUsuario, getEditTextContraseña;
    Button buttonEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextUsuario=findViewById(R.id.editTexUsuario);
        getEditTextContraseña=findViewById(R.id.editTexContraseña);
        buttonEnviar=findViewById(R.id.buttonEnviar);

        buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("Datos",editTextUsuario.getText().toString());

                Intent intent1=new Intent(MainActivity.this,segundaP.class);
                startActivity(intent1);


            }
        });




    }
}