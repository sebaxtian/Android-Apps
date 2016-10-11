package co.com.ideafalaz.callme;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    // Se llama este metodo cuando se hace click en el boton
    public void onCallMe(View view) {
        EditText messageEdit = (EditText) findViewById(R.id.editText);
        String numberPhoneText = messageEdit.getText().toString();
        Uri number = Uri.parse("tel:" + numberPhoneText);
        Intent intent = new Intent(Intent.ACTION_DIAL, number);
        startActivity(intent);
    }

}
