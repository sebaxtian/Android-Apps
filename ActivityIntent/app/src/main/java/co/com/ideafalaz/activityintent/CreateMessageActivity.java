package co.com.ideafalaz.activityintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateMessageActivity extends AppCompatActivity {


    public static final String EXTRA_MESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }


    // Se llama este metodo cuando se hace click en el boton
    public void onSendMessage(View view) {
        Intent intent = new Intent(this, ReceiveMessageActivity.class);
        EditText messageEdit = (EditText)findViewById(R.id.editText);
        String messageText = messageEdit.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, messageText);
        startActivity(intent);
    }

}
