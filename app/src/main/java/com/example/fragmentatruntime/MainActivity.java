package com.example.fragmentatruntime;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import static com.example.fragmentatruntime.R.id.fragment_container;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.reg_user);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        LoginFragment loginFragment = new LoginFragment();
        getSupportFragmentManager().beginTransaction().add(fragment_container,loginFragment).commit();
        fragmentTransaction.commit();

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                androidx.fragment.app.FragmentManager fragmentManager = getSupportFragmentManager();
                androidx.fragment.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                RegisterFragment registerFragment = new RegisterFragment();
                fragmentTransaction.replace(fragment_container,registerFragment);
                fragmentTransaction.commit();
            }
        });
    }
}
