/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clue.fina;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author ricardo sanchez
 */
public class ClueFina extends JFrame implements ActionListener{
    JButton suponer;
    JButton nar,sas,kak,it,min,ob,mad,shi,hin;
    JButton kun,shu,kat,gua,aba,mari,cu,esp,sen;
    JButton ho,nu,nie,are,llu,rem,lun,val,cue;
    JButton RP,RA,RL;
    JTextField PD,AD,LD;
    JComboBox per,arm,lug;
    JLabel texto1,texto2,texto3,texto4,texto5,texto6;
    ImageIcon kunai,shuriken,katana,guadaña,abanico,marioneta,cuchilla,espada,senbon;
    ImageIcon naruto,sasuke,kakashi,itachi,minato,obito,madara,shisui,hinata;
    ImageIcon hoja,nube,niebla,arena,lluvia,remolino,luna,valle,cueva,pant;
    public int A = (int) Math.floor(Math.random()*9);
    public int B = (int) Math.floor(Math.random()*9);
    public int C = (int) Math.floor(Math.random()*9);
    public int p=0,a=0,l=0,i=0; 
    public int bandera1=0,bandera2=0,bandera3=0,bandera4=0,bandera5=0;
    public String r;
    public String PersonajesD[]={"Naruto no fue Dattebayo","Sasuke es su esposo","Kakashi estaba con el hokage",
        "Itachi no la atacaria sin razón","Minato estaba con kakashi","Obito se encontraba en el limbo",
        "Madara todavia no revivia","Shisui estaba con itachi","Hinata es su mejor amiga"};
    public String PersonajesE[]={"Naruto se vengo por la friendzone ","Sasuke le hizo un chidori ","Kakashi se canso de su inutiles ",
        "Itachi fue visto cerca ","Habia la marca del hirashin ","Se vio la mascara de Tobi ",
        "Madara lo planeo todo desde el principio","Shisui saco a pasear el kotoamatsukami","Hinata lo hizo por Naruto"};
    public String ArmasD[]={"\nademas no tenia marca de Kunai en la herida","\nademas no tenia marca de Shuriken en la herida","\nademas no tenia marca de Katana en la herda","\nademas la Guadaña esta enterrada con hidan",
        "\nademas los Abanicos los controla temari","\nademas no habia indicios de Marionetas","\nademas la Cuchilla de Chakra solo pocos la dominan","\n ademas la Espada de Sangre esta guardada","\nademas no tenia marca de Senbon la herida"};
    public String ArmasE[]={"\n Y uso varios Kunai","\nY uso los Shuriken","\nY uso la Katana","\nY utilizó la Guadaña de Hidan",
        "\nY uso el Abanico con tres lunas","\nY uso la marioneta de sasori","\nY uso la Cuchilla de Chakra","\nY utilizo la Espada de Sangre","\nY sabia usar los senbon perfectamente"};
    public String LugaresD[]={"\nNo fue en la Aldea de la Hoja","\nNo fue en la Aldea de las Nubes","\nNo fue en la Aldea de la Niebla","\nNo fue en la Aldea de la Arena","\nNo fue en la Aldea de la Lluvia",
    "\nNo fue en la Aldea del Remolino","\nNo fue en la Luna","\nNo fue en el valle del fin","\nNo fue en la Cueva de Akatsuki"};
    public String LugaresE[]={"\nEl cuerpo estaba en la Aldea de la Hoja","\nEl cuerpo estaba en la Aldea de las Nubes","\nEl cuerpo estaba en la Aldea de la Niebla","\nEl cuerpo estaba en la Aldea de la Arena","\nEl cuerpo estaba en la Aldea de la Lluvia",
    "\nEl cuerpo estaba en la Aldea del Remolino","\nEl cuerpo estaba en la Luna","\nEl cuerpo estaba en el valle del fin","\nEl cuerpo estaba en la Cueva de Akatsuki"};
    
    
    public String p1,a1,l1;
    /**
     * @param args the command line arguments
     */
    public void personajes(){
       nar=new JButton("Naruto");
       nar.setBackground(Color.orange);
       nar.setBounds(10,50,100,50);
       add(nar);
       
       sas=new JButton("Sasuke");
       sas.setBackground(Color.orange);
       sas.setBounds(120,50,100,50);
       add(sas);
       
       kak=new JButton("Kakashi");
       kak.setBackground(Color.orange);
       kak.setBounds(230,50,100,50);
       add(kak);
       
       it=new JButton("Itachi");
       it.setBackground(Color.orange);
       it.setBounds(10,110,100,50);
       add(it);
       
       min=new JButton("Minato");
       min.setBackground(Color.orange);
       min.setBounds(120,110,100,50);
       add(min);
       
       ob=new JButton("Obito");
       ob.setBackground(Color.orange);
       ob.setBounds(230,110,100,50);
       add(ob);
       
       mad=new JButton("Madara");
       mad.setBackground(Color.orange);
       mad.setBounds(10,170,100,50);
       add(mad);
       
       shi=new JButton("Shisui");
       shi.setBackground(Color.orange);
       shi.setBounds(120,170,100,50);
       add(shi);
       
       hin=new JButton("Hinata");
       hin.setBackground(Color.orange);
       hin.setBounds(230,170,100,50);
       add(hin);
    }
    
    public void armas(){
       kun=new JButton("Kunai");
       kun.setBackground(Color.green);
       kun.setBounds(340,50,100,50);
       add(kun);
       
       shu=new JButton("Shuriken");
       shu.setBackground(Color.green);
       shu.setBounds(450,50,100,50);
       add(shu);
       
       kat=new JButton("Katana");
       kat.setBackground(Color.green);
       kat.setBounds(560,50,100,50);
       add(kat);
       
       gua=new JButton("Guadaña");
       gua.setBackground(Color.green);
       gua.setBounds(340,110,100,50);
       add(gua);
       
       aba=new JButton("Abanico");
       aba.setBackground(Color.green);
       aba.setBounds(450,110,100,50);
       add(aba);
       
       mari=new JButton("Marioneta");
       mari.setBackground(Color.green);
       mari.setBounds(560,110,100,50);
       add(mari);
       
       cu=new JButton("Cuchilla");
       cu.setBackground(Color.green);
       cu.setBounds(340,170,100,50);
       add(cu);
       
       esp=new JButton("Espada");
       esp.setBackground(Color.green);
       esp.setBounds(450,170,100,50);
       add(esp);
       
       sen=new JButton("Senbon");
       sen.setBackground(Color.green);
       sen.setBounds(560,170,100,50);
       add(sen);
    }
    
    public void lugares(){
       ho=new JButton("Hoja");
       ho.setBackground(Color.cyan);
       ho.setBounds(680,50,100,50);
       add(ho);
       
       nu=new JButton("Nubes");
       nu.setBackground(Color.cyan);
       nu.setBounds(790,50,100,50);
       add(nu);
       
       nie=new JButton("Niebla");
       nie.setBackground(Color.cyan);
       nie.setBounds(900,50,100,50);
       add(nie);
       
       are=new JButton("Arena");
       are.setBackground(Color.cyan);
       are.setBounds(680,110,100,50);
       add(are);
       
       llu=new JButton("LLuvia");
       llu.setBackground(Color.cyan);
       llu.setBounds(790,110,100,50);
       add(llu);
       
       rem=new JButton("Remolino");
       rem.setBackground(Color.cyan);
       rem.setBounds(900,110,100,50);
       add(rem);
       
       lun=new JButton("Luna");
       lun.setBackground(Color.cyan);
       lun.setBounds(680,170,100,50);
       add(lun);
       
       val=new JButton("Valle");
       val.setBackground(Color.cyan);
       val.setBounds(790,170,100,50);
       add(val);
       
       cue=new JButton("Cueva");
       cue.setBackground(Color.cyan);
       cue.setBounds(900,170,100,50);
       add(cue);
    }
    
    public void demas(){
       RP=new JButton("");
       RP.setBackground(Color.white);
       RP.setBounds(70,290,200,200);
       add(RP);
       
       RA=new JButton("");
       RA.setBackground(Color.white);
       RA.setBounds(390,290,200,200);
       add(RA);
       
       RL=new JButton("");
       RL.setBackground(Color.white);
       RL.setBounds(740,290,200,200);
       add(RL);
       
       PD = new JTextField("");
       PD.setBounds(70,500,200,30);
       add(PD);
       
       AD = new JTextField("");
       AD.setBounds(390,500,200,30);
       add(AD);
       
       LD = new JTextField("");
       LD.setBounds(740,500,200,30);
       add(LD);
       
       suponer=new JButton("suponer");
       suponer.setBackground(Color.red);
       suponer.setBounds(900,620,100,50);
       add(suponer);
       suponer.addActionListener(this);
       
       texto1=new JLabel("Personajes que pueden ser el culpable");
       texto1.setBounds(50,10,250,30);
       add(texto1);
       
       texto2=new JLabel("Arma que podria haber sido");
       texto2.setBounds(400,10,250,30);
       add(texto2);
       
       texto3=new JLabel("Lugar donde pudo ser");
       texto3.setBounds(750,10,250,30);
       add(texto3);
       
       texto4=new JLabel("Quien piensas que fue");
       texto4.setBounds(100,250,250,30);
       add(texto4);
       
       texto5=new JLabel("Con que piensas que fue");
       texto5.setBounds(420,250,250,30);
       add(texto5);
       
       texto6=new JLabel("Donde crees que fue");
       texto6.setBounds(770,250,250,30);
       add(texto6);
       
    }
    
    public void Ocultar(){
        RP.setVisible(false);
        RA.setVisible(false);
        RL.setVisible(false);
        PD.setVisible(false);
        AD.setVisible(false);
        LD.setVisible(false);
        suponer.setVisible(false);
        per.setVisible(false);
        arm.setVisible(false);
        lug.setVisible(false);
        texto1.setVisible(false);
        texto2.setVisible(false);
        texto3.setVisible(false);
        texto4.setVisible(false);
        texto5.setVisible(false);
        texto6.setVisible(false);
        nar.setVisible(false);
        sas.setVisible(false);
        kak.setVisible(false);
        it.setVisible(false);
        min.setVisible(false);
        ob.setVisible(false);
        mad.setVisible(false);
        hin.setVisible(false);
        shi.setVisible(false);
        kun.setVisible(false);
        shu.setVisible(false);
        kat.setVisible(false);
        gua.setVisible(false);
        aba.setVisible(false);
        mari.setVisible(false);
        cu.setVisible(false);
        esp.setVisible(false);
        sen.setVisible(false);
        ho.setVisible(false);
        nu.setVisible(false);
        nie.setVisible(false);
        are.setVisible(false);
        llu.setVisible(false);
        rem.setVisible(false);
        lun.setVisible(false);
        val.setVisible(false);
        cue.setVisible(false);
    }
    
    public void mostrar(){
        RP.setVisible(true);
        RA.setVisible(true);
        RL.setVisible(true);
        PD.setVisible(true);
        AD.setVisible(true);
        LD.setVisible(true);
        suponer.setVisible(true);
        per.setVisible(true);
        arm.setVisible(true);
        lug.setVisible(true);
        texto1.setVisible(true);
        texto2.setVisible(true);
        texto3.setVisible(true);
        texto4.setVisible(true);
        texto5.setVisible(true);
        texto6.setVisible(true);
        nar.setVisible(true);
        sas.setVisible(true);
        kak.setVisible(true);
        it.setVisible(true);
        min.setVisible(true);
        ob.setVisible(true);
        mad.setVisible(true);
        hin.setVisible(true);
        shi.setVisible(true);
        kun.setVisible(true);
        shu.setVisible(true);
        kat.setVisible(true);
        gua.setVisible(true);
        aba.setVisible(true);
        mari.setVisible(true);
        cu.setVisible(true);
        esp.setVisible(true);
        sen.setVisible(true);
        ho.setVisible(true);
        nu.setVisible(true);
        nie.setVisible(true);
        are.setVisible(true);
        llu.setVisible(true);
        rem.setVisible(true);
        lun.setVisible(true);
        val.setVisible(true);
        cue.setVisible(true);
    }
    
    public void combos(){
       per=new JComboBox();
       per.setBounds(70, 540, 200, 50);
       per.addItem("Naruto");
       per.addItem("Sasuke");
       per.addItem("Kakashi");
       per.addItem("Itachi");
       per.addItem("Minato");
       per.addItem("Obito");
       per.addItem("Madara");
       per.addItem("Shisui");
       per.addItem("Hinata");
       add(per);
       per.setVisible(true);
       per.addActionListener(new ActionListener() 
        {
        
            @Override
        public void actionPerformed(ActionEvent w) {
        p1=per.getSelectedItem().toString();
        switch(p1){
                case "Naruto":
                    p=0;
                break;
                case "Sasuke":
                    p=1;
                break;
                case "Kakashi":
                    p=2;
                break;
                case "Itachi":
                    p=3;
                break;
                case "Minato":
                    p=4;
                break;
                case "Obito":
                    p=5;
                break;
                case "Madara":
                    p=6;
                break;
                case "Shisui":
                    p=7;
                break;
                case "Hinata":
                    p=8;
                break;
        }
        }
        });
       
       
        arm=new JComboBox();
        arm.setBounds(390, 540, 200, 50);
        arm.addItem("Unos Kunai");
        arm.addItem("Unos Shuriken");
        arm.addItem("La Katana");
        arm.addItem("La Guadaña");
        arm.addItem("El Abanico");
        arm.addItem("Una Marioneta");
        arm.addItem("La Cuchilla");
        arm.addItem("La Espada");
        arm.addItem("Los Senbon");
        add(arm);
        arm.setVisible(true);
        arm.addActionListener(new ActionListener() 
         {

             @Override
         public void actionPerformed(ActionEvent w) {
         a1=arm.getSelectedItem().toString();
         switch(a1){
                 case "Unos Kunai":
                     a=0;
                 break;
                 case "Unos Shuriken":
                     a=1;
                 break;
                 case "La Katana":
                     a=2;
                 break;
                 case "La Guadaña":
                     a=3;
                 break;
                 case "El Abanico":
                     a=4;
                 break;
                 case "Una Marioneta":
                     a=5;
                 break;
                 case "La Cuchilla":
                     a=6;
                 break;
                 case "La Espada":
                     a=7;
                 break;
                 case "Los Senbon":
                     a=8;
                 break;
         }
         }
         });
        lug=new JComboBox();
        lug.setBounds(740, 540, 200, 50);
        lug.addItem("La Aldea de la Hoja");
        lug.addItem("La Aldea de las Nubes");
        lug.addItem("La Aldea de la Niebla");
        lug.addItem("La Aldea de la Arena");
        lug.addItem("La Aldea de la Lluvia");
        lug.addItem("La Aldea del Remolino");
        lug.addItem("La Luna");
        lug.addItem("El valle del fin");
        lug.addItem("La Cueva de Akatsuki");
        add(lug);
        lug.setVisible(true);
        lug.addActionListener(new ActionListener() 
         {

             @Override
         public void actionPerformed(ActionEvent w) {
         l1=lug.getSelectedItem().toString();
         switch(l1){
                 case "La Aldea de la Hoja":
                     l=0;
                 break;
                 case "La Aldea de las Nubes":
                     l=1;
                 break;
                 case "La Aldea de la Niebla":
                     l=2;
                 break;
                 case "La Aldea de la Arena":
                     l=3;
                 break;
                 case "La Aldea de la Lluvia":
                     l=4;
                 break;
                 case "La Aldea del Remolino":
                     l=5;
                 break;
                 case "La Luna":
                     l=6;
                 break;
                 case "El valle del fin":
                     l=7;
                 break;
                 case "La Cueva de Akatsuki":
                     l=8;
                 break;
         }
         }
         });
    }
    
    public void imagenes(){
        switch(p){
                    case 0:
                        naruto= new ImageIcon("Naruto.jpg");
                        RP.setIcon(naruto);
                        if (p==A){
                            PD.setText("Encontraste al culpable");
                            bandera1=1;
                            per.setVisible(false);
                            nar.setVisible(false);
                            sas.setVisible(false);
                            kak.setVisible(false);
                            it.setVisible(false);
                            min.setVisible(false);
                            ob.setVisible(false);
                            mad.setVisible(false);
                            hin.setVisible(false);
                            shi.setVisible(false);
                        }
                        else{
                            PD.setText("Sigue buscando");
                            nar.setVisible(false);
                        }
                    break;
                    
                    case 1:
                        sasuke= new ImageIcon("Sasuke.jpg");
                        RP.setIcon(sasuke);
                        if (p==A){
                            PD.setText("Encontraste al culpable");
                            bandera1=1;
                            per.setVisible(false);
                            nar.setVisible(false);
                            sas.setVisible(false);
                            kak.setVisible(false);
                            it.setVisible(false);
                            min.setVisible(false);
                            ob.setVisible(false);
                            mad.setVisible(false);
                            hin.setVisible(false);
                            shi.setVisible(false);
                        }
                        else{
                            PD.setText("Sigue buscando");
                            sas.setVisible(false);
                        }
                    break;
                    
                    case 2:
                        kakashi= new ImageIcon("Kakashi.jpg");
                        RP.setIcon(kakashi);
                        if (p==A){
                            PD.setText("Encontraste al culpable");
                            bandera1=1;
                            per.setVisible(false);
                            nar.setVisible(false);
                            sas.setVisible(false);
                            kak.setVisible(false);
                            it.setVisible(false);
                            min.setVisible(false);
                            ob.setVisible(false);
                            mad.setVisible(false);
                            hin.setVisible(false);
                            shi.setVisible(false);
                        }
                        else{
                            PD.setText("Sigue buscando");
                            kak.setVisible(false);
                        }
                    break;
                    
                    case 3:
                        itachi= new ImageIcon("Itachi.jpg");
                        RP.setIcon(itachi);
                        if (p==A){
                            PD.setText("Encontraste al culpable");
                            bandera1=1;
                            per.setVisible(false);
                            nar.setVisible(false);
                            sas.setVisible(false);
                            kak.setVisible(false);
                            it.setVisible(false);
                            min.setVisible(false);
                            ob.setVisible(false);
                            mad.setVisible(false);
                            hin.setVisible(false);
                            shi.setVisible(false);
                        }
                        else{
                            PD.setText("Sigue buscando");
                            it.setVisible(false);
                        }
                    break;
                    
                    case 4:
                        minato= new ImageIcon("Minato.jpg");
                        RP.setIcon(minato);
                        if (p==A){
                            PD.setText("Encontraste al culpable");
                            bandera1=1;
                            per.setVisible(false);
                            nar.setVisible(false);
                            sas.setVisible(false);
                            kak.setVisible(false);
                            it.setVisible(false);
                            min.setVisible(false);
                            ob.setVisible(false);
                            mad.setVisible(false);
                            hin.setVisible(false);
                            shi.setVisible(false);
                        }
                        else{
                            PD.setText("Sigue buscando");
                            min.setVisible(false);
                        }
                    break;
                    
                    case 5:
                        obito= new ImageIcon("Obito.jpg");
                        RP.setIcon(obito);
                        if (p==A){
                            PD.setText("Encontraste al culpable");
                            bandera1=1;
                            per.setVisible(false);
                            nar.setVisible(false);
                            sas.setVisible(false);
                            kak.setVisible(false);
                            it.setVisible(false);
                            min.setVisible(false);
                            ob.setVisible(false);
                            mad.setVisible(false);
                            hin.setVisible(false);
                            shi.setVisible(false);
                        }
                        else{
                            PD.setText("Sigue buscando");
                            ob.setVisible(false);
                        }
                    break;
                    
                    case 6:
                        madara= new ImageIcon("Madara.jpg");
                        RP.setIcon(madara);
                        if (p==A){
                            PD.setText("Encontraste al culpable");
                            bandera1=1;
                            per.setVisible(false);
                            nar.setVisible(false);
                            sas.setVisible(false);
                            kak.setVisible(false);
                            it.setVisible(false);
                            min.setVisible(false);
                            ob.setVisible(false);
                            mad.setVisible(false);
                            hin.setVisible(false);
                            shi.setVisible(false);
                        }
                        else{
                            PD.setText("Sigue buscando");
                            mad.setVisible(false);
                        }
                    break;
                    
                    case 7:
                        shisui= new ImageIcon("Shisui.jpg");
                        RP.setIcon(shisui);
                        if (p==A){
                            PD.setText("Encontraste al culpable");
                            bandera1=1;
                            per.setVisible(false);
                            nar.setVisible(false);
                            sas.setVisible(false);
                            kak.setVisible(false);
                            it.setVisible(false);
                            min.setVisible(false);
                            ob.setVisible(false);
                            mad.setVisible(false);
                            hin.setVisible(false);
                            shi.setVisible(false);
                        }
                        else{
                            PD.setText("Sigue buscando");
                            shi.setVisible(false);
                        }
                    break;
                    
                    case 8:
                        hinata= new ImageIcon("Hinata.jpg");
                        RP.setIcon(hinata);
                        if (p==A){
                            PD.setText("Encontraste al culpable");
                            bandera1=1;
                            per.setVisible(false);
                            nar.setVisible(false);
                            sas.setVisible(false);
                            kak.setVisible(false);
                            it.setVisible(false);
                            min.setVisible(false);
                            ob.setVisible(false);
                            mad.setVisible(false);
                            hin.setVisible(false);
                            shi.setVisible(false);
                        }
                        else{
                            PD.setText("Sigue buscando");
                            hin.setVisible(false);
                        }
                    break;
                }
                
                switch(a){
                    case 0:
                        kunai= new ImageIcon("kunai.jpg");
                        RA.setIcon(kunai);
                        if (a==B){
                            AD.setText("Encontraste con que fue");
                            bandera2=1;
                            arm.setVisible(false);
                            kun.setVisible(false);
                            shu.setVisible(false);
                            kat.setVisible(false);
                            gua.setVisible(false);
                            aba.setVisible(false);
                            mari.setVisible(false);
                            cu.setVisible(false);
                            esp.setVisible(false);
                            sen.setVisible(false);
                        }
                        else{
                            AD.setText("Sigue buscando");
                            kun.setVisible(false);
                        }
                    break;
                    
                    case 1:
                        shuriken= new ImageIcon("shuriken.jpg");
                        RA.setIcon(shuriken);
                        if (a==B){
                            PD.setText("Encontraste con que fue");
                            bandera2=1;
                            arm.setVisible(false);
                            kun.setVisible(false);
                            shu.setVisible(false);
                            kat.setVisible(false);
                            gua.setVisible(false);
                            aba.setVisible(false);
                            mari.setVisible(false);
                            cu.setVisible(false);
                            esp.setVisible(false);
                            sen.setVisible(false);
                        }
                        else{
                            AD.setText("Sigue buscando");
                            shu.setVisible(false);
                        }
                    break;
                    
                    case 2:
                        katana = new ImageIcon("katana.jpg");
                        RA.setIcon(katana);
                        if (a==B){
                            AD.setText("Encontraste con que fue");
                            bandera2=1;
                            arm.setVisible(false);
                            kun.setVisible(false);
                            shu.setVisible(false);
                            kat.setVisible(false);
                            gua.setVisible(false);
                            aba.setVisible(false);
                            mari.setVisible(false);
                            cu.setVisible(false);
                            esp.setVisible(false);
                            sen.setVisible(false);
                        }
                        else{
                            AD.setText("Sigue buscando");
                            kat.setVisible(false);
                        }
                    break;
                    
                    case 3:
                        guadaña= new ImageIcon("guadana.jpg");
                        RA.setIcon(guadaña);
                        if (a==B){
                            AD.setText("Encontraste con que fue");
                            bandera2=1;
                            arm.setVisible(false);
                            kun.setVisible(false);
                            shu.setVisible(false);
                            kat.setVisible(false);
                            gua.setVisible(false);
                            aba.setVisible(false);
                            mari.setVisible(false);
                            cu.setVisible(false);
                            esp.setVisible(false);
                            sen.setVisible(false);
                        }
                        else{
                            AD.setText("Sigue buscando");
                            gua.setVisible(false);
                        }
                    break;
                    
                    case 4:
                        abanico= new ImageIcon("abanico.jpg");
                        RA.setIcon(abanico);
                        if (a==B){
                            AD.setText("Encontraste con que fue");
                            bandera2=1;
                            arm.setVisible(false);
                            kun.setVisible(false);
                            shu.setVisible(false);
                            kat.setVisible(false);
                            gua.setVisible(false);
                            aba.setVisible(false);
                            mari.setVisible(false);
                            cu.setVisible(false);
                            esp.setVisible(false);
                            sen.setVisible(false);
                        }
                        else{
                            AD.setText("Sigue buscando");
                            aba.setVisible(false);
                        }
                    break;
                    
                    case 5:
                        marioneta= new ImageIcon("marioneta.jpg");
                        RA.setIcon(marioneta);
                        if (a==B){
                            AD.setText("Encontraste con que fue");
                            bandera2=1;
                            arm.setVisible(false);
                            kun.setVisible(false);
                            shu.setVisible(false);
                            kat.setVisible(false);
                            gua.setVisible(false);
                            aba.setVisible(false);
                            mari.setVisible(false);
                            cu.setVisible(false);
                            esp.setVisible(false);
                            sen.setVisible(false);
                        }
                        else{
                            AD.setText("Sigue buscando");
                            mari.setVisible(false);
                        }
                    break;
                    
                    case 6:
                        cuchilla= new ImageIcon("cuchilla.jpg");
                        RA.setIcon(cuchilla);
                        if (a==B){
                            AD.setText("Encontraste con que fue");
                            bandera2=1;
                            arm.setVisible(false);
                            kun.setVisible(false);
                            shu.setVisible(false);
                            kat.setVisible(false);
                            gua.setVisible(false);
                            aba.setVisible(false);
                            mari.setVisible(false);
                            cu.setVisible(false);
                            esp.setVisible(false);
                            sen.setVisible(false);
                        }
                        else{
                            AD.setText("Sigue buscando");
                            cu.setVisible(false);
                        }
                    break;
                    
                    case 7:
                        espada= new ImageIcon("espada.jpg");
                        RA.setIcon(espada);
                        if (a==B){
                            AD.setText("Encontraste con que fue");
                            bandera2=1;
                            arm.setVisible(false);
                            kun.setVisible(false);
                            shu.setVisible(false);
                            kat.setVisible(false);
                            gua.setVisible(false);
                            aba.setVisible(false);
                            mari.setVisible(false);
                            cu.setVisible(false);
                            esp.setVisible(false);
                            sen.setVisible(false);
                        }
                        else{
                            AD.setText("Sigue buscando");
                            esp.setVisible(false);
                        }
                    break;
                    
                    case 8:
                        senbon= new ImageIcon("senbon.jpg");
                        RA.setIcon(senbon);
                        if (a==B){
                            AD.setText("Encontraste con que fue");
                            bandera2=1;
                            arm.setVisible(false);
                            kun.setVisible(false);
                            shu.setVisible(false);
                            kat.setVisible(false);
                            gua.setVisible(false);
                            aba.setVisible(false);
                            mari.setVisible(false);
                            cu.setVisible(false);
                            esp.setVisible(false);
                            sen.setVisible(false);
                        }
                        else{
                            AD.setText("Sigue buscando");
                            sen.setVisible(false);
                        }
                    break;
                }
            
            switch(l){
                    case 0:
                        hoja= new ImageIcon("hoja.jpg");
                        RL.setIcon(hoja);
                        if (l==C){
                            LD.setText("Encontraste donde fue");
                            bandera3=1;
                            lug.setVisible(false);
                            ho.setVisible(false);
                            nu.setVisible(false);
                            nie.setVisible(false);
                            are.setVisible(false);
                            llu.setVisible(false);
                            rem.setVisible(false);
                            lun.setVisible(false);
                            val.setVisible(false);
                            cue.setVisible(false);
                        }
                        else{
                            LD.setText("Sigue buscando");
                            ho.setVisible(false);
                        }
                    break;
                    
                    case 1:
                        nube= new ImageIcon("nube.jpg");
                        RL.setIcon(nube);
                        if (l==C){
                            LD.setText("Encontraste donde fue");
                            bandera3=1;
                            lug.setVisible(false);
                            ho.setVisible(false);
                            nu.setVisible(false);
                            nie.setVisible(false);
                            are.setVisible(false);
                            llu.setVisible(false);
                            rem.setVisible(false);
                            lun.setVisible(false);
                            val.setVisible(false);
                            cue.setVisible(false);
                        }
                        else{
                            LD.setText("Sigue buscando");
                            nu.setVisible(false);
                        }
                    break;
                    
                    case 2:
                        niebla= new ImageIcon("niebla.jpg");
                        RL.setIcon(niebla);
                        if (l==C){
                            LD.setText("Encontraste donde fue");
                            bandera3=1;
                            lug.setVisible(false);
                            ho.setVisible(false);
                            nu.setVisible(false);
                            nie.setVisible(false);
                            are.setVisible(false);
                            llu.setVisible(false);
                            rem.setVisible(false);
                            lun.setVisible(false);
                            val.setVisible(false);
                            cue.setVisible(false);
                        }
                        else{
                            LD.setText("Sigue buscando");
                            nie.setVisible(false);
                        }
                    break;
                    
                    case 3:
                        arena= new ImageIcon("arena.jpg");
                        RL.setIcon(arena);
                        if (l==C){
                            LD.setText("Encontraste donde fue");
                            bandera3=1;
                            lug.setVisible(false);
                            ho.setVisible(false);
                            nu.setVisible(false);
                            nie.setVisible(false);
                            are.setVisible(false);
                            llu.setVisible(false);
                            rem.setVisible(false);
                            lun.setVisible(false);
                            val.setVisible(false);
                            cue.setVisible(false);
                        }
                        else{
                            LD.setText("Sigue buscando");
                            are.setVisible(false);
                        }
                    break;
                    
                    case 4:
                        lluvia= new ImageIcon("lluvia.jpg");
                        RL.setIcon(lluvia);
                        if (l==C){
                            PD.setText("Encontraste donde fue");
                            bandera3=1;
                            lug.setVisible(false);
                            ho.setVisible(false);
                            nu.setVisible(false);
                            nie.setVisible(false);
                            are.setVisible(false);
                            llu.setVisible(false);
                            rem.setVisible(false);
                            lun.setVisible(false);
                            val.setVisible(false);
                            cue.setVisible(false);
                        }
                        else{
                            LD.setText("Sigue buscando");
                            llu.setVisible(false);
                        }
                    break;
                    
                    case 5:
                        remolino= new ImageIcon("remolino.jpg");
                        RL.setIcon(remolino);
                        if (l==C){
                            LD.setText("Encontraste donde fue");
                            bandera3=1;
                            lug.setVisible(false);
                            ho.setVisible(false);
                            nu.setVisible(false);
                            nie.setVisible(false);
                            are.setVisible(false);
                            llu.setVisible(false);
                            rem.setVisible(false);
                            lun.setVisible(false);
                            val.setVisible(false);
                            cue.setVisible(false);
                        }
                        else{
                            LD.setText("Sigue buscando");
                            rem.setVisible(false);
                        }
                    break;
                    
                    case 6:
                        luna= new ImageIcon("luna.jpg");
                        RL.setIcon(luna);
                        if (l==C){
                            LD.setText("Encontraste donde fue");
                            bandera3=1;
                            lug.setVisible(false);
                            ho.setVisible(false);
                            nu.setVisible(false);
                            nie.setVisible(false);
                            are.setVisible(false);
                            llu.setVisible(false);
                            rem.setVisible(false);
                            lun.setVisible(false);
                            val.setVisible(false);
                            cue.setVisible(false);
                        }
                        else{
                            LD.setText("Sigue buscando");
                            lun.setVisible(false);
                        }
                    break;
                    
                    case 7:
                        valle= new ImageIcon("valle.jpg");
                        RL.setIcon(valle);
                        if (l==C){
                            LD.setText("Encontraste donde fue");
                            bandera3=1;
                            lug.setVisible(false);
                            ho.setVisible(false);
                            nu.setVisible(false);
                            nie.setVisible(false);
                            are.setVisible(false);
                            llu.setVisible(false);
                            rem.setVisible(false);
                            lun.setVisible(false);
                            val.setVisible(false);
                            cue.setVisible(false);
                        }
                        else{
                            LD.setText("Sigue buscando");
                            val.setVisible(false);
                        }
                    break;
                    
                    case 8:
                        cueva= new ImageIcon("cueva.jpg");
                        RL.setIcon(cueva);
                        if (l==C){
                            LD.setText("Encontraste donde fue");
                            bandera3=1;
                            lug.setVisible(false);
                            ho.setVisible(false);
                            nu.setVisible(false);
                            nie.setVisible(false);
                            are.setVisible(false);
                            llu.setVisible(false);
                            rem.setVisible(false);
                            lun.setVisible(false);
                            val.setVisible(false);
                            cue.setVisible(false);
                        }
                        else{
                            LD.setText("Sigue buscando");
                            cue.setVisible(false);
                        }
                    break;
                }
            }
    
   
       
    public ClueFina(){
       super("Clue");
       setLayout(null);
       setSize(1300,800);
       this.getContentPane().setBackground(Color.gray);
       
        JOptionPane.showMessageDialog(null,"Bienvenidos al jugo\nRecuerda leer las instrucciones");
        personajes();
        armas();
        lugares();
        demas();
        combos();
        
    }
    public static void main(String[] args) {
        ClueFina mv= new ClueFina();
        mv.setVisible(true);
        mv.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==suponer){
            bandera4=bandera4+1;
                imagenes();
                if(bandera1==0 && bandera2==0 && bandera3==0){
                    r=PersonajesD[p]+ArmasD[a]+LugaresD[l];
                    
                    JOptionPane.showMessageDialog(null, r);
                }
                if(bandera1==0 && bandera2==0 && bandera3==1){
                    r=PersonajesD[p]+ArmasD[a]+LugaresE[l];
                     JOptionPane.showMessageDialog(null, r);
                }
                if(bandera1==0 && bandera2==1 && bandera3==0){
                    r=PersonajesD[p]+ArmasE[a]+LugaresD[l];
                     JOptionPane.showMessageDialog(null, r);
                }
                if(bandera1==0 && bandera2==1 && bandera3==1){
                    r=PersonajesD[p]+ArmasE[a]+LugaresE[l];
                     JOptionPane.showMessageDialog(null, r);
                }
                if(bandera1==1 && bandera2==0 && bandera3==0){
                    r=PersonajesE[p]+ArmasD[a]+LugaresD[l];
                     JOptionPane.showMessageDialog(null, r);
                }
                if(bandera1==1 && bandera2==0 && bandera3==1){
                    r=PersonajesE[p]+ArmasD[a]+LugaresE[l];
                     JOptionPane.showMessageDialog(null, r);
                }
                if(bandera1==1 && bandera2==1 && bandera3==0){
                    r=PersonajesE[p]+ArmasE[a]+LugaresD[l];
                     JOptionPane.showMessageDialog(null, r);
                }
                if(bandera1==1 && bandera2==1 && bandera3==1){
                    r=PersonajesE[p]+ArmasE[a]+LugaresE[l];
                     JOptionPane.showMessageDialog(null, r);
                     String d=bandera4+"";
                     String f="gracias por jugar. tardaste "+d+" intentos";
                     JOptionPane.showMessageDialog(null, f);
                    Ocultar();
                    
                }
                
        }
        
        }
}

