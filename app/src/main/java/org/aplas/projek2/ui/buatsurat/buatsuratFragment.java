package org.aplas.projek2.ui.buatsurat;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import org.aplas.projek2.R;
import org.aplas.projek2.databinding.FragmentBuatsuratBinding;

public class buatsuratFragment extends Fragment {

    private buatsuratViewModel buatsuratViewModel;
    private FragmentBuatsuratBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        buatsuratViewModel =
                new ViewModelProvider(this).get(buatsuratViewModel.class);

        binding = FragmentBuatsuratBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textBuatsurat;
        buatsuratViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}