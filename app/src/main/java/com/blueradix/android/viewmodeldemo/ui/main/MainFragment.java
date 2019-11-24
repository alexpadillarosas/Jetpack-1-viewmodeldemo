package com.blueradix.android.viewmodeldemo.ui.main;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.blueradix.android.viewmodeldemo.R;
import com.google.android.material.textfield.TextInputEditText;

public class MainFragment extends Fragment {

    private MainViewModel mViewModel;

    private TextInputEditText dollarInputEditText;
    private TextView resultTextView;
    private Button convertButton;

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.main_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        // TODO: Use the ViewModel

        dollarInputEditText = getView().findViewById(R.id.dollarInputEditText);
        resultTextView = getView().findViewById(R.id.resultTextView);
        convertButton = getView().findViewById(R.id.convertButton);

        resultTextView.setText(mViewModel.getResult().toString());

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!dollarInputEditText.getText().toString().equals("")){
                    mViewModel.setAmount(dollarInputEditText.getText().toString());
                    resultTextView.setText(mViewModel.getResult().toString());
                }else{
                    resultTextView.setText("No value");
                }
            }
        });

    }

}
