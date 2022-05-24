package vn.edu.ntu.bai2_61134498;


import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvBaiTho;
    EditText edBT;
    Button btnThem;
    Button btnCapNhat;
    ArrayList<String> arrayBaiTho = new ArrayList<>();
    int vitri = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvBaiTho = (ListView) findViewById(R.id.lvBT);
        edBT = (EditText) findViewById(R.id.edBT);
        btnThem = (Button) findViewById(R.id.btnThem);
        btnCapNhat = (Button) findViewById(R.id.btnCapNhat);
        arrayBaiTho.add("Việt Nam Quê Hương Ta");
        arrayBaiTho.add("Quê Hương");
        arrayBaiTho.add("Đường Về Quê Mẹ");
        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, arrayBaiTho);
        lvBaiTho.setAdapter(adapter);

        btnThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String baiTho = edBT.getText().toString();
                arrayBaiTho.add(baiTho);
                adapter.notifyDataSetChanged();
            }
        });

        lvBaiTho.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                edBT.setText(arrayBaiTho.get(i));
                vitri = i;
            }
        });
        btnCapNhat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayBaiTho.set(vitri, edBT.getText().toString());
                adapter.notifyDataSetChanged();
            }
        });
        lvBaiTho.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                arrayBaiTho.remove(i);
                adapter.notifyDataSetChanged();
                return false;
            }
        });
    }
}