/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesPoke;

import controle.Controle;
import java.util.ArrayList;
import java.util.List;
import main.Pokemon;
import java.io.*;
import java.awt.*;

/**
 *
 * @author Millena Venturini
 */
public class Ganhador extends javax.swing.JFrame {

    /**
     * Creates new form Ganhador
     */
    public Ganhador() {
        //inicializa componentes
        initComponents();
        editatextos();

    }

    //inicializa textos
    public void editatextos() {
        List<Pokemon> aux = Controle.getControle().getParticipantes();
        part.setText("Duelos: " + aux.get(0).getNome() + " x " + aux.get(1).getNome() + " / " + aux.get(2).getNome() + " x " + aux.get(3).getNome() + " / " + aux.get(4).getNome() + " x " + aux.get(5).getNome() + " / " + aux.get(6).getNome() + " x " + aux.get(7).getNome() + ". ");
        round1.setText("Ganhadores primeiro round: " + Controle.getControle().getRound1().get(0).getNome() + ", " + Controle.getControle().getRound1().get(1).getNome() + ", " + Controle.getControle().getRound1().get(2).getNome() + " e " + Controle.getControle().getRound1().get(3).getNome() + ".");
        round2.setText("Ganhadores segundo round: " + Controle.getControle().getRound2().get(0).getNome() + " e " + Controle.getControle().getRound2().get(1).getNome() + ".");
        finalPoke.setText("VENCEDOR: " + Controle.getControle().getGanhador().getNome());

    }

    //grava ganhador
    public void gravaGanhador() {
        if (gravar.toString() != "")  {  
        Controle.getControle().setGravaGanhadores(gravar.toString());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        gravar = new javax.swing.JFormattedTextField();
        ok = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        parabens = new javax.swing.JLabel();
        round1 = new javax.swing.JLabel();
        round2 = new javax.swing.JLabel();
        part = new javax.swing.JLabel();
        finalPoke = new javax.swing.JLabel();
        imagemGanhador = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 150));
        setPreferredSize(new java.awt.Dimension(560, 400));
        getContentPane().setLayout(null);

        gravar.setText(" ");
        gravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gravarActionPerformed(evt);
            }
        });
        getContentPane().add(gravar);
        gravar.setBounds(220, 340, 120, 20);

        ok.setText("Ok");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });
        getContentPane().add(ok);
        ok.setBounds(340, 340, 45, 20);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Salve aqui o ganhador:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 340, 180, 17);

        parabens.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        parabens.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        parabens.setText("Parabéns aos participantes!");
        parabens.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(parabens);
        parabens.setBounds(60, 30, 300, 20);

        round1.setText("jLabel2");
        getContentPane().add(round1);
        round1.setBounds(60, 150, 320, 30);

        round2.setText("jLabel2");
        getContentPane().add(round2);
        round2.setBounds(60, 190, 320, 30);

        part.setText("jLabel2");
        getContentPane().add(part);
        part.setBounds(60, 120, 320, 30);

        finalPoke.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        finalPoke.setText("jLabel3");
        getContentPane().add(finalPoke);
        finalPoke.setBounds(50, 280, 90, 10);

        imagemGanhador.setIcon(new javax.swing.ImageIcon("D:\\Meus Documentos\\Pictures\\interface\\tm1.jpg")); // NOI18N
        imagemGanhador.setText("jLabel2");
        imagemGanhador.setMaximumSize(new java.awt.Dimension(557, 400));
        imagemGanhador.setMinimumSize(new java.awt.Dimension(557, 400));
        imagemGanhador.setPreferredSize(new java.awt.Dimension(557, 400));
        getContentPane().add(imagemGanhador);
        imagemGanhador.setBounds(-210, -300, 1153, 912);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gravarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gravarActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
       
        gravaGanhador();
    }//GEN-LAST:event_okActionPerformed

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
            java.util.logging.Logger.getLogger(Ganhador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ganhador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ganhador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ganhador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ganhador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel finalPoke;
    private javax.swing.JFormattedTextField gravar;
    private javax.swing.JLabel imagemGanhador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton ok;
    private javax.swing.JLabel parabens;
    private javax.swing.JLabel part;
    private javax.swing.JLabel round1;
    private javax.swing.JLabel round2;
    // End of variables declaration//GEN-END:variables
}
