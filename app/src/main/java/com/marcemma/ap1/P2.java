package com.marcemma.ap1; /*paquetería*/

/*importaciones iniciales*/
        importandroid.app.Activity;
        importandroid.content.Intent;
        importandroid.os.Bundle;
        importandroid.view.View;
        importandroid.widget.Button;
        importandroid.widget.EditText;
        importandroid.widget.Toast;

        publicclass P2 extends Activity {
private Button bNext; /*creación del botón*/
        privateEditTexttNombre;
        privateEditTexttPaterno;
        privateEditTexttMaterno;

private String datos[] = {null,null,null};
        protectedvoidonCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p2);
        /*se realiza un vinculo con los objetos contenidos
         * dentro del fichero activity_p2.xml*/
        bNext = (Button)findViewById(R.id.buttonNext);
        tNombre = (EditText)findViewById(R.id.editTextNombre);
        tPaterno = (EditText)findViewById(R.id.editTextPaterno);
        tMaterno = (EditText)findViewById(R.id.editTextMaterno);
        /*el metodosetOnClickListener recibe como parametro
         * un eventoOnClick*/
        bNext.setOnClickListener(newView.OnClickListener() {

@Override
publicvoidonClick(View v) {
        /*Aqui se escriben las acciones que se realizan
         * al pulsar sobre el boton.
         */
        datos[0] =tNombre.getText().toString().toUpperCase();
        datos[1] =tPaterno.getText().toString().toUpperCase();
        datos[2] =tMaterno.getText().toString().toUpperCase();
        /*se evalua que el contenido del Array datos sea igual
         * a null*/
        if((datos[0].equals("")) || (datos[1].equals(""))
        || (datos[2].equals(""))){
        /*el objeto Toast es un mensaje emergente de
         * cortaduracion en pantalla.*/
        Toast.makeText(getApplicationContext(),
        "Faltaron campos por llenar",
        1).show();
        /*los parametros del metodomakeText,
         * corresponden al contexto, al texto
         * y al tiempo que dura el texto en
         * pantalla cuando se llama al metodo
         * show()*/
        }else{
        /*si el contenido del Array datos no es
         * igual a null se crea un Intent y
         * se envian los datos al siguente
         * Activity*/
        Intent miIntent2 = new Intent(P2.this,P3.class);
        /*el metodoputExtra sirve para enviar datos
         * a otro Activity,recibe dos parametros, el
         * primero es de tipo String y es una llave
         * o nombre con el cual identificar al Intent
         * que envio los datos; el segundo parametro
         * corresponde a los datos que seran enviados,
         * pueden ser cadenas, enteros,
         * flotantes o booleanos.
         */
        miIntent2.putExtra("datosP2",datos);
        startActivity(miIntent2);
        }
        }
        });
        }
        }