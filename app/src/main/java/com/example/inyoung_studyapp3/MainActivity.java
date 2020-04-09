package com.example.inyoung_studyapp3;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.jjoe64.graphview.GraphView;

public class MainActivity extends AppCompatActivity {
    GraphView graphView; //api
    LinearLayout liCanvas; //그래픽그려질 공간
    String item[] = {"메모테스드트트트", "메모테스드트트트", "메모테스드트트트", "메모테스드트트트", "메모테스드트트트", "메모테스드트트트", "메모테스드트트트", "메모테스드트트트"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        liCanvas = (LinearLayout) findViewById(R.id.liCanvas);

        liCanvas.addView(new GraphCanvas(this));

        ListAdapter listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, item);
        ListView listView = (ListView) findViewById(R.id.lvMemo);
        listView.setAdapter(listAdapter);
    }
}
