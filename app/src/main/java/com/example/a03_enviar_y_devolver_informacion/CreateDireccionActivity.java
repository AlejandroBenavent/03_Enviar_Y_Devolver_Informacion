package com.example.a03_enviar_y_devolver_informacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.a03_enviar_y_devolver_informacion.modelos.Direccion;

public class CreateDireccionActivity extends AppCompatActivity {

    private EditText txtCalle;
    private EditText txtNumero;
    private EditText txtCiudad;
    private Button btnCrear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_direccion);
        inicializaVista();

        btnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {                                //Debemos pasar el String a int por que el atributo esta asi
                Direccion dir = new Direccion(txtCalle.getText().toString(), Integer.parseInt(txtNumero.getText().toString()),txtCiudad.getText().toString());
                //Cosassss......
                Intent intent = new Intent(); // Esto es solo para poder pasar la informacion de una actividad a otra ya que no inicia ninguna nueva actividad
                Bundle bundle = new Bundle();
                bundle.putSerializable("DIR",dir);
                intent.putExtras(bundle);
                setResult( RESULT_OK, intent);
                finish();
            }
        });
    }

    private void inicializaVista() {
        txtCalle = findViewById(R.id.txtCalleCreateDir);
        txtCiudad = findViewById(R.id.txtCiudadCreateDir);
        txtNumero = findViewById(R.id.txtNumeroCreateDir);
        btnCrear = findViewById(R.id.btnCrearCreateDir);
    }
}