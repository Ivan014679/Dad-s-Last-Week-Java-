/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dadlastweek;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ivan
 */
public class Estadisticas extends javax.swing.JFrame {
    DefaultTableModel estadisticas;
    private Cursor cursor;
    
    /**
     * Creates new form Estadisticas
     */
    public Estadisticas() {
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
        fondo = new javax.swing.JPanel();
        titlepane = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        pjbutton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        contenido = new javax.swing.JPanel();
        tablepane = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        stats = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        mifinallabel = new javax.swing.JLabel();
        mifinal = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        pertenece = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        statstitlepane = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buttonspane = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        closebutton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Estadísticas");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        fondo.setOpaque(false);
        fondo.setLayout(new java.awt.BorderLayout());

        titlepane.setOpaque(false);
        titlepane.setLayout(new javax.swing.OverlayLayout(titlepane));

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        jLabel8.setText("                                                                                                                       ");
        jPanel3.add(jLabel8);

        pjbutton.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        pjbutton.setContentAreaFilled(false);
        pjbutton.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pjbutton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pjbutton.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        pjbutton.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        pjbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pjbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pjbuttonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pjbuttonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pjbuttonMouseReleased(evt);
            }
        });
        pjbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pjbuttonActionPerformed(evt);
            }
        });
        jPanel3.add(pjbutton);

        titlepane.add(jPanel3);

        jPanel5.setOpaque(false);
        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel5.add(titulo);

        titlepane.add(jPanel5);

        fondo.add(titlepane, java.awt.BorderLayout.PAGE_START);

        contenido.setOpaque(false);
        contenido.setLayout(new java.awt.BorderLayout());

        tablepane.setOpaque(false);
        tablepane.setLayout(new javax.swing.BoxLayout(tablepane, javax.swing.BoxLayout.LINE_AXIS));

        jLabel4.setText("                  ");
        tablepane.add(jLabel4);

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jScrollPane1.setOpaque(false);

        stats.setFont(new java.awt.Font("Agency FB", 0, 12)); // NOI18N
        stats.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "Nombre PJ", "Apellido PJ", "Salud", "Estado", "Final encontrado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        stats.setOpaque(false);
        jScrollPane1.setViewportView(stats);

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 0, 12))); // NOI18N
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.PAGE_AXIS));

        jPanel6.setOpaque(false);
        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.LINE_AXIS));

        mifinallabel.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        mifinallabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mifinallabel.setText("Tu final: ");
        jPanel6.add(mifinallabel);

        mifinal.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        mifinal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mifinal.setText("%");
        jPanel6.add(mifinal);

        jPanel4.add(jPanel6);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel11.setText(" ");
        jPanel4.add(jLabel11);

        jPanel7.setOpaque(false);
        jPanel7.setLayout(new java.awt.GridLayout(1, 0));

        pertenece.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        pertenece.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pertenece.setText("Perteneces al #% de aquellos que llegaron al final %");
        jPanel7.add(pertenece);

        jPanel4.add(jPanel7);

        jPanel2.add(jPanel4, java.awt.BorderLayout.PAGE_END);

        tablepane.add(jPanel2);

        jLabel5.setText("                  ");
        tablepane.add(jLabel5);

        contenido.add(tablepane, java.awt.BorderLayout.CENTER);

        statstitlepane.setOpaque(false);
        statstitlepane.setLayout(new javax.swing.BoxLayout(statstitlepane, javax.swing.BoxLayout.Y_AXIS));

        jLabel1.setText(" ");
        statstitlepane.add(jLabel1);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jLabel3.setFont(new java.awt.Font("Old English Text MT", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Estadísticas");
        jPanel1.add(jLabel3);

        statstitlepane.add(jPanel1);

        jLabel2.setText(" ");
        statstitlepane.add(jLabel2);

        contenido.add(statstitlepane, java.awt.BorderLayout.PAGE_START);

        buttonspane.setOpaque(false);
        buttonspane.setLayout(new java.awt.GridLayout(1, 0));
        buttonspane.add(jLabel6);

        closebutton.setBorderPainted(false);
        closebutton.setContentAreaFilled(false);
        closebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebuttonActionPerformed(evt);
            }
        });
        buttonspane.add(closebutton);
        buttonspane.add(jLabel7);

        contenido.add(buttonspane, java.awt.BorderLayout.PAGE_END);

        fondo.add(contenido, java.awt.BorderLayout.CENTER);

        getContentPane().add(fondo);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void anotherInitComponents(){
        //Deshabilitar pjbutton
        pjbutton.setEnabled(false);
        pjbutton.setVisible(false);
        // Comienza codigo aqui
//        new DadsLastWeek().setIsPlaying(true);        
        
        //CURSOR
        ImageIcon imagencursor = new ImageIcon(getClass().getResource("/images/cursor.png"));
        Toolkit TK = Toolkit.getDefaultToolkit(); 
        this.cursor = TK.createCustomCursor(imagencursor.getImage(), new Point(2,2),"Cursor 01"); 
        this.setCursor(cursor);
        
        jScrollPane1.getViewport().setOpaque(false);
        jScrollPane1.setViewportBorder(null);
        stats.setBackground(new Color(0, 0, 0, 64));
        stats.setSelectionBackground(new Color(0, 0, 0, 96));

        Image mini = new ImageIcon(getClass().getResource("/images/Titulo.png")).getImage().getScaledInstance(200, 95, Image.SCALE_AREA_AVERAGING);
        titulo.setIcon(new ImageIcon(mini));        
        this.setSize(800,600);
        Image ico = new ImageIcon(getClass().getResource("/images/calendar_5-512.png")).getImage().getScaledInstance(2000, 1900, Image.SCALE_AREA_AVERAGING);
        this.setIconImage(ico);
        Image personajeboton;

        try{
            personajeboton = new Database().consultarImagen(new DadsLastWeek().getIdusuario()).getImage().getScaledInstance(25, 25, java.awt.Image.SCALE_AREA_AVERAGING);
        }catch(NullPointerException ex){
            personajeboton = new ImageIcon(getClass().getResource("/images/withoutphoto.png")).getImage().getScaledInstance(25,25, Image.SCALE_AREA_AVERAGING);
        }
        pjbutton.setIcon(new ImageIcon(personajeboton));
        
        Image cerrarboton = new ImageIcon(getClass().getResource("/images/closebutton.png")).getImage().getScaledInstance(140, 60, Image.SCALE_AREA_AVERAGING);
        Image cerrarbotonenfocado = new ImageIcon(getClass().getResource("/images/closebuttonfocused.png")).getImage().getScaledInstance(140, 60, Image.SCALE_AREA_AVERAGING);
        Image cerrarbotonpresionado = new ImageIcon(getClass().getResource("/images/closebuttonpressed.png")).getImage().getScaledInstance(140, 60, Image.SCALE_AREA_AVERAGING);
        closebutton.setIcon(new ImageIcon(cerrarboton));
        closebutton.setRolloverIcon(new ImageIcon(cerrarbotonenfocado));
        closebutton.setPressedIcon(new ImageIcon(cerrarbotonpresionado));
        
        try{
            estadisticas = (DefaultTableModel) new Database().estadisticas(stats);
            stats.setModel(estadisticas);
            String mifinalstat = new Database().miEstadistica(new DadsLastWeek().getIdusuario());
            if(mifinalstat == null || "".equals(mifinalstat)){
                mifinal.setText("No has jugado aún");
                pertenece.setText("Necesitas jugar una partida primero para obtener tus estadísticas");
            }else{
                mifinal.setText(mifinalstat);
                int conteo = new Database().conteoEstadisticas(mifinal.getText());

                float userpertenece = ((float) conteo/estadisticas.getRowCount())*100;
                DecimalFormat df = new DecimalFormat("#.000");

                pertenece.setText("Perteneces al "+df.format(userpertenece)+"% de aquellos que llegaron al final: "+mifinal.getText());
            }            
        }catch(java.lang.ArrayIndexOutOfBoundsException sinregistros){
            System.out.println(sinregistros.getMessage());
            mifinal.setText("No has jugado aún");
            pertenece.setText("Necesitas jugar una partida primero para obtener tus estadísticas");
        }
    }
    
    private void pjbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pjbuttonMouseEntered
        pjbutton.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 102), new java.awt.Color(255, 255, 102), new java.awt.Color(255, 153, 102), new java.awt.Color(255, 102, 51)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
    }//GEN-LAST:event_pjbuttonMouseEntered

    private void pjbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pjbuttonMouseExited
        pjbutton.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
    }//GEN-LAST:event_pjbuttonMouseExited

    private void pjbuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pjbuttonMousePressed
        pjbutton.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
    }//GEN-LAST:event_pjbuttonMousePressed

    private void pjbuttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pjbuttonMouseReleased
        pjbutton.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 102), new java.awt.Color(255, 255, 102), new java.awt.Color(255, 153, 102), new java.awt.Color(255, 102, 51)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
    }//GEN-LAST:event_pjbuttonMouseReleased

    private void pjbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pjbuttonActionPerformed
        new Personaje(this).setVisible(true);
    }//GEN-LAST:event_pjbuttonActionPerformed

    private void closebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebuttonActionPerformed
        if("D007".equals(new DadsLastWeek().getDia_coddia())){
            reiniciar();
            new DadsLastWeek().setIsPlaying(false);
        }
        this.dispose();
        new Menu().setVisible(true);
        
    }//GEN-LAST:event_closebuttonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if("D007".equals(new DadsLastWeek().getDia_coddia())){
            reiniciar();
            new DadsLastWeek().setIsPlaying(false);
        }
        new Menu().setVisible(true);        
    }//GEN-LAST:event_formWindowClosing

    private void reiniciar(){
        //Reiniciar todo
        new Database().actualizarDiaYDecision(new DadsLastWeek().getIdusuario(), "D000", "A001");
        new Database().borrarTodosLosObjetos(new DadsLastWeek().getIdusuario());
        new Database().actualizarPersonaje(new DadsLastWeek().getIdusuario(), new DadsLastWeek().getNompersonaje(), new DadsLastWeek().getApellpersonaje(), 100, "Normal");
        new DadsLastWeek().setDia_coddia("D000");
        new DadsLastWeek().setDecision_iddecision("A001");
        new DadsLastWeek().setListaobjetos(new ArrayList<>());
        new DadsLastWeek().setSalud(100);
        new DadsLastWeek().setEstadosalud("Normal");
    }
    
//    private void centrarVentana() {
//        //este metodo devuelve el tamaño de la pantalla
//        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
//        //obtenemos el tamaño de la ventana
//        Dimension ventana = this.getSize();
//        //para centrar la ventana lo hacemos con el siguiente calculo
//        this.setLocation((pantalla.width - ventana.width) / 2, (pantalla.height - ventana.height) / 2);
//    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonspane;
    private javax.swing.JButton closebutton;
    private javax.swing.JPanel contenido;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mifinal;
    private javax.swing.JLabel mifinallabel;
    private javax.swing.JLabel pertenece;
    private javax.swing.JButton pjbutton;
    private javax.swing.JTable stats;
    private javax.swing.JPanel statstitlepane;
    private javax.swing.JPanel tablepane;
    private javax.swing.JPanel titlepane;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
