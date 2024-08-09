package com.example.list_grid_project;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
   ListView listView;
    String tutorials[] = { "Rahul sir ", "Binod sir ",
            "Rupak Sir", "Binod Ji",
            "Sajesh ", "Elu mam ",
            "Asmit sir", "Roushan sir ",
            "prem sir " ,"Ram sir ","Riya mam","Amosh sir ","ravi sir "};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.list);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,tutorials);
        listView.setAdapter(arrayAdapter);
    }
    //Menu Function

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu,menu);
        return true;
    }
}