package com.example.quizapp;

import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/example/quizapp/Constant;", "", "()V", "USER_NAME", "", "getQuestion", "Ljava/util/ArrayList;", "Lcom/example/quizapp/Question;", "Lkotlin/collections/ArrayList;", "app_debug"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: Constant.kt */
public final class Constant {
    public static final Constant INSTANCE = new Constant();
    public static final String USER_NAME = "user_name";

    private Constant() {
    }

    public final ArrayList<Question> getQuestion() {
        ArrayList questionList = new ArrayList();
        questionList.add(new Question(1, "What brand does the logo represent?", R.drawable.bmw, "Audi", "BMW", "Toyota", "TATA", 2));
        questionList.add(new Question(2, "What brand does the logo represent?", R.drawable.mercedes, "Jaguar", "Mitsubishi", "Mercedes", "Suzuki", 3));
        questionList.add(new Question(3, "What brand does the logo represent?", R.drawable.hyundai, "Hyundai", "Honda", "MG", "None", 1));
        questionList.add(new Question(4, "What brand does the logo represent?", R.drawable.lambo, "Volkswagen", "Tesla", "Kia", "Lamborghini", 4));
        questionList.add(new Question(5, "What brand does the logo represent?", R.drawable.toyota, "Kia", "Toyota", "Bugatti", "Mercedes", 2));
        questionList.add(new Question(6, "What brand does the logo represent?", R.drawable.bentley, "Bentley", "BMW", "Toyota", "Suzuki", 1));
        questionList.add(new Question(7, "What brand does the logo represent?", R.drawable.aston, "Tesla", "Jaguar", "Aston Martin", "Audi", 3));
        questionList.add(new Question(8, "What brand does the logo represent?", R.drawable.jaguar, "John Deer", "Kia", "Toyota", "Jaguar", 4));
        questionList.add(new Question(9, "What brand does the logo represent?", R.drawable.chevvy, "Subaru", "Chevrolet", "None", "TATA", 2));
        questionList.add(new Question(10, "What brand does the logo represent?", R.drawable.morris, "Morris Garages", "Lamborghini", "Mayor Garages", "Ferrari", 1));
        return questionList;
    }
}
