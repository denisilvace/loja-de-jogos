package gamesshop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Toolkit;

public class telacatalogo {

	private JFrame frmCadastro;
	JTextArea mostrarcarrinho;
	ArrayList <String>carrinho = new ArrayList<>();
	JLabel lbltotal;
	double total;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telacatalogo window = new telacatalogo();
					window.frmCadastro.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public telacatalogo( ) {
		initialize();
	}
	public void visivel() {
		telacatalogo window = new telacatalogo();
		window.frmCadastro.setVisible(true);
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmCadastro = new JFrame();
		frmCadastro.setIconImage(Toolkit.getDefaultToolkit().getImage(telacatalogo.class.getResource("/imagens/logoloja.png")));
		frmCadastro.setTitle("Catálogo");
		frmCadastro.setBounds(100, 100, 1218, 702);
		frmCadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCadastro.getContentPane().setLayout(null);
		
		JButton btnDebito = new JButton("");
		btnDebito.setOpaque(false);
		btnDebito.setBorder(null);
		btnDebito.setContentAreaFilled(false);
		btnDebito.setBorderPainted(false);
		btnDebito.setIcon(new ImageIcon(telacatalogo.class.getResource("/imagens/btnDébito.png")));
		btnDebito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog
				(null,"Pagamento realizado com sucesso","Débito",-1);
				BancoDeDados bd = new BancoDeDados();
				bd.conectar();
				if(bd.estaConectado()) {
					bd.salvarVenda(carrinho);
					frmCadastro.dispose();	
				}else {
					JOptionPane.showMessageDialog(null, "erro","aviso",-1);
				}
			}
		});
		btnDebito.setBounds(924, 598, 146, 47);
		frmCadastro.getContentPane().add(btnDebito);
		
		JButton btncredito = new JButton("");
		btncredito.setOpaque(false);
		btncredito.setBorder(null);
		btncredito.setContentAreaFilled(false);
		btncredito.setBorderPainted(false);
		btncredito.setIcon(new ImageIcon(telacatalogo.class.getResource("/imagens/btnCrédito.png")));
		btncredito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog
				(null,"Pagamento realizado com sucesso","Crédito",-1);
				BancoDeDados bd = new BancoDeDados();
				bd.conectar();
				if(bd.estaConectado()) {
					bd.salvarVenda(carrinho);
					frmCadastro.dispose();
					
				}else {
					JOptionPane.showMessageDialog(null, "erro","aviso",-1);
				}
			}
		});
		btncredito.setBounds(810, 593, 118, 56);
		frmCadastro.getContentPane().add(btncredito);
		
		JButton btnpix = new JButton("");
		btnpix.setOpaque(false);
		btnpix.setBorder(null);
		btnpix.setContentAreaFilled(false);
		btnpix.setBorderPainted(false);
		btnpix.setIcon(new ImageIcon(telacatalogo.class.getResource("/imagens/_comicLight small Base.png")));
		btnpix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog
				(null, "Pix: denis.silvace@hotmail.com","PIX",-1);
				BancoDeDados bd = new BancoDeDados();
				bd.conectar();
				if(bd.estaConectado()) {
					bd.salvarVenda(carrinho);
					frmCadastro.dispose();
					
				}else {
					JOptionPane.showMessageDialog(null, "erro","aviso",-1);
				}
				
			}
		});
		btnpix.setBounds(692, 593, 124, 56);
		frmCadastro.getContentPane().add(btnpix);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(telacatalogo.class.getResource("/imagens/avalonnovo.png")));
		lblNewLabel.setBounds(29, 44, 100, 122);
		frmCadastro.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(telacatalogo.class.getResource("/imagens/Decrypto.png")));
		lblNewLabel_1.setBounds(189, 44, 100, 132);
		frmCadastro.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setIcon(new ImageIcon(telacatalogo.class.getResource("/imagens/Ito.png")));
		lblNewLabel_2.setBounds(344, 44, 100, 132);
		frmCadastro.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setIcon(new ImageIcon(telacatalogo.class.getResource("/imagens/cash guns.png")));
		lblNewLabel_3.setBounds(33, 261, 92, 115);
		frmCadastro.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(telacatalogo.class.getResource("/imagens/jenga.png")));
		lblNewLabel_4.setBounds(189, 261, 100, 132);
		frmCadastro.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setIcon(new ImageIcon(telacatalogo.class.getResource("/imagens/coup.jpg")));
		lblNewLabel_5.setBounds(356, 261, 77, 132);
		frmCadastro.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setIcon(new ImageIcon(telacatalogo.class.getResource("/imagens/dobble-Photoroom (1).png")));
		lblNewLabel_6.setBounds(48, 478, 62, 94);
		frmCadastro.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("");
		lblNewLabel_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_1.setIcon(new ImageIcon(telacatalogo.class.getResource("/imagens/nem-a-pato.png")));
		lblNewLabel_6_1.setBounds(185, 478, 108, 94);
		frmCadastro.getContentPane().add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("");
		lblNewLabel_6_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_1_1.setIcon(new ImageIcon(telacatalogo.class.getResource("/imagens/nós-não-testamos-esse-troço.png")));
		lblNewLabel_6_1_1.setBounds(344, 485, 108, 94);
		frmCadastro.getContentPane().add(lblNewLabel_6_1_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("");
		lblNewLabel_6_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_2.setIcon(new ImageIcon(telacatalogo.class.getResource("/imagens/taco, gato, cabra, queijo, pizza (3).png")));
		lblNewLabel_6_2.setBounds(510, 464, 77, 115);
		frmCadastro.getContentPane().add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_6_2_1 = new JLabel("");
		lblNewLabel_6_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_2_1.setIcon(new ImageIcon(telacatalogo.class.getResource("/imagens/spyfall.png")));
		lblNewLabel_6_2_1.setBounds(485, 261, 129, 137);
		frmCadastro.getContentPane().add(lblNewLabel_6_2_1);
		
		JLabel lblNewLabel_6_2_1_1 = new JLabel("");
		lblNewLabel_6_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_2_1_1.setIcon(new ImageIcon(telacatalogo.class.getResource("/imagens/quem-foi.png")));
		lblNewLabel_6_2_1_1.setBounds(505, 58, 88, 115);
		frmCadastro.getContentPane().add(lblNewLabel_6_2_1_1);
		
		JLabel lblNewLabel_7 = new JLabel("Avalon");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_7.setBounds(59, 164, 41, 29);
		frmCadastro.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_7_1 = new JLabel("R$ 242,73");
		lblNewLabel_7_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_7_1.setBounds(52, 190, 54, 29);
		frmCadastro.getContentPane().add(lblNewLabel_7_1);
		
		JButton btnadd1 = new JButton("");
		btnadd1.setContentAreaFilled(false);
		btnadd1.setBorderPainted(false);
		btnadd1.setIcon(new ImageIcon(telacatalogo.class.getResource("/imagens/btnaddoficial2.png")));
		btnadd1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total = total + 242.73;
				lbltotal.setText(String.valueOf(String.format("%.2f", total)));
				carrinho.add("Avalon - R$ 242,73");
				atualizarcarrinho();
			}
		});
		btnadd1.setBounds(29, 217, 100, 33);
		frmCadastro.getContentPane().add(btnadd1);
		
		JLabel lblNewLabel_7_2 = new JLabel("Decrypto");
		lblNewLabel_7_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_7_2.setBounds(208, 164, 62, 29);
		frmCadastro.getContentPane().add(lblNewLabel_7_2);
		
		JLabel lblNewLabel_7_1_1 = new JLabel("R$ 216,58");
		lblNewLabel_7_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_7_1_1.setBounds(212, 190, 54, 29);
		frmCadastro.getContentPane().add(lblNewLabel_7_1_1);
		
		JButton btnadd2 = new JButton("");
		btnadd2.setContentAreaFilled(false);
		btnadd2.setBorderPainted(false);
		btnadd2.setIcon(new ImageIcon(telacatalogo.class.getResource("/imagens/btnaddoficial2.png")));
		btnadd2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total = total + 216.58;
				lbltotal.setText(String.valueOf(String.format("%.2f", total)));
				carrinho.add("Decrypto - R$ 216,58");
				atualizarcarrinho();
			}
		});
		btnadd2.setBounds(196, 225, 92, 25);
		frmCadastro.getContentPane().add(btnadd2);
		
		JLabel lblNewLabel_7_2_1 = new JLabel("ITO");
		lblNewLabel_7_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_7_2_1.setBounds(375, 164, 38, 29);
		frmCadastro.getContentPane().add(lblNewLabel_7_2_1);
		
		JLabel lblNewLabel_7_1_1_1 = new JLabel("R$ 96,00");
		lblNewLabel_7_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_7_1_1_1.setBounds(367, 190, 54, 29);
		frmCadastro.getContentPane().add(lblNewLabel_7_1_1_1);
		
		JButton btnadd3 = new JButton("");
		btnadd3.setContentAreaFilled(false);
		btnadd3.setBorderPainted(false);
		btnadd3.setIcon(new ImageIcon(telacatalogo.class.getResource("/imagens/btnaddoficial2.png")));
		btnadd3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total = total + 96.00;
				lbltotal.setText(String.valueOf(String.format("%.2f", total)));
				carrinho.add("ITO - R$ 96,00");
				atualizarcarrinho();
			}
		});
		btnadd3.setBounds(352, 229, 92, 20);
		frmCadastro.getContentPane().add(btnadd3);
		
		JLabel lblNewLabel_7_2_1_1 = new JLabel("Quem foi?");
		lblNewLabel_7_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_7_2_1_1.setBounds(518, 164, 63, 29);
		frmCadastro.getContentPane().add(lblNewLabel_7_2_1_1);
		
		JLabel lblNewLabel_7_1_1_1_1 = new JLabel("R$ 59,90");
		lblNewLabel_7_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_7_1_1_1_1.setBounds(522, 190, 54, 29);
		frmCadastro.getContentPane().add(lblNewLabel_7_1_1_1_1);
		
		JButton btnadd4 = new JButton("");
		btnadd4.setContentAreaFilled(false);
		btnadd4.setBorderPainted(false);
		btnadd4.setIcon(new ImageIcon(telacatalogo.class.getResource("/imagens/btnaddoficial2.png")));
		btnadd4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total = total + 59.90;
				lbltotal.setText(String.valueOf(String.format("%.2f", total)));
				carrinho.add("Quem foi? - R$ 59,90");
				atualizarcarrinho();
			}
		});
		btnadd4.setBounds(507, 229, 92, 20);
		frmCadastro.getContentPane().add(btnadd4);
		
		JLabel lblNewLabel_7_3 = new JLabel("Cash Guns");
		lblNewLabel_7_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_7_3.setBounds(44, 384, 70, 29);
		frmCadastro.getContentPane().add(lblNewLabel_7_3);
		
		JLabel lblNewLabel_7_1_2 = new JLabel("R$ 139,99");
		lblNewLabel_7_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_7_1_2.setBounds(52, 407, 54, 29);
		frmCadastro.getContentPane().add(lblNewLabel_7_1_2);
		
		JButton btnadd5 = new JButton("");
		btnadd5.setContentAreaFilled(false);
		btnadd5.setBorderPainted(false);
		btnadd5.setIcon(new ImageIcon(telacatalogo.class.getResource("/imagens/btnaddoficial2.png")));
		btnadd5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total = total + 139.99;
				lbltotal.setText(String.valueOf(String.format("%.2f", total)));
				carrinho.add("Cash Guns - R$ 139,99");
				atualizarcarrinho();
			}
		});
		btnadd5.setBounds(37, 434, 92, 20);
		frmCadastro.getContentPane().add(btnadd5);
		
		JLabel lblNewLabel_7_4 = new JLabel("Jenga");
		lblNewLabel_7_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_7_4.setBounds(219, 384, 41, 29);
		frmCadastro.getContentPane().add(lblNewLabel_7_4);
		
		JLabel lblNewLabel_7_1_3 = new JLabel("R$ 74,99");
		lblNewLabel_7_1_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_7_1_3.setBounds(212, 407, 54, 29);
		frmCadastro.getContentPane().add(lblNewLabel_7_1_3);
		
		JButton btnadd6 = new JButton("");
		btnadd6.setContentAreaFilled(false);
		btnadd6.setBorderPainted(false);
		btnadd6.setIcon(new ImageIcon(telacatalogo.class.getResource("/imagens/btnaddoficial2.png")));
		btnadd6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total = total + 74.99;
				lbltotal.setText(String.valueOf(String.format("%.2f", total)));
				carrinho.add("Jenga - R$ 74,99");
				atualizarcarrinho();
			}
		});
		btnadd6.setBounds(197, 434, 92, 20);
		frmCadastro.getContentPane().add(btnadd6);
		
		JLabel lblNewLabel_7_5 = new JLabel("Coup");
		lblNewLabel_7_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_7_5.setBounds(374, 384, 41, 29);
		frmCadastro.getContentPane().add(lblNewLabel_7_5);
		
		JLabel lblNewLabel_7_1_4 = new JLabel("R$ 98,47");
		lblNewLabel_7_1_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_7_1_4.setBounds(367, 407, 54, 29);
		frmCadastro.getContentPane().add(lblNewLabel_7_1_4);
		
		JButton btnadd7 = new JButton("");
		btnadd7.setContentAreaFilled(false);
		btnadd7.setBorderPainted(false);
		btnadd7.setIcon(new ImageIcon(telacatalogo.class.getResource("/imagens/btnaddoficial2.png")));
		btnadd7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total = total + 98.47;
				lbltotal.setText(String.valueOf(String.format("%.2f", total)));
				carrinho.add("Coup - R$ 98,47");
				atualizarcarrinho();
			}
		});
		btnadd7.setBounds(352, 434, 92, 20);
		frmCadastro.getContentPane().add(btnadd7);
		
		JLabel lblNewLabel_7_6 = new JLabel("SpyFall");
		lblNewLabel_7_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_7_6.setBounds(520, 384, 59, 29);
		frmCadastro.getContentPane().add(lblNewLabel_7_6);
		
		JLabel lblNewLabel_7_1_5 = new JLabel("R$ 214,90");
		lblNewLabel_7_1_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_7_1_5.setBounds(522, 407, 54, 29);
		frmCadastro.getContentPane().add(lblNewLabel_7_1_5);
		
		JButton btnadd8 = new JButton("");
		btnadd8.setContentAreaFilled(false);
		btnadd8.setBorderPainted(false);
		btnadd8.setIcon(new ImageIcon(telacatalogo.class.getResource("/imagens/btnaddoficial2.png")));
		btnadd8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total = total + 214.90;
				lbltotal.setText(String.valueOf(String.format("%.2f", total)));
				carrinho.add("SpyFall - R$ 214,90");
				atualizarcarrinho();
			}
		});
		btnadd8.setBounds(507, 434, 92, 20);
		frmCadastro.getContentPane().add(btnadd8);
		
		JLabel lblNewLabel_7_3_1 = new JLabel("Dobble");
		lblNewLabel_7_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_3_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_7_3_1.setBounds(48, 562, 62, 29);
		frmCadastro.getContentPane().add(lblNewLabel_7_3_1);
		
		JLabel lblNewLabel_7_1_2_1 = new JLabel("R$ 62,99");
		lblNewLabel_7_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_7_1_2_1.setBounds(52, 589, 54, 29);
		frmCadastro.getContentPane().add(lblNewLabel_7_1_2_1);
		
		JButton btnadd9 = new JButton("");
		btnadd9.setContentAreaFilled(false);
		btnadd9.setBorderPainted(false);
		btnadd9.setIcon(new ImageIcon(telacatalogo.class.getResource("/imagens/btnaddoficial2.png")));
		btnadd9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total = total + 62.99;
				lbltotal.setText(String.valueOf(String.format("%.2f", total)));
				carrinho.add("Dobble - R$ 62,99");
				atualizarcarrinho();
			}
		});
		btnadd9.setBounds(36, 617, 92, 20);
		frmCadastro.getContentPane().add(btnadd9);
		
		JLabel lblNewLabel_7_3_2 = new JLabel("Nem a pato");
		lblNewLabel_7_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_3_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_7_3_2.setBounds(204, 562, 70, 29);
		frmCadastro.getContentPane().add(lblNewLabel_7_3_2);
		
		JLabel lblNewLabel_7_1_2_2 = new JLabel("R$ 66,03");
		lblNewLabel_7_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_7_1_2_2.setBounds(212, 589, 54, 29);
		frmCadastro.getContentPane().add(lblNewLabel_7_1_2_2);
		
		JButton btnadd10 = new JButton("");
		btnadd10.setContentAreaFilled(false);
		btnadd10.setBorderPainted(false);
		btnadd10.setIcon(new ImageIcon(telacatalogo.class.getResource("/imagens/btnaddoficial2.png")));
		btnadd10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total = total + 66.03;
				lbltotal.setText(String.valueOf(String.format("%.2f", total)));
				carrinho.add("Nem a Pato - R$ 66,03");
				atualizarcarrinho();
			}
		});
		btnadd10.setBounds(196, 617, 92, 20);
		frmCadastro.getContentPane().add(btnadd10);
		
		JLabel lblNewLabel_7_3_3 = new JLabel("NNTET");
		lblNewLabel_7_3_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_3_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_7_3_3.setBounds(374, 562, 41, 29);
		frmCadastro.getContentPane().add(lblNewLabel_7_3_3);
		
		JLabel lblNewLabel_7_1_2_3 = new JLabel("R$ 78,90");
		lblNewLabel_7_1_2_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_7_1_2_3.setBounds(367, 589, 54, 29);
		frmCadastro.getContentPane().add(lblNewLabel_7_1_2_3);
		
		JButton btnadd11 = new JButton("");
		btnadd11.setContentAreaFilled(false);
		btnadd11.setBorderPainted(false);
		btnadd11.setIcon(new ImageIcon(telacatalogo.class.getResource("/imagens/btnaddoficial2.png")));
		btnadd11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total = total + 78.90;
				lbltotal.setText(String.valueOf(String.format("%.2f", total)));
				carrinho.add("Nós não testamos esse troço - R$ 78,90");
				atualizarcarrinho();
			}
		});
		btnadd11.setBounds(351, 617, 92, 20);
		frmCadastro.getContentPane().add(btnadd11);
		
		JLabel lblNewLabel_7_3_4 = new JLabel("TGCQP");
		lblNewLabel_7_3_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_3_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_7_3_4.setBounds(519, 562, 59, 29);
		frmCadastro.getContentPane().add(lblNewLabel_7_3_4);
		
		JLabel lblNewLabel_7_1_2_4 = new JLabel("R$ 65,90");
		lblNewLabel_7_1_2_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_7_1_2_4.setBounds(521, 589, 54, 29);
		frmCadastro.getContentPane().add(lblNewLabel_7_1_2_4);
		
		JButton btnadd12 = new JButton("");
		btnadd12.setContentAreaFilled(false);
		btnadd12.setBorderPainted(false);
		btnadd12.setIcon(new ImageIcon(telacatalogo.class.getResource("/imagens/btnaddoficial2.png")));
		btnadd12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total = total + 65.90;
				lbltotal.setText(String.valueOf(String.format("%.2f", total)));
				carrinho.add("Taco, Gato, Cabra, Queijo, Pizza - R$ 65,90");
				atualizarcarrinho();
			}
		});
		btnadd12.setBounds(501, 617, 92, 20);
		frmCadastro.getContentPane().add(btnadd12);
		
		mostrarcarrinho = new JTextArea();
		mostrarcarrinho.setFont(new Font("Monospaced", Font.PLAIN, 20));
		JScrollPane scrollPane = new JScrollPane(mostrarcarrinho);
		frmCadastro.getContentPane().add(scrollPane);
		mostrarcarrinho.setEditable(false);
		scrollPane.setBounds(652, 50, 530, 490);
		
		lbltotal = new JLabel("");
		lbltotal.setFont(new Font("Tahoma", Font.BOLD, 30));
		lbltotal.setBounds(1008, 550, 174, 47);
		frmCadastro.getContentPane().add(lbltotal);
		lbltotal.setText(String.valueOf(total));
		
		JLabel lblNewLabel_8 = new JLabel("TOTAL: R$");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_8.setBounds(851, 555, 152, 37);
		frmCadastro.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon(telacatalogo.class.getResource("/imagens/telacatalogo.png")));
		lblNewLabel_9.setBounds(0, 0, 1204, 665);
		frmCadastro.getContentPane().add(lblNewLabel_9);
		//frmCadastro.getContentPane().add(mostrarcarrinho);
	
		
		
		
	}
	public void atualizarcarrinho() {
		mostrarcarrinho.setText("");
		for(int i = 0;i<carrinho.size();i++) {
			mostrarcarrinho.append(carrinho.get(i)+"\n");
		}
	}
}
