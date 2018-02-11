package nurik.projectsdutechnopark;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class ListFragment extends Fragment {

    public ListFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_list, container, false);

        List<Item> list = new ArrayList<>();

        list.add(new Item(R.drawable.card, "Продажи", "25999тг"));
        list.add(new Item(R.drawable.card, "Продажи", "25999тг"));
        list.add(new Item(R.drawable.card, "Продажи", "25999тг"));
        list.add(new Item(R.drawable.card, "Продажи", "25999тг"));
        list.add(new Item(R.drawable.card, "Продажи", "25999тг"));
        list.add(new Item(R.drawable.card, "Продажи", "25999тг"));
        list.add(new Item(R.drawable.card, "Продажи", "25999тг"));
        list.add(new Item(R.drawable.card, "Продажи", "25999тг"));
        list.add(new Item(R.drawable.card, "Продажи", "25999тг"));

        RecyclerView recyclerView = rootView.findViewById(R.id.list);
        ItemAdapter adapter = new ItemAdapter(getContext(), list);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return rootView;
    }

}
