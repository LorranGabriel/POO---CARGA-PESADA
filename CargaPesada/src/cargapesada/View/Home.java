package cargapesada.View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class Home extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	private JTable table_4;
	private JTable table_5;
	private JTable table_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 823, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(0, 0, 0, 0));
		tabbedPane.addTab("Home", null, panel, null);
		panel.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(25, 32, 335, 189);
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Veículos");
		lblNewLabel.setBounds(12, 12, 66, 15);
		panel_6.add(lblNewLabel);
		
		JLabel lblTotal = new JLabel("Total de Veículos:");
		lblTotal.setBounds(12, 44, 139, 15);
		panel_6.add(lblTotal);
		
		JLabel label = new JLabel("20");
		label.setBounds(12, 66, 66, 15);
		panel_6.add(label);
		
		JLabel lblVeculosEmTransporte = new JLabel("Veículos em Transporte");
		lblVeculosEmTransporte.setBounds(12, 90, 206, 15);
		panel_6.add(lblVeculosEmTransporte);
		
		JLabel label_1 = new JLabel("13");
		label_1.setBounds(12, 110, 66, 15);
		panel_6.add(label_1);
		
		JLabel lblVeculosDisponveis = new JLabel("Veículos Disponíveis:");
		lblVeculosDisponveis.setBounds(12, 141, 176, 15);
		panel_6.add(lblVeculosDisponveis);
		
		JLabel label_7 = new JLabel("7");
		label_7.setBounds(12, 163, 66, 15);
		panel_6.add(label_7);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_7.setBounds(420, 32, 335, 189);
		panel.add(panel_7);
		
		JLabel label_2 = new JLabel("Financeiro");
		label_2.setBounds(12, 12, 176, 15);
		panel_7.add(label_2);
		
		JLabel label_3 = new JLabel("Faturamento:");
		label_3.setBounds(12, 44, 139, 15);
		panel_7.add(label_3);
		
		JLabel label_4 = new JLabel("R$ 20.000,00");
		label_4.setBounds(12, 66, 282, 15);
		panel_7.add(label_4);
		
		JLabel label_5 = new JLabel("Gastos:");
		label_5.setBounds(12, 90, 206, 15);
		panel_7.add(label_5);
		
		JLabel label_6 = new JLabel("R$ 7.000,00");
		label_6.setBounds(12, 110, 239, 15);
		panel_7.add(label_6);
		
		JLabel label_8 = new JLabel("Lucro:");
		label_8.setBounds(12, 141, 176, 15);
		panel_7.add(label_8);
		
		JLabel label_9 = new JLabel("R$ 13.000,00");
		label_9.setBounds(12, 163, 206, 15);
		panel_7.add(label_9);
		
		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_8.setBounds(25, 233, 335, 189);
		panel.add(panel_8);
		
		JLabel label_10 = new JLabel("Serviços");
		label_10.setBounds(12, 12, 176, 15);
		panel_8.add(label_10);
		
		JLabel label_11 = new JLabel("Serviços Contratados:");
		label_11.setBounds(12, 44, 218, 15);
		panel_8.add(label_11);
		
		JLabel label_12 = new JLabel("30");
		label_12.setBounds(12, 66, 282, 15);
		panel_8.add(label_12);
		
		JLabel label_13 = new JLabel("Serviços Realizados:");
		label_13.setBounds(12, 90, 206, 15);
		panel_8.add(label_13);
		
		JLabel label_14 = new JLabel("23");
		label_14.setBounds(12, 110, 239, 15);
		panel_8.add(label_14);
		
		JLabel label_15 = new JLabel("Serviços em Andamento:");
		label_15.setBounds(12, 141, 239, 15);
		panel_8.add(label_15);
		
		JLabel label_16 = new JLabel("7");
		label_16.setBounds(12, 163, 206, 15);
		panel_8.add(label_16);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Serviços", null, panel_1, null);
		panel_1.setLayout(null);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(680, 12, 114, 25);
		panel_1.add(btnCadastrar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 77, 782, 347);
		panel_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Ve\u00EDculos", "Origem", "Destino", "Data Inicio", "Data Fim", "Cliente", "Status", "Detalhe"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, Object.class, Object.class, String.class, String.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Veículos", null, panel_2, null);
		panel_2.setLayout(null);
		
		JButton button = new JButton("Cadastrar");
		button.setBounds(680, 12, 114, 25);
		panel_2.add(button);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(12, 77, 782, 347);
		panel_2.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Marce", "Modelo", "Ano", "RENAVAM", "PLACA", "Cor", "Motorista", "Status"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, Object.class, Object.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane_1.setViewportView(table_1);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Funcionarios", null, panel_4, null);
		panel_4.setLayout(null);
		
		JButton button_2 = new JButton("Cadastrar");
		button_2.setBounds(279, 88, 114, 25);
		panel_4.add(button_2);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(12, 118, 381, 306);
		panel_4.add(scrollPane_3);
		
		table_5 = new JTable();
		table_5.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Codigo", "Nome", "Cep", "Numero", "UF", "Email"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, Object.class, Object.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane_3.setViewportView(table_5);
		
		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(405, 118, 389, 306);
		panel_4.add(scrollPane_6);
		
		table_6 = new JTable();
		table_6.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Codigo", "Nome", "Endere\u00E7o", "Numero", "Cep", "UF", "CPF", "Email", "CNH", "Categoria", "Validade"
			}
		) {
			Class[] columnTypes = new Class[] {
				Object.class, String.class, String.class, String.class, Object.class, String.class, String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane_6.setViewportView(table_6);
		
		JButton button_5 = new JButton("Cadastrar");
		button_5.setBounds(680, 88, 114, 25);
		panel_4.add(button_5);
		
		JLabel lblFuncionrio = new JLabel("Funcionário");
		lblFuncionrio.setBounds(12, 93, 120, 15);
		panel_4.add(lblFuncionrio);
		
		JLabel lblMotorista = new JLabel("Motorista");
		lblMotorista.setBounds(411, 93, 91, 15);
		panel_4.add(lblMotorista);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Financeiro", null, panel_3, null);
		panel_3.setLayout(null);
		
		JButton button_1 = new JButton("Cadastrar");
		button_1.setBounds(693, 98, 101, 25);
		panel_3.add(button_1);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(12, 130, 386, 294);
		panel_3.add(scrollPane_2);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Cliente", "Parcela", "Valor", "Status"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, Integer.class, String.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane_2.setViewportView(table_2);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(410, 130, 384, 294);
		panel_3.add(scrollPane_5);
		
		table_3 = new JTable();
		table_3.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Tipo", "Valor", "Descri\u00E7\u00E3o", "Status"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, Object.class, String.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane_5.setViewportView(table_3);
		
		JLabel lblTabelaDeEntrada = new JLabel("Tabela de Entrada");
		lblTabelaDeEntrada.setBounds(12, 103, 175, 15);
		panel_3.add(lblTabelaDeEntrada);
		
		JLabel label_17 = new JLabel("Tabela de Saida");
		label_17.setBounds(410, 103, 175, 15);
		panel_3.add(label_17);
		
		JButton button_4 = new JButton("Cadastrar");
		button_4.setBounds(297, 98, 101, 25);
		panel_3.add(button_4);
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("Clientes", null, panel_5, null);
		panel_5.setLayout(null);
		
		JButton button_3 = new JButton("Cadastrar");
		button_3.setBounds(680, 12, 114, 25);
		panel_5.add(button_3);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(12, 77, 782, 347);
		panel_5.add(scrollPane_4);
		
		table_4 = new JTable();
		table_4.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Nome", "CPF", "CNPJ", "Contato", "Endere\u00E7o"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane_4.setViewportView(table_4);
	}
}
