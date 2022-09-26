package com.example.a03_enviar_y_devolver_informacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.a03_enviar_y_devolver_informacion.modelos.Usuario;

public class DescifrarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descifrar);

        //Esto es para poder recoger los datos del la anterior actividad
        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();

        if (bundle != null){
           /* String password = bundle.getString("PASS");
            String email = bundle.getString("EMAIL");
            Usuario user = new Usuario(email,password);*/
            Usuario user = (Usuario) bundle.getSerializable("USER");
            Toast.makeText(this, user.toString(), Toast.LENGTH_SHORT).show();
        }
    }
}