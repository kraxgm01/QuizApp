package com.example.quizapp;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0015R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/example/quizapp/ResultScreen;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "tvCongoName", "Landroid/widget/TextView;", "tvScore", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: ResultScreen.kt */
public final class ResultScreen extends AppCompatActivity {
    private TextView tvCongoName;
    private TextView tvScore;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_result_screen);
        this.tvScore = (TextView) findViewById(R.id.tvScore);
        this.tvCongoName = (TextView) findViewById(R.id.tvCongoName);
        String name = getIntent().getStringExtra("nameResult");
        TextView textView = this.tvCongoName;
        if (textView != null) {
            textView.setText(Intrinsics.stringPlus("Congratulations !, ", name));
        }
        int intValue = getIntent().getIntExtra("score_result", 0);
        TextView textView2 = this.tvScore;
        if (textView2 != null) {
            textView2.setText(Intrinsics.stringPlus("SCORE: ", Integer.valueOf(intValue)));
        }
    }
}
