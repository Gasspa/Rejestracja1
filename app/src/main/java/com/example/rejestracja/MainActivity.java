package com.example.rejestracja;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText Email;
    private EditText password;
    private EditText confirmpassword;
    private Button confirm;
    private TextView alert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Email = findViewById(R.id.Email);
        password = findViewById(R.id.password);
        confirmpassword = findViewById(R.id.confirmpassword);
        confirm = findViewById(R.id.confirm);
        alert = findViewById(R.id.alert);

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = Email.getText().toString().trim();
                String psswrd = password.getText().toString().trim();
                String confirmpass = confirmpassword.getText().toString().trim();

                if(!isValidEmail(email)){
                    alert.setText("Niepoprawny Email");
                }else if(!confirmpass.equals(psswrd)){
                    alert.setText("Hasła się różnią");
                }else{
                    alert.setText("Witaj" + email);
                }
            }
        });
    }
    public boolean isValidEmail(String email){
        return email.contains("@");
    }
}