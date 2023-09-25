package gui;

import semana_05.ArregloPrecios;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Propuesto_5_2 extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JButton btnListar;
	private JButton btnReportar;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Propuesto_5_2 frame = new Propuesto_5_2();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Propuesto_5_2() {
		setTitle("Propuesto_5_2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setBounds(58, 11, 95, 23);
		contentPane.add(btnListar);
		
		btnReportar = new JButton("Reportar");
		btnReportar.addActionListener(this);
		btnReportar.setBounds(163, 11, 95, 23);
		contentPane.add(btnReportar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 44, 414, 406);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 13));
		scrollPane.setViewportView(txtS);
		
		btnGenerar = new JButton("Generar");
		btnGenerar.addActionListener(this);
		btnGenerar.setBounds(268, 12, 85, 21);
		contentPane.add(btnGenerar);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnReportar) {
			actionPerformedBtnReportar(arg0);
		}
		if (arg0.getSource() == btnListar) {
			actionPerformedBtnListar(arg0);
		}
		if (arg0.getSource() == btnGenerar) {
			actionPerformedBtnGenerar(arg0);
		}
	}
	ArregloPrecios ap = new ArregloPrecios();
	private JButton btnGenerar;
	
	protected void actionPerformedBtnListar(ActionEvent arg0) {
		txtS.setText("");
		for(int e=0; e<ap.tamanio(); e++) {
			imprimir("n [" + e + "] : " + ap.obtener(e));
		}

	}
	protected void actionPerformedBtnReportar(ActionEvent arg0) {
		imprimir();
		imprimir("precio promedio: " + ap.precioPromedio());
		imprimir("precio mayor: " + ap.precioMayor());
		imprimir("precio menor: " + ap.precioMenor());
		imprimir("cant Mayores Precio Promedio: " + ap.cantMayoresPrecioPromedio());
		imprimir("cant Menores Precio Promedio: " + ap.cantMenoresPrecioPromedio());
		imprimir("pos Primer Precio Mayor Al Segundo: " + ap.posPrimerPrecioMayorAlSegundo());
		imprimir("pos Ultimo Precio Menor Al Penultimo: " + ap.posUltimoPrecioMenorAlPenultimo());
	}
	
	protected void actionPerformedBtnGenerar(ActionEvent argo0) {
		ap.generarPrecios();
		imprimir();
		imprimir("los precios han sido cambiados. pulsar [listar]");
		
	}
	//  Métodos tipo void (sin parámetros)
	void imprimir() {
		imprimir("");
	}
	//  Métodos tipo void (con parámetros)
	void imprimir(String s) {
		txtS.append(s + "\n");
	}
}