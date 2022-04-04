package vn.edu.ntu.intent_login;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView tvkq;
    int Request_Code = 8000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getSupportActionBar() !=null) {
            getSupportActionBar().setTitle("Man hinh chinh");
        }
        btn = (Button) findViewById(R.id.BtnLogin);
        tvkq = (TextView) findViewById(R.id.tvKq);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivityForResult(intent, Request_Code);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if(requestCode == 8000)
        if (resultCode == RESULT_OK)
        {
            String UserNameNhanDuoc = data.getStringExtra("US");
            tvkq.setText("Chao mung "+UserNameNhanDuoc);
        }
        else
            Toast.makeText(this, "Dang nhap that bai", Toast.LENGTH_LONG);
        else
        super.onActivityResult(requestCode, resultCode, data);
    }
}