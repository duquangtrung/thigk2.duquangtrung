package thigk2.duquangtrung;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DanhNhanAdapter extends RecyclerView.Adapter<DanhNhanAdapter.ViewHolder> {

    Context context;
    ArrayList<DanhNhan> list;

    public DanhNhanAdapter(Context context, ArrayList<DanhNhan> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_danhnan, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        DanhNhan d = list.get(position);

        holder.txtTen.setText(d.ten);
        holder.txtQue.setText(d.que);
        holder.img.setImageResource(d.hinh);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView txtTen, txtQue;
        ImageView img;

        public ViewHolder(View itemView) {
            super(itemView);

            txtTen = itemView.findViewById(R.id.txtTen);
            txtQue = itemView.findViewById(R.id.txtQue);
            img = itemView.findViewById(R.id.img);
        }
    }
}