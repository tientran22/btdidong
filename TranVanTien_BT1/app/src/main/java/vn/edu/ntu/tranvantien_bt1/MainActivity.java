package vn.edu.ntu.tranvantien_bt1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText edUs = (EditText) findViewById(R.id.edUS);
        EditText edPw = (EditText) findViewById(R.id.edPW);
        Button btn = (Button) findViewById(R.id.Btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edUs.getText().toString().equals("maicuongtho") && edPw.getText().toString().equals("Cntt60ntu")) {
                    Toast.makeText(MainActivity.this, "User and Password is correct",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "User and Password is not correct",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}