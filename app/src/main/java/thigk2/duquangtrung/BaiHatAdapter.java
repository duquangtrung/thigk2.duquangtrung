package thigk2.duquangtrung;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BaiHatAdapter extends RecyclerView.Adapter<BaiHatAdapter.ViewHolder> {

    Context context;
    ArrayList<BaiHat> list;

    // Constructor
    public BaiHatAdapter(Context context, ArrayList<BaiHat> list) {
        this.context = context;
        this.list = list;
    }

    // Tạo item view
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_baihat, parent, false);
        return new ViewHolder(view);
    }

    // Gán dữ liệu vào item
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        BaiHat bh = list.get(position);
        holder.txtTen.setText(bh.getTen());
    }

    // Số lượng item
    @Override
    public int getItemCount() {
        return list.size();
    }

    // ViewHolder
    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView txtTen;

        public ViewHolder(View itemView) {
            super(itemView);
            txtTen = itemView.findViewById(R.id.txtTen);
        }
    }
}