package com.example.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0003J\b\u0010\u001d\u001a\u00020\u001cH\u0002J \u0010\u001e\u001a\u00020\u001c2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000ej\b\u0012\u0004\u0012\u00020\f`\u000fH\u0003J\u0012\u0010\u001f\u001a\u00020\u001c2\b\u0010 \u001a\u0004\u0018\u00010!H\u0014J\b\u0010\"\u001a\u00020\u001cH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\"\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\f\u0018\u00010\u000ej\n\u0012\u0004\u0012\u00020\f\u0018\u0001`\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/example/quizapp/QuizQuestions;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "btnSubmit", "Landroid/widget/Button;", "counter", "", "imgLogo", "Landroid/widget/ImageView;", "progressBar", "Landroid/widget/ProgressBar;", "question", "Lcom/example/quizapp/Question;", "questionList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "score", "selectedOption", "tvOptionFour", "Landroid/widget/TextView;", "tvOptionOne", "tvOptionThree", "tvOptionTwo", "tvProgress", "tvQuestion", "userName", "", "btnSubmitClicked", "", "defaultTvStyle", "loadQuestionScreen", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "tvClickListener", "app_debug"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: QuizQuestions.kt */
public final class QuizQuestions extends AppCompatActivity {
    private Button btnSubmit;
    private int counter = 1;
    private ImageView imgLogo;
    private ProgressBar progressBar;
    private Question question;
    private ArrayList<Question> questionList;
    private int score;
    private int selectedOption;
    private TextView tvOptionFour;
    private TextView tvOptionOne;
    private TextView tvOptionThree;
    private TextView tvOptionTwo;
    private TextView tvProgress;
    private TextView tvQuestion;
    private String userName;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_quiz_questions);
        this.questionList = Constant.INSTANCE.getQuestion();
        this.userName = getIntent().getStringExtra(Constant.USER_NAME);
        this.tvQuestion = (TextView) findViewById(R.id.tvQuestion);
        this.imgLogo = (ImageView) findViewById(R.id.imgLogo);
        this.progressBar = (ProgressBar) findViewById(R.id.progressBar);
        this.tvProgress = (TextView) findViewById(R.id.tvProgress);
        this.tvOptionOne = (TextView) findViewById(R.id.tvOptionOne);
        this.tvOptionTwo = (TextView) findViewById(R.id.tvOptionTwo);
        this.tvOptionThree = (TextView) findViewById(R.id.tvOptionThree);
        this.tvOptionFour = (TextView) findViewById(R.id.tvOptionFour);
        this.btnSubmit = (Button) findViewById(R.id.btnSubmit);
        ArrayList<Question> arrayList = this.questionList;
        Intrinsics.checkNotNull(arrayList);
        loadQuestionScreen(arrayList);
        tvClickListener();
    }

    private final void loadQuestionScreen(ArrayList<Question> questionList2) {
        Button button;
        if (this.counter <= questionList2.size()) {
            Button button2 = this.btnSubmit;
            if (button2 != null) {
                button2.setText("SUBMIT");
            }
            Question question2 = questionList2.get(this.counter - 1);
            Intrinsics.checkNotNullExpressionValue(question2, "questionList[counter-1]");
            Question question3 = question2;
            this.question = question3;
            TextView textView = this.tvQuestion;
            Question question4 = null;
            if (textView != null) {
                if (question3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("question");
                    question3 = null;
                }
                textView.setText(question3.getQuestion());
            }
            ImageView imageView = this.imgLogo;
            if (imageView != null) {
                Question question5 = this.question;
                if (question5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("question");
                    question5 = null;
                }
                imageView.setImageResource(question5.getImage());
            }
            ProgressBar progressBar2 = this.progressBar;
            if (progressBar2 != null) {
                progressBar2.setProgress(this.counter);
            }
            TextView textView2 = this.tvProgress;
            if (textView2 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.counter);
                sb.append('/');
                sb.append(questionList2.size());
                textView2.setText(sb.toString());
            }
            TextView textView3 = this.tvOptionOne;
            if (textView3 != null) {
                Question question6 = this.question;
                if (question6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("question");
                    question6 = null;
                }
                textView3.setText(question6.getOptionOne());
            }
            TextView textView4 = this.tvOptionTwo;
            if (textView4 != null) {
                Question question7 = this.question;
                if (question7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("question");
                    question7 = null;
                }
                textView4.setText(question7.getOptionTwo());
            }
            TextView textView5 = this.tvOptionThree;
            if (textView5 != null) {
                Question question8 = this.question;
                if (question8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("question");
                    question8 = null;
                }
                textView5.setText(question8.getOptionThree());
            }
            TextView textView6 = this.tvOptionFour;
            if (textView6 != null) {
                Question question9 = this.question;
                if (question9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("question");
                } else {
                    question4 = question9;
                }
                textView6.setText(question4.getOptionFour());
            }
            defaultTvStyle();
            if (this.counter == questionList2.size() && (button = this.btnSubmit) != null) {
                button.setText("Finish");
            }
            this.counter++;
            btnSubmitClicked();
            return;
        }
        Intent intentResult = new Intent(this, ResultScreen.class);
        intentResult.putExtra("nameResult", this.userName);
        intentResult.putExtra("score_result", this.score);
        startActivity(intentResult);
        finish();
    }

    private final void btnSubmitClicked() {
        Button button = this.btnSubmit;
        if (button != null) {
            button.setOnClickListener(new QuizQuestions$$ExternalSyntheticLambda2(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: btnSubmitClicked$lambda-2  reason: not valid java name */
    public static final void m3btnSubmitClicked$lambda2(QuizQuestions this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i = this$0.selectedOption;
        Question question2 = null;
        if (i == 0) {
            Question question3 = this$0.question;
            if (question3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("question");
            } else {
                question2 = question3;
            }
            switch (question2.getCorrectOption()) {
                case 1:
                    TextView textView = this$0.tvOptionOne;
                    if (textView != null) {
                        textView.setBackgroundResource(R.drawable.correct_textview_style);
                        break;
                    }
                    break;
                case 2:
                    TextView textView2 = this$0.tvOptionTwo;
                    if (textView2 != null) {
                        textView2.setBackgroundResource(R.drawable.correct_textview_style);
                        break;
                    }
                    break;
                case 3:
                    TextView textView3 = this$0.tvOptionThree;
                    if (textView3 != null) {
                        textView3.setBackgroundResource(R.drawable.correct_textview_style);
                        break;
                    }
                    break;
                case 4:
                    TextView textView4 = this$0.tvOptionFour;
                    if (textView4 != null) {
                        textView4.setBackgroundResource(R.drawable.correct_textview_style);
                        break;
                    }
                    break;
            }
            Button button = this$0.btnSubmit;
            if (button != null) {
                button.setText("NEXT");
            }
            Button button2 = this$0.btnSubmit;
            if (button2 != null) {
                button2.setOnClickListener(new QuizQuestions$$ExternalSyntheticLambda5(this$0));
                return;
            }
            return;
        }
        Question question4 = this$0.question;
        if (question4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("question");
            question4 = null;
        }
        if (i != question4.getCorrectOption()) {
            switch (this$0.selectedOption) {
                case 1:
                    TextView textView5 = this$0.tvOptionOne;
                    if (textView5 != null) {
                        textView5.setBackgroundResource(R.drawable.wrong_textview_style);
                        break;
                    }
                    break;
                case 2:
                    TextView textView6 = this$0.tvOptionTwo;
                    if (textView6 != null) {
                        textView6.setBackgroundResource(R.drawable.wrong_textview_style);
                        break;
                    }
                    break;
                case 3:
                    TextView textView7 = this$0.tvOptionThree;
                    if (textView7 != null) {
                        textView7.setBackgroundResource(R.drawable.wrong_textview_style);
                        break;
                    }
                    break;
                case 4:
                    TextView textView8 = this$0.tvOptionFour;
                    if (textView8 != null) {
                        textView8.setBackgroundResource(R.drawable.wrong_textview_style);
                        break;
                    }
                    break;
            }
        }
        int i2 = this$0.selectedOption;
        Question question5 = this$0.question;
        if (question5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("question");
            question5 = null;
        }
        if (i2 == question5.getCorrectOption()) {
            this$0.score++;
        }
        Question question6 = this$0.question;
        if (question6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("question");
        } else {
            question2 = question6;
        }
        switch (question2.getCorrectOption()) {
            case 1:
                TextView textView9 = this$0.tvOptionOne;
                if (textView9 != null) {
                    textView9.setBackgroundResource(R.drawable.correct_textview_style);
                    break;
                }
                break;
            case 2:
                TextView textView10 = this$0.tvOptionTwo;
                if (textView10 != null) {
                    textView10.setBackgroundResource(R.drawable.correct_textview_style);
                    break;
                }
                break;
            case 3:
                TextView textView11 = this$0.tvOptionThree;
                if (textView11 != null) {
                    textView11.setBackgroundResource(R.drawable.correct_textview_style);
                    break;
                }
                break;
            case 4:
                TextView textView12 = this$0.tvOptionFour;
                if (textView12 != null) {
                    textView12.setBackgroundResource(R.drawable.correct_textview_style);
                    break;
                }
                break;
        }
        Button button3 = this$0.btnSubmit;
        if (button3 != null) {
            button3.setText("NEXT");
        }
        Button button4 = this$0.btnSubmit;
        if (button4 != null) {
            button4.setOnClickListener(new QuizQuestions$$ExternalSyntheticLambda1(this$0));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: btnSubmitClicked$lambda-2$lambda-0  reason: not valid java name */
    public static final void m4btnSubmitClicked$lambda2$lambda0(QuizQuestions this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.selectedOption = 0;
        ArrayList<Question> arrayList = this$0.questionList;
        Intrinsics.checkNotNull(arrayList);
        this$0.loadQuestionScreen(arrayList);
    }

    /* access modifiers changed from: private */
    /* renamed from: btnSubmitClicked$lambda-2$lambda-1  reason: not valid java name */
    public static final void m5btnSubmitClicked$lambda2$lambda1(QuizQuestions this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.selectedOption = 0;
        ArrayList<Question> arrayList = this$0.questionList;
        Intrinsics.checkNotNull(arrayList);
        this$0.loadQuestionScreen(arrayList);
    }

    private final void defaultTvStyle() {
        TextView textView = this.tvOptionOne;
        if (textView != null) {
            textView.setBackgroundResource(R.drawable.default_textview_style);
        }
        TextView textView2 = this.tvOptionTwo;
        if (textView2 != null) {
            textView2.setBackgroundResource(R.drawable.default_textview_style);
        }
        TextView textView3 = this.tvOptionThree;
        if (textView3 != null) {
            textView3.setBackgroundResource(R.drawable.default_textview_style);
        }
        TextView textView4 = this.tvOptionFour;
        if (textView4 != null) {
            textView4.setBackgroundResource(R.drawable.default_textview_style);
        }
    }

    private final void tvClickListener() {
        TextView textView = this.tvOptionOne;
        if (textView != null) {
            textView.setOnClickListener(new QuizQuestions$$ExternalSyntheticLambda0(this));
        }
        TextView textView2 = this.tvOptionTwo;
        if (textView2 != null) {
            textView2.setOnClickListener(new QuizQuestions$$ExternalSyntheticLambda4(this));
        }
        TextView textView3 = this.tvOptionThree;
        if (textView3 != null) {
            textView3.setOnClickListener(new QuizQuestions$$ExternalSyntheticLambda6(this));
        }
        TextView textView4 = this.tvOptionFour;
        if (textView4 != null) {
            textView4.setOnClickListener(new QuizQuestions$$ExternalSyntheticLambda3(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: tvClickListener$lambda-3  reason: not valid java name */
    public static final void m6tvClickListener$lambda3(QuizQuestions this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.defaultTvStyle();
        TextView textView = this$0.tvOptionOne;
        if (textView != null) {
            textView.setBackgroundResource(R.drawable.selected_textview_style);
        }
        this$0.selectedOption = 1;
        Log.i("Selected Option is: ", String.valueOf(1));
    }

    /* access modifiers changed from: private */
    /* renamed from: tvClickListener$lambda-4  reason: not valid java name */
    public static final void m7tvClickListener$lambda4(QuizQuestions this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.defaultTvStyle();
        TextView textView = this$0.tvOptionTwo;
        if (textView != null) {
            textView.setBackgroundResource(R.drawable.selected_textview_style);
        }
        this$0.selectedOption = 2;
        Log.i("Selected Option is: ", String.valueOf(2));
    }

    /* access modifiers changed from: private */
    /* renamed from: tvClickListener$lambda-5  reason: not valid java name */
    public static final void m8tvClickListener$lambda5(QuizQuestions this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.defaultTvStyle();
        TextView textView = this$0.tvOptionThree;
        if (textView != null) {
            textView.setBackgroundResource(R.drawable.selected_textview_style);
        }
        this$0.selectedOption = 3;
        Log.i("Selected Option is: ", String.valueOf(3));
    }

    /* access modifiers changed from: private */
    /* renamed from: tvClickListener$lambda-6  reason: not valid java name */
    public static final void m9tvClickListener$lambda6(QuizQuestions this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.defaultTvStyle();
        TextView textView = this$0.tvOptionFour;
        if (textView != null) {
            textView.setBackgroundResource(R.drawable.selected_textview_style);
        }
        this$0.selectedOption = 4;
        Log.i("Selected Option is: ", String.valueOf(4));
    }
}
