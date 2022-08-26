package com.example.quizapp;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003JY\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012¨\u0006%"}, d2 = {"Lcom/example/quizapp/Question;", "", "id", "", "question", "", "image", "optionOne", "optionTwo", "optionThree", "optionFour", "correctOption", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getCorrectOption", "()I", "getId", "getImage", "getOptionFour", "()Ljava/lang/String;", "getOptionOne", "getOptionThree", "getOptionTwo", "getQuestion", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: Question.kt */
public final class Question {
    private final int correctOption;
    private final int id;
    private final int image;
    private final String optionFour;
    private final String optionOne;
    private final String optionThree;
    private final String optionTwo;
    private final String question;

    public static /* synthetic */ Question copy$default(Question question2, int i, String str, int i2, String str2, String str3, String str4, String str5, int i3, int i4, Object obj) {
        Question question3 = question2;
        int i5 = i4;
        return question2.copy((i5 & 1) != 0 ? question3.id : i, (i5 & 2) != 0 ? question3.question : str, (i5 & 4) != 0 ? question3.image : i2, (i5 & 8) != 0 ? question3.optionOne : str2, (i5 & 16) != 0 ? question3.optionTwo : str3, (i5 & 32) != 0 ? question3.optionThree : str4, (i5 & 64) != 0 ? question3.optionFour : str5, (i5 & 128) != 0 ? question3.correctOption : i3);
    }

    public final int component1() {
        return this.id;
    }

    public final String component2() {
        return this.question;
    }

    public final int component3() {
        return this.image;
    }

    public final String component4() {
        return this.optionOne;
    }

    public final String component5() {
        return this.optionTwo;
    }

    public final String component6() {
        return this.optionThree;
    }

    public final String component7() {
        return this.optionFour;
    }

    public final int component8() {
        return this.correctOption;
    }

    public final Question copy(int i, String str, int i2, String str2, String str3, String str4, String str5, int i3) {
        Intrinsics.checkNotNullParameter(str, "question");
        Intrinsics.checkNotNullParameter(str2, "optionOne");
        Intrinsics.checkNotNullParameter(str3, "optionTwo");
        Intrinsics.checkNotNullParameter(str4, "optionThree");
        Intrinsics.checkNotNullParameter(str5, "optionFour");
        return new Question(i, str, i2, str2, str3, str4, str5, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Question)) {
            return false;
        }
        Question question2 = (Question) obj;
        return this.id == question2.id && Intrinsics.areEqual((Object) this.question, (Object) question2.question) && this.image == question2.image && Intrinsics.areEqual((Object) this.optionOne, (Object) question2.optionOne) && Intrinsics.areEqual((Object) this.optionTwo, (Object) question2.optionTwo) && Intrinsics.areEqual((Object) this.optionThree, (Object) question2.optionThree) && Intrinsics.areEqual((Object) this.optionFour, (Object) question2.optionFour) && this.correctOption == question2.correctOption;
    }

    public int hashCode() {
        return (((((((((((((this.id * 31) + this.question.hashCode()) * 31) + this.image) * 31) + this.optionOne.hashCode()) * 31) + this.optionTwo.hashCode()) * 31) + this.optionThree.hashCode()) * 31) + this.optionFour.hashCode()) * 31) + this.correctOption;
    }

    public String toString() {
        return "Question(id=" + this.id + ", question=" + this.question + ", image=" + this.image + ", optionOne=" + this.optionOne + ", optionTwo=" + this.optionTwo + ", optionThree=" + this.optionThree + ", optionFour=" + this.optionFour + ", correctOption=" + this.correctOption + ')';
    }

    public Question(int id2, String question2, int image2, String optionOne2, String optionTwo2, String optionThree2, String optionFour2, int correctOption2) {
        Intrinsics.checkNotNullParameter(question2, "question");
        Intrinsics.checkNotNullParameter(optionOne2, "optionOne");
        Intrinsics.checkNotNullParameter(optionTwo2, "optionTwo");
        Intrinsics.checkNotNullParameter(optionThree2, "optionThree");
        Intrinsics.checkNotNullParameter(optionFour2, "optionFour");
        this.id = id2;
        this.question = question2;
        this.image = image2;
        this.optionOne = optionOne2;
        this.optionTwo = optionTwo2;
        this.optionThree = optionThree2;
        this.optionFour = optionFour2;
        this.correctOption = correctOption2;
    }

    public final int getId() {
        return this.id;
    }

    public final String getQuestion() {
        return this.question;
    }

    public final int getImage() {
        return this.image;
    }

    public final String getOptionOne() {
        return this.optionOne;
    }

    public final String getOptionTwo() {
        return this.optionTwo;
    }

    public final String getOptionThree() {
        return this.optionThree;
    }

    public final String getOptionFour() {
        return this.optionFour;
    }

    public final int getCorrectOption() {
        return this.correctOption;
    }
}
