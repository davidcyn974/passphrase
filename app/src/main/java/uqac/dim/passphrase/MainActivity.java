package uqac.dim.passphrase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText inputText;
    Button buttonVal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputText = findViewById(R.id.userInputText);
        buttonVal = findViewById(R.id.buttonValider);
        buttonVal.setOnClickListener(view -> TestPhrase());
    }



    private void TestPhrase(){
        if(inputText.getText().length() >5)
            finish();
    }
}


