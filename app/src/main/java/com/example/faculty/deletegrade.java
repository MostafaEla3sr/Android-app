package com.example.faculty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class deletegrade extends AppCompatActivity {
    EditText idtxt;
    DB db ;    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deletegrade);
        db = new DB(this);
        idtxt = (EditText) findViewById(R.id.idtxt);
    }
    public void deletegrade(View view)
    {
        if (idtxt.getText().toString().isEmpty())
            Toast.makeText(this, "Please enter ID", Toast.LENGTH_SHORT).show();
        else
        {
            boolean result = db.deletegrades(idtxt.getText().toString());
            if (result)
            {
                Toast.makeText(this, "Deleted successfully", Toast.LENGTH_SHORT).show();
                idtxt.setText("");
            }
            else
                Toast.makeText(this, "Deleted failed", Toast.LENGTH_SHORT).show();

        }
    }
}