/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lorran
 */
public class TabelaSet {
    
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
        DefaultTableModel modelo1 = new DefaultTableModel();
        modelo1.addColumn("Codigo");
        modelo1.addColumn("CNH");
        modelo1.addColumn("Data de Vencimento");
        modelo1.addColumn("Categoria da CNH");
        modelo1.addColumn("Funcionario");

        Motorista gen;
        if (motoristas.isEmpty()) {
            modelo1.addRow(new String[]{"NADA", "NADA"});

        } else {
            for (int i = 0; i < motoristas.size(); i++) {
                gen = motoristas.get(i);
                modelo1.addRow(new String[]{Integer.toString(gen.getIdMotorista()),
                    gen.getCnh(),
                    gen.getDataVencimento(),
                    gen.getCategoriaCnh(),
                    Integer.toString(gen.getIdFuncionario())});
            }
        }
        tabela.setModel(modelo1);
    }
}
