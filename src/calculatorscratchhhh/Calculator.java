package calculatorscratchhhh;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {
	Boolean isdot=false,isClicked=false;
	String oldValue;
	char ch;
	float oldValueF,newValueF,result;
	JFrame jf;
	JLabel displayLabel;
	
	JButton sevenButton,eightButton,nineButton,divisionButton,fourButton,fiveButton,sixButton,threeButton;
	JButton twoButton,oneButton,addButton,dotButton,zeroButton,assignButton,subButton;
	JButton multiplyButton,clearButton;
	
	
	
	
	
	Calculator(){
		 jf= new JFrame("CALCULATOR APP");
		jf.setLayout(null);
		jf.setSize(600,600);
		jf.setLocation(300,200);
		
		jf.getContentPane().setBackground(Color.black);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		displayLabel= new JLabel();
		displayLabel.setBounds(30, 50, 540,40);
		displayLabel.setFont(new Font("Serif", Font.PLAIN, 24));;
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.white);
		displayLabel.setBackground(Color.black);
		displayLabel.setOpaque(true);
		jf.add(displayLabel);
		
		 sevenButton= new JButton("7");
		sevenButton.setBounds(30, 120, 50, 50);
		sevenButton.setBackground(Color.gray);
		sevenButton.setForeground(Color.white);
		sevenButton.setFont(new Font("7", Font.PLAIN, 29));
		sevenButton.addActionListener(this);
		jf.add(sevenButton);
		
		 eightButton= new JButton("8");
		eightButton.setBounds(90, 120, 50, 50);
		eightButton.setBackground(Color.gray);
		eightButton.setForeground(Color.white);
		eightButton.setFont(new Font("8", Font.PLAIN, 29));
		eightButton.addActionListener(this);
		jf.add(eightButton);
		
		 nineButton= new JButton("9");
		nineButton.setBounds(150, 120, 50, 50);
		nineButton.setBackground(Color.gray);
		nineButton.setForeground(Color.white);
		nineButton.setFont(new Font("7", Font.PLAIN, 29));
		nineButton.addActionListener(this);
		jf.add(nineButton);
		
		 divisionButton= new JButton("/");
		divisionButton.setBounds(210, 120, 50, 50);
		divisionButton.setBackground(Color.orange);
		divisionButton.setForeground(Color.white);
		divisionButton.setFont(new Font("7", Font.PLAIN, 29));
		divisionButton.addActionListener(this);
		jf.add(divisionButton);
		
		 fourButton= new JButton("4");
		fourButton.setBounds(30, 180, 50, 50);
		fourButton.setBackground(Color.gray);
		fourButton.setForeground(Color.white);
		fourButton.setFont(new Font("7", Font.PLAIN, 29));
		fourButton.addActionListener(this);
		jf.add(fourButton);
		
		 fiveButton= new JButton("5");
		fiveButton.setBounds(90, 180, 50, 50);
		fiveButton.setForeground(Color.white);
		fiveButton.setBackground(Color.gray);
		fiveButton.setFont(new Font("7", Font.PLAIN, 29));
		fiveButton.addActionListener(this);
		jf.add(fiveButton);
		
		 sixButton= new JButton("6");
		sixButton.setBounds(150, 180, 50, 50);
		sixButton.setForeground(Color.white);
		sixButton.setBackground(Color.gray);
		sixButton.setFont(new Font("7", Font.PLAIN, 29));
		sixButton.addActionListener(this);
		jf.add(sixButton);
		
		 multiplyButton= new JButton("x");
		multiplyButton.setBounds(210, 180, 50, 50);
		multiplyButton.setBackground(Color.orange);
		multiplyButton.setForeground(Color.white);
		multiplyButton.setFont(new Font("7", Font.PLAIN, 25));
		multiplyButton.addActionListener(this);
		jf.add(multiplyButton);
		
		 oneButton= new JButton("1");
		oneButton.setBounds(30, 240, 50, 50);
		oneButton.setBackground(Color.gray);
		oneButton.setForeground(Color.white);
		oneButton.setFont(new Font("7", Font.PLAIN, 29));
		oneButton.addActionListener(this);
		jf.add(oneButton);
		
		 twoButton= new JButton("2");
		twoButton.setBounds(90, 240, 50, 50);
		twoButton.setBackground(Color.gray);
		twoButton.setForeground(Color.white);
		twoButton.setFont(new Font("7", Font.PLAIN, 29));
		twoButton.addActionListener(this);
		jf.add(twoButton);
		
		 threeButton= new JButton("3");
		threeButton.setBounds(150, 240, 50, 50);
		threeButton.setBackground(Color.gray);
		threeButton.setForeground(Color.white);
		threeButton.setFont(new Font("7", Font.PLAIN, 29));
		threeButton.addActionListener(this);
		jf.add(threeButton);
		
		addButton= new JButton("+");
		addButton.setBounds(210, 240, 50, 50);
		addButton.setBackground(Color.orange);
		addButton.setForeground(Color.white);
		addButton.setFont(new Font("7", Font.PLAIN, 25));
		addButton.addActionListener(this);
		jf.add(addButton);
		
		 zeroButton= new JButton("0");
		zeroButton.setBounds(30, 300, 50, 50);
		zeroButton.setFont(new Font("7", Font.PLAIN, 29));
		zeroButton.setBackground(Color.gray);
		zeroButton.setForeground(Color.white);
		zeroButton.addActionListener(this);
		jf.add(zeroButton);
		
		 dotButton= new JButton(".");
		dotButton.setBounds(90, 300, 50, 50);
		dotButton.setFont(new Font("7", Font.PLAIN, 29));
		dotButton.setBackground(Color.gray);
		dotButton.setForeground(Color.white);
		dotButton.addActionListener(this);
		jf.add(dotButton);
		
		 assignButton= new JButton("=");
		assignButton.setBounds(150,300, 50, 50);
		assignButton.setFont(new Font("7", Font.PLAIN, 25));
		assignButton.setBackground(Color.gray);
		assignButton.setForeground(Color.white);
		assignButton.addActionListener(this);
		jf.add(assignButton);
		
		 subButton= new JButton("-");
		subButton.setBounds(210,300, 50, 50);
		subButton.setBackground(Color.orange);
		subButton.setForeground(Color.white);
		subButton.setFont(new Font("7", Font.PLAIN, 29));
		subButton.addActionListener(this);
		jf.add(subButton);
		
		 clearButton= new JButton("clear");
			clearButton.setBounds(270,120, 80, 230);
			clearButton.setBackground(Color.orange);
			clearButton.setForeground(Color.white);
			clearButton.setFont(new Font("7", Font.PLAIN, 20));
			clearButton.addActionListener(this);
			jf.add(clearButton);
		
		
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==sevenButton)
		{
			if(isClicked)
			{
				displayLabel.setText(" ");
				displayLabel.setText("7");
				isClicked=false;
				
			}
				
			else
				displayLabel.setText(displayLabel.getText()+"7");
		}
			
		else if(e.getSource()==eightButton)
		{
			if(isClicked)
			{
				displayLabel.setText(" ");
				displayLabel.setText("8");
				isClicked=false;
				
			}
				
			else
				displayLabel.setText(displayLabel.getText()+"8");
		}
		else if(e.getSource()==nineButton)
		{
			if(isClicked)
			{
				displayLabel.setText(" ");
				displayLabel.setText("9");
				isClicked=false;
				
			}
				
			else
				displayLabel.setText(displayLabel.getText()+"9");
		}
			
		else if(e.getSource()==sixButton)
		{
			if(isClicked)
			{
				displayLabel.setText(" ");
				displayLabel.setText("6");
				isClicked=false;
				
			}
				
			else
				displayLabel.setText(displayLabel.getText()+"6");
		}
			
		else if(e.getSource()==fiveButton)
		{
			if(isClicked)
			{
				displayLabel.setText(" ");
				displayLabel.setText("5");
				isClicked=false;
				
			}
				
			else
				displayLabel.setText(displayLabel.getText()+"5");
		}
		else if(e.getSource()==fourButton)
		{
			if(isClicked)
			{
				displayLabel.setText(" ");
				displayLabel.setText("4");
				isClicked=false;
				
			}
				
			else
				displayLabel.setText(displayLabel.getText()+"4");
		}
		else if(e.getSource()==threeButton)
		{
			if(isClicked)
			{
				displayLabel.setText(" ");
				displayLabel.setText("3");
				isClicked=false;
				
			}
				
			else
				displayLabel.setText(displayLabel.getText()+"3");
		}
		else if(e.getSource()==twoButton)
		{
			if(isClicked)
			{
				displayLabel.setText(" ");
				displayLabel.setText("2");
				isClicked=false;
				
			}
				
			else
				displayLabel.setText(displayLabel.getText()+"2");
		}
		else if(e.getSource()==oneButton)
			if(isClicked)
			{
				displayLabel.setText(" ");
				displayLabel.setText("1");
				isClicked=false;
				
			}
				
			else
				displayLabel.setText(displayLabel.getText()+"1");
		else if(e.getSource()==zeroButton)
		{
			if(isClicked)
			{
				displayLabel.setText(" ");
				displayLabel.setText("0");
				isClicked=false;
				
			}
				
			else
				displayLabel.setText(displayLabel.getText()+"0");
		}
		else if(e.getSource()==dotButton)
		{
			char s[]=displayLabel.getText().toCharArray();
			boolean f=false;
			for(char c:s)
			{
				if(c=='.')
				{
					f=true;
					break;
				}
			}
			if(f==false)
			{
			  if(isClicked)
			    {
				displayLabel.setText(" ");
				displayLabel.setText(".");
				isClicked=false;
				//isdot=true;
				
			    }
				else
				{displayLabel.setText(displayLabel.getText()+".");
				//isdot=true;
				}
		    }
		}
		
		
		else if(e.getSource()==divisionButton) 
		{
            oldValue=displayLabel.getText();
			
			displayLabel.setText("/");
			
			isClicked=true;
			//isdot=false;
			ch='/';
			
			
		}
		
		else if(e.getSource()==addButton)
		{
			oldValue=displayLabel.getText();
			
			displayLabel.setText("+");
			
			isClicked=true;
			//isdot=false;
			ch='+';
			
		}
		else if(e.getSource()==multiplyButton)
		{
            oldValue=displayLabel.getText();
			displayLabel.setText("x");
			isClicked=true;
			//isdot=false;
			ch='x';
			
		}
		else if(e.getSource()==subButton)
		{
			oldValue=displayLabel.getText();
			displayLabel.setText("-");
			isClicked=true;
			//isdot=false;
			ch='-';
			
			
		}
		else if(e.getSource()==assignButton)
		{
			
				
			newValueF=Float.parseFloat(displayLabel.getText());
			oldValueF=Float.parseFloat(oldValue);
			if(ch=='+')
			result=newValueF+oldValueF;
			else if(ch=='/')
				result=oldValueF/newValueF;
			else if (ch=='x') 
				result=newValueF*oldValueF;
			else if(ch=='-')
				result=oldValueF-newValueF;
				
			displayLabel.setText(result+"");
			
				
			
			
			}
		else if(e.getSource()==clearButton)
		{
			displayLabel.setText(" ");
		}
			
		}
		public static void main(String[] args) {

		Calculator cb=new Calculator();
		}
		
		
		
	}


