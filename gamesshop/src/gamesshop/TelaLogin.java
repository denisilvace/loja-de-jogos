package gamesshop;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class TelaLogin {

	private JFrame frmSenagames;
	private JTextField txtusuario;
	private JPasswordField txtsenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin window = new TelaLogin();
					window.frmSenagames.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaLogin() {
		initialize();
	}
	public void visivel() {
		TelaLogin window = new TelaLogin();
		window.frmSenagames.setVisible(true);
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSenagames = new JFrame();
		frmSenagames.setIconImage(Toolkit.getDefaultToolkit().getImage(TelaLogin.class.getResource("/imagens/logoloja.png")));
		frmSenagames.setTitle("senagames");
		frmSenagames.setBounds(100, 100, 506, 345);
		frmSenagames.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSenagames.getContentPane().setLayout(null);
		
		txtusuario = new JTextField();
		txtusuario.setHorizontalAlignment(SwingConstants.CENTER);
		txtusuario.setBounds(142, 93, 220, 20);
		frmSenagames.getContentPane().add(txtusuario);
		txtusuario.setColumns(10);
		txtusuario.setBorder(null);
		txtusuario.setOpaque(false);
		
		txtsenha = new JPasswordField();
		txtsenha.setHorizontalAlignment(SwingConstants.CENTER);
		txtsenha.setBounds(142, 147, 220, 20);
		frmSenagames.getContentPane().add(txtsenha);
		txtsenha.setBorder(null);
		txtsenha.setOpaque(false);
		
		JCheckBox checkmostrar = new JCheckBox("Mostrar senha");
		checkmostrar.setOpaque(false);
		checkmostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(checkmostrar.isSelected()) {
					txtsenha.setEchoChar((char) 0);
				}else {
					txtsenha.setEchoChar('●');
				}
			}
		});
		checkmostrar.setBounds(133, 173, 182, 20);
		frmSenagames.getContentPane().add(checkmostrar);
		
		
		JButton btnentrar = new JButton("");
		btnentrar.setOpaque(false);
		btnentrar.setBorder(null);
		btnentrar.setContentAreaFilled(false);
		btnentrar.setBorderPainted(false);
		btnentrar.setIcon(new ImageIcon(TelaLogin.class.getResource("/imagens/botaoentrar.png")));
		btnentrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String usuario = txtusuario.getText();
				String senha = txtsenha.getText();
				BancoDeDados bd = new BancoDeDados();
				bd.conectar();
				if(bd.verificarlogin(usuario, senha)) {
					telacatalogo tel = new telacatalogo();
					tel.visivel();
					frmSenagames.dispose();
				}else {
					JOptionPane.showMessageDialog
					(null, "Usuário ou senha inválido","Atenção",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnentrar.setBounds(114, 227, 115, 37);
		frmSenagames.getContentPane().add(btnentrar);
		
		JButton btncadastrar = new JButton("");
		btncadastrar.setOpaque(false);
		btncadastrar.setBorder(null);
		btncadastrar.setContentAreaFilled(false);
		btncadastrar.setBorderPainted(false);
		btncadastrar.setIcon(new ImageIcon(TelaLogin.class.getResource("/imagens/botaocadastrar.png")));
		btncadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telacadastro tel = new telacadastro();
				tel.visivel();
				frmSenagames.dispose();
			}
		});
		btncadastrar.setBounds(276, 227, 134, 37);
		frmSenagames.getContentPane().add(btncadastrar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaLogin.class.getResource("/imagens/tela login.png")));
		lblNewLabel.setBounds(0, 0, 492, 308);
		frmSenagames.getContentPane().add(lblNewLabel);
	}
}
