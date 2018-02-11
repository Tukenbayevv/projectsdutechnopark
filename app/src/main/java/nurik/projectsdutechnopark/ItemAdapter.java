package nurik.projectsdutechnopark;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemContactsViewHolder> {

    private Context context;
    private List<Item> items;

    public ItemAdapter(Context context, List<Item> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public ItemContactsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item, parent, false);
        return new ItemContactsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ItemContactsViewHolder holder, int position) {
        holder.main.setText(items.get(position).getMain());
        holder.sum.setText(items.get(position).getSub());
        Picasso.with(context)
                .load(items.get(position).getImage())
                .fit()
                .centerCrop()
                .into(holder.image);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    class ItemContactsViewHolder extends RecyclerView.ViewHolder {

        private ImageView image;
        private TextView main, sum;

        ItemContactsViewHolder(View v) {
            super(v);
            image = v.findViewById(R.id.image);
            main = v.findViewById(R.id.main);
            sum = v.findViewById(R.id.sum);
        }

    }

}