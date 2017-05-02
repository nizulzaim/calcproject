/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples.message;

import jade.lang.acl.ACLMessage;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Tutor
 */
public class CalcGUI extends javax.swing.JFrame {
    private CalcSender myAgent;

    /**
     * Creates new form CalGUI
     */
    public CalcGUI(CalcSender a) {
        super(a.getLocalName());		
        myAgent = a;
        initComponents();
    }
    
    public CalcGUI() {
        initComponents();
    }    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        operand1 = new javax.swing.JTextField();
        operand2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        operation = new javax.swing.JComboBox<String>();
        submit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtLog = new javax.swing.JTextArea();
        servicecheck = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Operand 1");

        jLabel2.setText("Operand 2");

        operand2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operand2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Operation");

        operation.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "plus", "minus", "multiply", "divide" }));
        operation.setEnabled(false);

        submit.setText("Calculate");
        submit.setEnabled(false);
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        txtLog.setColumns(20);
        txtLog.setRows(5);
        jScrollPane1.setViewportView(txtLog);

        servicecheck.setLabel("Service Check");
        servicecheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                servicecheckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(operand2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(operand1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(submit))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(operation, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(servicecheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(servicecheck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(operand1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(operand2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(operation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(submit)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void operand2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operand2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_operand2ActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        int oper1 = Integer.parseInt(operand1.getText());
        int oper2 = Integer.parseInt(operand2.getText());
        String theOperator = (String)operation.getSelectedItem();
        
        Calculation calcObj = new Calculation();
        calcObj.setOperand1(oper1);
        calcObj.setOperand2(oper2);
        calcObj.setOperation(theOperator);
        myAgent.requestCalculation(calcObj);
        
        //JOptionPane.showMessageDialog(new JFrame(), oper1 + " + " + oper2 + " = " + result);
    }//GEN-LAST:event_submitActionPerformed

    private void servicecheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_servicecheckActionPerformed
        // TODO add your handling code here:
        myAgent.getCalcServiceAgent();
    }//GEN-LAST:event_servicecheckActionPerformed

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
            java.util.logging.Logger.getLogger(CalcGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalcGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalcGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalcGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalcGUI().setVisible(true);
            }
        });
    }
    
    public void showGui() {
	pack();
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	int centerX = (int)screenSize.getWidth() / 2;
	int centerY = (int)screenSize.getHeight() / 2;
	setLocation(centerX - getWidth() / 2, centerY - getHeight() / 2);
	super.setVisible(true);
    }	

    public void showResult(Calculation calcObj) {
        /*
        if (calcObj.isSuccess()) {
            System.out.println("\n[CalcSender] Calculation - operation: " + calcObj.getOperation());
            System.out.println("[CalcSender] Calculation - operand1 : " + calcObj.getOperand1());
            System.out.println("[CalcSender] Calculation - operand2 : " + calcObj.getOperand2());
            System.out.println("[CalcSender] Calculation - result   : " + calcObj.getResult());
            System.out.println("[CalcSender] Calculation - info   : " + calcObj.getInfo());
        } else {
            System.out.println("\n[CalcSender]" + calcObj.getInfo());
        } 
        */
        
        JOptionPane.showMessageDialog(new JFrame(), calcObj.getInfo());
    }
    
    public void appendLog(String text) {
        txtLog.append(text + "\n");        
    }
    
    public void clearLog() {
        txtLog.setText("");
    }
    
    public void popup(String text) {
        JOptionPane.showMessageDialog(new JFrame(), text);
    }
    
    public void enabledGUI() {
        operation.setEnabled(true);
        submit.setEnabled(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField operand1;
    private javax.swing.JTextField operand2;
    private javax.swing.JComboBox<String> operation;
    private javax.swing.JButton servicecheck;
    private javax.swing.JButton submit;
    private javax.swing.JTextArea txtLog;
    // End of variables declaration//GEN-END:variables
}