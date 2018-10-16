package tt.test.com.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        public void currencyConvert(View view) {
            EditText editText = (EditText) findViewById(R.id.editText);
            Double dollar= Double.parseDouble(editText.getText().toString());
             Double rupee = dollar * 65.17;
            Log.i("Info",editText.getText().toString());
            Toast.makeText(MainActivity.this, "Rupees" +String.format("%.2f", rupee),Toast.LENGTH_LONG).show();
        }
            @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
