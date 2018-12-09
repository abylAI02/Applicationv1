package com.example.abylai.application_v1;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.abylai.application_v1.model.Question;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{

    private List<Question> questions;

    public Adapter(List<Question> questions) {
        this.questions = questions;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view =
                LayoutInflater.from(viewGroup.getContext())
                        .inflate(R.layout.item_question, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.questionTextView.setText(questions.get(i).getText());
    }

    @Override
    public int getItemCount() {
        return questions.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView questionTextView;
        private RadioGroup radioGroup;
        private RadioButton radioButton1;
        private RadioButton radioButton2;
        private RadioButton radioButton3;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            questionTextView = itemView.findViewById(R.id.questionTextView);
            radioGroup = itemView.findViewById(R.id.radioGroup);
            radioButton1 = itemView.findViewById(R.id.question1A);
            radioButton2 = itemView.findViewById(R.id.question1B);
            radioButton3 = itemView.findViewById(R.id.question1C);
        }
    }
}
