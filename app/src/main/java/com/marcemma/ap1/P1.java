package com.marcemma.ap1; /*paquetería*/

/*importaciones iniciales*/
        importandroid.app.Activity;
        importandroid.content.Intent;
        importandroid.os.Bundle;
        importandroid.view.Menu;
        importandroid.view.MenuItem;
        publicclass P1 extends Activity {
@Override
protectedvoidonCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p1);
        /*
         * el parametro R.layout.activity_p1 corresponde al
         * fichero activity_p1.xml y a los objetos contenidos
         * en el.
         */
        }
@Override
publicbooleanonCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_p1, menu);
        returntrue;
        }
//metodo que llama a otro Activity
        publicbooleanonOptionsItemSelected(MenuItem mi){
//evalua la opcionelejida al presionar la tecla menu
        switch(mi.getItemId()){
        caseR.id.menu_settings:
        /*si la opcion seleccionada corresponde al parametro
         * R.id.menu_settings , entonces crea un nuevo
         * Intent el cual recibe dos parametros de entrada,
         * el primero corresponde a la clase actual P1.this, y
         * el segundo a la clase a la que se desea acceder
         * P2.class, la cual es un Activity*/
        Intent miIntent1 = new Intent(P1.this,P2.class);
        /*este metodo inicia la ejecucion del Activity, y
         * recibe como parametro de entrada un Intent*/
        startActivity(miIntent1);
        break;
        }
        return true;
        }
        }