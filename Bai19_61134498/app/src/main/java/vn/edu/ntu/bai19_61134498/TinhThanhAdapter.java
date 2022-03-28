package vn.edu.ntu.bai19_61134498;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class TinhThanhAdapter extends BaseAdapter {

    Context myConText;
    int myLayout;
    List<TinhThanh> arrayTinhThanh;
    public TinhThanhAdapter (Context context, int layout, List<TinhThanh> TinhThanhList){
        myConText = context;
        myLayout = layout;
        arrayTinhThanh = TinhThanhList;
    }

    @Override
    public int getCount() {
        return arrayTinhThanh.size();
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
        view = inflater.inflate(myLayout, null);
        ImageView imgHinh = (ImageView) view.findViewById(R.id.ImageViewHinh);
        imgHinh.setImageResource(arrayTinhThanh.get(i).HinhAnh);
        TextView txtTen = (TextView) view.findViewById(R.id.textViewTen);
        txtTen.setText(arrayTinhThanh.get(i).ten);
        return view;
    }
}
