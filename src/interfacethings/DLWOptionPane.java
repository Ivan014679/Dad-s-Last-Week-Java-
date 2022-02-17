/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacethings;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 *
 * @author Ivan
 */
public class DLWOptionPane extends javax.swing.JDialog {
    boolean hasaccepted = false;
    private Cursor cursor;
    /**
     * Creates new form DLWOptionPane
     * @param padre
     * @param text
     * @param title
     * @param image
     * @param width
     * @param height
     * @param type
     */
    public DLWOptionPane(JFrame padre, String text, String title, String image, int width, int height, Boolean type) {
        // padre y modal
        super(padre, true);
        initComponents();        
        anotherInitComponents(text, title, image, width, height, type);
    }
    
    public DLWOptionPane(JDialog padre, String text, String title, String image, int width, int height, Boolean type) {
        // padre y modal
        super(padre, true);
        initComponents();
        anotherInitComponents(text, title, image, width, height, type);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageFond image = new ImageFond();
        image.setImage("/images/Fondo.jpg");
        setContentPane(image);
        fondo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        imageicon = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        textlabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        overlaypanel = new javax.swing.JPanel();
        acceptbuttononly = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        acceptbutton1 = new javax.swing.JButton();
        acceptandcancelbuttons = new javax.swing.JPanel();
        acceptbutton2 = new javax.swing.JButton();
        cancelbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        fondo.setOpaque(false);
        fondo.setLayout(new java.awt.BorderLayout());

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jLabel2.setText("     ");
        jPanel1.add(jLabel2);

        jPanel6.setOpaque(false);
        jPanel6.setLayout(new java.awt.GridLayout(1, 0));

        imageicon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel6.add(imageicon);

        jPanel1.add(jPanel6);

        jLabel3.setText("     ");
        jPanel1.add(jLabel3);

        jPanel5.setOpaque(false);
        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        textlabel.setFont(new java.awt.Font("Agency FB", 0, 14)); // NOI18N
        jPanel5.add(textlabel);

        jPanel1.add(jPanel5);

        jLabel5.setText("     ");
        jPanel1.add(jLabel5);

        fondo.add(jPanel1, java.awt.BorderLayout.CENTER);

        overlaypanel.setOpaque(false);
        overlaypanel.setLayout(new javax.swing.OverlayLayout(overlaypanel));

        acceptbuttononly.setOpaque(false);
        acceptbuttononly.setLayout(new java.awt.GridLayout(1, 1));
        acceptbuttononly.add(jLabel1);

        acceptbutton1.setBorderPainted(false);
        acceptbutton1.setContentAreaFilled(false);
        acceptbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptbutton1ActionPerformed(evt);
            }
        });
        acceptbuttononly.add(acceptbutton1);

        overlaypanel.add(acceptbuttononly);

        acceptandcancelbuttons.setOpaque(false);
        acceptandcancelbuttons.setLayout(new java.awt.GridLayout(1, 0));

        acceptbutton2.setBorderPainted(false);
        acceptbutton2.setContentAreaFilled(false);
        acceptbutton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptbutton2ActionPerformed(evt);
            }
        });
        acceptandcancelbuttons.add(acceptbutton2);

        cancelbutton.setBorderPainted(false);
        cancelbutton.setContentAreaFilled(false);
        cancelbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbuttonActionPerformed(evt);
            }
        });
        acceptandcancelbuttons.add(cancelbutton);

        overlaypanel.add(acceptandcancelbuttons);

        fondo.add(overlaypanel, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(fondo);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void anotherInitComponents(String text, String title, String image, int width, int height, Boolean type) {                

        //CURSOR
        ImageIcon imagencursor = new ImageIcon(getClass().getResource("/images/cursor.png"));
        Toolkit TK = Toolkit.getDefaultToolkit(); 
        this.cursor = TK.createCustomCursor(imagencursor.getImage(), new Point(2,2),"Cursor 01"); 
        this.setCursor(cursor);
        
        Image icon = null;
        this.setSize(width, height);
        if(null != image)switch (image) {
            case "info":
                icon = new ImageIcon(getClass().getResource("/images/Infoicon.png")).getImage().getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING);
                break;
            case "error":
                icon = new ImageIcon(getClass().getResource("/images/Erroricon.png")).getImage().getScaledInstance(50, 50, Image.SCALE_AREA_AVERAGING);
                break;
            case "warning":
                icon = new ImageIcon(getClass().getResource("/images/Warningicon.png")).getImage().getScaledInstance(50, 50, Image.SCALE_AREA_AVERAGING);
                break;
            case "question":
                icon = new ImageIcon(getClass().getResource("/images/Questionicon.png")).getImage().getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING);
                break;
            default:
                break;
        }
        Image aceptarboton = new ImageIcon(getClass().getResource("/images/acceptbutton.png")).getImage().getScaledInstance(110, 50, Image.SCALE_AREA_AVERAGING);
        Image cancelarboton = new ImageIcon(getClass().getResource("/images/cancelbutton.png")).getImage().getScaledInstance(110, 50, Image.SCALE_AREA_AVERAGING);
        Image aceptarbotonenfocado = new ImageIcon(getClass().getResource("/images/acceptbuttonfocused.png")).getImage().getScaledInstance(110, 50, Image.SCALE_AREA_AVERAGING);
        Image cancelarbotonenfocado = new ImageIcon(getClass().getResource("/images/cancelbuttonfocused.png")).getImage().getScaledInstance(110, 50, Image.SCALE_AREA_AVERAGING);
        Image aceptarbotonpresionado = new ImageIcon(getClass().getResource("/images/acceptbuttonpressed.png")).getImage().getScaledInstance(110, 50, Image.SCALE_AREA_AVERAGING);
        Image cancelarbotonpresionado = new ImageIcon(getClass().getResource("/images/cancelbuttonpressed.png")).getImage().getScaledInstance(110, 50, Image.SCALE_AREA_AVERAGING);
        acceptbutton1.setIcon(new ImageIcon(aceptarboton));
        acceptbutton2.setIcon(new ImageIcon(aceptarboton));
        cancelbutton.setIcon(new ImageIcon(cancelarboton));
        acceptbutton1.setRolloverIcon(new ImageIcon(aceptarbotonenfocado));
        acceptbutton2.setRolloverIcon(new ImageIcon(aceptarbotonenfocado));
        cancelbutton.setRolloverIcon(new ImageIcon(cancelarbotonenfocado));
        acceptbutton1.setPressedIcon(new ImageIcon(aceptarbotonpresionado));
        acceptbutton2.setPressedIcon(new ImageIcon(aceptarbotonpresionado));
        cancelbutton.setPressedIcon(new ImageIcon(cancelarbotonpresionado));
        imageicon.setIcon(new ImageIcon(icon));
        textlabel.setText("<html><body>"+text+"</body></html>");
        this.setTitle(title);
        this.setIconImage(icon);
        if(type){
            acceptbuttononly.setVisible(false);
        }else{
            acceptandcancelbuttons.setVisible(false);
        }
    }
    
    private void acceptbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptbutton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_acceptbutton1ActionPerformed

    private void acceptbutton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptbutton2ActionPerformed
        this.dispose();
        hasaccepted = true;
    }//GEN-LAST:event_acceptbutton2ActionPerformed

    private void cancelbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbuttonActionPerformed
        this.dispose();
        hasaccepted = false;
    }//GEN-LAST:event_cancelbuttonActionPerformed

//    private void centrarVentana() {
//        //este metodo devuelve el tamaño de la pantalla
//        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
//        //obtenemos el tamaño de la ventana
//        Dimension ventana = this.getSize();
//        //para centrar la ventana lo hacemos con el siguiente calculo
//        this.setLocation((pantalla.width - ventana.width) / 2, (pantalla.height - ventana.height) / 2);
//    }
    
    public boolean hasAccepted(){
        return hasaccepted;
    }
    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel acceptandcancelbuttons;
    private javax.swing.JButton acceptbutton1;
    private javax.swing.JButton acceptbutton2;
    private javax.swing.JPanel acceptbuttononly;
    private javax.swing.JButton cancelbutton;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel imageicon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel overlaypanel;
    private javax.swing.JLabel textlabel;
    // End of variables declaration//GEN-END:variables
}
