/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package x.credit.view;

import java.awt.Color;
import java.time.Instant;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import x.credit.controller.RecargaController;
import x.credit.controller.TransacaoController;
import x.credit.model.Recarga;
import x.credit.model.Transacao;

/**
 *
 * @author Edmilson Rolas
 */
public class TelaRecargas extends javax.swing.JFrame {

    /**
     * Creates new form RegistoUsuario
     */
    public TelaRecargas() {
        initComponents();
        preencherTabela();
        btTipoAlter.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btTransacoes = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        btSave = new javax.swing.JButton();
        btNew = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        cbQuantidadeStock = new javax.swing.JComboBox<>();
        cbValor = new javax.swing.JComboBox<>();
        cbOperadora = new javax.swing.JComboBox<>();
        btTipoAlter = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        lbRec = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel6.setBackground(new java.awt.Color(153, 0, 0));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("X-Credit : Recargas");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(46, 46, 46))
        );

        jPanel5.setBackground(new java.awt.Color(153, 0, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btTransacoes.setBackground(new java.awt.Color(204, 255, 255));
        btTransacoes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btTransacoes.setText("Transacoes");
        btTransacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTransacoesActionPerformed(evt);
            }
        });

        btRemover.setBackground(new java.awt.Color(204, 255, 255));
        btRemover.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btRemover.setText("Remover");
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });

        btSave.setBackground(new java.awt.Color(204, 255, 255));
        btSave.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btSave.setText("Salvar");
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });

        btNew.setBackground(new java.awt.Color(204, 255, 255));
        btNew.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btNew.setText("Novo");
        btNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btTransacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btNew, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btSave, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btTransacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btSave, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btNew, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(153, 0, 0));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Valor", "Operadora", "Quantidade Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jTable1MouseDragged(evt);
            }
        });
        jTable1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTable1FocusGained(evt);
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTable1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTable1MouseExited(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(153, 0, 0));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cbQuantidadeStock.setEditable(true);
        cbQuantidadeStock.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        cbQuantidadeStock.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "10", "15", "20", "30", "40", "50", "60", "70", "80", "90", "100", "200", "500", "1000" }));
        cbQuantidadeStock.setToolTipText("Quantidade");
        cbQuantidadeStock.setMaximumSize(new java.awt.Dimension(112, 28));
        cbQuantidadeStock.setMinimumSize(new java.awt.Dimension(112, 28));
        cbQuantidadeStock.setPreferredSize(new java.awt.Dimension(112, 28));
        cbQuantidadeStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbQuantidadeStockActionPerformed(evt);
            }
        });

        cbValor.setEditable(true);
        cbValor.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        cbValor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "20", "50", "100", "200", "300", "500", "600", "1000" }));
        cbValor.setToolTipText("Valor");
        cbValor.setMaximumSize(new java.awt.Dimension(112, 28));
        cbValor.setMinimumSize(new java.awt.Dimension(112, 28));
        cbValor.setName("Valor"); // NOI18N
        cbValor.setNextFocusableComponent(cbOperadora);
        cbValor.setPreferredSize(new java.awt.Dimension(112, 28));

        cbOperadora.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        cbOperadora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tmcel", "Vodacom", "Movitel" }));
        cbOperadora.setToolTipText("Operadora");
        cbOperadora.setMaximumSize(new java.awt.Dimension(112, 28));
        cbOperadora.setMinimumSize(new java.awt.Dimension(112, 28));
        cbOperadora.setPreferredSize(new java.awt.Dimension(112, 28));

        btTipoAlter.setBackground(new java.awt.Color(204, 204, 255));
        btTipoAlter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btTipoAlter.setText("Entrada");
        btTipoAlter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btTipoAlterStateChanged(evt);
            }
        });
        btTipoAlter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTipoAlterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbOperadora, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(cbValor, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(btTipoAlter, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbQuantidadeStock, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbValor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbOperadora, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbQuantidadeStock, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(btTipoAlter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(153, 0, 0));
        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbRec.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        lbRec.setForeground(new java.awt.Color(255, 255, 255));
        lbRec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbRec.setText("Nova Recarga"); // NOI18N
        lbRec.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbRec, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbRec, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (jTable1.getSelectedRow() != -1) {
            lbRec.setText("Dados da Recarga:");
            cbValor.setSelectedItem(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
            cbOperadora.setSelectedItem(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
            cbQuantidadeStock.setSelectedItem(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
            
            cbValor.setEnabled(false);
            cbOperadora.setEnabled(false);
            
            btTipoAlter.setVisible(true);
            btTipoAlter.setText("Entrada");
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseEntered
//        System.out.println("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseEntered

    private void btTransacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTransacoesActionPerformed
        new Transacoes().setVisible(true);
        dispose();
    }//GEN-LAST:event_btTransacoesActionPerformed

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        String data = Date.from(Instant.now()).toString();
        
        if (jTable1.getSelectedRow() != -1) {
            
            String id = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
            if (JOptionPane.showConfirmDialog(null, "tem certeza?")==0) {
                RecargaController.removerRecarga(id);
                DefaultTableModel defaultTableModel = (DefaultTableModel) jTable1.getModel();
                defaultTableModel.removeRow(jTable1.getSelectedRow());
                
                lbRec.setText("Nova Recarga:");
                cbValor.setEnabled(true);
                cbOperadora.setEnabled(true);
                
                btTipoAlter.setVisible(false);
                
                Transacao t = new Transacao();
                    t.setData(data);
                    t.setEvento("Remocao");
                TransacaoController.registar(t);
            }
        }
    }//GEN-LAST:event_btRemoverActionPerformed

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        String id = "";
        Double lucro = 0.1;
        String data = Date.from(Instant.now()).toString();
        try{
            switch (cbOperadora.getSelectedIndex()) {
                case 0: 
                    id = "TM"+cbValor.getSelectedItem();
                    lucro*= Double.parseDouble(cbValor.getSelectedItem().toString());
                    break;
                case 1: id = "VM"+cbValor.getSelectedItem();
                    lucro = 0.9;
                    lucro*= Double.parseDouble(cbValor.getSelectedItem().toString())/10;
                    break;
                case 2: id = "MV"+cbValor.getSelectedItem();
                    lucro*= Double.parseDouble(cbValor.getSelectedItem().toString());
                    break;
                default:
                    throw new AssertionError();
            }
            
            lucro*=Double.parseDouble(cbQuantidadeStock.getSelectedItem().toString());
            Recarga r = new Recarga(id, Integer.parseInt(cbValor.getSelectedItem().toString()), cbOperadora.getSelectedItem().toString(), Integer.parseInt(cbQuantidadeStock.getSelectedItem().toString()));
            Transacao t = new Transacao();
                    t.setData(data);
            
            if (btTipoAlter.isVisible()) {
                if (btTipoAlter.getText().equals("Entrada")){
                    t.setLucro(lucro);
                    JOptionPane.showMessageDialog(this, lucro);
                    RecargaController.acrescentarQuantidadeRecargas(id, Integer.parseInt(cbQuantidadeStock.getSelectedItem().toString()));
                    t.setEvento("Entrada");
                    new TelaRecargas().setVisible(true);
                    dispose();
                }else{
                    RecargaController.reduzirQuantidadeRecargas(id, Integer.parseInt(cbQuantidadeStock.getSelectedItem().toString()));
                    t.setEvento("Saida");
                    new TelaRecargas().setVisible(true);
                    dispose();
                }
            }else{
                if (RecargaController.registar(r)) {
                    t.setLucro(lucro);
                    JOptionPane.showMessageDialog(this, lucro);
                    t.setEvento("Cadastro recarga");
                    DefaultTableModel defaultTableModel = (DefaultTableModel) jTable1.getModel();
                    Object[] linha = {r.getId(), r.getValor(), r.getOperadora(), r.getQuantidadeStock()};
                    defaultTableModel.addRow(linha);                
                }
            }
            
            TransacaoController.registar(t);
            
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Somente valores inteiros", "Registo Invalido!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btSaveActionPerformed

    private void jTable1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable1FocusGained
//        System.out.println("yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy");
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1FocusGained

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
        if (jTable1.getSelectedRow() != -1) {
            lbRec.setText("Dados da Recarga:");
            cbValor.setSelectedItem(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
            cbOperadora.setSelectedItem(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
            cbQuantidadeStock.setSelectedItem(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
            cbValor.setEnabled(false);
            cbOperadora.setEnabled(false);
        }
    }//GEN-LAST:event_jTable1KeyReleased

    private void jTable1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseExited
//        System.out.println("mmmmmmmmmmmmmmmmmmmmmmmmmm");
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseExited

    private void jTable1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseDragged

    private void cbQuantidadeStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbQuantidadeStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbQuantidadeStockActionPerformed

    private void btTipoAlterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTipoAlterActionPerformed
        if (btTipoAlter.getText().equals("Entrada")) btTipoAlter.setText("Saida");
        else btTipoAlter.setText("Entrada");
        jTable1.setSelectionBackground(Color.GRAY);
    }//GEN-LAST:event_btTipoAlterActionPerformed

    private void btTipoAlterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btTipoAlterStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_btTipoAlterStateChanged

    private void btNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewActionPerformed
        new TelaRecargas().setVisible(true);
        dispose();
    }//GEN-LAST:event_btNewActionPerformed

    private void preencherTabela(){
        DefaultTableModel defaultTableModel = (DefaultTableModel) jTable1.getModel();
        for (Recarga r : RecargaController.listar()) {
            Object[] linha = {r.getId(), r.getValor(),r.getOperadora(), r.getQuantidadeStock()};
            defaultTableModel.addRow(linha);
        }
        jTable1.setSelectionBackground(Color.DARK_GRAY);
    }
    
    
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
            java.util.logging.Logger.getLogger(TelaRecargas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRecargas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRecargas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRecargas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRecargas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btNew;
    private javax.swing.JButton btRemover;
    private javax.swing.JButton btSave;
    private javax.swing.JButton btTipoAlter;
    private javax.swing.JButton btTransacoes;
    private javax.swing.JComboBox<String> cbOperadora;
    private javax.swing.JComboBox<String> cbQuantidadeStock;
    private javax.swing.JComboBox<String> cbValor;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbRec;
    // End of variables declaration//GEN-END:variables
}