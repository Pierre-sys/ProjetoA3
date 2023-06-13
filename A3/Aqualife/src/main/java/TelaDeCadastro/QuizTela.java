package TelaDeCadastro;

import java.awt.Color;
import javax.swing.SwingWorker;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

public class QuizTela extends javax.swing.JFrame {
    private final Color blueColor = new Color(102, 204, 255);
    

    String[] questions = {"Qual é a principal causa do desperdício de água em residências?",
        "Quanto tempo, em média, uma torneira pingando desperdiça água em um dia?",
        "Qual das seguintes atividades domésticas consome mais água?",
        "Como reduzir o desperdício de água ao lavar o carro?",
        "Qual é a principal consequência do desperdício de água nas áreas urbanas?"};
    
    //o ultimo item é a resposta correta
    String[][] options = {
        {"Descarga","Banhos longos","Vazamentos de torneiras e canos.","Escovar os dentes com a torneira ligada","Vazamentos de torneiras e canos."},
        {"10 Litros","15 Litros","46 Litros","25 Litros","46 Litros"},
        {"Lavar roupa na máquina.","Tomar banho.","Regar o jardim.","Lavar louça à mão.","Lavar roupa na máquina."},
        {"Usar mangueira de alta pressão.","Lavar em superfície impermeável.","Deixar torneira aberta o tempo todo.","Enxaguar com baldes de água.","Enxaguar com baldes de água."},
        {"Escassez de água.","Aumento da poluição do ar.","Restrição no abastecimento de água.","Erosão do solo.","Restrição no abastecimento de água."}};
    
    int index = 0, correct = 0;
    
    ButtonGroup bg = new ButtonGroup();
        
    public QuizTela() {
        initComponents();
        
        bg.add(jRadioButton1_);
        bg.add(jRadioButton2_);
        bg.add(jRadioButton3_);
        bg.add(jRadioButton4_);
        
        jButton_Next_QActionPerformed(null);                           
    }

    public void getSelectedOption (JRadioButton rbtn)
    {
        SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
    @Override
    protected Void doInBackground() throws Exception {
        enableRbuttons(false);
        Color correctColor = Color.GREEN;
        Color wrongColor = Color.RED;

        if (rbtn.getText().equals(options[index][4])) {
            correct++;
            blinkColor(correctColor);
        } else {
            blinkColor(wrongColor);
        }

        index++;
        return null;
    }

    private void blinkColor(Color color) throws InterruptedException {
        jPanel_Q_Container.setBackground(color);
        Thread.sleep(500);
        jPanel_Q_Container.setBackground(new Color(102, 204, 255));
        Thread.sleep(500);
    }
};
worker.execute();
    }
    
    
    public void enableRbuttons(boolean yes_or_no)
    {
        jRadioButton1_.setEnabled(yes_or_no);
        jRadioButton2_.setEnabled(yes_or_no);
        jRadioButton3_.setEnabled(yes_or_no);
        jRadioButton4_.setEnabled(yes_or_no);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Q_Container = new javax.swing.JPanel();
        Lbl_Question = new javax.swing.JLabel();
        jRadioButton1_ = new javax.swing.JRadioButton();
        jRadioButton2_ = new javax.swing.JRadioButton();
        jRadioButton3_ = new javax.swing.JRadioButton();
        jRadioButton4_ = new javax.swing.JRadioButton();
        jButton_Next_Q = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_Q_Container.setBackground(new java.awt.Color(102, 204, 255));

        Lbl_Question.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Lbl_Question.setText("Questão 1");

        jRadioButton1_.setText("jRadioButton1");
        jRadioButton1_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1_ActionPerformed(evt);
            }
        });

        jRadioButton2_.setText("jRadioButton2");
        jRadioButton2_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2_ActionPerformed(evt);
            }
        });

        jRadioButton3_.setText("jRadioButton3");
        jRadioButton3_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3_ActionPerformed(evt);
            }
        });

        jRadioButton4_.setText("jRadioButton4");
        jRadioButton4_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4_ActionPerformed(evt);
            }
        });

        jButton_Next_Q.setBackground(new java.awt.Color(153, 153, 153));
        jButton_Next_Q.setText("PRÓXIMA QUESTÃO");
        jButton_Next_Q.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Next_QActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_Q_ContainerLayout = new javax.swing.GroupLayout(jPanel_Q_Container);
        jPanel_Q_Container.setLayout(jPanel_Q_ContainerLayout);
        jPanel_Q_ContainerLayout.setHorizontalGroup(
            jPanel_Q_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Q_ContainerLayout.createSequentialGroup()
                .addGroup(jPanel_Q_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_Q_ContainerLayout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(jButton_Next_Q, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_Q_ContainerLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(Lbl_Question))
                    .addGroup(jPanel_Q_ContainerLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel_Q_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton2_)
                            .addComponent(jRadioButton1_)
                            .addComponent(jRadioButton3_)
                            .addComponent(jRadioButton4_))))
                .addContainerGap(327, Short.MAX_VALUE))
        );
        jPanel_Q_ContainerLayout.setVerticalGroup(
            jPanel_Q_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Q_ContainerLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(Lbl_Question, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jRadioButton1_)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton2_)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton3_)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton4_)
                .addGap(45, 45, 45)
                .addComponent(jButton_Next_Q, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Q_Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Q_Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_Next_QActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Next_QActionPerformed
        
        if(jButton_Next_Q.getText().equals("RECOMEÇAR O QUIZ"))
        {            
            //recomeçar o quiz
            jButton_Next_Q.setText("PRÓXIMO");            
            index = 0;
            correct = 0;           
            jPanel_Q_Container.setBackground(blueColor);
        }    
        
        if(index == questions.length)
        {
            Lbl_Question.setText("SUA PONTUAÇÃO: " + correct + " / " + questions.length);
            if(correct >= (float) questions.length/2)                                 
            {
                jPanel_Q_Container.setBackground(Color.green);
            }
            else{
                jPanel_Q_Container.setBackground(Color.red);
            }
            jButton_Next_Q.setText("RECOMEÇAR O QUIZ");
        }
        
        else{
                enableRbuttons(true);

            // display da proxima questão
            Lbl_Question.setText(questions[index]);
            jRadioButton1_.setText(options[index][0]);
            jRadioButton2_.setText(options[index][1]);
            jRadioButton3_.setText(options[index][2]);
            jRadioButton4_.setText(options[index][3]);

            if(index == questions.length-1){
                jButton_Next_Q.setText("VER O RESULTADO");
            }
        }
        //limpar a seleção 
        bg.clearSelection();
            
    }//GEN-LAST:event_jButton_Next_QActionPerformed

    private void jRadioButton1_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1_ActionPerformed
        getSelectedOption(jRadioButton1_);
    }//GEN-LAST:event_jRadioButton1_ActionPerformed

    private void jRadioButton2_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2_ActionPerformed
        getSelectedOption(jRadioButton2_);
    }//GEN-LAST:event_jRadioButton2_ActionPerformed

    private void jRadioButton3_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3_ActionPerformed
        getSelectedOption(jRadioButton3_);
    }//GEN-LAST:event_jRadioButton3_ActionPerformed

    private void jRadioButton4_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4_ActionPerformed
        getSelectedOption(jRadioButton4_);
    }//GEN-LAST:event_jRadioButton4_ActionPerformed
    
    
    
    
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
            java.util.logging.Logger.getLogger(QuizTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuizTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuizTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuizTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuizTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbl_Question;
    private javax.swing.JButton jButton_Next_Q;
    private javax.swing.JPanel jPanel_Q_Container;
    private javax.swing.JRadioButton jRadioButton1_;
    private javax.swing.JRadioButton jRadioButton2_;
    private javax.swing.JRadioButton jRadioButton3_;
    private javax.swing.JRadioButton jRadioButton4_;
    // End of variables declaration//GEN-END:variables
}
