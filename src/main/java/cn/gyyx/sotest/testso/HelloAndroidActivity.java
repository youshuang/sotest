package cn.gyyx.sotest.testso;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.widget.TextView;

public class HelloAndroidActivity extends Activity {

	private int jniValue  ;
	private int jniValue2 ;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        TextView  tv = new TextView(this);
        tv.setText( String.valueOf(intFromJNI() ));
        setContentView(tv);
    }
    
    public void setJniValue(){
    	jniValue = 20  ;
    }

    public native int  intFromJNI();

    public native String  unimplementedStringFromJNI();

    static {
        System.loadLibrary("hello-jni");
    }

}

