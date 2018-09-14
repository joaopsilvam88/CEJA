package br.com.ceja.gui;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

import br.com.ceja.classes.Aluno;
import br.com.ceja.classes.Sistema;

public class MenuIniciar extends JFrame implements ActionListener{

	Sistema sistema;
	JLabel rotulo = new JLabel("");
	ImageIcon imagem = new ImageIcon(getClass().getResource("/br/com/ceja/images/menu_buscar.jpg"));
	Image image;
	JButton botao1 = new JButton();
	JButton botao2 = new JButton();
	JButton botao3 = new JButton();
	JTextField buscar = new JTextField();
	
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

		buscar.setBounds(80, 176, 795, 35);
		buscar.setOpaque(false);
		buscar.setBorder(null);
		
		rotulo.add(botao1);
		rotulo.add(botao2);
		rotulo.add(botao3);
		rotulo.add(buscar);
		
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

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == botao1) {
			imagem = new ImageIcon(getClass().getResource("/br/com/ceja/images/menu_buscar.jpg"));
			image = imagem.getImage().getScaledInstance(rotulo.getWidth(), rotulo.getHeight(), Image.SCALE_SMOOTH);
			rotulo.setIcon(new ImageIcon(image));
			
		}
	}
}
