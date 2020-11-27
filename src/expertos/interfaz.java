
package expertos;


import javax.swing.ImageIcon;
import net.sf.clipsrules.jni.Environment;
import net.sf.clipsrules.jni.FactAddressValue;
import net.sf.clipsrules.jni.MultifieldValue;

public class interfaz extends javax.swing.JFrame {
    
    private final Environment clips;

    public interfaz() {
        
       initComponents();
       clips= new Environment ();
       clips.load("reglas.CLP");
       this.setResizable(false);
       this.setLocationRelativeTo(null);
       this.setIconImage (new ImageIcon(getClass().getResource("/img/icono.png")).getImage());
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlabel_numero = new javax.swing.JLabel();
        jlabel_lugar = new javax.swing.JLabel();
        jcb_tipo = new javax.swing.JComboBox<>();
        jcb_licencia = new javax.swing.JComboBox<>();
        jcb_so = new javax.swing.JComboBox<>();
        jlabel_tipo = new javax.swing.JLabel();
        jlabel_recomendar = new javax.swing.JButton();
        jlabel_titulo = new javax.swing.JLabel();
        jl_recomendacion = new javax.swing.JLabel();
        jLabel_casos = new javax.swing.JLabel();
        jcb_casos = new javax.swing.JComboBox<>();
        jlabel_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Recomendar Software");
        setBackground(new java.awt.Color(51, 51, 255));
        setForeground(new java.awt.Color(51, 51, 255));
        setIconImages(null);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlabel_numero.setBackground(new java.awt.Color(0, 0, 0));
        jlabel_numero.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlabel_numero.setForeground(new java.awt.Color(51, 0, 51));
        jlabel_numero.setText("Número de personas:");
        getContentPane().add(jlabel_numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 210, 30));

        jlabel_lugar.setBackground(new java.awt.Color(0, 0, 102));
        jlabel_lugar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlabel_lugar.setForeground(new java.awt.Color(51, 0, 51));
        jlabel_lugar.setText("Tipo de Lugar :");
        getContentPane().add(jlabel_lugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 140, -1));

        jcb_tipo.setBackground(new java.awt.Color(0, 0, 102));
        jcb_tipo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jcb_tipo.setForeground(new java.awt.Color(255, 255, 255));
        jcb_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "zona_abierta", "zona_cerrada" }));
        getContentPane().add(jcb_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 54, 160, -1));

        jcb_licencia.setBackground(new java.awt.Color(0, 0, 153));
        jcb_licencia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jcb_licencia.setForeground(new java.awt.Color(255, 255, 255));
        jcb_licencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "1_10_personas", "11_20_personas", "mas_20_personas" }));
        getContentPane().add(jcb_licencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 117, 160, -1));

        jcb_so.setBackground(new java.awt.Color(0, 0, 102));
        jcb_so.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jcb_so.setForeground(new java.awt.Color(255, 255, 255));
        jcb_so.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "familiar", "trabajo", "amigos", "desconocidos" }));
        getContentPane().add(jcb_so, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 171, 160, -1));

        jlabel_tipo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlabel_tipo.setForeground(new java.awt.Color(51, 0, 51));
        jlabel_tipo.setText("Tipo de Reunión:");
        getContentPane().add(jlabel_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jlabel_recomendar.setBackground(new java.awt.Color(0, 204, 255));
        jlabel_recomendar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlabel_recomendar.setForeground(new java.awt.Color(51, 0, 51));
        jlabel_recomendar.setText("CONSULTAR");
        jlabel_recomendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlabel_recomendarActionPerformed(evt);
            }
        });
        getContentPane().add(jlabel_recomendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, -1, -1));

        jlabel_titulo.setBackground(new java.awt.Color(255, 255, 255));
        jlabel_titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlabel_titulo.setForeground(new java.awt.Color(255, 51, 51));
        jlabel_titulo.setText("Probabilidad de Contagio en una reunión");
        getContentPane().add(jlabel_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 390, 40));

        jl_recomendacion.setBackground(new java.awt.Color(51, 51, 255));
        jl_recomendacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jl_recomendacion.setForeground(new java.awt.Color(255, 255, 255));
        jl_recomendacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jl_recomendacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 390, 29));

        jLabel_casos.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel_casos.setForeground(new java.awt.Color(51, 0, 51));
        jLabel_casos.setText("El anfitrión tuvo casos de COVID recientes en su núcleo familiar: ");
        getContentPane().add(jLabel_casos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 540, 40));

        jcb_casos.setBackground(new java.awt.Color(0, 0, 102));
        jcb_casos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jcb_casos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "si", "no" }));
        getContentPane().add(jcb_casos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 160, 30));

        jlabel_fondo.setBackground(new java.awt.Color(255, 255, 255));
        jlabel_fondo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlabel_fondo.setForeground(new java.awt.Color(255, 255, 255));
        jlabel_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/distanciamiento.jpg"))); // NOI18N
        getContentPane().add(jlabel_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 540, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    private void jlabel_recomendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlabel_recomendarActionPerformed
        // TODO add your handling code here:
        String hecho,tipo,licencia,so,licencia2 = "";
        tipo=jcb_tipo.getSelectedItem().toString().toLowerCase();
        licencia=jcb_licencia.getSelectedItem().toString();
        so=jcb_so.getSelectedItem().toString().toLowerCase();
        if (licencia.equals("GNU")) {
            licencia2=licencia;
        }
        if (licencia.equals("Privativo")) {
            licencia2=licencia.toLowerCase();
        }
        hecho = "(assert (lenguaje-programacion(tipo " + tipo + ")(licencia " + licencia2 +")(so " + so + ")))";
        clips.eval(hecho);
        clips.run();        
        String evaluador = "(find-all-facts ((?m recomendacion)) TRUE)";
        
        FactAddressValue fv = (FactAddressValue) ((MultifieldValue) clips.eval(evaluador)).get(0);
        
        try {
            String msj = fv.getFactSlot("mensaje").toString();
            jl_recomendacion.setText(msj);
            clips.reset();
        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_jlabel_recomendarActionPerformed

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new interfaz().setVisible(true);
        });
        
    }
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel_casos;
    private javax.swing.JComboBox<String> jcb_casos;
    private javax.swing.JComboBox<String> jcb_licencia;
    private javax.swing.JComboBox<String> jcb_so;
    public javax.swing.JComboBox<String> jcb_tipo;
    private javax.swing.JLabel jl_recomendacion;
    private javax.swing.JLabel jlabel_fondo;
    private javax.swing.JLabel jlabel_lugar;
    private javax.swing.JLabel jlabel_numero;
    private javax.swing.JButton jlabel_recomendar;
    private javax.swing.JLabel jlabel_tipo;
    private javax.swing.JLabel jlabel_titulo;
    // End of variables declaration//GEN-END:variables
}
