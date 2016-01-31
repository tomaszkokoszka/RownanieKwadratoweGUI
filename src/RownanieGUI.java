import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class RownanieGUI extends JFrame implements ActionListener
{
		private JLabel jA, jB, jC, jDelta, jWynik, jPierwiastek1_0, jPierwiastek2;
		private JTextField jtA, jtB, jtC, jtDelta, jtRozwi¹zanie, jtPierwiastek1_0, jtPierwiastek2;
		private JButton jbOblicz, jbWyjœcie;
	
		
	public RownanieGUI()
	{
		setSize(450,450);
		setTitle("Rozwi¹zywanie równania kwadratowego");
		setLayout(null);
		
		jA = new JLabel("Wspó³czynnik a: ");
		jA.setBounds(20, 25, 100, 20);
		add(jA); 
		
		jtA = new JTextField();
		jtA.setBounds(125, 25, 50, 20);
		jtA.setToolTipText("Podaj wspó³czynnik a");
		add(jtA);
		
		jB = new JLabel("Wspó³czynnik b: ");
		jB.setBounds(20, 50, 100, 20);
		add(jB); 
		
		jtB = new JTextField();
		jtB.setBounds(125, 50, 50, 20);
		jtB.setToolTipText("Podaj wspó³czynnik b");
		add(jtB);
		
		jC = new JLabel("Wspó³czynnik c: ");
		jC.setBounds(20, 75, 100, 20);
		add(jC); 
		
		jtC = new JTextField();
		jtC.setBounds(125, 75, 50, 20);
		jtC.setToolTipText("Podaj wspó³czynnik c");
		add(jtC);
		
		jbOblicz = new JButton("Oblicz");
		jbOblicz.setBounds(50,100,100,20);
		add(jbOblicz);
		jbOblicz.addActionListener(this);
		
//		jDelta = new JLabel("Delta: ");
//		jDelta.setBounds(20, 175, 100, 20);
//		add(jDelta); 
//		
//		jtDelta = new JTextField();
//		jtDelta.setBounds(125, 175, 150, 20);
//		add(jtDelta);
		
		jWynik = new JLabel("Wynik: ");
		jWynik.setBounds(20,125,100,20);
		add(jWynik);
		
		jtRozwi¹zanie = new JTextField();
		jtRozwi¹zanie.setBounds(20, 150, 350, 20);
		add(jtRozwi¹zanie);
		
//		jPierwiastek1_0 = new JLabel("Pierwiastek x1 ");
//		jPierwiastek1_0.setBounds(20, 200, 100, 20);
//		add(jPierwiastek1_0); 
//		
//		jtPierwiastek1_0 = new JTextField();
//		jtPierwiastek1_0.setBounds(125, 200, 250, 20);
//		add(jtPierwiastek1_0);
//		
//		jPierwiastek2 = new JLabel("Pierwiastek x2 ");
//		jPierwiastek2.setBounds(20, 225, 100, 20);
//		add(jPierwiastek2); 
//		
//		jtPierwiastek2 = new JTextField();
//		jtPierwiastek2.setBounds(125, 225, 250, 20);
//		add(jtPierwiastek2);
		
		jbWyjœcie = new JButton ("Wyjœcie");
		jbWyjœcie.setBounds(50, 250, 100, 20);
		add(jbWyjœcie);
		jbWyjœcie.addActionListener(this);
		
	}
	
	public static void main(String[] args) 
	{
			RownanieGUI app = new RownanieGUI();
			app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			app.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Object Ÿród³o = e.getSource();
		
		if (Ÿród³o==jbWyjœcie)
		{
			dispose();
		}
		
		else if (Ÿród³o==jbOblicz)
		{
			int a = Integer.parseInt(jtA.getText());
			int b = Integer.parseInt(jtB.getText());
			int c = Integer.parseInt(jtC.getText());
			
			RownanieKwadratowe równanie = new RownanieKwadratowe(a, b, c);
			String rozwi¹zanie = równanie.rozwi¹¿();
			jtRozwi¹zanie.setText(rozwi¹zanie);
//			jtPierwiastek1_0.setText(pierwiastekx1);
//			jtPierwiastek2.setText(pierwiastekx0);
		}
			
		}
		
	}