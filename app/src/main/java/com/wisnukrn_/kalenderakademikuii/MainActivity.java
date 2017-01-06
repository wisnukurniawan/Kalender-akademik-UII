package com.wisnukrn_.kalenderakademikuii;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    private FakultasAdapter adapter;
    private List<Fakultas> fakultasList;

    @BindView(R.id.my_recycler_view)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        fakultasList = new ArrayList<>();
        adapter = new FakultasAdapter(this, fakultasList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        
        myFakultas();
    }

    private void myFakultas() {
        int[] images = new int[]{
                R.drawable.fti_uii1,
                R.drawable.ftsp_uii,
                R.drawable.fmipa_uii,
                R.drawable.fpsb_uii
        };

        String[] names = new String[]{
                getResources().getString(R.string.fti_name),
                "Fakultas Teknik Sipil dan Perencanaan",
                "Fakultas Matematika dan Ilmu Pengetahuan Alam",
                "Fakultas Psikologi dan Ilmu Budaya"
        };

        Fakultas a = new Fakultas(images[0], names[0]);
        fakultasList.add(a);

        a = new Fakultas(images[1], names[1]);
        fakultasList.add(a);

        a = new Fakultas(images[2], names[2]);
        fakultasList.add(a);

        a = new Fakultas(images[3], names[3]);
        fakultasList.add(a);
        adapter.notifyDataSetChanged();
    }

}
