package com.example.a03_enviar_y_devolver_informacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;

import com.example.a03_enviar_y_devolver_informacion.modelos.Usuario;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText txtEmail;
    private EditText txtPassword;
    private Button btnDescifrar;
    private Button btnCrearDireccion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializarVistas();

        btnDescifrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = txtEmail.getText().toString();
                String password = txtPassword.getText().toString();
                Intent intent = new Intent(MainActivity.this, DescifrarActivity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("USER", new Usuario(email,password));
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        
        btnCrearDireccion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    private void inicializarVistas() {
        txtEmail = findViewById(R.id.txtEmailMain);
        txtPassword = findViewById(R.id.txtPasswordMain);
        btnDescifrar = findViewById(R.id.btnDescifrarMain);
        btnCrearDireccion = findViewById(R.id.btnCrearDireccionMain);
    }
}