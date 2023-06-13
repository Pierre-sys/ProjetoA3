package TelaDeCadastro;

public class WaterCalculator extends javax.swing.JFrame {

    public WaterCalculator() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1_ = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2_ = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3_ = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4_ = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        btn_Calculo = new javax.swing.JButton();
        btn_Quiz = new javax.swing.JButton();
        lbl_Resultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));

        jLabel1_.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1_.setText("Quanto tempo você passa no banho? (minutos)");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2_.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2_.setText("Quantidade de descargas por dia");

        jLabel3_.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3_.setText("Tempo escovando os dentes (minutos)");

        jLabel4_.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4_.setText("Tempo lavando a louça (minutos)");

        btn_Calculo.setText("CALCULAR");
        btn_Calculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CalculoActionPerformed(evt);
            }
        });

        btn_Quiz.setText("Abrir Quiz");
        btn_Quiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_QuizActionPerformed(evt);
            }
        });

        lbl_Resultado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_Resultado.setText("Resultado: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Resultado)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                        .addComponent(jLabel4_)
                        .addComponent(jTextField3)
                        .addComponent(jLabel3_)
                        .addComponent(jTextField2)
                        .addComponent(jLabel2_)
                        .addComponent(jTextField1)
                        .addComponent(jLabel1_)
                        .addComponent(btn_Calculo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_Quiz, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(186, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel4_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btn_Calculo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_Resultado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Quiz, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btn_CalculoActionPerformed(java.awt.event.ActionEvent evt) {
      
        
        
        int tempoBanho = Integer.parseInt(jTextField1.getText());
        int descargasPorDia = Integer.parseInt(jTextField2.getText());
        int tempoEscovandoDentes = Integer.parseInt(jTextField3.getText());
        int tempoLavandoLouca = Integer.parseInt(jTextField4.getText());

        int litrosGastos = calcularLitrosGastos(tempoBanho, descargasPorDia, tempoEscovandoDentes, tempoLavandoLouca);

        lbl_Resultado.setText("Resultado: " + litrosGastos + " litros");
        
        Consumo consumo = new Consumo( tempoBanho,  tempoLavandoLouca,  tempoEscovandoDentes,  descargasPorDia,  litrosGastos);
        ConexaoBD con = new ConexaoBD();
        con.insertConsumo(consumo);
    }

    private void btn_QuizActionPerformed(java.awt.event.ActionEvent evt) {
        QuizTela quiz = new QuizTela();
        quiz.setVisible(true);
    }

    private int calcularLitrosGastos(int tempoBanho, int descargasPorDia, int tempoEscovandoDentes, int tempoLavandoLouca) {
        // Fórmula para cálculo dos litros gastos
        int litrosBanho = tempoBanho * 15;
        int litrosDescargas = descargasPorDia * 12;
        int litrosEscovarDentes = tempoEscovandoDentes * 8;
        int litrosLavarLouca = tempoLavandoLouca * 3;

        int litrosGastos = litrosBanho + litrosDescargas + litrosEscovarDentes + litrosLavarLouca;
        return litrosGastos;
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WaterCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btn_Calculo;
    private javax.swing.JButton btn_Quiz;
    private javax.swing.JLabel jLabel1_;
    private javax.swing.JLabel jLabel2_;
    private javax.swing.JLabel jLabel3_;
    private javax.swing.JLabel jLabel4_;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lbl_Resultado;
    // End of variables declaration
}