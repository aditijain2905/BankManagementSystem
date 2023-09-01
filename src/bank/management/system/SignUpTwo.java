
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUpTwo extends JFrame implements ActionListener{
    
    long random;
    JTextField pan,adhaarnoTextField, stateTextField;
    JButton next;
    JRadioButton male,female,eyes,eno ;

    JComboBox religionbox , categorybox,occupationbox,incomebox,education,occupation;
    
     SignUpTwo(){
         
         setLayout(null);
         
         
         setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
         
         
         JLabel additionalDetails = new JLabel("Page 2: Additional Details");
         additionalDetails.setFont(new Font("Raleway", Font.BOLD , 22));
         additionalDetails.setBounds(290,80,400,30);
         add(additionalDetails);
         
         JLabel religion = new JLabel("Religion:");
         religion.setFont(new Font("Raleway", Font.BOLD , 20));
         religion.setBounds(100,140,100,30);
         add(religion);
         
          String valreligion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
        religionbox = new JComboBox(valreligion);
        religionbox.setBackground(Color.WHITE);
      religionbox.setBounds(300,140,400,30);
         add(religionbox);
         
 
         
         
         JLabel category = new JLabel("Category:");
         category.setFont(new Font("Raleway", Font.BOLD , 20));
         category.setBounds(100,190,200,30);
         add(category);
         
          String valcategory[] = {"General","OBC","SC","ST","Other"};
      categorybox = new JComboBox(valcategory);
        categorybox.setBackground(Color.WHITE);

         categorybox.setBounds(300,190,400,30);
         add(categorybox);
         
         JLabel income = new JLabel("Income:");
         income.setFont(new Font("Raleway", Font.BOLD , 20));
         income.setBounds(100,240,200,30);
         add(income);
         
         String valincome[] = {"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000","Above 10,00,000"};
        incomebox = new JComboBox(valincome);
        incomebox.setBackground(Color.WHITE);
        incomebox.setFont(new Font("Raleway", Font.BOLD, 14));
          incomebox.setBounds(300,240,200,30);
         add(incomebox);
         
        
         
         JLabel educational = new JLabel("Educational:");
         educational.setFont(new Font("Raleway", Font.BOLD , 20));
         educational.setBounds(100,290,200,30);
         add(educational);
         
        
         
       
         JLabel email = new JLabel("Qualification:");
         email.setFont(new Font("Ralelway", Font.BOLD , 20));
         email.setBounds(100,315,200,30);
         add(email);
         
            String valeducation[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
       education = new JComboBox(valeducation);
        education.setBackground(Color.WHITE);
        education.setFont(new Font("Raleway", Font.BOLD, 14));
        education.setBounds(300,315,400,30);
         add(education);
         
         
       
         
         JLabel marital = new JLabel("Occupation:");
         marital.setFont(new Font("Raleway", Font.BOLD , 20));
         marital.setBounds(100,390,200,30);
         add(marital);
         
               
        
        String valoccupation[] = {"Salaried","Self-Employmed","Business","Student","Retired","Others"};
       occupation = new JComboBox(valoccupation);
        occupation.setBackground(Color.WHITE);
        occupation.setFont(new Font("Raleway", Font.BOLD, 14));
         occupation.setBounds(300,315,400,30);
         add( occupation);
    
         
         
         JLabel address = new JLabel("Pan No.:");
         address.setFont(new Font("Raleway", Font.BOLD , 20));
         address.setBounds(100,440,200,30);
         add(address);
         
      pan = new JTextField();
         pan.setFont(new Font("Raleway", Font.BOLD , 14));
         pan.setBounds(300,440,400,30);
         add(pan);
         
         JLabel adhaarno = new JLabel("Adhaar No:");
         adhaarno.setFont(new Font("Raleway", Font.BOLD , 20));
         adhaarno.setBounds(100,490,200,30);
         add(adhaarno);
         
      adhaarnoTextField = new JTextField();
         adhaarnoTextField.setFont(new Font("Raleway", Font.BOLD , 14));
         adhaarnoTextField.setBounds(300,490,400,30);
         add(adhaarnoTextField);
         
         
         JLabel state = new JLabel("Senior Citizen:");
         state.setFont(new Font("Raleway", Font.BOLD , 20));
        state.setBounds(100,540,200,30);
         add(state);
         
          male = new JRadioButton("YES");
         male.setBounds(300,390,100,30);
         male.setBackground(Color.WHITE);
         add(male);
         
          female = new JRadioButton("NO");
          female.setBounds(450,390,100,30);
          female.setBackground(Color.WHITE);
          add(female);
          
            ButtonGroup gendergroup = new ButtonGroup();
          gendergroup.add(male);
          gendergroup.add(female);
         
         stateTextField = new JTextField();
         stateTextField.setFont(new Font("Raleway", Font.BOLD , 14));
         stateTextField.setBounds(300,540,400,30);
         add(stateTextField);
         
         JLabel pincode = new JLabel("Existing Account:");
         pincode.setFont(new Font("Raleway", Font.BOLD , 20));
         pincode.setBounds(100,590,200,30);
         add(pincode);
         
         
          eyes = new JRadioButton("YES");
         eyes.setBounds(300,390,100,30);
         eyes.setBackground(Color.WHITE);
         add(eyes);
         
          eno = new JRadioButton("NO");
          eno.setBounds(450,390,100,30);
          eno.setBackground(Color.WHITE);
          add(eno);
          
            ButtonGroup existingaccount = new ButtonGroup();
          existingaccount.add(eyes);
          existingaccount.add(eno);
         
    next = new JButton();
         next.setBackground(Color.BLACK);
         next.setForeground(Color.WHITE);
         next.setFont(new Font("Raelway",Font.BOLD,14));
         next.setBounds(620,660,80,30);
         next.addActionListener(this);
         add(next);
         
         
         getContentPane().setBackground(Color.white);
         
         setSize(850,800);
         setLocation(350,10);
         setVisible(true);
         
     }
     
     public void actionPerformed(ActionEvent ae){
         String formno = "" + random;
         String sreligion = (String) religionbox.getSelectedItem();
         String scategory = (String) categorybox.getSelectedItem();
         String sincome = (String) incomebox.getSelectedItem();
         String seducation = (String) education.getSelectedItem();
         String soccupation = (String) occupation.getSelectedItem();
         String seniorcitizen = null;
         if(male.isSelected()){
             seniorcitizen = "Yes";
         }else if(female.isSelected()){
             seniorcitizen = "No";
         }
         String email = emailTextField.getText();
         String existingaccount = null;
         if(eyes.isSelected()){
             existingaccount  = "Yes";
         }else if(unmarried.isSelected()){
             marital = "Unmarried";
         }
         
         String address = addressTextField.getText();
          String city = cityTextField.getText();
           String state = stateTextField.getText();
            String pincode = pincodeTextField.getText();
            
         try{
             if(name.equals("")){
                 JOptionPane.showMessageDialog(null, "Name is Requried");
             }
             else{
                 Conn c = new Conn();
                 String query = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                 c.s.executeUpdate(query);
             }
         }catch (Exception e){
            System.out.println(e);
         
         }
         
         
     }
    public static void main(String args[]) {
        new SignUpTwo();
        
    }
}
