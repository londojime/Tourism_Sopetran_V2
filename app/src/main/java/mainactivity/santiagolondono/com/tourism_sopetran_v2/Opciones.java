package mainactivity.santiagolondono.com.tourism_sopetran_v2;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.ListFragment;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class Opciones extends ListFragment {
    private String[] opcion;
   // private String[] opcion={"Presentación","Bares","Demografía","Hoteles","Sitios de interés"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        final String Presentacion    = getResources().getString(R.string.Presentacion);
        final String Bares        = getResources().getString(R.string.Bares);
        final String Demografia = getResources().getString(R.string.Demo);
        final String Hoteles      = getResources().getString(R.string.Hotel);
        final String Sitios = getResources().getString(R.string.Sitios);
        final String Mapa = getResources().getString(R.string.mapa);


        opcion = new String[]{Presentacion, Bares, Demografia, Hoteles, Sitios, Mapa};

        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,opcion));

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Toast.makeText(getActivity(),opcion[position], Toast.LENGTH_SHORT).show();
        FragmentManager fragmentManager=getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();


        if(position==0) {

            Inicio fragment = new Inicio();
            if (getResources().getConfiguration().orientation== Configuration.ORIENTATION_PORTRAIT) {
                fragmentTransaction.replace(R.id.fcambiarport, fragment).commit();
            }
            else

                fragmentTransaction.replace(R.id.fcambiar, fragment).commit();
        }

        if(position==1) {

            Bares fragment = new Bares();
            if (getResources().getConfiguration().orientation== Configuration.ORIENTATION_PORTRAIT) {
                fragmentTransaction.replace(R.id.fcambiarport, fragment).commit();
            }
            else

            fragmentTransaction.replace(R.id.fcambiar, fragment).commit();
        }

        if(position==2) {

            Demografia fragment = new Demografia();

            if (getResources().getConfiguration().orientation== Configuration.ORIENTATION_PORTRAIT){
                fragmentTransaction.replace(R.id.fcambiarport, fragment).commit();

            }
            else
            fragmentTransaction.replace(R.id.fcambiar, fragment).commit();


        }

        if(position==3) {

            Hotel fragment = new Hotel();
            if (getResources().getConfiguration().orientation== Configuration.ORIENTATION_PORTRAIT){
                fragmentTransaction.replace(R.id.fcambiarport, fragment).commit();

            }
            else
            fragmentTransaction.replace(R.id.fcambiar, fragment).commit();
        }

        if(position==4) {

            Sitios fragment = new Sitios();
            if (getResources().getConfiguration().orientation== Configuration.ORIENTATION_PORTRAIT){
                fragmentTransaction.replace(R.id.fcambiarport, fragment).commit();

            }
            else
            fragmentTransaction.replace(R.id.fcambiar, fragment).commit();
        }

        if(position==5) {

            Intent i =new Intent(getActivity(),MapsActivity.class);
            startActivity(i);
        }



    }
}
