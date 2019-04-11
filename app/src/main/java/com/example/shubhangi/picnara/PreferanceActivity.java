package com.example.shubhangi.picnara;




import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class PreferanceActivity extends AppCompatActivity {

    final String[] state={"Goa – Panaji",
            "Gujarat – Gandhinagar",
            "Haryana – Chandigar",
            "Himachal Pradesh",
            "Jammu & Kashmir – Srinagar (Winter : Jammu)" ,
            "Karnataka – Bengaluru (Bangalooru)",
            "Kerala – Thiruvananthapuram",
            "Madhya Pradesh – Bhopal",
            "Maharashtra – Mumbai",
            "Manipur – Imphal",
            "Meghalaya – Shillong",
            "Mizoram – Aizawl",
            "Nagaland – Kohima",
            "Orissa – Bhubaneswar",
            "Punjab – Chandigarh",
            "Rajasthan – Jaipur"};
    AlertDialog dialog;
    final ArrayList itemsSelected = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferance);
        EditText edt=findViewById(R.id.locat);

        edt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               AlertDialog.Builder builder=new AlertDialog.Builder(PreferanceActivity.this);
                builder.setTitle("Choose Location");
                builder.setMultiChoiceItems(state, null, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                        if (b) {
                            itemsSelected.add(i);
                        } else if (itemsSelected.contains(i)) {
                            itemsSelected.remove(Integer.valueOf(i));
                        }
                    }
                }).setPositiveButton("Save", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        //Your logic when OK button is clicked
                    }
                })
                        .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                            }
                        });
                dialog=builder.create();
                dialog.show();
            }
        });
    }
}
