package com.example.actividad1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnSaludar;
    private EditText txtNombre;
    private TextView lblSaludar;
    private Button btnLimpiar;
    private Button btnSalir;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // relacionar los objetos
        btnSaludar = (Button) findViewById(R.id.btnSaludo);
        txtNombre = (EditText) findViewById(R.id.txtSaludo2);
        lblSaludar = (TextView) findViewById(R.id.lblSaludo);
        btnLimpiar = (Button) findViewById(R.id.btnLimpio);
        btnSalir = (Button) findViewById(R.id.btnSal);

        // Presionar Botón Saludar
        btnSaludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtNombre.getText().toString().matches("")){
                    Toast.makeText(MainActivity.this,"Escriba un nombre",Toast.LENGTH_SHORT).show();
                } else {
                    String str = "hola " + txtNombre.getText().toString() + " como estas?";
                    lblSaludar.setText(str);
                }
            }
        });

        // Presionar Botón Limpiar
        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lblSaludar.setText("");
            }
        });

        // Presionar Botón Salir
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                finish();
                System.exit(0);
            }
        });

    }
}