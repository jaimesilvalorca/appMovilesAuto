package com.example.auto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button btnGuardar,btnEliminar,btnAtras,btnSiguiente;
    private EditText etPatente,etMarca,etModelo,etCilindrada;

    private ArrayList<Auto> listaAuto = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        referencias();
        eventos();

    }

    public void eventos() {
        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String patente, marca, modelo, cilindrada;

                patente = etPatente.getText().toString();
                marca = etMarca.getText().toString();
                modelo = etModelo.getText().toString();
                cilindrada = etCilindrada.getText().toString();

                Auto auto = new Auto(patente, marca, modelo, cilindrada);

                Log.d("TAG", "Datos ---->" + auto.getPatente() +" "+ auto.getMarca() + " "+ auto.getModelo()+ " " + auto.getCilindrada());


            }
        });
    }

    public void referencias(){
        etPatente = findViewById(R.id.editTextPatente);
        etMarca = findViewById(R.id.editTextMarca);
        etModelo = findViewById(R.id.editTextModelo);
        etCilindrada = findViewById(R.id.editTextCilindrada);
        btnSiguiente =findViewById(R.id.buttonNext);
        btnAtras = findViewById(R.id.buttonPrevious);
        btnGuardar = findViewById(R.id.buttonSave);
        btnEliminar = findViewById(R.id.buttonDelete);


    }
}

