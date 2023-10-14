package roteiro10.parte1;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Janela02 extends JFrame{
    
    private int largura = 300;
    private int altura = 300;
    private JButton btn01;
    private JButton btn02;
    
    public Janela02()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(largura,altura); 
        this.setTitle("Janela02");
        this.setLayout(null);
        
        btn01 = new JButton("Botão 01");
        btn02 = new JButton("Botão 02");
        
	  // setando as dimensões dos botões
	  // setBounds(posição x , posição y, largura e altura)		
        btn01.setBounds(20, 50, 100, 40);  
        btn02.setBounds(130, 50, 100, 40);         
        
        this.add(btn01);
        this.add(btn02);
        
        this.setVisible(true);
    }
    
}

