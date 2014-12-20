package com.hendra.tebakgambar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Soal5 extends Activity {
	EditText jawabanTxt;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_soal5);
	      //cari komponen editText1
  		jawabanTxt = (EditText)findViewById(R.id.editText1);
  		//set input huruf besar
  		jawabanTxt.setFilters(new InputFilter[] {new InputFilter.AllCaps()});
  	}
  	public void cekJawaban(View v){
  		String JawabanBenar = "KAPTEN KAPAL";
  		String jawabanUser = jawabanTxt.getText().toString();
  		if(jawabanUser.equals(JawabanBenar)){
  	// pean Toast
  			Toast.makeText(getApplicationContext(),
  					"JAWABAN TEPAT!", Toast.LENGTH_LONG).show();
  			Intent i = new Intent(getApplicationContext(), Soal6.class);
  			startActivity(i);
  		}
  		else{
  			//Pesan TOast
  			Toast.makeText(getApplicationContext(), "JAWABAN MASIH SALAH!", Toast.LENGTH_LONG).show();
  		
  		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.soal5, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
