package itacademy.kg.musicshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    ImageButton iikkk;
    ImageButton iijjj;
    Button bvvvvv;
    Spinner langugespiner;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iikkk = (ImageButton) findViewById(R.id.iikk);
        iijjj = (ImageButton) findViewById(R.id.iijj);
        textView=(TextView)findViewById(R.id.textView);
        bvvvvv = (Button) findViewById(R.id.bvvvv);
        langugespiner = (Spinner) findViewById(R.id.Spiner);
        ArrayList<String> Languages = new ArrayList<>();
        Languages.add("piano");
        Languages.add("komuz");
        Languages.add("drums");
        adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_item, Languages);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        langugespiner.setAdapter(adapter);
        iikkk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
          ;
                langugespiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        Toast.makeText(MainActivity.this, Languages.get(position), Toast.LENGTH_SHORT).show();
                        String selektedItem = parent.getSelectedItem().toString();
                        Log.i("MYTAG", selektedItem);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }

                });
            }
        });
    }
}