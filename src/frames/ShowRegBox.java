package frames;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import database.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author dinht_000
 */
public class ShowRegBox extends JFrame {
    private static User user;
    /**
     * Creates new form showRegBox
     */
    public ShowRegBox(User user) {
        super("Get Free Key");
        this.user = user;
        setResizable(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        mainPanel = new JPanel();
        nameLabel = new JLabel();
        nameInputField = new JTextField();
        parentPanel = new JPanel();
        getKeyPanel = new JPanel();
        getKeyButton = new JButton();
        productKeyPanel = new JPanel();
        productKeyLabel = new JLabel();
        keyField = new JTextField();

        keyField.setEditable(false);
        keyField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                keyField.selectAll();
                keyField.copy();
                JOptionPane.showMessageDialog(ShowRegBox.this, "Key is copied to the clipboard");
            }
        });

        nameLabel.setText("Name:");

        parentPanel.setLayout(new CardLayout());

        final CardLayout cards = (CardLayout)parentPanel.getLayout();

        getKeyButton.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        getKeyButton.setText("Get Your Free Key");

        GroupLayout getKeyPanelLayout = new GroupLayout(getKeyPanel);
        getKeyPanel.setLayout(getKeyPanelLayout);
        getKeyPanelLayout.setHorizontalGroup(
                getKeyPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, getKeyPanelLayout.createSequentialGroup()
                                .addContainerGap(41, Short.MAX_VALUE)
                                .addComponent(getKeyButton, GroupLayout.PREFERRED_SIZE, 228, GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39))
        );
        getKeyPanelLayout.setVerticalGroup(
                getKeyPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(getKeyButton, GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        parentPanel.add(getKeyPanel, "getKeyButCard");

        productKeyLabel.setText("Product Key: ");

        GroupLayout productKeyPanelLayout = new GroupLayout(productKeyPanel);
        productKeyPanel.setLayout(productKeyPanelLayout);
        productKeyPanelLayout.setHorizontalGroup(
                productKeyPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(productKeyPanelLayout.createSequentialGroup()
                                .addComponent(productKeyLabel)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(keyField, GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE))
        );
        productKeyPanelLayout.setVerticalGroup(
                productKeyPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(productKeyPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(productKeyPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(productKeyLabel)
                                        .addComponent(keyField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(18, Short.MAX_VALUE))
        );

        parentPanel.add(productKeyPanel, "productKeyCard");

        GroupLayout mainPanelLayout = new GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
                mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(nameLabel)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nameInputField))
                        .addComponent(parentPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
                mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(nameLabel)
                                        .addComponent(nameInputField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(parentPanel, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(mainPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(mainPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        getKeyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user.setName(nameInputField.getText());
                keyField.setText(user.generateKey());
                cards.show(parentPanel, "productKeyCard");
            }
        });

        nameInputField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {}

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER){
                    user.setName(nameInputField.getText());
                    keyField.setText(user.generateKey());
                    cards.show(parentPanel, "productKeyCard");
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {}
        });
        pack();
    }// </editor-fold>

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ShowRegBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ShowRegBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ShowRegBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ShowRegBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ShowRegBox(user).setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify
    private JButton getKeyButton;
    private JPanel getKeyPanel;
    private JTextField keyField;
    private JPanel mainPanel;
    private JTextField nameInputField;
    private JLabel nameLabel;
    private JPanel parentPanel;
    private JPanel productKeyPanel;
    private JLabel productKeyLabel;
    // End of variables declaration                   
}
