package vn.edu.ntu.bai19_61134498;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvTinhThanh;
    ArrayList<TinhThanh> mangTinhThanh;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvTinhThanh = (ListView) findViewById(R.id.listViewTinhThanh);
        textView = (TextView) findViewById(R.id.tvKq);
        mangTinhThanh = new ArrayList<TinhThanh>();
        mangTinhThanh.add(new TinhThanh(R.drawable.qdc, "Ha Noi"));
        mangTinhThanh.add(new TinhThanh(R.drawable.ngoisao, "Hue"));
        mangTinhThanh.add(new TinhThanh(R.drawable.ngoisao, "spa"));
        mangTinhThanh.add(new TinhThanh(R.drawable.qdc, "Con Son"));
        mangTinhThanh.add(new TinhThanh(R.drawable.qdc, "Vung Tau"));
        mangTinhThanh.add(new TinhThanh(R.drawable.qdc, "Da Nang"));
        TinhThanhAdapter anAdapter = new TinhThanhAdapter(MainActivity.this, R.layout.dong_tinh_thanh, mangTinhThanh);
        lvTinhThanh.setAdapter(anAdapter);
        lvTinhThanh.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                textView.setText("" + adapterView.getItemAtPosition(i));
            }
        });
    }
}