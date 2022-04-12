package tranvantien.baikt4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class DongVatAdapter extends BaseAdapter {

    Context myConText;
    int myLayout;
    List<DongVat> arrayDongVat;
    public DongVatAdapter (Context context, int layout, List<DongVat> DongVatList){
        myConText = context;
        myLayout = layout;
        arrayDongVat = DongVatList;
    }

    @Override
    public int getCount() {
        return arrayDongVat.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) myConText.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(myLayout,null);
        ImageView imgHinh = (ImageView) view.findViewById(R.id.ImageViewHinh);
        imgHinh.setImageResource(arrayDongVat.get(i).Image);
        TextView txtName = (TextView) view.findViewById(R.id.textViewName);
        txtName.setText(arrayDongVat.get(i).Name);
        TextView txtMeterial = (TextView) view.findViewById(R.id.textViewMaterial);
        txtMeterial.setText(arrayDongVat.get(i).Material);
        return view;
    }
}
