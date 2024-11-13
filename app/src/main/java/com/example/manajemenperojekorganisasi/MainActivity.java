package com.example.manajemenperojekorganisasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText email, password;
    TextView label, lupa_pasword;
    Button login_button;
    @Override
    
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = findViewById(R.id.input_email);
        password = findViewById(R.id.input_password);
        label = findViewById(R.id.label_login);
        login_button = findViewById(R.id.masuk);
        lupa_pasword = findViewById(R.id.lupapassword);


    //ini inten ke home jika kondisi semua edit teks nya benar

        login_button.setOnClickListener(v ->{
            if ((email.getText().toString().equals("faisal fajar"))
                    && (password.getText().toString().equals("faisal"))) {

                label.setText("login berhasil");
                Intent home = new Intent(getApplicationContext(), MainHome.class);
                startActivity(home);

            } else {

                label.setText("login gagal");

            }
        });

    //inten even teksview lupa password di klik

        lupa_pasword.setOnClickListener(v ->{

        });
    }
}