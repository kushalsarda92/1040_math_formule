package com.example.math_formule;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class EnterActivity extends Activity implements OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_enter);
		
		Button entbutton1= (Button) findViewById(R.id.entbutton1);
        entbutton1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
            	Intent ei1=new Intent(EnterActivity.this,DerivActivity.class);
                startActivity(ei1);

            }
        });
        
        Button entbutton2= (Button) findViewById(R.id.entbutton2);
        entbutton2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
            	Intent ei2=new Intent(EnterActivity.this,IntegActivity.class);
                startActivity(ei2);

            }
        });
        
        Button entbutton3= (Button) findViewById(R.id.entbutton3);
        entbutton3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
            	Intent ei3=new Intent(EnterActivity.this,CompActivity.class);
                startActivity(ei3);

            }
        });
        
        Button entbutton4= (Button) findViewById(R.id.entbutton4);
        entbutton4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
            	Intent ei4=new Intent(EnterActivity.this,AlgeActivity.class);
                startActivity(ei4);

            }
        });
        
        Button entbutton5= (Button) findViewById(R.id.entbutton5);
        entbutton5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
            	Intent ei5=new Intent(EnterActivity.this,TrigActivity.class);
                startActivity(ei5);

            }
        });
        
      		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.enter, menu);
		return true;
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
	}

}
