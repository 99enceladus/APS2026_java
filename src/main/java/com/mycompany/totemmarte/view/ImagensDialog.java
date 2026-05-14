
package com.mycompany.totemmarte.view;
import com.mycompany.totemmarte.modelo.SessaoModelo;
import javax.swing.ImageIcon;

public class ImagensDialog extends javax.swing.JDialog {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ImagensDialog.class.getName());

    
    public ImagensDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        setResizable(false);
    }

    public void configurar(SessaoModelo modelo) {

        txpLegenda.setText(modelo.getLegenda());

        ImageIcon icon = new ImageIcon(getClass().getResource(modelo.getCaminhoImagemGrande()));
        lblImagemGrande.setIcon(icon);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLegenda = new javax.swing.JPanel();
        txpLegenda = new javax.swing.JTextPane();
        lblImagemGrande = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);
        setPreferredSize(new java.awt.Dimension(800, 600));

        pnlLegenda.setBackground(new java.awt.Color(0, 0, 0));
        pnlLegenda.setLayout(new java.awt.BorderLayout());

        txpLegenda.setEditable(false);
        txpLegenda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));
        txpLegenda.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        txpLegenda.setForeground(new java.awt.Color(255, 255, 255));
        txpLegenda.setText("18.01.19");
        txpLegenda.setOpaque(false);
        txpLegenda.setPreferredSize(new java.awt.Dimension(62, 100));
        pnlLegenda.add(txpLegenda, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(pnlLegenda, java.awt.BorderLayout.PAGE_END);
        getContentPane().add(lblImagemGrande, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                ImagensDialog dialog = new ImagensDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblImagemGrande;
    private javax.swing.JPanel pnlLegenda;
    private javax.swing.JTextPane txpLegenda;
    // End of variables declaration//GEN-END:variables
}
