package br.com.ceja.gui;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Avisos extends JFrame{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel rotulo = new JLabel("");
	ImageIcon imagem;
	Image image;

	public Avisos() {		

		
		add(rotulo);
		new JFrame();
		setSize(360, 220);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);

	}
	
	public void admNaoEncontrado() {
		imagem = new ImageIcon(getClass().getResource("/br/com/ceja/images/admNaoEncontrado.jpg"));
		image = imagem.getImage().getScaledInstance(rotulo.getWidth(), rotulo.getHeight(), Image.SCALE_SMOOTH);
		rotulo.setIcon(new ImageIcon(image));
	}

	public void alunoCadastrado() {
		imagem = new ImageIcon(getClass().getResource("/br/com/ceja/images/alunoCadastrado.jpg"));
		image = imagem.getImage().getScaledInstance(rotulo.getWidth(), rotulo.getHeight(), Image.SCALE_SMOOTH);
		rotulo.setIcon(new ImageIcon(image));
	}

	public void alunoNaoEncontrado() {
		imagem = new ImageIcon(getClass().getResource("/br/com/ceja/images/alunoNaoEncontrado.jpg"));
		image = imagem.getImage().getScaledInstance(rotulo.getWidth(), rotulo.getHeight(), Image.SCALE_SMOOTH);
		rotulo.setIcon(new ImageIcon(image));
	}
	
	public void alunoRemovido() {
		imagem = new ImageIcon(getClass().getResource("/br/com/ceja/images/alunoRemovido.jpg"));
		image = imagem.getImage().getScaledInstance(rotulo.getWidth(), rotulo.getHeight(), Image.SCALE_SMOOTH);
		rotulo.setIcon(new ImageIcon(image));
	}
	
	public static void main(String[] args) {
		new Avisos().alunoCadastrado();
	}
}
