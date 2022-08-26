package com.example.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/example/quizapp/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "btnStart", "Landroid/widget/Button;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: MainActivity.kt */
public final class MainActivity extends AppCompatActivity {
    private Button btnStart;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main);
        View findViewById = findViewById(R.id.etName);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.etName)");
        EditText etName = (EditText) findViewById;
        Button button = (Button) findViewById(R.id.btnStart);
        this.btnStart = button;
        if (button != null) {
            button.setOnClickListener(new MainActivity$$ExternalSyntheticLambda0(etName, this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: onCreate$lambda-0  reason: not valid java name */
    public static final void m1onCreate$lambda0(EditText $etName, MainActivity this$0, View it) {
        Intrinsics.checkNotNullParameter($etName, "$etName");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CharSequence text = $etName.getText();
        if (text == null || text.length() == 0) {
            Toast.makeText(this$0, "Please enter your name", 0).show();
            return;
        }
        Intent intentQue = new Intent(this$0, QuizQuestions.class);
        intentQue.putExtra(Constant.USER_NAME, $etName.getText().toString());
        this$0.startActivity(intentQue);
        this$0.finish();
    }
}
