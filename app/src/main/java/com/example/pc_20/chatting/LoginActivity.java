package com.example.pc_20.chatting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class LoginActivity extends AppCompatActivity {

    EditText login_id;
    EditText login_pw;
    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        login_id = findViewById(R.id.login_id);
        login_pw = findViewById(R.id.login_pw);
        btn_login = findViewById(R.id.btn_login);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(login_id.getText().toString().equals("연상") && login_pw.getText().toString().equals("1234")){
                    Intent intent = new Intent(LoginActivity.this, ChatActivity.class);
                    intent.putExtra("id", login_id.getText().toString());
                    startActivity(intent);
                    finish();
                }else if(login_id.getText().toString().equals("찡찡이") && login_pw.getText().toString().equals("1234")){
                    Intent intent = new Intent(LoginActivity.this, ChatActivity.class);
                    intent.putExtra("id", login_id.getText().toString());
                    startActivity(intent);
                    finish();
                }else{
                    Toast.makeText(getApplicationContext(), "로그인에 실패했어요.", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
