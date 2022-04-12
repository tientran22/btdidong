package tranvantien.baikt4;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvDongVat;
    ArrayList<DongVat> mangDongVat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvDongVat = (ListView) findViewById(R.id.listViewDongVat);
        mangDongVat = new ArrayList<DongVat>();
        mangDongVat.add(new DongVat(R.drawable.bt, "Octupus ", "8 tentaled monster"));
        mangDongVat.add(new DongVat(R.drawable.pig, "Pig", "Delicious in rolls"));
        mangDongVat.add(new DongVat(R.drawable.sheep, "Sheep","Great for jumbers"));
        mangDongVat.add(new DongVat(R.drawable.rabbit, "Rabbit", "Nice in a stew"));
        mangDongVat.add(new DongVat(R.drawable.snake, "Snake", "Great for shoes"));
       DongVatAdapter AnAdapter = new DongVatAdapter(MainActivity.this, R.layout.dong_dongvat, mangDongVat);
        lvDongVat.setAdapter(AnAdapter);
    }
}