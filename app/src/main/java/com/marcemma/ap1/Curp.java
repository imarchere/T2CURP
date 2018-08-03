package com.marcemma.ap1; /*paquetería*/
public class Curp { /*nombre de la clase principal*/
private String nombre; /*representa cadenas de caracteres*/
private String paterno; /*representa cadenas de caracteres*/
private String materno; /*representa cadenas de caracteres*/
private String sexo; /*representa cadenas de caracteres*/
private String estado; /*representa cadenas de caracteres*/
        privateintdd;
        privateintmm;
        privateintyyyy;
        /*Arreglo de tipo String que contiene las
         * claves de las entidades federativas de México*/
        finalstatic String claves[] = {"AS","BS","BC","CC","CS","CH","CL",
        "CM","DF","DG","GT","GR","HG","JC","MC","MN","MS","NT","NL","OC",
        "PL","QT","QR","SP","SL","SR","TC","TS","TL","VZ","YN","ZS","NE"};
        publicCurp(){
        this.nombre = null; /*es el contexto del estado actual de la aplicación / objeto*/
        this.paterno = null; /*es el contexto del estado actual de la aplicación / objeto*/
        this.materno = null; /*es el contexto del estado actual de la aplicación / objeto*/
        this.sexo = null; /*es el contexto del estado actual de la aplicación / objeto*/
        this.estado = null; /*es el contexto del estado actual de la aplicación / objeto*/
        this.mm = 0; /*es el contexto del estado actual de la aplicación / objeto inicializado en 0*/
        this.dd = 0; /*es el contexto del estado actual de la aplicación / objeto inicializado en 0*/
        this.yyyy = 0; /*es el contexto del estado actual de la aplicación / objeto inicializado en 0*/
        }
public String getNombre(){ /*representa cadenas de caracteres del objeto getNombre*/
        returnthis.nombre; /*retorna el valor según el estado de "nombre"*/
        }
        publicvoidsetNombre(String n){
        this.nombre = n;  /*es el contexto del estado actual del objeto*/
        }
public String getPaterno() /*representa cadenas de caracteres del objeto getPaterno*/
        returnthis.paterno; /*retorna el valor según el estado de "paterno"*/
        }
        publicvoidsetPaterno(String n){
        this.paterno = n; /*es el contexto del estado actual del objeto*/
        }
public String getMaterno(){ /*representa cadenas de caracteres del objeto getMaterno*/
        returnthis.materno; /*retorna el valor según el estado de "materno"*/
        }
        publicvoidsetMaterno(String n){
        this.materno = n; /*es el contexto del estado actual del objeto*/
        }
public String getSexo(){ /*representa cadenas de caracteres del objeto getSexo*/
        returnthis.sexo; /*retorna el valor según el estado de "sexo"*/
        }
        publicvoidsetSexo(String n){
        this.sexo = n; /*es el contexto del estado actual del objeto*/
        }
public String getEstado(){ /*representa cadenas de caracteres del objeto getEstado*/
        returnthis.estado; /*retorna el valor según el estado de "estado"*/
        }
        publicvoidsetEstado(String n){
        this.estado = n; /*es el contexto del estado actual del objeto*/
        }
        publicintgetDD(){
        returnthis.dd;
        }
        publicvoidsetDD(int n){
        this.dd = n;
        }
        publicintgetMM(){
        returnthis.mm;
        }
        publicvoidsetMM(int n){
        this.mm = n;
        }
        publicintgetYYYY(){
        returnthis.yyyy;
        }
        publicvoidsetYYYY(int n){
        this.yyyy = n;
        }
public String generaClave(int id){
        String re = claves[id];
        return re;
        }
public String buscaVocales(String en){ /*Arreglo de tipo String que contiene las vocales admitidas*/
        String re = "";
        en.toUpperCase();
        for (int i=1; i<en.length(); i ++){
        if(en.charAt(i) == 'A' || en.charAt(i) == 'E'
        || en.charAt(i) == 'I' || en.charAt(i) == 'O'
        || en.charAt(i) == 'U'){
        re=""+en.charAt(i);
        break;
        }
        }
        return re;
        }
public String buscaConsonantes(String en){ /*Arreglo de tipo String que contiene las consonantes admitidas*/
        String re = "";
        en.toUpperCase();
        for (int i=1; i<en.length(); i ++){
        if(en.charAt(i) == 'B' || en.charAt(i) == 'C'
        || en.charAt(i) == 'D' || en.charAt(i) == 'F'
        || en.charAt(i) == 'G' || en.charAt(i) == 'H'
        || en.charAt(i) == 'J' || en.charAt(i) == 'K'
        || en.charAt(i) == 'L' || en.charAt(i) == 'M'
        || en.charAt(i) == 'N' || en.charAt(i) == 'Ñ'
        || en.charAt(i) == 'P' || en.charAt(i) == 'Q'
        || en.charAt(i) == 'R' || en.charAt(i) == 'S'
        || en.charAt(i) == 'T' || en.charAt(i) == 'V'
        || en.charAt(i) == 'W' || en.charAt(i) == 'X'
        || en.charAt(i) == 'Y' || en.charAt(i) == 'Z'){
        re=""+en.charAt(i);
        break;
        }
        }
        return re;
        }
public String generaCurp(String clave){ /*Arreglo de tipo String que crea la CURP del usuario*/
        String ddd,mmm,yyy;
        yyy = ""+this.yyyy;
        if(this.dd<10){
        ddd = "0"+this.dd;
        }else{ddd = ""+this.dd;}
        if(this.mm<10){
        mmm = "0"+this.mm;
        }else{mmm = ""+this.mm;}
        String re =""+this.paterno.charAt(0)+buscaVocales(this.paterno)+
        this.materno.charAt(0)+this.nombre.charAt(0)+yyy.charAt(2)+
        yyy.charAt(3)+mmm+ddd+this.sexo.charAt(0)+
        clave+buscaConsonantes(this.paterno)+
        buscaConsonantes(this.materno)+buscaConsonantes(this.nombre);
        return re;
        }
        }