package com.example.android_alen.myapplication;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.ProgressDialog;
import android.graphics.Movie;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.StringRequest;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    CustomAdapter customAdapter;
    List<ListClass>listClasses=new ArrayList<ListClass>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        customAdapter=new CustomAdapter(this,listClasses);

        listView=(ListView)findViewById(R.id.list_item);

        listView.setAdapter(customAdapter);


      setvalues();




            final MyFragment fragment=new MyFragment();
            final   FragmentManager fragmentManager=getFragmentManager();

            final FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
            fragmentTransaction.addToBackStack("back");
            fragmentTransaction.add(R.id.mainlayout, fragment, "firstfrag").addToBackStack("back");
            fragmentTransaction.commit();


// Tag used to cancel the request







    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);

        Log.d("onAttachFragment","attached");
    }

    public void setvalues()
    {


        for(int i=0;i<10;i++){

            ListClass listClass=new ListClass();

            listClass.setName("name "+i);
            listClass.setDisc("disc "+i);

            listClasses.add(listClass);

        }





    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
