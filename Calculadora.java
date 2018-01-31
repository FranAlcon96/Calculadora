import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class Calculadora extends JFrame implements ActionListener {
	
	private String numero1="",numero2="",simbolo="";
	private int secuencia=1;
	private JPanel contentPane;
	private JLabel pantalla;
	private JButton botonRC;
	private JButton botonC;
	private JButton botonDel;
	private JButton botonDiv;
	private JButton boton7;
	private JButton boton8;
	private JButton boton9;
	private JButton botonmulti;
	private JButton boton4;
	private JButton boton5;
	private JButton boton6;
	private JButton botonresta;
	private JButton boton3;
	private JButton boton2;
	private JButton boton1;
	private JButton botonsuma;
	private JButton botonCerrar;
	private JButton boton0,botonpunto,botonigual;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setResizable(false);
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 394, 416);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		pantalla = new JLabel("");
		pantalla.setBorder(new LineBorder(null));
		pantalla.setFont(new Font("SansSerif", Font.BOLD, 13));
		pantalla.setHorizontalAlignment(SwingConstants.CENTER);
		pantalla.setBackground(new Color(0, 0, 0));
		pantalla.setForeground(new Color(255, 255, 255));
		pantalla.setBounds(36, 22, 322, 117);
		contentPane.add(pantalla);
		
		botonRC = new JButton("RC");
		botonRC.setFont(new Font("Tahoma", Font.BOLD, 12));
		botonRC.setForeground(new Color(255, 255, 255));
		botonRC.setBackground(new Color(0, 102, 102));
		botonRC.setBounds(36, 161, 73, 23);
		contentPane.add(botonRC);
		botonRC.addActionListener(this);
		
		botonC = new JButton("C");
		botonC.setFont(new Font("Tahoma", Font.BOLD, 12));
		botonC.setForeground(new Color(255, 255, 255));
		botonC.setBackground(new Color(0, 102, 102));
		botonC.setBounds(119, 161, 73, 23);
		contentPane.add(botonC);
		botonC.addActionListener(this);
		
		botonDel = new JButton("Info");
		botonDel.setFont(new Font("Tahoma", Font.BOLD, 12));
		botonDel.setForeground(new Color(255, 255, 255));
		botonDel.setBackground(new Color(0, 102, 102));
		botonDel.setBounds(202, 161, 73, 23);
		contentPane.add(botonDel);
		botonDel.addActionListener(this);
		
		botonDiv = new JButton("/");
		botonDiv.setBackground(new Color(0, 102, 102));
		botonDiv.setFont(new Font("Tahoma", Font.BOLD, 12));
		botonDiv.setForeground(new Color(255, 255, 255));
		botonDiv.setBounds(285, 161, 73, 23);
		contentPane.add(botonDiv);
		botonDiv.addActionListener(this);
		
		boton7 = new JButton("7");
		boton7.setForeground(new Color(255, 255, 255));
		boton7.setBackground(new Color(0, 102, 102));
		boton7.setFont(new Font("Tahoma", Font.BOLD, 12));
		boton7.setBounds(36, 209, 73, 23);
		contentPane.add(boton7);
		boton7.addActionListener(this);
		
		boton8 = new JButton("8");
		boton8.setForeground(new Color(255, 255, 255));
		boton8.setBackground(new Color(0, 102, 102));
		boton8.setFont(new Font("Tahoma", Font.BOLD, 12));
		boton8.setBounds(119, 209, 73, 23);
		contentPane.add(boton8);
		boton8.addActionListener(this);
		
		boton9 = new JButton("9");
		boton9.setForeground(new Color(255, 255, 255));
		boton9.setBackground(new Color(0, 102, 102));
		boton9.setFont(new Font("Tahoma", Font.BOLD, 12));
		boton9.setBounds(202, 209, 73, 23);
		contentPane.add(boton9);
		boton9.addActionListener(this);
		
		botonmulti = new JButton("*");
		botonmulti.setBackground(new Color(0, 102, 102));
		botonmulti.setForeground(new Color(255, 255, 255));
		botonmulti.setFont(new Font("Tahoma", Font.BOLD, 12));
		botonmulti.setBounds(285, 209, 73, 23);
		contentPane.add(botonmulti);
		botonmulti.addActionListener(this);
		
		boton4 = new JButton("4");
		boton4.setForeground(new Color(255, 255, 255));
		boton4.setBackground(new Color(0, 102, 102));
		boton4.setFont(new Font("Tahoma", Font.BOLD, 12));
		boton4.setBounds(36, 254, 73, 23);
		contentPane.add(boton4);
		boton4.addActionListener(this);
		
		boton5 = new JButton("5");
		boton5.setBackground(new Color(0, 102, 102));
		boton5.setForeground(new Color(255, 255, 255));
		boton5.setFont(new Font("Tahoma", Font.BOLD, 12));
		boton5.setBounds(119, 254, 73, 23);
		contentPane.add(boton5);
		boton5.addActionListener(this);
		
		boton6 = new JButton("6");
		boton6.setForeground(new Color(255, 255, 255));
		boton6.setBackground(new Color(0, 102, 102));
		boton6.setFont(new Font("Tahoma", Font.BOLD, 12));
		boton6.setBounds(202, 254, 73, 23);
		contentPane.add(boton6);
		boton6.addActionListener(this);
		
		botonresta = new JButton("-");
		botonresta.setForeground(new Color(255, 255, 255));
		botonresta.setBackground(new Color(0, 102, 102));
		botonresta.setFont(new Font("Tahoma", Font.BOLD, 12));
		botonresta.setBounds(285, 254, 73, 23);
		contentPane.add(botonresta);
		botonresta.addActionListener(this);
		
		boton1 = new JButton("1");
		boton1.setForeground(new Color(255, 255, 255));
		boton1.setBackground(new Color(0, 102, 102));
		boton1.setFont(new Font("Tahoma", Font.BOLD, 12));
		boton1.setBounds(36, 299, 73, 23);
		contentPane.add(boton1);
		boton1.addActionListener(this);
		
		boton2 = new JButton("2");
		boton2.setForeground(new Color(255, 255, 255));
		boton2.setBackground(new Color(0, 102, 102));
		boton2.setFont(new Font("Tahoma", Font.BOLD, 12));
		boton2.setBounds(119, 299, 73, 23);
		contentPane.add(boton2);
		boton2.addActionListener(this);
		
		boton3 = new JButton("3");
		boton3.setForeground(new Color(255, 255, 255));
		boton3.setBackground(new Color(0, 102, 102));
		boton3.setFont(new Font("Tahoma", Font.BOLD, 12));
		boton3.setBounds(202, 299, 73, 23);
		contentPane.add(boton3);
		boton3.addActionListener(this);
		
		botonsuma = new JButton("+");
		botonsuma.setForeground(new Color(255, 255, 255));
		botonsuma.setBackground(new Color(0, 102, 102));
		botonsuma.setFont(new Font("Tahoma", Font.BOLD, 12));
		botonsuma.setBounds(285, 299, 73, 23);
		contentPane.add(botonsuma);
		botonsuma.addActionListener(this);
		
		botonCerrar = new JButton("Cerrar");
		botonCerrar.setForeground(new Color(255, 255, 255));
		botonCerrar.setBackground(new Color(0, 102, 102));
		botonCerrar.setFont(new Font("Tahoma", Font.BOLD, 12));
		botonCerrar.setBounds(36, 343, 73, 23);
		contentPane.add(botonCerrar);
		botonCerrar.addActionListener(this);
		
		boton0 = new JButton("0");
		boton0.setForeground(new Color(255, 255, 255));
		boton0.setBackground(new Color(0, 102, 102));
		boton0.setFont(new Font("Tahoma", Font.BOLD, 12));
		boton0.setBounds(119, 343, 73, 23);
		contentPane.add(boton0);
		boton0.addActionListener(this);
		
		botonpunto = new JButton(".");
		botonpunto.setForeground(new Color(255, 255, 255));
		botonpunto.setBackground(new Color(0, 102, 102));
		botonpunto.setFont(new Font("Tahoma", Font.BOLD, 12));
		botonpunto.setBounds(202, 343, 73, 23);
		contentPane.add(botonpunto);
		botonpunto.addActionListener(this);
		
		botonigual = new JButton("=");
		botonigual.setForeground(new Color(255, 255, 255));
		botonigual.setBackground(new Color(0, 102, 102));
		botonigual.setFont(new Font("Tahoma", Font.BOLD, 12));
		botonigual.setBounds(285, 343, 73, 23);
		contentPane.add(botonigual);
		botonigual.addActionListener(this);
	}
	
	private void calcular(){
		double num1,num2;
		double resultado=0;
		num1 = Double.parseDouble(numero1);
		num2 = Double.parseDouble(numero2);
		switch (simbolo) {
		case "+":
			resultado=num1+num2;
			break;
		case "-":
			resultado=num1-num2;
			break;
		case "*":
			resultado=num1*num2;
			break;
		case "/":
			resultado=num1/num2;
			break;
		default:
			break;
		}
		
		pantalla.setText(numero1+" "+simbolo+" "+numero2+" = "+resultado);
		
		this.numero1="";
		this.numero2="";
		this.simbolo="";
		this.secuencia=1;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(botonCerrar)){
			JOptionPane.showMessageDialog(null, "Adiós, gracias por usar esta aplicación :).");
			System.exit(0);
		}
		
		if(e.getSource().equals(boton0)){
			if(secuencia==1){
				numero1+=0;
				pantalla.setText(numero1);
			}else{
				numero2+=0;
				pantalla.setText(numero1+" "+simbolo+" "+numero2);
			}
			return;
		}
		
		if(e.getSource().equals(boton1)){
			if(secuencia==1){
				numero1+=1;
				pantalla.setText(numero1);
			}else{
				numero2+=1;
				pantalla.setText(numero1+" "+simbolo+" "+numero2);
			}
			return;
		}
		
		if(e.getSource().equals(boton2)){
			if(secuencia==1){
				numero1+=2;
				pantalla.setText(numero1);
			}else{
				numero2+=2;
				pantalla.setText(numero1+" "+simbolo+" "+numero2);
			}
			return;
		}
		
		if(e.getSource().equals(boton3)){
			if(secuencia==1){
				numero1+=3;
				pantalla.setText(numero1);
			}else{
				numero2+=3;
				pantalla.setText(numero1+" "+simbolo+" "+numero2);
			}
			return;
		}
		
		if(e.getSource().equals(boton4)){
			if(secuencia==1){
				numero1+=4;
				pantalla.setText(numero1);
			}else{
				numero2+=4;
				pantalla.setText(numero1+" "+simbolo+" "+numero2);
			}
			return;
		}
		
		if(e.getSource().equals(boton5)){
			if(secuencia==1){
				numero1+=5;
				pantalla.setText(numero1);
			}else{
				numero2+=5;
				pantalla.setText(numero1+" "+simbolo+" "+numero2);
			}
			return;
		}
		
		if(e.getSource().equals(boton6)){
			if(secuencia==1){
				numero1+=6;
				pantalla.setText(numero1);
			}else{
				numero2+=6;
				pantalla.setText(numero1+" "+simbolo+" "+numero2);
			}
			return;
		}
		
		if(e.getSource().equals(boton7)){
			if(secuencia==1){
				numero1+=7;
				pantalla.setText(numero1);
			}else{
				numero2+=7;
				pantalla.setText(numero1+" "+simbolo+" "+numero2);
			}
			return;
		}
		
		if(e.getSource().equals(boton8)){
			if(secuencia==1){
				numero1+=8;
				pantalla.setText(numero1);
			}else{
				numero2+=8;
				pantalla.setText(numero1+" "+simbolo+" "+numero2);
			}
			return;
		}
		
		if(e.getSource().equals(boton9)){
			if(secuencia==1){
				numero1+=9;
				pantalla.setText(numero1);
			}else{
				numero2+=9;
				pantalla.setText(numero1+" "+simbolo+" "+numero2);
			}
			return;
		}

		if(e.getSource().equals(botonsuma)){
			if(numero1.equals("")){
				JOptionPane.showMessageDialog(null, "Por favor, introduzca el primer número antes de introducir el símbolo.");
				return;
			}
			
			if(simbolo.equals("")){
				simbolo="+";
				secuencia=2;
				pantalla.setText(numero1+" "+simbolo);
				return;
			}
			
			pantalla.setText(numero1+" "+simbolo+" "+numero2);
		}
		
		if(e.getSource().equals(botonresta)){
			if(numero1.equals("")){
				JOptionPane.showMessageDialog(null, "Por favor, introduzca el primer número antes de introducir el símbolo.");
				return;
			}
			if(simbolo.equals("")){
				simbolo="-";
				secuencia=2;
				pantalla.setText(numero1+" "+simbolo);
				return;
			}
			
			pantalla.setText(numero1+" "+simbolo+" "+numero2);
		}
		
		if(e.getSource().equals(botonmulti)){
			if(numero1.equals("")){
				JOptionPane.showMessageDialog(null, "Por favor, introduzca el primer número antes de introducir el símbolo.");
				return;
			}
			if(simbolo.equals("")){
				simbolo="*";
				secuencia=2;
				pantalla.setText(numero1+" "+simbolo);
				return;
			}
			
			pantalla.setText(numero1+" "+simbolo+" "+numero2);
		}
		
		if(e.getSource().equals(botonDiv)){
			if(numero1.equals("")){
				JOptionPane.showMessageDialog(null, "Por favor, introduzca el primer número antes de introducir el símbolo.");
				return;
			}
			if(simbolo.equals("")){
				simbolo="/";
				secuencia=2;
				pantalla.setText(numero1+" "+simbolo);
				return;
			}
			
			pantalla.setText(numero1+" "+simbolo+" "+numero2);
		}
		
		if(e.getSource().equals(botonigual)){
			if(numero1.equals("") || numero2.equals("")){
				JOptionPane.showMessageDialog(null, "Por favor, introduzca los números antes de realizar el cálculo.");
				return;
			}
			calcular();
		}
		
		if(e.getSource().equals(botonC)){
			numero1="";
			numero2="";
			secuencia=1;
			simbolo="";
			pantalla.setText("");
		}
		
		if(e.getSource().equals(botonRC)) {
			if(numero1.equals("")){
				JOptionPane.showMessageDialog(null, "Por favor, introduzca el primer número antes de calcular la raíz cuadrada.");
				return;
			}
			
			if(simbolo.equals("") && numero2.equals("")) {
				double result=Math.sqrt(Integer.parseInt(numero1));
				pantalla.setText(""+result);
			}
		}
		
		if(e.getSource().equals("info")) {
			JOptionPane.showMessageDialog(null, "Proyecto realizado por Fran Alcón, estudiante de DAW en el I.E.S Polígono Sur.");
		}
		
		if(e.getSource().equals(botonpunto)) {
			if(numero1.equals("")){
				return;
			}
			
	
			
			if(secuencia==1) {
				int contador=0;
				for (int i = 0; i < numero1.length(); i++) {
						if(numero1.charAt(i)=='.') {
							contador++;
						}
				}
				
				if(contador==0) {
					numero1=numero1+".";
					pantalla.setText(numero1);		
				}else {
					JOptionPane.showMessageDialog(null, "Solo puede haber un punto.");					
				}
				
			}
			
			if(secuencia==2) {
				int contador=0;
				for (int i = 0; i < numero2.length(); i++) {
						if(numero2.charAt(i)=='.') {
							contador++;
						}
				}
				
				if(contador==0) {
					numero2=numero2+".";
					pantalla.setText(numero1 + "" + simbolo + "" + numero2);		
				}else {
					JOptionPane.showMessageDialog(null, "Solo puede haber un punto.");					
				}
				
			}
			
				
		}
	}
}
