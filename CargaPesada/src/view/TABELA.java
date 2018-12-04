/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.*;

/**
 *
 * @author walla
 */
public class TABELA extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    int id;
    String nome = "";

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setDadosTabelaVeiculos(ArrayList<Veiculo> veiculo, JTable tabela) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Nome");
        modelo.addColumn("Status");

        modelo.addColumn("Chassi");
        modelo.addColumn("Placa");
        modelo.addColumn("Status");
        modelo.addColumn("Combustivel");
        modelo.addColumn("Categoria");
        modelo.addColumn("Modelo");
        modelo.addColumn("Motorista");

        if (veiculo.isEmpty()) {
            modelo.addRow(new String[]{"NADA", "NADA"});

        } else {
            for (int i = 0; i < veiculo.size(); i++) {
                Veiculo gen = veiculo.get(i);
                modelo.addRow(new String[]{Integer.toString(gen.getIdVeiculo()),
                    (gen.getNomeVeiculo()),
                    (gen.getChassi()),
                    (gen.getPlaca()),
                    Integer.toString(gen.getIdModelo()),
                    Integer.toString(gen.getIdMotorista()),
                    Integer.toString(gen.getIdSeguro()),
                    Integer.toString(gen.getIdCategoria()),});

            }
        }
        tabela.setModel(modelo);
    }

    public void setDadosTabelaCliente(List<Cliente> clientes, JTable tabela) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Nome");
        modelo.addColumn("Tipo");
        modelo.addColumn("Cnpj");
        modelo.addColumn("CPF");
        modelo.addColumn("Data de Cadatro");

        Cliente gen;
        if (clientes.isEmpty()) {
            modelo.addRow(new String[]{"NADA", "NADA"});

        } else {
            for (int i = 0; i < clientes.size(); i++) {
                gen = clientes.get(i);
                modelo.addRow(new String[]{Integer.toString(gen.getIdCliente()),
                    gen.getNome(),
                    gen.getTipo_cliente(),
                    gen.getCnpj(),
                    gen.getCpf(),
                    gen.getData_atual()});
            }
        }
        tabela.setModel(modelo);
    }
       
    public void setDadosTabelaServico(List<Servico> servicos, JTable tabela) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Status");
        modelo.addColumn("valor_contrato");
        modelo.addColumn("Data de Inicio");
        modelo.addColumn("Data de Fim");
        modelo.addColumn("Id do Cliente");
        modelo.addColumn("Id do Funcionario");
        modelo.addColumn("Id do Veiculo");

        Servico gen;
        if (servicos.isEmpty()) {
            modelo.addRow(new String[]{"NADA", "NADA"});

        } else {
            for (int i = 0; i < servicos.size(); i++) {
                gen = servicos.get(i);
                modelo.addRow(new String[]{Integer.toString(gen.getIdServico()),
                    gen.getStatus(),
                    Float.toString(gen.getValorContrato()),
                    gen.getDataFim(),
                    Integer.toString(gen.getIdCliente()),
                    Integer.toString(gen.getIdFuncionario()),
                    Integer.toString(gen.getIdVeiculo())});
            }
        }
        tabela.setModel(modelo);
    }
    
    public void setDadosTabelaFuncionario(List<Funcionario> funcionarios, JTable tabela) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Nome");
        modelo.addColumn("CPF");
        modelo.addColumn("Cargo");
        modelo.addColumn("Salario");
        modelo.addColumn("Sexo");
        modelo.addColumn("Data de Cadatro");
        modelo.addColumn("Data de Nascimento");

        Funcionario gen;
        if (funcionarios.isEmpty()) {
            modelo.addRow(new String[]{"NADA", "NADA"});

        } else {
            for (int i = 0; i < funcionarios.size(); i++) {
                gen = funcionarios.get(i);
                modelo.addRow(new String[]{Integer.toString(gen.getIdFuncionario()),
                    gen.getNome(),
                    gen.getCpf(),
                    gen.getCargo(),
                    Float.toString(gen.getSalario()),
                    gen.getSexo(),
                    gen.getDataCadastro(),
                    gen.getDataNascimento()});
            }
        }
        tabela.setModel(modelo);
    }

    public void setDadosTabelaMotorista(List<Motorista> motoristas, JTable tabela) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("CNH");
        modelo.addColumn("Data de Vencimento");
        modelo.addColumn("Categoria da CNH");
        modelo.addColumn("Funcionario");

        Motorista gen;
        if (motoristas.isEmpty()) {
            modelo.addRow(new String[]{"NADA", "NADA"});

        } else {
            for (int i = 0; i < motoristas.size(); i++) {
                gen = motoristas.get(i);
                modelo.addRow(new String[]{Integer.toString(gen.getIdMotorista()),
                    gen.getCnh(),
                    gen.getDataVencimento(),
                    gen.getCategoriaCnh(),
                    Integer.toString(gen.getIdFuncionario())});
            }
        }
        tabela.setModel(modelo);
    }

    /**
     * Creates new form TABELA
     */
    public TABELA() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        SELECIONAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        SELECIONAR.setText("SELECIONAR");
        SELECIONAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SELECIONARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(294, Short.MAX_VALUE)
                .addComponent(SELECIONAR)
                .addGap(39, 39, 39))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 252, Short.MAX_VALUE)
                .addComponent(SELECIONAR))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(23, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 55, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SELECIONARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SELECIONARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SELECIONARActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int coluna = jTable1.getSelectedColumn();
        int linha = jTable1.getSelectedRow();
        id = Integer.parseInt((String) jTable1.getValueAt(linha, coluna));
        nome = (String) jTable1.getValueAt(linha, coluna + 1);
        //CadastroServico.merda();
        dispose();
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(TABELA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TABELA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TABELA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TABELA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TABELA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SELECIONAR;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
