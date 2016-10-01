package co.com.ideafalaz.activityintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiveMessageActivity extends AppCompatActivity {


    public static final String EXTRA_MESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);

        Intent intent = getIntent();
        String messageText = intent.getStringExtra(EXTRA_MESSAGE);
        if(messageText == null) {
            messageText = intent.getStringExtra(Intent.EXTRA_TEXT);
        }
        TextView messageView = (TextView) findViewById(R.id.message);
        messageView.setText(messageText);
    }
}
