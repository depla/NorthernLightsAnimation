package edu.miracostacollege.cs134.northernlightsanimation;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * MainActivity.java - Tests various types of animations
 *
 * @author Dennis La
 * @version 1.0
 * 
 */
public class MainActivity extends AppCompatActivity {

    private ImageView lightsImageView;

    //animationdrawable used for frame animations
    private AnimationDrawable frameAnim;

    //animation used for tweened animations
    private Animation rotateAnim;
    private Animation shakeAnim;
    private Animation customAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lightsImageView = findViewById(R.id.lightsImageView);
    }

    //method for the frame animation button
    public void toggleFrameAnim(View v)
    {
        if(frameAnim == null)
        {
            lightsImageView.setBackgroundResource(R.drawable.frame_anim);

            frameAnim = (AnimationDrawable) lightsImageView.getBackground();
        }

        //if the animation is running stop it
        if(frameAnim.isRunning())
        {
            frameAnim.stop();
        }
        else //start it
        {
            frameAnim.start();
        }
    }

    public void toggleRotateAnim(View v)
    {
        rotateAnim = AnimationUtils.loadAnimation(this, R.anim.rotate_anim);

        lightsImageView.startAnimation(rotateAnim);
    }

    public void toggleShakeAnim(View v)
    {
        shakeAnim = AnimationUtils.loadAnimation(this, R.anim.shake_anim);

        lightsImageView.startAnimation(shakeAnim);
    }

    public void toggleCustomAnim(View v)
    {
        customAnim = AnimationUtils.loadAnimation(this, R.anim.custom_anim);

        lightsImageView.startAnimation(customAnim);
    }
}
