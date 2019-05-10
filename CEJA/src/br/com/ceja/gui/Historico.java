package br.com.ceja.gui;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Historico extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	List<JTextField> portugues = new ArrayList<JTextField>();
	List<JTextField> ingles = new ArrayList<JTextField>();
	List<JTextField> espanhol = new ArrayList<JTextField>();
	List<JTextField> edfisica = new ArrayList<JTextField>();
	List<JTextField> arte = new ArrayList<JTextField>();
	List<JTextField> historia = new ArrayList<JTextField>();
	List<JTextField> geografia = new ArrayList<JTextField>();
	List<JTextField> sociologia = new ArrayList<JTextField>();
	List<JTextField> filosofia = new ArrayList<JTextField>();
	List<JTextField> matematica = new ArrayList<JTextField>();
	List<JTextField> fisica = new ArrayList<JTextField>();
	List<JTextField> biologia = new ArrayList<JTextField>();
	List<JTextField> quimica = new ArrayList<JTextField>();
	List<JTextField> ciencias = new ArrayList<JTextField>();
	
	JLabel rotulo = new JLabel("");
	ImageIcon imagem;
	Image image;

	public Historico() {
		
		rotulo.setBounds(0, 0, 765, 395);

		imagem = new ImageIcon(getClass().getResource("/br/com/ceja/images/historico.jpg"));
		image = imagem.getImage().getScaledInstance(rotulo.getWidth(), rotulo.getHeight(), Image.SCALE_SMOOTH);
		rotulo.setIcon(new ImageIcon(image));
		

		for(int i = 0; i < 16; i++) {
			portugues.add(new JTextField("7.0"));
			ingles.add(new JTextField(""));
			espanhol.add(new JTextField(""));
			edfisica.add(new JTextField(""));
			arte.add(new JTextField(""));
			historia.add(new JTextField(""));
			geografia.add(new JTextField(""));
			sociologia.add(new JTextField(""));
			filosofia.add(new JTextField(""));
			matematica.add(new JTextField(""));
			fisica.add(new JTextField(""));
			biologia.add(new JTextField(""));
			quimica.add(new JTextField(""));
			ciencias.add(new JTextField(""));
			
			portugues.get(i).setOpaque(false);
			ingles.get(i).setOpaque(false);
			espanhol.get(i).setOpaque(false);
			edfisica.get(i).setOpaque(false);
			arte.get(i).setOpaque(false);
			historia.get(i).setOpaque(false);
			geografia.get(i).setOpaque(false);
			sociologia.get(i).setOpaque(false);
			filosofia.get(i).setOpaque(false);
			matematica.get(i).setOpaque(false);
			fisica.get(i).setOpaque(false);
			biologia.get(i).setOpaque(false);
			quimica.get(i).setOpaque(false);
			ciencias.get(i).setOpaque(false);

			portugues.get(i).setBorder(null);
			ingles.get(i).setBorder(null);
			espanhol.get(i).setBorder(null);
			edfisica.get(i).setBorder(null);
			arte.get(i).setBorder(null);
			historia.get(i).setBorder(null);
			geografia.get(i).setBorder(null);
			sociologia.get(i).setBorder(null);
			filosofia.get(i).setBorder(null);
			matematica.get(i).setBorder(null);
			fisica.get(i).setBorder(null);
			biologia.get(i).setBorder(null);
			quimica.get(i).setBorder(null);
			ciencias.get(i).setBorder(null);
			
			portugues.get(i).setEditable(false);
			ingles.get(i).setEditable(false);
			espanhol.get(i).setEditable(false);
			edfisica.get(i).setEditable(false);
			arte.get(i).setEditable(false);
			historia.get(i).setEditable(false);
			geografia.get(i).setEditable(false);
			sociologia.get(i).setEditable(false);
			filosofia.get(i).setEditable(false);
			matematica.get(i).setEditable(false);
			fisica.get(i).setEditable(false);
			biologia.get(i).setEditable(false);
			quimica.get(i).setEditable(false);
			ciencias.get(i).setEditable(false);

			rotulo.add(portugues.get(i));
			rotulo.add(ingles.get(i));
			rotulo.add(espanhol.get(i));
			rotulo.add(edfisica.get(i));
			rotulo.add(arte.get(i));
			rotulo.add(historia.get(i));
			rotulo.add(geografia.get(i));
			rotulo.add(sociologia.get(i));
			rotulo.add(filosofia.get(i));
			rotulo.add(matematica.get(i));
			rotulo.add(fisica.get(i));
			rotulo.add(biologia.get(i));
			rotulo.add(quimica.get(i));
			rotulo.add(ciencias.get(i));
		}
		
		int x = 0;
		for(int i = 128; i < 760; i+=40) {
			portugues.get(x).setBounds(i, 25, 40, 25);
			ingles.get(x).setBounds(i, 50, 40, 25);
			espanhol.get(x).setBounds(i, 75, 40, 25);
			edfisica.get(x).setBounds(i, 100, 40, 25);
			arte.get(x).setBounds(i, 125, 40, 25);
			historia.get(x).setBounds(i, 150, 40, 25);
			geografia.get(x).setBounds(i, 175, 40, 25);
			sociologia.get(x).setBounds(i, 200, 40, 25);
			filosofia.get(x).setBounds(i, 225, 40, 25);
			matematica.get(x).setBounds(i, 250, 40, 25);
			fisica.get(x).setBounds(i, 275, 40, 25);
			biologia.get(x).setBounds(i, 300, 40, 25);
			quimica.get(x).setBounds(i, 325, 40, 25);
			ciencias.get(x).setBounds(i, 350, 40, 25);
			x++;
		}

		

		add(rotulo);
		new JFrame();
		setSize(770, 407);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);

	}
	
	public static void main(String[] args) {
		new Historico();
	}
}
