package br.com.ceja.gui;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicComboBoxUI;

import br.com.ceja.classes.Aluno;
import br.com.ceja.classes.Rg;
import br.com.ceja.classes.Sistema;
import br.com.ceja.exceptions.AlunoJaExisteException;
import br.com.ceja.exceptions.AlunoNaoExisteException;

public class MenuIniciar extends JFrame implements ActionListener, MouseListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Sistema sistema;
	JLabel rotulo = new JLabel("");
	ImageIcon imagem = new ImageIcon(getClass().getResource("/br/com/ceja/images/menu_geral.jpg"));
	Image image;
	JButton botao1 = new JButton();
	JButton botao2 = new JButton();
	JButton botao3 = new JButton();
	JButton botao4 = new JButton();
	JButton botao5 = new JButton();
	JTextField buscar = new JTextField("Informe o nome ou a matrícula do aluno.");
	JComboBox<String> alunos = new JComboBox<String>();
	JComboBox<String> config = new JComboBox<String>();
	JList<String> lista = new JList<String>();
	List<JTextField> dados = new ArrayList<JTextField>();
	List<JRadioButton> botoes = new ArrayList<JRadioButton>();
	List<ButtonGroup> gruposBotoes = new ArrayList<ButtonGroup>();

	public MenuIniciar(Sistema sistema) {

		this.sistema = sistema;

		rotulo.setBounds(0, 0, 995, 570);
		image = imagem.getImage().getScaledInstance(rotulo.getWidth(), rotulo.getHeight(), Image.SCALE_SMOOTH);
		rotulo.setIcon(new ImageIcon(image));

		botao1.setBounds(12, 32, 158, 54);
		botao1.setOpaque(false);
		botao1.setContentAreaFilled(false);
		botao1.addActionListener(this);

		botao2.setBounds(169, 32, 178, 54);
		botao2.setOpaque(false);
		botao2.setContentAreaFilled(false);
		botao2.addActionListener(this);

		botao3.setBounds(936, 45, 31, 30);
		botao3.setOpaque(false);
		botao3.setContentAreaFilled(false);
		botao3.addActionListener(this);

		botao4.setBounds(870, 176, 40, 34);
		botao4.setOpaque(false);
		botao4.setContentAreaFilled(false);
		botao4.addActionListener(this);
		botao4.setVisible(false);

		botao5.setBounds(908, 490, 43, 32);
		botao5.setOpaque(false);
		botao5.setContentAreaFilled(false);
		botao5.addActionListener(this);
		botao5.setVisible(false);

		buscar.setBounds(80, 176, 795, 35);
		buscar.setOpaque(false);
		buscar.setBorder(null);
		buscar.setVisible(false);
		buscar.addMouseListener(this);

		alunos.setBounds(80, 210, 795, 25);
		alunos.setOpaque(false);
		alunos.setBorder(null);
		alunos.setVisible(false);
		alunos.setBackground(new Color(220, 220, 220));
		alunos.setUI(new BasicComboBoxUI() {
			protected JButton createArrowButton() {
				return new JButton() {
					@Override
					public Color getBackground() {		        		
						return super.getBackground().getColor("", new Color(220, 220, 220));
					}	
					@Override
					public Border getBorder() {
						// TODO Auto-generated method stub
						return javax.swing.BorderFactory.createLineBorder(new Color(220, 220, 220), 0);
					}
					public int getWidth() {
						return 20;
					}
				};
			}
		});

		config.setBounds(877, 75, 90, 20);
		config.setVisible(false);
		config.setBackground(new Color(250, 177, 61));
		//config.addItem("");
		config.addItem("Logout");
		config.addItem("Sair");
		config.addItem("About!");
		config.setUI(new BasicComboBoxUI() {
			protected JButton createArrowButton() {
				return new JButton() {
					@Override
					public Color getBackground() {		        		
						return super.getBackground().getColor("", new Color(250, 177, 61));
					}	
					@Override
					public Border getBorder() {
						// TODO Auto-generated method stub
						return javax.swing.BorderFactory.createLineBorder(new Color(0, 0, 0), 0);
					}
					public int getWidth() {
						return 20;
					}
				};
			}
		});

		addMouseListener(this);
		gerarJanelaCadastro();

		rotulo.add(botao1);
		rotulo.add(botao2);
		rotulo.add(botao3);
		rotulo.add(botao4);
		rotulo.add(botao5);
		rotulo.add(buscar);
		rotulo.add(alunos);
		rotulo.add(config);

		add(rotulo);

		new JFrame();
		setSize(1000, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MenuIniciar(new Sistema());
	}

	public void gerarJanelaCadastro() {

		for(int i = 0; i < 19; i++) {
			dados.add(new JTextField(""));
			rotulo.add(dados.get(i));
			dados.get(i).setOpaque(false);
			dados.get(i).setBorder(null);

		}

		dados.get(0).setBounds(60, 161, 422, 25);
		dados.get(1).setBounds(61, 214, 192, 22);
		dados.get(2).setBounds(61, 263, 192, 22);
		dados.get(3).setBounds(61, 315, 115, 22);
		dados.get(4).setBounds(61, 360, 349, 22);
		dados.get(5).setBounds(61, 406, 349, 22);
		dados.get(6).setBounds(70, 455, 150, 22);
		dados.get(7).setBounds(61, 502, 349, 22);
		dados.get(8).setBounds(360, 214, 192, 22);
		dados.get(9).setBounds(360, 244, 192, 22);
		dados.get(10).setBounds(360, 271, 192, 22);
		dados.get(11).setBounds(360, 299, 192, 22);
		dados.get(12).setBounds(595, 164, 193, 22);
		dados.get(13).setBounds(637, 262, 291, 22);
		dados.get(14).setBounds(632, 305, 220, 22);
		dados.get(15).setBounds(872, 305, 57, 22);
		dados.get(16).setBounds(710, 351, 220, 22);
		dados.get(17).setBounds(454, 502, 151, 22);
		dados.get(18).setBounds(627, 502, 152, 22);

		for(int i = 0; i < 8; i++) {
			botoes.add(new JRadioButton());
			rotulo.add(botoes.get(i));
			botoes.get(i).setBackground(getBackground().WHITE);
		}

		botoes.get(0).setBounds(498, 164, 20, 20);
		botoes.get(1).setBounds(542, 164, 20, 20);
		botoes.get(2).setBounds(355, 198, 17, 15);
		botoes.get(3).setBounds(455, 198, 17, 15);
		botoes.get(4).setBounds(673, 417, 17, 15);
		botoes.get(5).setBounds(727, 417, 17, 15);
		botoes.get(6).setBounds(833, 417, 17, 15);
		botoes.get(7).setBounds(883, 417, 17, 15);

		alteraBotoesCaixas(false);

		for(int i = 0; i < 4; i++) {
			gruposBotoes.add(new ButtonGroup());
		}

		gruposBotoes.get(0).add(botoes.get(0));
		gruposBotoes.get(0).add(botoes.get(1));
		gruposBotoes.get(1).add(botoes.get(2));
		gruposBotoes.get(1).add(botoes.get(3));
		gruposBotoes.get(2).add(botoes.get(4));
		gruposBotoes.get(2).add(botoes.get(5));
		gruposBotoes.get(3).add(botoes.get(6));
		gruposBotoes.get(3).add(botoes.get(7));

	}

	public void alteraBotoesCaixas(boolean b) {
		botao5.setVisible(b);
		for(int i = 0; i < 8; i++) {
			botoes.get(i).setVisible(b);
		}
		for(int i = 0; i < 19; i++) {
			dados.get(i).setVisible(b);
		}
	}

	public void cadastraAluno() {
		imagem = new ImageIcon(getClass().getResource("/br/com/ceja/images/cadastro.jpg"));
		image = imagem.getImage().getScaledInstance(rotulo.getWidth(), rotulo.getHeight(), Image.SCALE_SMOOTH);
		rotulo.setIcon(new ImageIcon(image));
		botao3.setBounds(935, 45, 31, 30);
		alteraBotoesCaixas(true);
		buscar.setVisible(false);
		botao4.setVisible(false);
	}

	public void verificaAluno() {
		try {
			for(Aluno a: sistema.verificaAluno(buscar.getText())) {
				alunos.addItem(a.getDados().getNome().toUpperCase());
				alunos.setVisible(true);
			}
		} catch (AlunoNaoExisteException e1) {
			e1.printStackTrace();
		}
	}
	
	public void buscaAluno() {
		imagem = new ImageIcon(getClass().getResource("/br/com/ceja/images/menu_buscar.jpg"));
		image = imagem.getImage().getScaledInstance(rotulo.getWidth(), rotulo.getHeight(), Image.SCALE_SMOOTH);
		rotulo.setIcon(new ImageIcon(image));
		botao3.setBounds(935, 45, 31, 30);
		alteraBotoesCaixas(false);
		botao4.setVisible(true);
		buscar.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		for(int i = 0; i < 4; i++) {
			if(alunos.getSelectedIndex() == i) {
				try {
					System.out.println(sistema.verificaAluno(alunos.getItemAt(i)));
				} catch (AlunoNaoExisteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
		if(e.getSource() == botao1) {
			buscaAluno();
			getRootPane().setDefaultButton(botao4);
		}

		if(e.getSource() == botao2) {
			cadastraAluno();
		}

		if(e.getSource() == botao3) {
			config.setVisible(true);
			config.showPopup();

		}

		if(e.getSource() == botao4) {
			alunos.removeAllItems();
			verificaAluno();
		}

		if(e.getSource() == botao5) {
			try {
				Aluno aluno = new Aluno();
				aluno.getDados().setNome(dados.get(0).getText());
				aluno.getDados().setCpf(dados.get(1).getText());
				Rg rg = new Rg();
				rg.setNumero(dados.get(2).getText());
				aluno.getDados().setRg(rg);
				aluno.getDados().setDataNascimento(dados.get(3).getText());
				aluno.getDados().setNomeMae(dados.get(4).getText());
				aluno.getDados().setNomePai(dados.get(5).getText());
				aluno.getDados().getTelefone().setNumero(dados.get(6).getText());
				aluno.getDados().setEmail(dados.get(7).getText());
				aluno.getDados().getCertidao().setNumTermo(dados.get(8).getText());
				aluno.getDados().getCertidao().setFolha(dados.get(9).getText());
				aluno.getDados().getCertidao().setLivro(dados.get(10).getText());
				aluno.getDados().getCertidao().setDataEmissao(dados.get(11).getText());
				aluno.getDados().setNaturalidade(dados.get(12).getText());
				aluno.getDados().getEndereco().setRua(dados.get(13).getText());
				aluno.getDados().getEndereco().setBairro_distrito(dados.get(14).getText());
				aluno.getDados().getEndereco().setNum(dados.get(15).getText());
				aluno.getDados().getEndereco().setCidade(dados.get(16).getText());
				aluno.getDados().setMatricula(dados.get(17).getText());
				aluno.getDados().setSige(dados.get(18).getText());

				sistema.addAluno(aluno);
				alteraBotoesCaixas(false);
				imagem = new ImageIcon(getClass().getResource("/br/com/ceja/images/menu_geral.jpg"));
				image = imagem.getImage().getScaledInstance(rotulo.getWidth(), rotulo.getHeight(), Image.SCALE_SMOOTH);
				rotulo.setIcon(new ImageIcon(image));
				for(JTextField t: dados) t.setText("");
				/**
				 * 
				 * 
				 * Colocar janela de aluno cadastrado.
				 */
			} catch (AlunoJaExisteException e1) {
				e1.printStackTrace();
			};


		}

	}

	public void mouseClicked(MouseEvent e) {
		config.setVisible(false);
		alunos.setVisible(false);
	}
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
		if(e.getSource() == buscar) {
			buscar.setText("");
		}
	}
	public void mouseReleased(MouseEvent e) {		
	}
}