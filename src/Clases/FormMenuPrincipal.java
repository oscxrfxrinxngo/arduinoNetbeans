/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Clases;

import java.util.Date;
import java.text.SimpleDateFormat;
import Clases.HoraFecha;

import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.Timer;
import panamahitek.Arduino.PanamaHitek_Arduino;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author xavi
 */
public class FormMenuPrincipal extends javax.swing.JFrame implements Runnable {
     private Timer timer;
     String hora,minutos,segundos,anho,mes,dia;
    Thread hilo;
    
    PanamaHitek_Arduino ino =new PanamaHitek_Arduino();
    SerialPortEventListener listener = new SerialPortEventListener(){
        @Override
        public void serialEvent(SerialPortEvent spe) {
            System.out.println("ino.receiveData");
            
            
               //if(ino.isMessageAvailable()){
               // btn1.setText(ino.printMessage());
                
            }
       
        };
    /*private Object hilo;
            
      

    /**
     * Creates new form FormMenuPrincipal
     */
    public FormMenuPrincipal() {
        initComponents();
        hilo=new Thread(this);
        hilo.start();
        setVisible(true);
        //iniciarTimer();
        //ino = new PanamaHitek_Arduino();
        try {
            ino.arduinoRXTX("COM3", 115200,listener);
        } catch (Exception ex) {
            Logger.getLogger(FormMenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        setLocationRelativeTo(null);
        imagenPuertaCerrada();
    }
    public void hora(){
        
        
     Calendar calendario= new GregorianCalendar();
     Date horaActual=new Date();
     calendario.setTime(horaActual);
     anho = Integer.toString(calendario.get(Calendar.YEAR));
     mes = Integer.toString(calendario.get(Calendar.MONTH+1));
     dia = Integer.toString(calendario.get(Calendar.DATE));
     hora=calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
     minutos=calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
     segundos=calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);
     
    }
    public void run(){
        Thread current= Thread.currentThread();
        
        while(current==hilo){
            hora();
            lblDate.setText(anho+"-"+mes+"-"+dia+":"+hora+":"+minutos+":"+segundos);
            
        }
    }
    /*private void iniciarTimer() {
        int intervaloActualizacion = 1000; // 1000 ms = 1 segundo
        timer = new Timer(intervaloActualizacion, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarFechaHoraActual();
            }
        });
        timer.start();
    }

    private void mostrarFechaHoraActual() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String fechaHoraActual = sdf.format(new Date());
        lblDate.setText(fechaHoraActual);
    }*/

    // Resto de métodos y eventos de tu ventana generada por NetBeans...

    // Variables declaration - do not modify//GEN-BEGIN:variables
    

    // El resto de los métodos de tu ventana, si los tienes, irían aquí...

 
    
   
    
    public void imagenPuertaCerrada(){
        
        //ImageIcon door;
      /*  String imagePath = "C:\\Users\\xavi\\Documents\\NetBeansProjects\\MyLoginDI\\src\\main\\java\\imagenes\\door_open.png";
        ImageIcon door = new ImageIcon(imagePath);
        Icon doorIcono = new ImageIcon(door.getImage().getScaledInstance(
                lblImg.getWidth(), lblImg.getHeight(), Image.SCALE_SMOOTH));
        lblImg.setIcon(doorIcono);*/
        
        ImageIcon door = new ImageIcon(getClass().getResource("/images/door_open.png")); //C:\Users\xavi\Documents\NetBeansProjects\MyLoginDI\src\main\java\imagenes
        Icon doorIcono = new ImageIcon(door.getImage().getScaledInstance(
                lblImg.getWidth(),lblImg.getHeight(),Image.SCALE_SMOOTH));
        lblImg.setIcon(doorIcono);
        
        /*ImageIcon door = new ImageIcon(getClass().getResource("/imagenes/door_close.png")); //C:\Users\xavi\Documents\NetBeansProjects\MyLoginDI\src\main\java\imagenes
        Icon doorIcono = new ImageIcon(door.getImage().getScaledInstance(
                lblImg.getWidth(),lblImg.getHeight(),Image.SCALE_SMOOTH));
        lblImg.setIcon(doorIcono);*/
    }
    public void imagenPuertaAbierta(){
        
        //ImageIcon door;
     /*  String imagePath = "C:\\Users\\xavi\\Documents\\NetBeansProjects\\MyLoginDI\\src\\main\\java\\imagenes\\door_close.png";
        ImageIcon door = new ImageIcon(imagePath);
        Icon doorIcono = new ImageIcon(door.getImage().getScaledInstance(
                lblImg.getWidth(), lblImg.getHeight(), Image.SCALE_SMOOTH));
        lblImg.setIcon(doorIcono);*/
        
        ImageIcon door = new ImageIcon(getClass().getResource("/images/door_closed.png")); //C:\Users\xavi\Documents\NetBeansProjects\MyLoginDI\src\main\java\imagenes
        Icon doorIcono = new ImageIcon(door.getImage().getScaledInstance(
                lblImg.getWidth(),lblImg.getHeight(),Image.SCALE_SMOOTH));
        lblImg.setIcon(doorIcono);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn1 = new javax.swing.JToggleButton();
        lblTexto = new javax.swing.JLabel();
        lblImg = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmFacturacion = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn1.setBackground(new java.awt.Color(255, 51, 51));
        btn1.setText("Cerrar");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        lblTexto.setText("Estado de la puerta");

        lblDate.setText("DD/MM/AA hh:mm:ss");

        jMenu1.setText("Factura");

        jmFacturacion.setText("Facturacion");
        jmFacturacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmFacturacionMouseClicked(evt);
            }
        });
        jMenu1.add(jmFacturacion);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ingresos");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Reportes");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Salir");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmFacturacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmFacturacionMouseClicked
        // TODO add your handling code here:
        /*Facturacion b= new Facturacion();
        b.setVisible(b, true);
        this.setVisible(b, False );*/
    }//GEN-LAST:event_jmFacturacionMouseClicked

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        if(btn1.isSelected()){
            btn1.setBackground(new Color(0,255,51));  //255,51,51
            btn1.setText("Abrir");
            lblTexto.setText("La Puerta esta Cerrada");
            imagenPuertaAbierta();
        }else{
            btn1.setBackground(new Color(255,51,51));
            btn1.setText("Cerrar");
            lblTexto.setText("La Puerta esta Abierta");
            imagenPuertaCerrada();
        }
    }//GEN-LAST:event_btn1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btn1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmFacturacion;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblImg;
    private javax.swing.JLabel lblTexto;
    // End of variables declaration//GEN-END:variables
}
