package com.androidsingh.notesyanimaal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

public class AndroidQuestions extends AppCompatActivity {
    ExpandableListView expandableListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_androidquestions);

        expandableListView = findViewById(R.id.expandibleTV);
        ExpandibleTextViewAdapter adapter =new ExpandibleTextViewAdapter(this);
        expandableListView.setAdapter(adapter);
        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            int previousGroup=-1;
            @Override
            public void onGroupExpand(int groupPosition) {
                if (groupPosition!=previousGroup){
                    expandableListView.collapseGroup(previousGroup);
                }
                previousGroup=groupPosition;
            }
        });

    }
}
