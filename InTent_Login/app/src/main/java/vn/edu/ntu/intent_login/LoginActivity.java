package vn.edu.ntu.intent_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        if (getSupportActionBar() !=null) {
            getSupportActionBar().setTitle("Man hinh dang nhap");
        }
        EditText edUS = (EditText) findViewById(R.id.edUsername);
        EditText edPW = (EditText) findViewById(R.id.edPass);
        EditText edEM = (EditText) findViewById(R.id.edEmail);
        Button btnOK = (Button) findViewById(R.id.btnOK);
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Usernew = edUS.getText().toString();
                String Passnew = edPW.getText().toString();
                String Emailnew = edEM.getText().toString();
                Intent intent =  new Intent();
                intent.putExtra("US", Usernew);
                intent.putExtra("PW", Passnew);
                intent.putExtra("EM", Emailnew);
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}