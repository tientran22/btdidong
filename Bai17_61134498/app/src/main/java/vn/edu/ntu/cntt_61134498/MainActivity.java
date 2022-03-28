package vn.edu.ntu.cntt_61134498;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listview;
    ArrayAdapter<String> adapter;
    Button button;
    ArrayList<String> listdata;
    EditText editText;
    TextView textViewKetQua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview = (ListView) findViewById(R.id.listview);
        textViewKetQua = (TextView) findViewById(R.id.tvkq);
        editText = (EditText) findViewById(R.id.EdText);
        button = (Button) findViewById(R.id.btn);

        listdata = new ArrayList<>();
        listdata.add("teo");
        listdata.add("ty");
        listdata.add("bin");
        adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, listdata);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                textViewKetQua.setText("position : " + adapterView.getItemIdAtPosition(i)+ ";value = " + adapterView.getItemAtPosition(i));
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String item = editText.getText().toString().trim();
                listdata.add(item);
                adapter.notifyDataSetChanged();
            }
        });
    }

}

