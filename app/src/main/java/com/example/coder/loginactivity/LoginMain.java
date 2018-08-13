package com.example.coder.loginactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginMain extends AppCompatActivity {
    EditText editText1, editText2;
    String text1,text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_main);
    }

    public void Pindah(View view) {
        editText1 = findViewById(R.id.edittext_username);
        editText2 = findViewById(R.id.edittext_password);
        text1 = editText1.getText().toString();
        text2 = editText2.getText().toString();
        if((text1.contains("yazidihsan1@gmail.com")) && (text2.contains("135246"))) {
            Toast.makeText(this, "Login Sukses", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(LoginMain.this, ListMakanan.class);
            startActivity(intent);
        }else if((text1.matches("")||text2.matches(""))){
            Toast.makeText(this, "Isikan Username dan Password", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this,"Login Gagal /Username Password Salah", Toast.LENGTH_SHORT).show();
        }
    }
}
