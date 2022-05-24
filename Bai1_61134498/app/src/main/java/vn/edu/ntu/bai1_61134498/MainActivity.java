package vn.edu.ntu.bai1_61134498;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edKq;
    EditText edCR;
    EditText edCD;
    Button btnHCN;
    EditText edCC;
    EditText edCanhDay;
    Button btnHBH;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edKq = (EditText) findViewById(R.id.edKq);
        edCR = (EditText) findViewById(R.id.edCR);
        edCD = (EditText) findViewById(R.id.edCD);
        btnHCN = (Button) findViewById(R.id.btnHCN);
        edCC = (EditText) findViewById(R.id.edCC);
        edCanhDay = (EditText) findViewById(R.id.edCDay);
        btnHBH = (Button) findViewById(R.id.btnHBH);
    }

    public void HCN (View v) {
        String CD = edCD.getText().toString();
        Double a = Double.parseDouble(CD);
        String CR = edCR.getText().toString();
        Double b = Double.parseDouble(CR);
        Double chuVi = (a+b)*2;
        String chuoiCV = String.valueOf(chuVi);
        edKq.setText(chuoiCV);
    }
    public void HBH (View v) {
        String CC = edCC.getText().toString();
        Double cc = Double.parseDouble(CC);
        String cDay = edCanhDay.getText().toString();
        Double cd = Double.parseDouble(cDay);
        Double dienTich = cc*cd;
        String chuoiDT = String.valueOf(dienTich);
        edKq.setText(chuoiDT);
    }
}