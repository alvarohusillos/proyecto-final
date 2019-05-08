package LP;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class menu extends JFrame implements ActionListener{

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu frame = new menu();
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
	public menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 549, 404);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnGestionUsuarios = new JMenu("Gestion Usuarios");
		menuBar.add(mnGestionUsuarios);
		
		JMenu mnSocios = new JMenu("Socios");
		mnGestionUsuarios.add(mnSocios);
		
		JMenuItem mntmDarDeAlta = new JMenuItem("Dar de Alta");
		mnSocios.add(mntmDarDeAlta);
		
		JMenuItem mntmDarDeBaja = new JMenuItem("Dar de Baja");
		mnSocios.add(mntmDarDeBaja);
		
		JMenuItem mntmModificar = new JMenuItem("Modificar");
		mnSocios.add(mntmModificar);
		
		JMenuItem mntmConsultar = new JMenuItem("Consultar");
		mnSocios.add(mntmConsultar);
		
		JMenu mnProfesores = new JMenu("Profesores");
		mnGestionUsuarios.add(mnProfesores);
		
		JMenuItem mntmDarDeAlta_1 = new JMenuItem("Dar de Alta");
		mnProfesores.add(mntmDarDeAlta_1);
		
		JMenuItem mntmDarDeBaja_1 = new JMenuItem("Dar de Baja");
		mnProfesores.add(mntmDarDeBaja_1);
		
		JMenuItem mntmModificar_1 = new JMenuItem("Modificar");
		mnProfesores.add(mntmModificar_1);
		
		JMenuItem mntmConsultar_1 = new JMenuItem("Consultar");
		mnProfesores.add(mntmConsultar_1);
		
		JMenu mnGestionActividades = new JMenu("Gestion Actividades");
		menuBar.add(mnGestionActividades);
		
		JMenu mnActividadesPadel = new JMenu("Actividades Padel");
		mnGestionActividades.add(mnActividadesPadel);
		
		JMenu mnActividadesFitness = new JMenu("Actividades Fitness");
		mnGestionActividades.add(mnActividadesFitness);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setHorizontalAlignment(SwingConstants.RIGHT);
		btnNewButton.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton.setBounds(444, 320, 89, 23);
		contentPane.add(btnNewButton);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
