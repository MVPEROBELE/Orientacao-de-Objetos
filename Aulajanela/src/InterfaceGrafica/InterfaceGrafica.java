/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceGrafica;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Supervisor
 */
public class InterfaceGrafica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        JFrame janela = new JFrame ("Ache o pato");
        janela.setSize(500, 500);
        JLabel resposta = new JLabel ("Não");
        JButton botao1 = new JButton ("Botão 1");
        JButton botao2 = new JButton ("Botão 2");
        JButton botao3 = new JButton ("Botão 3");
        JButton botao4 = new JButton ("Botão 4");
        JButton botao5 = new JButton ("Botão 5");
        JPanel painel = new JPanel();
        painel.setLayout(new BorderLayout());
        botao1.addActionListener(new escutaBotao());
        botao4.addActionListener(new escutaBotao());
        botao5.addActionListener(new escutaBotao());
        //criando classe anonima
        botao2.addActionListener(new ActionListener(){
         @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Errou");
        }
        });
        
        botao3.addActionListener(new ActionListener(){
         @Override
        
    public void actionPerformed(ActionEvent e) {
        Object [] opcao = {"Tentar Novamente", "Encerrar"};
   
        NewJFrame interf = new NewJFrame();
        interf.setVisible(true);
        //JOptionPane.showOptionDialog(janela, "Você Achou o Pato", "Informação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcao, opcao[1]);
        //JOptionPane.showOptionDialog(parentComponent, opcao, title, 0, 0, icon, opcao, opcao)
    }
        });
        
       //msm função do de cima
       //painel.setLayout(new BoxLayout(painel, BoxLayout.X_AXIS));
        
        janela.getContentPane().add(painel);
        painel.add(botao1, BorderLayout.NORTH);
        painel.add(botao2, BorderLayout.SOUTH);
        painel.add(botao3, BorderLayout.EAST);
        painel.add(botao4, BorderLayout.WEST);
        painel.add(botao5, BorderLayout.CENTER);
        
        janela.pack();
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
        // TODO code application logic here
    }
    
}
