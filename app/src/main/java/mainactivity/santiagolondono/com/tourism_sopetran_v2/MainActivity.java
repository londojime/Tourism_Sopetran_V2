package mainactivity.santiagolondono.com.tourism_sopetran_v2;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager=getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        if (getResources().getConfiguration().orientation== Configuration.ORIENTATION_PORTRAIT){

            Opciones fragment = new Opciones();
            fragmentTransaction.replace(R.id.fcambiarport,fragment).commit();
        }

        else {
            Inicio fragment = new Inicio();
            fragmentTransaction.replace(R.id.fcambiar,fragment).commit();
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
        FragmentManager fragmentManager=getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        if (id == R.id.fpresentacion) {
            Inicio fragment = new Inicio();
            if (getResources().getConfiguration().orientation== Configuration.ORIENTATION_PORTRAIT){
                fragmentTransaction.replace(R.id.fcambiarport, fragment).commit();

            }
            else
                fragmentTransaction.replace(R.id.fcambiar, fragment).commit();
        }

        if (id == R.id.finicio) {

            if (getResources().getConfiguration().orientation== Configuration.ORIENTATION_PORTRAIT){
                Opciones fragment = new Opciones();
                fragmentTransaction.replace(R.id.fcambiarport, fragment).commit();

            }
            else{
                Inicio fragment = new Inicio();
                fragmentTransaction.replace(R.id.fcambiar, fragment).commit();}
        }

       if (id == R.id.fhotel) {
           Hotel fragment = new Hotel();
           if (getResources().getConfiguration().orientation== Configuration.ORIENTATION_PORTRAIT){
               fragmentTransaction.replace(R.id.fcambiarport, fragment).commit();

           }
           else
               fragmentTransaction.replace(R.id.fcambiar, fragment).commit();
       }



        if (id == R.id.fbares) {
            Bares fragment = new Bares();
            if (getResources().getConfiguration().orientation== Configuration.ORIENTATION_PORTRAIT){
                fragmentTransaction.replace(R.id.fcambiarport, fragment).commit();

            }
            else
                fragmentTransaction.replace(R.id.fcambiar, fragment).commit();
        }

        if (id == R.id.fdemo) {
            Demografia fragment = new Demografia();
            if (getResources().getConfiguration().orientation== Configuration.ORIENTATION_PORTRAIT){
                fragmentTransaction.replace(R.id.fcambiarport, fragment).commit();

            }
            else
                fragmentTransaction.replace(R.id.fcambiar, fragment).commit();
        }

        if (id == R.id.fsitios) {
            Sitios fragment = new Sitios();
            if (getResources().getConfiguration().orientation== Configuration.ORIENTATION_PORTRAIT){
                fragmentTransaction.replace(R.id.fcambiarport, fragment).commit();

            }
            else
                fragmentTransaction.replace(R.id.fcambiar, fragment).commit();
        }

        if (id == R.id.about) {
            Intent i =new Intent(this,activity_about.class);
            startActivity(i);
        }

        if (id == R.id.mapa) {
            Intent i =new Intent(this,MapsActivity.class);
            startActivity(i);
        }

        return super.onOptionsItemSelected(item);
        }


    }

