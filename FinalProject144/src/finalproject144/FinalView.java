package finalproject144;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class FinalView extends JFrame{
    static FinalFolder m;
    //Interface Implementation
    JPanel p1=new JPanel();
    JLabel Title=new JLabel("Employee Data Entry");
    JLabel Lname=new JLabel("Last Name : ");
    JLabel Fname=new JLabel("First Name : ");
    JLabel Ptype=new JLabel("Phone Type: ");
    JLabel Pnumber=new JLabel("Phone # : ");
    JLabel Address=new JLabel("Address: ");
    JLabel Apartment= new JLabel("Apartment: ");
    JLabel City=new JLabel("City : ");
    JLabel State=new JLabel("State : ");
    JButton bt1=new JButton("Clear Fields");
    JButton bt2= new JButton("Save");
    static JTextField Tlname=new JTextField();
    static JTextField Tfname=new JTextField();
    static JTextField Tnumber=new JTextField();
    static JTextField Taddress=new JTextField();
    static JTextField Tapartment=new JTextField();
    static JTextField Tcity=new JTextField();
    static JTextField Tstate=new JTextField();
    static JTextArea TAcomments=new JTextArea();
    
    static JRadioButton r1=new JRadioButton("Cell Phone");    
     JRadioButton r2=new JRadioButton("Land Phone");  
     ButtonGroup bg=new ButtonGroup();  
 
 
    //Put thiong together

    public FinalView() {
        p1.setLayout(null);
        Font f1=new Font("Verdana",Font.BOLD, 25);
        Title.setFont(f1);
        Title.setBounds(120, 10, 300, 30);
        Lname.setBounds(40, 100, 150, 30);
        Tlname.setBounds(120, 100, 150, 30);
        Fname.setBounds(40, 150, 150, 30);
        Tfname.setBounds(120, 150, 150, 30);
        Ptype.setBounds(40, 200, 150, 30);
        r1.setBounds(60, 230, 150, 30);
        r2.setBounds(60, 260, 150, 30);
        Pnumber.setBounds(40, 290, 150, 30);
        Tnumber.setBounds(120, 290, 150, 30);
        Address.setBounds(40, 350, 150, 30);
        Taddress.setBounds(120, 350, 150, 30);
        Apartment.setBounds(40, 410, 150, 30);
        Tapartment.setBounds(120, 410, 150,30);
        City.setBounds(40, 470, 150, 30);
        Tcity.setBounds(120, 470, 150, 30);
        State.setBounds(40, 530, 150, 30);
        Tstate.setBounds(120, 530, 150, 30);
        bt1.setBounds(40, 590, 150, 30);
        bt1.addActionListener(new clearfield());
        bt2.setBounds(200, 590, 150, 30);
        bt2.addActionListener(new mark());

        
        //bg.add(r1);bg.add(r2);
        TAcomments.setBounds(300, 100, 200, 300);
        TAcomments.setBackground(Color.CYAN);
        //ADD
        p1.add(Title);
        p1.add(Lname);
        p1.add(Fname);
        p1.add(Tfname);
        p1.add(Tlname);
        p1.add(Ptype);
        p1.add(Pnumber);
        p1.add(Tnumber);
        p1.add(Address);
        p1.add(Taddress);
        p1.add(Apartment);
        p1.add(Tapartment);
        p1.add(City);
        p1.add(Tcity);
        p1.add(State);
        p1.add(Tstate);
        p1.add(bt1);
        p1.add(bt2);
        p1.add(r1);
        p1.add(r2);
        p1.add(TAcomments);
        add(p1);
        setTitle("Employee Data Entry");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setSize(new Dimension(600, 600));
        setLocation(350, 100);
        setVisible(true);
    }
    public static class clearfield implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e){
    Tfname.setText("");
    Tlname.setText("");
    Tnumber.setText("");
    Taddress.setText("");
    Tapartment.setText("");
    Tcity.setText("");
    Tstate.setText("");
    //bg.setSelection(false, false);
    
    
    }
}
   public static class mark implements ActionListener{
   @Override
   public void actionPerformed(ActionEvent e){
       m = new FinalFolder();
       String l = Tlname.getText();
       String f = Tfname.getText();
       String n = Tnumber.getText();
       String a1 = Taddress.getText();
       String a2 = Tapartment.getText();
       String c = Tcity.getText();
       String s = Tstate.getText();
       int ft;
       if(r1.isSelected()){
           ft=1;
       }
       else
       {
           ft=2;
       }
       m.InsertMethod(l, f, ft, n, a1, a2, c, s);
       TAcomments.setText("Congrtulations, Data is Saved!");
   }
   }
}
