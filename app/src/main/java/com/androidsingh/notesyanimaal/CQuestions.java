package com.androidsingh.notesyanimaal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

public class CQuestions extends AppCompatActivity {

    ExpandableListView expandableListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cquestions);

        expandableListView = findViewById(R.id.expandibleTVC);
        ExpandibleTextViewAdapterC adapter =new ExpandibleTextViewAdapterC(this);
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
