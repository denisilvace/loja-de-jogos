package gamesshop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

import java.awt.Font;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class telacadastro {

	private JFrame frmCadastro;
	MaskFormatter maskcpf;
	MaskFormatter maskdata;
	MaskFormatter maskcep;
	MaskFormatter masktelefone;
	private JPasswordField txtsenha;
	private JPasswordField txtconfirmarsenha;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telacadastro window = new telacadastro();
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
	public telacadastro() {
		
		initialize();
	}
	public void visivel() {
		telacadastro window = new telacadastro();
		window.frmCadastro.setVisible(true);
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCadastro = new JFrame();
		frmCadastro.setIconImage(Toolkit.getDefaultToolkit().getImage(telacadastro.class.getResource("/imagens/logoloja.png")));
		frmCadastro.setTitle("cadastro");
		frmCadastro.setBounds(100, 100, 514, 473);
		frmCadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCadastro.getContentPane().setLayout(null);
		try {
			maskcpf = new MaskFormatter("###.###.###-##");
			maskdata = new MaskFormatter("##/##/####");
			maskcep = new MaskFormatter("##.###-###");
			masktelefone = new MaskFormatter("(##)#####-####");
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Erro","aviso",-1);
		}
		
		txtconfirmarsenha = new JPasswordField();
		txtconfirmarsenha.setBounds(115, 368, 337, 18);
		frmCadastro.getContentPane().add(txtconfirmarsenha);
		txtconfirmarsenha.setOpaque(false);
		txtconfirmarsenha.setBorder(null);
		txtsenha = new JPasswordField();
		txtsenha.setBounds(117, 333, 337, 18);
		frmCadastro.getContentPane().add(txtsenha);
		txtsenha.setOpaque(false);
		txtsenha.setBorder(null);
		JFormattedTextField txtemail = new JFormattedTextField();
		txtemail.setOpaque(false);
		txtemail.setBorder(null);
		txtemail.setBounds(118, 293, 331, 24);
		frmCadastro.getContentPane().add(txtemail);
		
		
		
		JFormattedTextField txtnome = new JFormattedTextField();
		txtnome.setBounds(116, 58, 333, 25);
		frmCadastro.getContentPane().add(txtnome);
		txtnome.setOpaque(false);
		txtnome.setBorder(null);
		JFormattedTextField txtcpf = new JFormattedTextField(maskcpf);
		txtcpf.setBounds(118, 97, 331, 25);
		frmCadastro.getContentPane().add(txtcpf);
		txtcpf.setOpaque(false);
		txtcpf.setBorder(null);
		JFormattedTextField txtdata = new JFormattedTextField(maskdata);
		txtdata.setBounds(117, 138, 336, 25);
		frmCadastro.getContentPane().add(txtdata);
		txtdata.setOpaque(false);
		txtdata.setBorder(null);
		JFormattedTextField txtendereco = new JFormattedTextField();
		txtendereco.setBounds(118, 179, 331, 24);
		frmCadastro.getContentPane().add(txtendereco);
		txtendereco.setOpaque(false);
		txtendereco.setBorder(null);
		JFormattedTextField txtcep = new JFormattedTextField(maskcep);
		txtcep.setBounds(115, 217, 333, 25);
		frmCadastro.getContentPane().add(txtcep);
		txtcep.setOpaque(false);
		txtcep.setBorder(null);
		JFormattedTextField txttelefone = new JFormattedTextField(masktelefone);
		txttelefone.setBounds(115, 260, 337, 19);
		frmCadastro.getContentPane().add(txttelefone);
		txttelefone.setOpaque(false);
		txttelefone.setBorder(null);
		JButton btncadastrar = new JButton("");
		btncadastrar.setContentAreaFilled(false);
		btncadastrar.setBorderPainted(false);
		btncadastrar.setIcon(new ImageIcon(telacadastro.class.getResource("/imagens/botaocadastro.png")));
		btncadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txtnome.getText().trim().toLowerCase();
				String cpf = txtcpf.getText().trim().toLowerCase();
				String nascimento = txtdata.getText().trim().toLowerCase();
				String endereco = txtendereco.getText().trim().toLowerCase();
				String cep = txtcep.getText().trim().toLowerCase();
				String telefone = txttelefone.getText().trim().toLowerCase();
				String email = txtemail.getText().trim().toLowerCase();
				String senha = txtsenha.getText().trim();
				String confirmarsenha = txtconfirmarsenha.getText().trim();
				String cpfformatado = cpf.replaceAll("\\D", "");
				if(nome.isEmpty()==false &&cpf.isEmpty()==false&&nascimento.isEmpty()==false&&endereco.isEmpty()==false&&cep.isEmpty()==false&&telefone.isEmpty()==false&&email.isEmpty()==false&&senha.isEmpty()==false&&confirmarsenha.isEmpty()==false) {
					if(nome.matches("[A-Za-z ]+")) {
						if(email.matches
								("[a-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}")) {
							if(senha.equals(confirmarsenha)) {
								ValidaCPF val = new ValidaCPF();
								if(val.isCPF(cpfformatado)) {
									BancoDeDados bd = new BancoDeDados();
									bd.conectar();
									if(bd.estaConectado()) {
										bd.inserirCliente(nome, cpf, nascimento, endereco, cep, telefone, email, senha);
										EnviarEmail env = new EnviarEmail();
										String mensagem = "Obrigado por se cadastrar na senagameshop";
										String assunto= "Cadastro realizado";
										env.enviar(email, assunto, mensagem);
										TelaLogin tel = new TelaLogin();
										tel.visivel();		
										frmCadastro.dispose();
										}else {
										JOptionPane.showMessageDialog(null, "erro no banco","Aviso",-1);
									}
								}else {
									JOptionPane.showMessageDialog(null
											, "Cpf inválido","aviso",-1);
								}
							}else {
								JOptionPane.showMessageDialog(null
										, "Senhas diferentes","aviso",-1);
							}
						}else {
							JOptionPane.showMessageDialog(null
									, "Email invalido","aviso",-1);
						}
					}else {
						JOptionPane.showMessageDialog(null
								, "Nome invalido","aviso",-1);
					}
				}else {
					JOptionPane.showMessageDialog(null
							, "Não pode ter campos vazios","aviso",-1);
				}
				
				JOptionPane.showMessageDialog
				(null, "Cadastro realizado com sucesso","Aviso",1);
			}
		});
		btncadastrar.setBounds(104, 387, 138, 43);
		frmCadastro.getContentPane().add(btncadastrar);
		
		JButton btnvoltar = new JButton("");
		btnvoltar.setContentAreaFilled(false);
		btnvoltar.setBorderPainted(false);
		btnvoltar.setIcon(new ImageIcon(telacadastro.class.getResource("/imagens/botaovoltar.png")));
		btnvoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaLogin tel = new TelaLogin();
				tel.visivel();
				frmCadastro.dispose();
			}
		});
		btnvoltar.setBounds(291, 387, 118, 43);
		frmCadastro.getContentPane().add(btnvoltar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(telacadastro.class.getResource("/imagens/telaajustada.png")));
		lblNewLabel.setBounds(0, 0, 500, 430);
		frmCadastro.getContentPane().add(lblNewLabel);
	}
}
