// Generated by view binder compiler. Do not edit!
package ca.unb.mobiledev.fitquest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ca.unb.mobiledev.fitquest.R;
import com.github.mikephil.charting.charts.BarChart;
import com.google.android.material.card.MaterialCardView;
import com.mikhaellopez.circularprogressbar.CircularProgressBar;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityStepCounterBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView calStepScreen;

  @NonNull
  public final TextView distanceStepScreen;

  @NonNull
  public final ConstraintLayout frameLayout3;

  @NonNull
  public final LinearLayout kmStepScreen;

  @NonNull
  public final TextView maxStepStepScreen;

  @NonNull
  public final Button setStepTargetStepScreen;

  @NonNull
  public final BarChart stepChartStepScreen;

  @NonNull
  public final MaterialCardView stepInfoCardView;

  @NonNull
  public final CircularProgressBar stepProgressCircularStepScreen;

  @NonNull
  public final TextView stepsTakenStepScreen;

  @NonNull
  public final TextView textView;

  private ActivityStepCounterBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView calStepScreen, @NonNull TextView distanceStepScreen,
      @NonNull ConstraintLayout frameLayout3, @NonNull LinearLayout kmStepScreen,
      @NonNull TextView maxStepStepScreen, @NonNull Button setStepTargetStepScreen,
      @NonNull BarChart stepChartStepScreen, @NonNull MaterialCardView stepInfoCardView,
      @NonNull CircularProgressBar stepProgressCircularStepScreen,
      @NonNull TextView stepsTakenStepScreen, @NonNull TextView textView) {
    this.rootView = rootView;
    this.calStepScreen = calStepScreen;
    this.distanceStepScreen = distanceStepScreen;
    this.frameLayout3 = frameLayout3;
    this.kmStepScreen = kmStepScreen;
    this.maxStepStepScreen = maxStepStepScreen;
    this.setStepTargetStepScreen = setStepTargetStepScreen;
    this.stepChartStepScreen = stepChartStepScreen;
    this.stepInfoCardView = stepInfoCardView;
    this.stepProgressCircularStepScreen = stepProgressCircularStepScreen;
    this.stepsTakenStepScreen = stepsTakenStepScreen;
    this.textView = textView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityStepCounterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityStepCounterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_step_counter, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityStepCounterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cal_stepScreen;
      TextView calStepScreen = ViewBindings.findChildViewById(rootView, id);
      if (calStepScreen == null) {
        break missingId;
      }

      id = R.id.distance_StepScreen;
      TextView distanceStepScreen = ViewBindings.findChildViewById(rootView, id);
      if (distanceStepScreen == null) {
        break missingId;
      }

      id = R.id.frameLayout3;
      ConstraintLayout frameLayout3 = ViewBindings.findChildViewById(rootView, id);
      if (frameLayout3 == null) {
        break missingId;
      }

      id = R.id.km_stepScreen;
      LinearLayout kmStepScreen = ViewBindings.findChildViewById(rootView, id);
      if (kmStepScreen == null) {
        break missingId;
      }

      id = R.id.maxStep_stepScreen;
      TextView maxStepStepScreen = ViewBindings.findChildViewById(rootView, id);
      if (maxStepStepScreen == null) {
        break missingId;
      }

      id = R.id.setStepTarget_stepScreen;
      Button setStepTargetStepScreen = ViewBindings.findChildViewById(rootView, id);
      if (setStepTargetStepScreen == null) {
        break missingId;
      }

      id = R.id.stepChart_stepScreen;
      BarChart stepChartStepScreen = ViewBindings.findChildViewById(rootView, id);
      if (stepChartStepScreen == null) {
        break missingId;
      }

      id = R.id.stepInfoCardView;
      MaterialCardView stepInfoCardView = ViewBindings.findChildViewById(rootView, id);
      if (stepInfoCardView == null) {
        break missingId;
      }

      id = R.id.stepProgressCircular_stepScreen;
      CircularProgressBar stepProgressCircularStepScreen = ViewBindings.findChildViewById(rootView, id);
      if (stepProgressCircularStepScreen == null) {
        break missingId;
      }

      id = R.id.stepsTaken_stepScreen;
      TextView stepsTakenStepScreen = ViewBindings.findChildViewById(rootView, id);
      if (stepsTakenStepScreen == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      return new ActivityStepCounterBinding((ConstraintLayout) rootView, calStepScreen,
          distanceStepScreen, frameLayout3, kmStepScreen, maxStepStepScreen,
          setStepTargetStepScreen, stepChartStepScreen, stepInfoCardView,
          stepProgressCircularStepScreen, stepsTakenStepScreen, textView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
