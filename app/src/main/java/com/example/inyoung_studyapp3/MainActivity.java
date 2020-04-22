package com.example.inyoung_studyapp3;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.Toast;

import com.jjoe64.graphview.GraphView;

public class MainActivity extends AppCompatActivity {
    GraphView graphView; //api
    LinearLayout liCanvas; //그래픽그려질 공간
    String item[] = {"memo1", "memo2", "memo3", "memo4", "memo5", "memo6", "memo7", "memo8"};
    ListView listView;
    ScrollView scrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        liCanvas = (LinearLayout) findViewById(R.id.liCanvas);
        listView = (ListView) findViewById(R.id.lvMemo);
        scrollView = (ScrollView) findViewById(R.id.scrollView);

        ListAdapter listAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, item);
        listView.setAdapter(listAdapter);

        liCanvas.addView(new GraphCanvas(this));

        scrollView.setVerticalScrollBarEnabled(false); //스크롤 안보이기

    }
}
