/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendaftaranmahasiswabaru2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Mada
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    
    File f = new File("c:\\Analog A Mada\\Data Mahastudent");
    String username,password,email;
    
    int ln;
    public Register() {
        initComponents();
        
    }
    void createfolder(){
        if (!f.exists()){
            f.mkdirs();
        }
    }
    void readfile(){
        try {
            FileReader fr = new FileReader (f+"\\Logins.txt");
            System.out.println("file exist!");}
        catch (FileNotFoundException ex) {
            try {
                FileWriter fw = new FileWriter(f+"\\Logins.txt");
                System.out.println("File created");
            } catch (IOException ex1) {
                Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        
        
    }
    void addData(String usr, String pswd){
        try {
            RandomAccessFile raf = new RandomAccessFile(f+"\\Logins.txt","rw");
            for (int i = 0; i < ln; i++) {
                raf.readLine();
            }
            
            raf.writeBytes("username:"+usr+"\r\n");
            raf.writeBytes("password:"+pswd);
            raf.writeBytes("\r\n");
            raf.writeBytes("\r\n");
            raf.writeBytes("\r\n");
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//    void checkdata(String usr, String pswd, String mail){
//        try {
//            RandomAccessFile raf = new RandomAccessFile(f+"\\Logins.txt","rw");
//            String line = raf.readLine();
//            username = line.substring(11);
//            password = raf.readLine().substring(11);
//            email = raf.readLine().substring(8);
//            if (usr.equalsIgnoreCase(username)&pswd.equalsIgnoreCase(password)) {
//                JOptionPane.showMessageDialog(null, "CONGRATULATION");
//                String nama = fieldusername1.getText();
//                
//                home h=new home(nama);
//                h.setVisible(true);
//                h.pack();
//                h.setLocationRelativeTo(null);
//                h.setDefaultCloseOperation(EXIT_ON_CLOSE);
//                this.dispose();
//                
//            }
//            else {
//                JOptionPane.showMessageDialog(null, "incorrect username/password");
//                fieldusername1.setText("");
//                fieldpassword1.setText("");
//            }
//            
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    void countlines(){
        try {
            ln=1;
            RandomAccessFile raf = new RandomAccessFile(f+"\\Logins.txt","rw");
            for (int i =0;raf.readLine()!=null; i++) {
                ln++;
            }
            System.out.println("number of lines:"+ln);
            ID.setText("LW"+ln);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    void logic (String usr, String pswd){
        try {
            RandomAccessFile raf = new RandomAccessFile(f+"\\Logins.txt","rw");
            for (int i = 0; i <ln; i+=4) {System.out.println("count"+i);
            
            String forusername = raf.readLine().substring(9);
            String forpassword = raf.readLine().substring(9);
            if (usr.equals(forusername)&pswd.equals(forpassword)) {
                JOptionPane.showMessageDialog(null, "YOU IN");
                String nama = fieldusername1.getText();
                
                home h=new home(nama);
                h.setVisible(true);
                h.pack();
                h.setLocationRelativeTo(null);
                h.setDefaultCloseOperation(EXIT_ON_CLOSE);
                this.dispose();
                break;
            }  
            else if (i==(ln-2)){
                JOptionPane.showMessageDialog(null, "YOU NOT IN");
                fieldusername1.setText("");
                fieldpassword1.setText("");
                break;
            }
            for(int k=1;k<=2;k++){
                raf.readLine();
            
            }
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void read(){
            try {
            FileReader fr = new FileReader (f+"\\Data Mahastudent.txt");
            System.out.println("file exist!");}
        catch (FileNotFoundException ex) {
            try {
                FileWriter fw = new FileWriter(f+"\\Data Mahastudent.txt");
                System.out.println("File created");
            } catch (IOException ex1) {
                Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }
    
    public void add(String id,String nama,String lahir,String sekolah,String mtk,String ipas,String sejarah,String seni){
        try {
            RandomAccessFile raf = new RandomAccessFile(f+"\\Data Mahastudent.txt","rw");
            for (int i = 0; i < ln; i++) {
                raf.readLine();
            }
            raf.writeBytes(id+"/"+nama+"/"+lahir+"/"+sekolah+"/"+mtk+"/"+ipas+"/"+sejarah+"/"+seni+"\n");
  
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lulusan = new javax.swing.ButtonGroup();
        gender = new javax.swing.ButtonGroup();
        panelawal = new javax.swing.JPanel();
        panelregister = new keeptoo.KGradientPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fieldusername = new javax.swing.JTextField();
        fieldpassword = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        panelregister2 = new keeptoo.KGradientPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        Rname = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        Rbirth = new javax.swing.JTextField();
        Rschool = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        Rseni = new javax.swing.JTextField();
        Rsejarah = new javax.swing.JTextField();
        Ripas = new javax.swing.JTextField();
        Rmtk = new javax.swing.JTextField();
        pernyataan = new javax.swing.JCheckBox();
        signup = new javax.swing.JButton();
        background = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        panellogin = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        fieldusername1 = new javax.swing.JTextField();
        fieldpassword1 = new javax.swing.JPasswordField();
        kButton1 = new keeptoo.KButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(740, 510));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelawal.setLayout(new java.awt.CardLayout());

        panelregister.setkEndColor(new java.awt.Color(247, 240, 215));
        panelregister.setkGradientFocus(1000);
        panelregister.setkStartColor(new java.awt.Color(197, 168, 112));
        panelregister.setOpaque(false);
        panelregister.setPreferredSize(new java.awt.Dimension(740, 510));
        panelregister.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/icon_user.png"))); // NOI18N
        jLabel2.setText("USERNAME");
        panelregister.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/icon_password.png"))); // NOI18N
        jLabel3.setText("PASSWORD");
        panelregister.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        fieldusername.setOpaque(false);
        fieldusername.setPreferredSize(null);
        fieldusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldusernameActionPerformed(evt);
            }
        });
        fieldusername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldusernameKeyTyped(evt);
            }
        });
        panelregister.add(fieldusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 259, -1));

        fieldpassword.setForeground(new java.awt.Color(254, 169, 1));
        fieldpassword.setToolTipText("");
        fieldpassword.setOpaque(false);
        fieldpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldpasswordKeyTyped(evt);
            }
        });
        panelregister.add(fieldpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 260, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/REGISTER BLACK.png"))); // NOI18N
        panelregister.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Component 10 – 1.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        panelregister.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/logo universitas.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        panelregister.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, -20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("Have an account? ");
        panelregister.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 153));
        jLabel8.setText("log in");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        panelregister.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/x.png"))); // NOI18N
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        panelregister.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel25.setText("(diisi menggunakan huruf kapital)");
        panelregister.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        panelawal.add(panelregister, "card2");

        panelregister2.setkEndColor(new java.awt.Color(247, 240, 215));
        panelregister2.setkGradientFocus(1000);
        panelregister2.setkStartColor(new java.awt.Color(197, 168, 112));
        panelregister2.setOpaque(false);
        panelregister2.setPreferredSize(new java.awt.Dimension(740, 510));
        panelregister2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/REGISTER BLACK.png"))); // NOI18N
        panelregister2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/x.png"))); // NOI18N
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
        });
        panelregister2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel32.setBackground(new java.awt.Color(0, 0, 0));
        jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel32.setText("NAMA");
        panelregister2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        Rname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RnameActionPerformed(evt);
            }
        });
        Rname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RnameKeyTyped(evt);
            }
        });
        panelregister2.add(Rname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 270, -1));

        jLabel33.setBackground(new java.awt.Color(0, 0, 0));
        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel33.setText("LAHIR");
        panelregister2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        Rbirth.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RbirthKeyTyped(evt);
            }
        });
        panelregister2.add(Rbirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 270, -1));

        Rschool.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RschoolKeyTyped(evt);
            }
        });
        panelregister2.add(Rschool, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 270, -1));

        jLabel35.setBackground(new java.awt.Color(0, 0, 0));
        jLabel35.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel35.setText("ASAL SEKOLAH");
        panelregister2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel37.setText("NILAI RAPOR (RATA-RATA SEMESTER 1-5 DENGAN BILANGAN BULAT)");
        panelregister2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, 20));

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel23.setText("MATEMATIKA");
        panelregister2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 90, 20));

        jLabel56.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel56.setText("PELAJARAN SAINTEK/SOSHUM");
        panelregister2.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 190, 20));

        jLabel57.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel57.setText("SEJARAH INDONESIA");
        panelregister2.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 140, 20));

        jLabel58.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel58.setText("SENI");
        panelregister2.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 40, 20));

        Rseni.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        Rseni.setToolTipText("");
        Rseni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RseniKeyTyped(evt);
            }
        });
        panelregister2.add(Rseni, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 130, -1));

        Rsejarah.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        Rsejarah.setToolTipText("");
        Rsejarah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RsejarahKeyTyped(evt);
            }
        });
        panelregister2.add(Rsejarah, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 130, -1));

        Ripas.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        Ripas.setToolTipText("");
        Ripas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RipasKeyTyped(evt);
            }
        });
        panelregister2.add(Ripas, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 130, -1));

        Rmtk.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        Rmtk.setToolTipText("");
        Rmtk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RmtkActionPerformed(evt);
            }
        });
        Rmtk.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RmtkKeyTyped(evt);
            }
        });
        panelregister2.add(Rmtk, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 130, 20));

        pernyataan.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        pernyataan.setText("SAYA MENYATAKAN BAHWA DATA YANG SAYA MASUKAN BENAR");
        pernyataan.setOpaque(false);
        pernyataan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pernyataanActionPerformed(evt);
            }
        });
        panelregister2.add(pernyataan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        signup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Component 10 – 1.png"))); // NOI18N
        signup.setBorderPainted(false);
        signup.setContentAreaFilled(false);
        signup.setEnabled(false);
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });
        panelregister2.add(signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 110, 50));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/logo universitas.png"))); // NOI18N
        background.setText("jLabel7");
        panelregister2.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, -20, -1, -1));

        jLabel24.setText("(diisi menggunakan huruf kapital)");
        panelregister2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, -1));

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel27.setText("ID");
        panelregister2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        ID.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ID.setEnabled(false);
        panelregister2.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 270, -1));

        panelawal.add(panelregister2, "card2");

        panellogin.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(197, 168, 112));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Harry P", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/icon_user.png"))); // NOI18N
        jLabel11.setText("USERNAME");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 120, -1));

        jLabel10.setFont(new java.awt.Font("Harry P", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/icon_password.png"))); // NOI18N
        jLabel10.setText("PASSWORD");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 120, -1));

        fieldusername1.setOpaque(false);
        fieldusername1.setPreferredSize(null);
        fieldusername1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldusername1ActionPerformed(evt);
            }
        });
        fieldusername1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldusername1KeyTyped(evt);
            }
        });
        jPanel4.add(fieldusername1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 220, -1));

        fieldpassword1.setToolTipText("");
        fieldpassword1.setOpaque(false);
        fieldpassword1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldpassword1KeyTyped(evt);
            }
        });
        jPanel4.add(fieldpassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 220, -1));

        kButton1.setText("LOGIN");
        kButton1.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        kButton1.setHideActionText(true);
        kButton1.setkEndColor(new java.awt.Color(247, 240, 215));
        kButton1.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton1.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverStartColor(new java.awt.Color(0, 0, 0));
        kButton1.setkStartColor(new java.awt.Color(255, 255, 255));
        kButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kButton1MouseClicked(evt);
            }
        });
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 91, 35));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/LOGIN.png"))); // NOI18N
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, -1, -1));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Have no account? ");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, -1, -1));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 3, 11)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 153));
        jLabel20.setText("Register");
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/hogwarts castle 2.png"))); // NOI18N
        jLabel18.setText("jLabel18");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(-230, 260, 740, -1));

        panellogin.add(jPanel4);
        jPanel4.setBounds(0, 0, 380, 510);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/logo universitas (kecil).png"))); // NOI18N
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, -1, -1));

        jPanel5.setBackground(new java.awt.Color(77, 5, 5));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/gryffindor.png"))); // NOI18N
        jLabel15.setToolTipText("");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jPanel9.setBackground(new java.awt.Color(243, 192, 27));
        jPanel5.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 90, 160));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 180, 160));

        jPanel6.setBackground(new java.awt.Color(37, 88, 31));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/slytherin.png"))); // NOI18N
        jLabel14.setToolTipText("");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jPanel10.setBackground(new java.awt.Color(158, 153, 151));
        jPanel6.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 90, 160));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 180, 160));

        jPanel7.setBackground(new java.awt.Color(0, 0, 102));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/ravenclaw.png"))); // NOI18N
        jLabel17.setToolTipText("");
        jPanel7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jPanel1.setBackground(new java.awt.Color(166, 122, 83));
        jPanel7.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 90, 170));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 180, 170));

        jPanel8.setBackground(new java.awt.Color(254, 169, 1));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/hufflepuff.png"))); // NOI18N
        jLabel16.setToolTipText("");
        jPanel8.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jPanel11.setBackground(new java.awt.Color(51, 51, 51));
        jPanel8.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 90, 170));

        jPanel3.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 180, 170));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/x.png"))); // NOI18N
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(159, 153, 151));
        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 510));

        jPanel12.setBackground(new java.awt.Color(37, 88, 31));
        jPanel3.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 90, 510));

        jPanel13.setBackground(new java.awt.Color(243, 192, 27));
        jPanel3.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 90, 510));

        jPanel14.setBackground(new java.awt.Color(77, 5, 5));
        jPanel3.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 90, 510));

        panellogin.add(jPanel3);
        jPanel3.setBounds(381, 0, 360, 510);

        panelawal.add(panellogin, "card3");

        getContentPane().add(panelawal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fieldusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldusernameActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        panelawal.removeAll();
        panelawal.repaint();
        panelawal.revalidate();
        //add
        panelawal.add(panellogin);
        panelawal.repaint();
        panelawal.revalidate();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        if (fieldusername.getText().trim().isEmpty()||fieldpassword.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "TIDAK BOLEH KOSONG");
        }
        else{
        createfolder();
        readfile();
        countlines();
        addData(fieldusername.getText(), fieldpassword.getText());
        //checkdata(username, password, email);
        
        panelawal.removeAll();
        panelawal.repaint();
        panelawal.revalidate();
        
        panelawal.add(panelregister2);
        panelawal.repaint();
        panelawal.revalidate();
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void fieldusername1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldusername1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_fieldusername1ActionPerformed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        
    }//GEN-LAST:event_kButton1ActionPerformed

    private void kButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kButton1MouseClicked
        // TODO add your handling code here:
        
        createfolder();
        readfile();
        countlines();
        logic(fieldusername1.getText(), fieldpassword1.getText());
        
        
        
    }//GEN-LAST:event_kButton1MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // TODO add your handling code here:
        panelawal.removeAll();
        panelawal.repaint();
        panelawal.revalidate();
        //add
        panelawal.add(panelregister);
        panelawal.repaint();
        panelawal.revalidate();
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
        // TODO add your handling code here:
        panelawal.removeAll();
        panelawal.repaint();
        panelawal.revalidate();
        //add
        panelawal.add(panelregister);
        panelawal.repaint();
        panelawal.revalidate();
    }//GEN-LAST:event_jLabel31MouseClicked

    private void RnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RnameActionPerformed

    private void RnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RnameKeyTyped
        // TODO add your handling code here:
        if (Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
        else if (Character.isLowerCase(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_RnameKeyTyped

    private void RseniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RseniKeyTyped
        // TODO add your handling code here:
        if (Character.isAlphabetic(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_RseniKeyTyped

    private void RsejarahKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RsejarahKeyTyped
        // TODO add your handling code here:
        if (Character.isAlphabetic(evt.getKeyChar())) {
            evt.consume();
        }
        
    }//GEN-LAST:event_RsejarahKeyTyped

    private void RipasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RipasKeyTyped
        // TODO add your handling code here:
        if (Character.isAlphabetic(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_RipasKeyTyped

    private void RmtkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RmtkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RmtkActionPerformed

    private void RmtkKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RmtkKeyTyped
        // TODO add your handling code here:
        if (Character.isAlphabetic(evt.getKeyChar())) {
            evt.consume();
        }
        
        
    }//GEN-LAST:event_RmtkKeyTyped

    private void pernyataanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pernyataanActionPerformed
        // TODO add your handling code here:
        if (pernyataan.isSelected()) {
            if (Rname.getText().trim().isEmpty()||Rbirth.getText().trim().isEmpty()||Rschool.getText().trim().isEmpty()||Rmtk.getText().trim().isEmpty()||Ripas.getText().trim().isEmpty()||Rsejarah.getText().trim().isEmpty()||Rseni.getText().trim().isEmpty()) {      
                    JOptionPane.showMessageDialog(null, "TIDAK BOLEH ADA DATA YANG KOSONG");
            }
            else{
                boolean a= true;
                    signup.setEnabled(a);
            }
        }
        else{
            boolean b = false;
            signup.setEnabled(b);
        }
    }//GEN-LAST:event_pernyataanActionPerformed

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
        // TODO add your handling code here:
        if (Integer.parseInt(Rmtk.getText())>100&&Integer.parseInt(Ripas.getText())>100&&Integer.parseInt(Rsejarah.getText())>100&&Integer.parseInt(Rseni.getText())>100) {
            JOptionPane.showMessageDialog(null,"NILAI LEBIH DARI 100");
        }
        else{
        JOptionPane.showMessageDialog(null, "ID ANDA "+"LW"+ln+" MOHON DIINGAT");
        panelawal.removeAll();
        panelawal.repaint();
        panelawal.revalidate();
        //add
        panelawal.add(panellogin);
        panelawal.repaint();
        panelawal.revalidate();
        read();
        add(ID.getText(),Rname.getText(),Rbirth.getText(),Rschool.getText(),Rmtk.getText(),Ripas.getText(),Rsejarah.getText(),Rseni.getText());
        
        }
    }//GEN-LAST:event_signupActionPerformed

    private void RbirthKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RbirthKeyTyped
        // TODO add your handling code here:
        if (Character.isLowerCase(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_RbirthKeyTyped

    private void RschoolKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RschoolKeyTyped
        // TODO add your handling code here:
        if (Character.isLowerCase(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_RschoolKeyTyped

    private void fieldusernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldusernameKeyTyped
        // TODO add your handling code here:
        if (Character.isLowerCase(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_fieldusernameKeyTyped

    private void fieldpasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldpasswordKeyTyped
        // TODO add your handling code here:
        if (Character.isLowerCase(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_fieldpasswordKeyTyped

    private void fieldusername1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldusername1KeyTyped
        // TODO add your handling code here:
        if (Character.isLowerCase(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_fieldusername1KeyTyped

    private void fieldpassword1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldpassword1KeyTyped
        // TODO add your handling code here:
        if (Character.isLowerCase(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_fieldpassword1KeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID;
    private javax.swing.JTextField Rbirth;
    private javax.swing.JTextField Ripas;
    private javax.swing.JTextField Rmtk;
    private javax.swing.JTextField Rname;
    private javax.swing.JTextField Rschool;
    private javax.swing.JTextField Rsejarah;
    private javax.swing.JTextField Rseni;
    private javax.swing.JLabel background;
    private javax.swing.JPasswordField fieldpassword;
    private javax.swing.JPasswordField fieldpassword1;
    private javax.swing.JTextField fieldusername;
    private javax.swing.JTextField fieldusername1;
    private javax.swing.ButtonGroup gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private keeptoo.KButton kButton1;
    private javax.swing.ButtonGroup lulusan;
    private javax.swing.JPanel panelawal;
    private javax.swing.JPanel panellogin;
    private keeptoo.KGradientPanel panelregister;
    private keeptoo.KGradientPanel panelregister2;
    private javax.swing.JCheckBox pernyataan;
    private javax.swing.JButton signup;
    // End of variables declaration//GEN-END:variables
}
