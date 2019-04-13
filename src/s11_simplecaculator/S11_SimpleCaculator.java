package s11_simplecaculator;

import com.sun.javafx.text.TextRun;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Phung Nguyen
 */
public class S11_SimpleCaculator extends JFrame {

    JPanel panel1, panel2, panel3, panel23, panel4;
    TextArea txtResult;
    boolean change = false;
    static float number1 ;
    static float number2 ;
    String op; 
    static int flag = 0;
    
    static int operation = 0;
    public S11_SimpleCaculator() {
        initComponents();
        System.out.println(number1);
        Font f = new Font("", 6, 12);
        txtResult.setFont(f);
        txtResult.setEditable(false);
        txtResult.setText("0");
    }
    public float caculate( float a, float b){
        CaculatorLogic cal = new CaculatorLogic();
        System.out.println(operation);
        System.out.println(a);
        System.out.println(b);
        if(operation == 1)
            return cal.add(a, b);
        else if(operation == 2)            
            return cal.minus(a, b);
        else if(operation == 3)         
            return cal.product(a, b);
        else if(operation == 4){
//            if(b ==0){
//                txtResult.setText("Can't devide by Zero");
//               
//            }
//            else 
                return cal.devide(a, b);
        }      
           
            
        return 0;
    }
    public void initComponents() {
        panel1 = new JPanel();
        txtResult = new TextArea("");
        txtResult.setPreferredSize(new Dimension(400, 50));
//        txtResult.setEnabled(false);
        txtResult.setForeground(Color.black);
        panel1.setPreferredSize(new Dimension(400, 50));
        panel1.setBackground(Color.WHITE);
        panel1.add(txtResult);

        panel2 = new JPanel();
        JButton btn7 = new JButton("7");
        JButton btn8 = new JButton("8");
        JButton btn9 = new JButton("9");
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");
        JButton btn6 = new JButton("6");
        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btnx = new JButton("");
        JButton btn0 = new JButton("0");
        JButton btny = new JButton("");
        panel2.add(btn7);
        panel2.add(btn8);
        panel2.add(btn9);
        panel2.add(btn4);
        panel2.add(btn5);
        panel2.add(btn6);
        panel2.add(btn1);
        panel2.add(btn2);
        panel2.add(btn3);
        panel2.add(btnx);
        panel2.add(btn0);
        panel2.add(btny);
        panel2.setLayout(new GridLayout(4, 3));
        panel2.setPreferredSize(new Dimension(300, 150));
        
        panel3 = new JPanel();
        JButton btnAdd = new JButton("+");
        JButton btnMinus = new JButton("-");
        JButton btnProduct = new JButton("*");
        JButton btnDevide = new JButton("/");
        JButton btnEqual = new JButton("=");
        panel3.add(btnAdd);
        panel3.add(btnMinus);
        panel3.add(btnProduct);
        panel3.add(btnDevide);
        panel3.add(btnEqual);
        panel3.setLayout(new GridLayout(5, 1));
        panel3.setPreferredSize(new Dimension(70, 150));
        
        JButton btnClear = new JButton("Clear");
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        container.add(panel1);
        container.add(panel2);
        container.add(panel3);
        container.add(btnClear);
        container.setBackground(Color.lightGray);
       
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                flag = 1;
                if(txtResult.getText().trim().equalsIgnoreCase("0"))
                    txtResult.setText("7");
                else if(change){
                    change = false;
                     txtResult.setText("7");
                }
                else 
                    txtResult.append("7");
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                flag = 1;
                if(txtResult.getText().trim().equalsIgnoreCase("0"))
                    txtResult.setText("8");
                else if(change){
                    change = false;
                     txtResult.setText("8");
                }
                else
                    txtResult.append("8");
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                flag = 1;
                if(txtResult.getText().trim().equalsIgnoreCase("0"))
                    txtResult.setText("9");
                else if(change){
                    change = false;
                     txtResult.setText("9");
                }
                else
                    txtResult.append("9");
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                flag = 1;
                if(txtResult.getText().trim().equalsIgnoreCase("0"))
                    txtResult.setText("4");
                else if(change){
                    change = false;
                     txtResult.setText("4");
                }
                else
                    txtResult.append("4");
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                flag = 1;
                if(txtResult.getText().trim().equalsIgnoreCase("0"))
                    txtResult.setText("5");
                else if(change){
                    change = false;
                     txtResult.setText("5");
                }
                else
                    txtResult.append("5");
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                flag = 1;
                if(txtResult.getText().trim().equalsIgnoreCase("0"))
                    txtResult.setText("6");
                else if(change){
                    change = false;
                     txtResult.setText("6");
                }
                else
                    txtResult.append("6");
            }
        });
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                flag = 1;
                if(txtResult.getText().trim().equalsIgnoreCase("0"))
                    txtResult.setText("1");
                else if(change){
                    change = false;
                     txtResult.setText("1");
                }
                else
                    txtResult.append("1");
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                flag = 1;
                if(txtResult.getText().trim().equalsIgnoreCase("0"))
                    txtResult.setText("2");
                else if(change){
                    change = false;
                     txtResult.setText("2");
                }
                else
                    txtResult.append("2");
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                flag = 1;
                if(txtResult.getText().trim().equalsIgnoreCase("0"))
                    txtResult.setText("3");
                else if(change){
                    change = false;
                     txtResult.setText("3");
                }
                else
                    txtResult.append("3");
            }
        });
        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                flag = 1;
                if(txtResult.getText().trim().equalsIgnoreCase("0"))
                    txtResult.setText("0");
                else if(change){
                    change = false;
                     txtResult.setText("0");
                }
                else
                    txtResult.append("0");
            }
        });
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(flag == 0 )
                    return;
                if(change == false || flag ==1){ // lúc ấn nút bằng change = true, nên fair có biến flag =1 để tiếp tục +, - , */
                    op = "+";
                    number1 = Float.parseFloat(txtResult.getText());
                    txtResult.setText("+");
                    operation = 1;
                    flag = 0; // để không thực hiện khi chưa nhập số
                }
                change = true;
                
            }
        });
        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(flag == 0 )
                    return;
                if(change == false || flag ==1){
                    op = "-";
                    number1 = Float.parseFloat(txtResult.getText());
                    txtResult.setText("-");
                    operation = 2;
                    
                    
                }
                change = true;
            }
        });
        btnProduct.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(flag == 0 )
                    return;
                if(change == false || flag ==1){
                    op = "*";
                     number1 = Float.parseFloat(txtResult.getText());
                     txtResult.setText("*");
                     operation = 3;
                    
                }
                change = true;
            }
        });
        btnDevide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(flag == 0 )
                    return;
                if(change == false || flag ==1){
                    op = "/";
                    number1 = Float.parseFloat(txtResult.getText());
                    txtResult.setText("/");
                    operation = 4;  
                   
                }
                 change = true;
            }
        });
         btnEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float number2 = Float.parseFloat(txtResult.getText());
                
                   
                flag = 1;   // bằng xong rồi tiếp tục được +,-,*,/ 
                change = true;
                if(number2 == 0)
                    txtResult.setText("Can't devide by Zero");
                  
                else
                    txtResult.setText(Float.toString(caculate(number1, number2)));
                   
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtResult.setText("0");
            }
        });
        

    }
    public static void main(String[] args) {
        S11_SimpleCaculator app = new S11_SimpleCaculator();
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setSize(400, 300);
        app.setLocationRelativeTo(null);
        app.setResizable(false);
        app.setVisible(true);
        
    }
    
}
