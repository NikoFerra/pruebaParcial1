package com.pruebap1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView usu,cont;
    Button btn1;
    String con;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        cont = (EditText) findViewById(R.id.cjn_cont);
        btn1 = (Button)findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cont.equals("admi123"))
                {
                    Intent I = new Intent(getApplicationContext(),part2.class);
                    startActivity(I);
                }else{
                    Toast.makeText(getApplicationContext(),"usuario-contraseña incorrecta",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}