/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dadlastweek;


import interfacethings.DLWOptionPane;
import interfacethings.ImageFond;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 * @author AULA3
 */
public class Registro extends javax.swing.JDialog {
    DLWOptionPane dialog;
    private Cursor cursor;
    /**
     * Creates new form Interfaz
     * @param parent
     */
    public Registro(javax.swing.JFrame parent) {
        super(parent, true);
        initComponents();        
        anotherInitComponents();
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
        Fondo = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        contenido = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        infaccountpanel = new javax.swing.JPanel();
        labelusername = new javax.swing.JLabel();
        nombreusuario = new javax.swing.JTextField();
        labelpassword = new javax.swing.JLabel();
        contrasena = new javax.swing.JPasswordField();
        fingerprintpanel = new javax.swing.JPanel();
        fingerprint = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        createaccountbutton = new javax.swing.JButton();
        closebutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Crear cuenta");
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        Fondo.setOpaque(false);
        Fondo.setLayout(new java.awt.BorderLayout());

        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fondo.add(titulo, java.awt.BorderLayout.CENTER);

        contenido.setOpaque(false);
        contenido.setLayout(new java.awt.BorderLayout());

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jLabel1.setText("               ");
        jPanel1.add(jLabel1);

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridLayout(2, 0));

        infaccountpanel.setOpaque(false);
        infaccountpanel.setLayout(new java.awt.GridLayout(4, 0));

        labelusername.setFont(new java.awt.Font("Agency FB", 0, 14)); // NOI18N
        labelusername.setText("Nombre de usuario:");
        infaccountpanel.add(labelusername);

        nombreusuario.setFont(new java.awt.Font("Agency FB", 0, 14)); // NOI18N
        nombreusuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 0, 0, 32), new java.awt.Color(0, 0, 0, 32), new java.awt.Color(0, 0, 0, 96), new java.awt.Color(0, 0, 0, 96)));
        nombreusuario.setOpaque(false);
        nombreusuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreusuarioKeyTyped(evt);
            }
        });
        infaccountpanel.add(nombreusuario);

        labelpassword.setFont(new java.awt.Font("Agency FB", 0, 14)); // NOI18N
        labelpassword.setText("Contraseña:");
        infaccountpanel.add(labelpassword);

        contrasena.setFont(new java.awt.Font("Agency FB", 0, 14)); // NOI18N
        contrasena.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 0, 0, 32), new java.awt.Color(0, 0, 0, 32), new java.awt.Color(0, 0, 0, 96), new java.awt.Color(0, 0, 0, 96)));
        contrasena.setOpaque(false);
        contrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                contrasenaKeyTyped(evt);
            }
        });
        infaccountpanel.add(contrasena);

        jPanel2.add(infaccountpanel);

        fingerprintpanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Huella digital:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 0, 12))); // NOI18N
        fingerprintpanel.setOpaque(false);
        fingerprintpanel.setLayout(new java.awt.GridLayout(1, 0));

        fingerprint.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fingerprint.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fingerprintpanel.add(fingerprint);

        jPanel2.add(fingerprintpanel);

        jPanel1.add(jPanel2);

        jLabel2.setText("               ");
        jPanel1.add(jLabel2);

        contenido.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        createaccountbutton.setBorderPainted(false);
        createaccountbutton.setContentAreaFilled(false);
        createaccountbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createaccountbuttonActionPerformed(evt);
            }
        });
        jPanel3.add(createaccountbutton);

        closebutton.setBorderPainted(false);
        closebutton.setContentAreaFilled(false);
        closebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebuttonActionPerformed(evt);
            }
        });
        jPanel3.add(closebutton);

        contenido.add(jPanel3, java.awt.BorderLayout.CENTER);

        Fondo.add(contenido, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(Fondo);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void anotherInitComponents(){
        
        //CURSOR
        ImageIcon imagencursor = new ImageIcon(getClass().getResource("/images/cursor.png"));
        Toolkit TK = Toolkit.getDefaultToolkit(); 
        this.cursor = TK.createCustomCursor(imagencursor.getImage(), new Point(2,2),"Cursor 01"); 
        this.setCursor(cursor);
        
        nombreusuario.setBackground(new Color(0, 0, 0, 64));
        contrasena.setBackground(new Color(0, 0, 0, 64));
        
        Image mini = new ImageIcon(getClass().getResource("/images/Titulo.png")).getImage().getScaledInstance(200, 95, Image.SCALE_AREA_AVERAGING);
        Image fingerprinter = new ImageIcon(getClass().getResource("/images/fingerprint.png")).getImage().getScaledInstance(50, 50, Image.SCALE_AREA_AVERAGING);
        titulo.setIcon(new ImageIcon(mini));        
        this.setSize(250,450);
        Image ico = new ImageIcon(getClass().getResource("/images/calendar_5-512.png")).getImage().getScaledInstance(2000, 1900, Image.SCALE_AREA_AVERAGING);
        this.setIconImage(ico);       
        Image crearcuentaboton = new ImageIcon(getClass().getResource("/images/createaccountbutton.png")).getImage().getScaledInstance(110, 50, Image.SCALE_AREA_AVERAGING);
        Image crearcuentabotonenfocado = new ImageIcon(getClass().getResource("/images/createaccountbuttonfocused.png")).getImage().getScaledInstance(110, 50, Image.SCALE_AREA_AVERAGING);
        Image crearcuentabotonpresionado = new ImageIcon(getClass().getResource("/images/createaccountbuttonpressed.png")).getImage().getScaledInstance(110, 50, Image.SCALE_AREA_AVERAGING);
        Image cerrarboton = new ImageIcon(getClass().getResource("/images/closebutton.png")).getImage().getScaledInstance(110, 50, Image.SCALE_AREA_AVERAGING);
        Image cerrarbotonenfocado = new ImageIcon(getClass().getResource("/images/closebuttonfocused.png")).getImage().getScaledInstance(110, 50, Image.SCALE_AREA_AVERAGING);
        Image cerrarbotonpresionado = new ImageIcon(getClass().getResource("/images/closebuttonpressed.png")).getImage().getScaledInstance(110, 50, Image.SCALE_AREA_AVERAGING);
        createaccountbutton.setIcon(new ImageIcon(crearcuentaboton));
        closebutton.setIcon(new ImageIcon(cerrarboton));
        createaccountbutton.setRolloverIcon(new ImageIcon(crearcuentabotonenfocado));
        closebutton.setRolloverIcon(new ImageIcon(cerrarbotonenfocado));
        createaccountbutton.setPressedIcon(new ImageIcon(crearcuentabotonpresionado));
        closebutton.setPressedIcon(new ImageIcon(cerrarbotonpresionado));
        fingerprint.setIcon(new ImageIcon(fingerprinter));
    }
    
    private void nombreusuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreusuarioKeyTyped
        if (nombreusuario.getText().length() >= 30) {
            evt.consume();
        }
    }//GEN-LAST:event_nombreusuarioKeyTyped

    private void contrasenaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contrasenaKeyTyped
        if (new String(contrasena.getPassword()).length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_contrasenaKeyTyped

    private void createaccountbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createaccountbuttonActionPerformed
        if(nombreusuario.getText() == null || "".equals(nombreusuario.getText()) || "".equals(new String(contrasena.getPassword()))){
            dialog = new DLWOptionPane(this, "Rellene todos los campos.", "Campos faltantes","warning",250,150,false);
            dialog.setVisible(true);
        }else if(new Database().guardaUsuario(nombreusuario.getText(), new String(contrasena.getPassword()))){
            dialog = new DLWOptionPane(this, "La cuenta de usuario ha sido creada exitosamente.", "Creación de cuenta exitosa","info",300,150,false);
            dialog.setVisible(true);
//            JOptionPane.showMessageDialog(null, "La cuenta de usuario ha sido creada exitosamente.", "Creación de cuenta exitosa", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        }else{
            dialog = new DLWOptionPane(this, "La cuenta de usuario ya existe, digite otro nombre.", "Cuenta existente","warning",370,150,false);
            dialog.setVisible(true);
//            JOptionPane.showMessageDialog(null, "La cuenta de usuario ya existe, digite otro nombre.", "Cuenta existente", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_createaccountbuttonActionPerformed

    private void closebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebuttonActionPerformed
        this.dispose();
    }//GEN-LAST:event_closebuttonActionPerformed

//    private void centrarVentana() {
//        //este metodo devuelve el tamaño de la pantalla
//        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
//        //obtenemos el tamaño de la ventana
//        Dimension ventana = this.getSize();
//        //para centrar la ventana lo hacemos con el siguiente calculo
//        this.setLocation((pantalla.width - ventana.width) / 2, (pantalla.height - ventana.height) / 2);
//    }
    
    /**
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JButton closebutton;
    private javax.swing.JPanel contenido;
    private javax.swing.JPasswordField contrasena;
    private javax.swing.JButton createaccountbutton;
    private javax.swing.JLabel fingerprint;
    private javax.swing.JPanel fingerprintpanel;
    private javax.swing.JPanel infaccountpanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelpassword;
    private javax.swing.JLabel labelusername;
    private javax.swing.JTextField nombreusuario;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
