package vn.edu.ntu.mycaculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Khai bao cac doi tuong lam viec
    EditText editSoA, editSoB;
    TextView textViewKetQua;
    Button nutCong, nutTru, nutNhan, nutChia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimWiget();
    }
    void TimWiget() {
        editSoA = (EditText) findViewById(R.id.edSoA);
        editSoB = (EditText) findViewById(R.id.edSoB);
        textViewKetQua = (TextView) findViewById(R.id.tvKetQua);
        nutCong = (Button) findViewById(R.id.BtnCong);
        nutTru = (Button) findViewById(R.id.BtnTru);
        nutNhan = (Button) findViewById(R.id.BtnNhan);
        nutChia = (Button) findViewById(R.id.BtnChia);
    }
    // Ham xu ly cong
    public void XuLyCong (View v) {
        // Lay du lieu
        String sA = editSoA.getText().toString();
        String sB = editSoB.getText().toString();
        //Chuyen doi kieu so
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        // Tinh tong
        int tong = a + b;
        // Chuyen tong thanh chuoi
        String chuoiTong = String.valueOf(tong);
        // Xuat ket qua
        textViewKetQua.setText("" + chuoiTong);
    }
    // Ham xu ly tru
    public void XuLyTru (View v) {
        // Lay du lieu
        String sA = editSoA.getText().toString();
        String sB = editSoB.getText().toString();
        //Chuyen doi kieu so
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        // Tinh hieu
        int tru = a - b;
        // Chuyen Hieu thanh chuoi
        String chuoiHieu = String.valueOf(tru);
        // Xuat ket qua
        textViewKetQua.setText("" + chuoiHieu);
    }
    // Ham xu ly nhan
    public void XuLyNhan (View v) {
        // Lay du lieu
        String sA = editSoA.getText().toString();
        String sB = editSoB.getText().toString();
        //Chuyen doi kieu so
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        // Tinh nhan
        int nhan = a * b;
        // Chuyen nhan thanh chuoi
        String chuoiNhan = String.valueOf(nhan);
        // Xuat ket qua
        textViewKetQua.setText("" + chuoiNhan);
    }
    // Ham xu ly chia
    public void XuLyChia (View v) {
        // Lay du lieu
        String sA = editSoA.getText().toString();
        String sB = editSoB.getText().toString();
        //Chuyen doi kieu so
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        // Tinh thuong
        int thuong = a / b;
        // Chuyen thuong thanh chuoi
        String chuoiThuong = String.valueOf(thuong);
        // Xuat ket qua
        textViewKetQua.setText("" + chuoiThuong);
    }
    public void ketQua (View v)
    {

    }
}
