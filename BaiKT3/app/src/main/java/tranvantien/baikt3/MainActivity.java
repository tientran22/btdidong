package tranvantien.baikt3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText ViTri, GiaTri;
    Button Them, Sua, Xoa;
    ListView ten;
    ArrayList<String> List;
    int toado = -1;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViTri = (EditText) findViewById(R.id.edtViTri);
        GiaTri = (EditText) findViewById(R.id.edtGiaTri);
        Them = (Button) findViewById(R.id.btnThem);
        Sua = (Button) findViewById(R.id.btnSua);
        Xoa = (Button) findViewById(R.id.btnXoa);
        ten = (ListView) findViewById(R.id.lv);

        List = new ArrayList<>();
        List.add("Content");
        List.add("Graphics");
        List.add("Hardware");
        List.add("Media");
        List.add("NFC");
        List.add("OS");
        List.add("Preference");

        ArrayAdapter adapter = new ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1,
                List);
        ten.setAdapter(adapter);

        Them.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String item = GiaTri.getText().toString().trim();
                List.add(item);
                adapter.notifyDataSetChanged();
            }
        });

        ten.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                ViTri.setText("" + i);
                GiaTri.setText(List.get(i));
                toado=i;
            }
        });


        Sua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List.set(toado,GiaTri.getText().toString());
                adapter.notifyDataSetChanged();
            }
        });

        Xoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List.remove(toado);
                adapter.notifyDataSetChanged();
            }
        });


    }
}