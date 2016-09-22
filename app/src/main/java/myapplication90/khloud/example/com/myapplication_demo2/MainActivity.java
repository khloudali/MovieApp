package myapplication90.khloud.example.com.myapplication_demo2;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements RAdapter.onClick{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public void onclick(long id) {
        Bundle bundle = new Bundle();
        bundle.putLong("id", id);


        Intent i = new Intent(this, DetailFragmentActivity.class);
        i.putExtra("id", id);

        startActivity(i);
    }
}