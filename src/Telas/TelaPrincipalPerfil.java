/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

/**
 *
 * @author void
 */
public class TelaPrincipalPerfil extends javax.swing.JPanel {

    /**
     * Creates new form TelaPrincipalPerfil
     */
    public TelaPrincipalPerfil() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        panelPerfilConteudo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnTelaPerfilEditar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnTelaPerfilNotificacoes = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnTelaPerfilAjuda = new javax.swing.JButton();
        btnTelaPerfilVoltar = new javax.swing.JButton();
        btnTelaPerfilConfiguracoes = new javax.swing.JButton();
        btnTelaPerfilSeguranca = new javax.swing.JButton();
        btnTelaPerfilCadastroEstabelecimento = new javax.swing.JButton();
        btnTelaPerfilFaleConosco = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(null);

        jLabel26.setText("Inicío");
        jPanel11.add(jLabel26);
        jLabel26.setBounds(10, 40, 37, 15);

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icones - lupa.png"))); // NOI18N
        jPanel11.add(jLabel27);
        jLabel27.setBounds(90, 0, 30, 30);

        jLabel29.setText("Busca");
        jPanel11.add(jLabel29);
        jLabel29.setBounds(80, 40, 42, 15);

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icones - casa.png"))); // NOI18N
        jPanel11.add(jLabel35);
        jLabel35.setBounds(10, 0, 30, 30);

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icones - carrinho.png"))); // NOI18N
        jPanel11.add(jLabel36);
        jLabel36.setBounds(170, 0, 30, 30);

        jLabel37.setText("Pedidos");
        jPanel11.add(jLabel37);
        jLabel37.setBounds(160, 40, 57, 15);

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icones - perfil.png"))); // NOI18N
        jPanel11.add(jLabel38);
        jLabel38.setBounds(250, 0, 30, 30);

        jLabel39.setText("Perfil");
        jPanel11.add(jLabel39);
        jLabel39.setBounds(250, 40, 37, 15);

        jPanel1.add(jPanel11);
        jPanel11.setBounds(0, 450, 310, 60);

        panelPerfilConteudo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Fullano de tal");

        btnTelaPerfilEditar.setOpaque(false);
        btnTelaPerfilEditar.setContentAreaFilled(false);
        btnTelaPerfilEditar.setBorderPainted(false);
        btnTelaPerfilEditar.setForeground(new java.awt.Color(102, 102, 102));
        btnTelaPerfilEditar.setText("Editar Perfil");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/foto rosto 60x60.png"))); // NOI18N

        btnTelaPerfilNotificacoes.setOpaque(false);
        btnTelaPerfilNotificacoes.setContentAreaFilled(false);
        //btnTelaPerfilNotificacoes.setBorderPainted(false);
        btnTelaPerfilNotificacoes.setText("    Notificações");
        btnTelaPerfilNotificacoes.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        btnTelaPerfilNotificacoes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnTelaPerfilNotificacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelaPerfilNotificacoesActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/seta volta (1).png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText(">");

        btnTelaPerfilAjuda.setOpaque(false);
        btnTelaPerfilAjuda.setContentAreaFilled(false);
        //btnTelaPerfilAjuda.setBorderPainted(false);
        btnTelaPerfilAjuda.setText("    Ajuda");
        btnTelaPerfilAjuda.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        btnTelaPerfilAjuda.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnTelaPerfilVoltar.setOpaque(false);
        btnTelaPerfilVoltar.setContentAreaFilled(false);
        //btnTelaPerfilVoltar.setBorderPainted(false);
        btnTelaPerfilVoltar.setBackground(new java.awt.Color(204, 204, 204));
        btnTelaPerfilVoltar.setText("    Voltar");
        btnTelaPerfilVoltar.setToolTipText("");
        btnTelaPerfilVoltar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        btnTelaPerfilVoltar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnTelaPerfilVoltar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnTelaPerfilConfiguracoes.setOpaque(false);
        btnTelaPerfilConfiguracoes.setContentAreaFilled(false);
        //btnTelaPerfilConfiguracoes.setBorderPainted(false);
        btnTelaPerfilConfiguracoes.setText("    Configurações");
        btnTelaPerfilConfiguracoes.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        btnTelaPerfilConfiguracoes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnTelaPerfilSeguranca.setOpaque(false);
        btnTelaPerfilSeguranca.setContentAreaFilled(false);
        //btnTelaPerfilSeguranca.setBorderPainted(false);
        btnTelaPerfilSeguranca.setText("    Segurança");
        btnTelaPerfilSeguranca.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        btnTelaPerfilSeguranca.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnTelaPerfilCadastroEstabelecimento.setOpaque(false);
        btnTelaPerfilCadastroEstabelecimento.setContentAreaFilled(false);
        //btnTelaPerfilCadastroEstabelecimento.setBorderPainted(false);
        btnTelaPerfilCadastroEstabelecimento.setText("    Cadastre Seu Estabelecimento");
        btnTelaPerfilCadastroEstabelecimento.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        btnTelaPerfilCadastroEstabelecimento.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnTelaPerfilFaleConosco.setOpaque(false);
        btnTelaPerfilFaleConosco.setContentAreaFilled(false);
        //btnTelaPerfilFaleConosco.setBorderPainted(false);
        btnTelaPerfilFaleConosco.setText("    Fale Conosco");
        btnTelaPerfilFaleConosco.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        btnTelaPerfilFaleConosco.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sino.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ajuda (1).png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/engrenagem (1).png"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/loja.png"))); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/escudo.png"))); // NOI18N

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fale.png"))); // NOI18N

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText(">");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText(">");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText(">");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText(">");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText(">");

        javax.swing.GroupLayout panelPerfilConteudoLayout = new javax.swing.GroupLayout(panelPerfilConteudo);
        panelPerfilConteudo.setLayout(panelPerfilConteudoLayout);
        panelPerfilConteudoLayout.setHorizontalGroup(
            panelPerfilConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPerfilConteudoLayout.createSequentialGroup()
                .addContainerGap(280, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addGap(20, 20, 20))
            .addGroup(panelPerfilConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelPerfilConteudoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(panelPerfilConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelPerfilConteudoLayout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(16, 16, 16)
                            .addGroup(panelPerfilConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelPerfilConteudoLayout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel1))
                                .addComponent(btnTelaPerfilEditar)))
                        .addGroup(panelPerfilConteudoLayout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(22, 22, 22)
                            .addComponent(btnTelaPerfilVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelPerfilConteudoLayout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(28, 28, 28)
                            .addComponent(btnTelaPerfilNotificacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel4))
                        .addGroup(panelPerfilConteudoLayout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(20, 20, 20)
                            .addGroup(panelPerfilConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelPerfilConteudoLayout.createSequentialGroup()
                                    .addGap(186, 186, 186)
                                    .addComponent(jLabel2))
                                .addComponent(btnTelaPerfilAjuda, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addComponent(jLabel17))
                        .addGroup(panelPerfilConteudoLayout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(18, 18, 18)
                            .addComponent(btnTelaPerfilConfiguracoes, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel18))
                        .addGroup(panelPerfilConteudoLayout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addGap(20, 20, 20)
                            .addComponent(btnTelaPerfilSeguranca, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel21))
                        .addGroup(panelPerfilConteudoLayout.createSequentialGroup()
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnTelaPerfilCadastroEstabelecimento, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelPerfilConteudoLayout.createSequentialGroup()
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnTelaPerfilFaleConosco, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel19)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panelPerfilConteudoLayout.setVerticalGroup(
            panelPerfilConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPerfilConteudoLayout.createSequentialGroup()
                .addContainerGap(348, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addGap(77, 77, 77))
            .addGroup(panelPerfilConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelPerfilConteudoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(panelPerfilConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addGroup(panelPerfilConteudoLayout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(5, 5, 5)
                            .addComponent(btnTelaPerfilEditar)))
                    .addGap(17, 17, 17)
                    .addGroup(panelPerfilConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelPerfilConteudoLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(btnTelaPerfilVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(11, 11, 11)
                    .addGroup(panelPerfilConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7)
                        .addComponent(btnTelaPerfilNotificacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelPerfilConteudoLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel4)))
                    .addGap(18, 18, 18)
                    .addGroup(panelPerfilConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addGroup(panelPerfilConteudoLayout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(jLabel2))
                        .addComponent(btnTelaPerfilAjuda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelPerfilConteudoLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel17)))
                    .addGap(20, 20, 20)
                    .addGroup(panelPerfilConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9)
                        .addComponent(btnTelaPerfilConfiguracoes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelPerfilConteudoLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel18)))
                    .addGap(18, 18, 18)
                    .addGroup(panelPerfilConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel13)
                        .addComponent(btnTelaPerfilSeguranca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel21))
                    .addGap(20, 20, 20)
                    .addGroup(panelPerfilConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11)
                        .addComponent(btnTelaPerfilCadastroEstabelecimento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addGroup(panelPerfilConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel15)
                        .addComponent(btnTelaPerfilFaleConosco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelPerfilConteudoLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel19)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(panelPerfilConteudo);
        panelPerfilConteudo.setBounds(0, 0, 310, 440);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTelaPerfilNotificacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelaPerfilNotificacoesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTelaPerfilNotificacoesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTelaPerfilAjuda;
    private javax.swing.JButton btnTelaPerfilCadastroEstabelecimento;
    private javax.swing.JButton btnTelaPerfilConfiguracoes;
    private javax.swing.JButton btnTelaPerfilEditar;
    private javax.swing.JButton btnTelaPerfilFaleConosco;
    private javax.swing.JButton btnTelaPerfilNotificacoes;
    private javax.swing.JButton btnTelaPerfilSeguranca;
    private javax.swing.JButton btnTelaPerfilVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    public javax.swing.JPanel panelPerfilConteudo;
    // End of variables declaration//GEN-END:variables
}
