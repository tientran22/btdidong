package vn.edu.ntu.bai18__61134498;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class MainActivity extends ListActivity {
    TextView textView;
    String[] listViewItem = {"Intel", "SamSung", "Nokia",
            "Simen", "AMD", "KIC", "ECD"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.tv);
        setListAdapter( new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listViewItem));
        getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                textView.setText("position = " +adapterView.getItemIdAtPosition(i)  + "; value =" +adapterView.getItemAtPosition(i));
            }
        });
    }
}