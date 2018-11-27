
package InterfacesPoke;

import controle.Controle;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.table.DefaultTableModel;
import main.Pokemon;



public class BatalhaOpcoes extends javax.swing.JFrame {

    Map<String, String> mapaNomes = new HashMap<String, String>();

    public BatalhaOpcoes() {

        initComponents();
        nomedescri();
        DefaultTableModel modelo = (DefaultTableModel) tablePoke.getModel();
        Set<String> nomesPoke = mapaNomes.keySet();
        for (String nome : nomesPoke) {
            modelo.addRow(new Object[]{nome});
        }
        tablePoke.setModel(modelo);
        this.inicializaPart();

    }
    
    public void inicializaPart (){
    List<Pokemon> part = Controle.getControle().getParticipantes();
    jtfJog1.setText(part.get(0).getNome());
    jtfJog2.setText(part.get(1).getNome());
    jtfJog3.setText(part.get(2).getNome());
    jtfJog4.setText(part.get(3).getNome());
    jtfJog5.setText(part.get(4).getNome());
    jtfJog6.setText(part.get(5).getNome());
    jtfJog7.setText(part.get(6).getNome());
    jtfJog8.setText(part.get(7).getNome());
}

    public void nomedescri() {
        mapaNomes.put("FireGrey", "FireGrey é um Pokemon do tipo fogo, pode aumentar seu dano com seu lança chamas de acordo com seu nível de raiva, suas evoluções são desconhecidos. Vantagens contra tipos planta, inseto, gelo e metálicos.");
        mapaNomes.put("AquaPoke", "AquaPoke é um Pokemon do tipo água, tendo vantagem sobre tipos fogo, terra e pedra. Sua aparência é inofensiva, porém, não queira vê-lo irritado. ");
        mapaNomes.put("Guifrint", "Guifrint é um Pokemon tipo voador, tem vantagens contra tipos grama, lutador e inseto. Suas evoluções ainda são desconhecidas. Ataca pelos ares usando investidas e rajadas de vento.");
        mapaNomes.put("Browser", "Browser é um Pokemon tipo terra, tendo vantagens contra fogo, elétrico, venenoso e pedra. Tem vantagens contra grama e inseto. Evoluções desconhecidas. Browser pode surpreender seus adversários entrando na terra e aplicando ataques físicos poderosos.");
        mapaNomes.put("Spopovite", "Spopovite é um Pokemon tipo lutador, tem vantagens sobre tipos gelo, pedra e aço. Evoluções desconhecidas, Spopovite possui apenas ataques físicos, porém, com uma gigantesca potência.");
        mapaNomes.put("Concker", "Concker é um Pokemon tipo elétrico, possui suas vantagens contra tipos água e voadores. Evoluções desconhecidas. Concker pode descarregar ataques elétricos mortais de deixar cabelos em pé.");
        mapaNomes.put("Orochibuto", "Orochibuto é um Pokemon tipo venenoso, possui vantagens contra fada, planta, inseto e lutador. Evoluções desconhecidas. Orochibuto ataca usando tipos de veneno como paralisantes ou tranquilizantes antes de sua dose mortal.");
        mapaNomes.put("Kabuterion", "Kabuterion é um Pokemon do tipo inseto, possui vantagem contra tipos planta, psíquico, noturno, terrestre e lutador. Evoluções desconhecidas. Kabuterion ataca pelos ares e também por terra, uma vantagem que pode ser aproveitada.");
        mapaNomes.put("Growker", "Growker é um Pokemon tipo pedra, com vantagens sobre tipos fogo, gelo, voador, inseto e venenoso. Evoluções desconhecidas. Growker pode atacar fisicamente e também atirar rochas em grande velocidade em seus adversários.");
        mapaNomes.put("Demoghost", "Demoghost é um Pokemon tipo fantasma, possui vantagens contra tipos, venenoso, inseto, psíquico e lutador. Evoluções desconhecidas. Demoghost pode usar ataques de ilusões e confundir seus adversários, adora brincar nas batalhas.");
        mapaNomes.put("Darkvaser", "Darkvaiser é um Pokemon tipo noturno, possui vantagens contra tipos fantasma e psíquico. Evoluções desconhecidas. Darkvaser adora atacar em meio a escuridão, não que possa subestima-lo(a) em qualquer ambiente, pode ser um erro fatal.");
        mapaNomes.put("Shakasky", "Shakasky é um Pokemon psiquico, com vantagens sobre tipos lutador e venenoso. Evoluções desconhecidas. Shakasky utiliza golpes psíquicos extremamente perturbadores fazendo seus adversários implorar para o fim da batalha.");
        mapaNomes.put("Nevasca", "Nevasca é um Pokemon tipo gelo, vantagens contra tipos planta, terrestre, voador e dragão. Evoluções desconhecidas. Yogaice usa sua tempestade congelante assim como dispara raios de gelo a temperaturas extremamente baixas. ");
        mapaNomes.put("Grooth", "Grooth é um Pokemon tipo planta, possui vantagens contra agua, elétrico, terrestre e pedra. Evoluções desconhecidas. Grooth possui uma grande diversidade de ataques, folhas navalha, chicotes espinhosos, e o seu mais potente raio solar, onde dispara uma rajada de raio solar com capacidade de finalizar imediatamente a batalha.");
        mapaNomes.put("Sowinx", "Sowinx é um Pokemon tipo fada, possui vantagem contra tipos noturno, lutador, inseto e dragão. Evoluções desconhecidas. Sowinx aparenta uma gracinha, porém, até si próprio(a) desconhece sua gigantesca força de ataque.");
        mapaNomes.put("Drogonar", "Drogonar é um Pokemon tipo dragão, possui vantagens contra tipos água, fogo, planta e elétrico. Evoluções desconhecidas. Drogonar ataca por ares e terra usando seu grande porte e peso, juntando a sua força e também seu lança chamas extremamente quente.");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jtfJog3 = new javax.swing.JTextField();
        jtfJog4 = new javax.swing.JTextField();
        jtfJog5 = new javax.swing.JTextField();
        jtfJog6 = new javax.swing.JTextField();
        jtfJog1 = new javax.swing.JTextField();
        jtfJog2 = new javax.swing.JTextField();
        jtfJog7 = new javax.swing.JTextField();
        jtfJog8 = new javax.swing.JTextField();
        gerarBatalha = new javax.swing.JButton();
        jScrollPane17 = new javax.swing.JScrollPane();
        tablePoke = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jInternalFrame1 = new javax.swing.JInternalFrame();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jtfJog3.setText("jTextField4");
        jtfJog3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfJog3ActionPerformed(evt);
            }
        });
        getContentPane().add(jtfJog3);
        jtfJog3.setBounds(150, 30, 59, 20);

        jtfJog4.setText("jTextField5");
        getContentPane().add(jtfJog4);
        jtfJog4.setBounds(210, 30, 59, 20);

        jtfJog5.setText("jTextField6");
        getContentPane().add(jtfJog5);
        jtfJog5.setBounds(280, 30, 59, 20);

        jtfJog6.setText("jTextField7");
        getContentPane().add(jtfJog6);
        jtfJog6.setBounds(340, 30, 59, 20);

        jtfJog1.setText("jTextField2");
        jtfJog1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfJog1ActionPerformed(evt);
            }
        });
        getContentPane().add(jtfJog1);
        jtfJog1.setBounds(10, 30, 59, 20);

        jtfJog2.setText("jTextField3");
        getContentPane().add(jtfJog2);
        jtfJog2.setBounds(70, 30, 59, 20);

        jtfJog7.setText("jTextField8");
        getContentPane().add(jtfJog7);
        jtfJog7.setBounds(420, 30, 59, 20);

        jtfJog8.setText("jTextField9");
        getContentPane().add(jtfJog8);
        jtfJog8.setBounds(480, 30, 59, 20);

        gerarBatalha.setText("Gerar Batalha!");
        gerarBatalha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerarBatalhaActionPerformed(evt);
            }
        });
        getContentPane().add(gerarBatalha);
        gerarBatalha.setBounds(180, 110, 190, 40);

        tablePoke.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablePoke.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePokeMouseClicked(evt);
            }
        });
        jScrollPane17.setViewportView(tablePoke);

        getContentPane().add(jScrollPane17);
        jScrollPane17.setBounds(390, 180, 150, 190);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Façam suas apostas e anotem! Vamos ver quem ganhará!");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 70, 480, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Meus Documentos\\Pictures\\interface\\fanfiction-animes-pokemon-pokemon-fire-red-and-leaf-green-704939,010420131428.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 558, 400);

        jInternalFrame1.setVisible(true);
        jInternalFrame1.getContentPane().setLayout(null);
        getContentPane().add(jInternalFrame1);
        jInternalFrame1.setBounds(0, 0, 560, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablePokeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePokeMouseClicked

        if (evt.getClickCount() == 1) {
            TelaDescricao telad = new TelaDescricao(this, true);
            
            telad.setDescriPoke(mapaNomes.get(tablePoke.getValueAt(tablePoke.getSelectedRow(), 0)));
           
            telad.setVisible(true);
            
        }
    }//GEN-LAST:event_tablePokeMouseClicked

    private void jtfJog1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfJog1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfJog1ActionPerformed

    private void jtfJog3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfJog3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfJog3ActionPerformed

    private void gerarBatalhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarBatalhaActionPerformed
         
        Ganhador ganhador = new Ganhador();
        this.setVisible(false);
        ganhador.setVisible(true);
    }//GEN-LAST:event_gerarBatalhaActionPerformed
  
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
            java.util.logging.Logger.getLogger(BatalhaOpcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BatalhaOpcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BatalhaOpcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BatalhaOpcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            new BatalhaOpcoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton gerarBatalha;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jtfJog1;
    private javax.swing.JTextField jtfJog2;
    private javax.swing.JTextField jtfJog3;
    private javax.swing.JTextField jtfJog4;
    private javax.swing.JTextField jtfJog5;
    private javax.swing.JTextField jtfJog6;
    private javax.swing.JTextField jtfJog7;
    private javax.swing.JTextField jtfJog8;
    private javax.swing.JTable tablePoke;
    // End of variables declaration//GEN-END:variables
}
