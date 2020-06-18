/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendaftaranmahasiswabaru2;

import java.awt.Image;
import java.awt.print.PrinterException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Mada
 */

public class home extends javax.swing.JFrame {
    /**
     * Creates new form home2
     */
    File f = new File("c:\\Analog A Mada\\Data Mahastudent");
    private static String nama;
    int hasilrapot,rata,ln;
    int tanya1,tanya2,tanya3,tanya4,hasilasrama;
    String hasilakhir;
    public home(String nama) {
        initComponents();
        this.nama = nama;
        labelnama.setText(nama);
        showdate();
        
    }
//    void playmusic(String musicLocation) {
//        try{
//            File music = new File(musicLocation);
//            if (music.exists()) {
//                AudioInputStream audios = AudioSystem.getAudioInputStream(music);
//                Clip clip = AudioSystem.getClip();
//                clip.open(audios);
//                if (play.isSelected()) {
//                   clip.start();
//                   clip.loop(Clip.LOOP_CONTINUOUSLY); 
//                }
//                else if (stop.isSelected()) {
//                    clip.stop();
//                }
//                
//            }
//            else{
//                System.out.println("CAN'T FIND FILE");
//            }
//        }
//        catch(Exception e){
//            e.printStackTrace();
//        }
//    }
//    
//    void stopmusic(){
//        try {
//            Clip clip = AudioSystem.getClip();
//            clip.stop();
//        } catch (LineUnavailableException ex) {
//            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//    }
    
    public void datapeserta (){
        String rname = Rname.getText();
        String rbirth = Rbirth.getText();
        String rschool = Rschool.getText();
        String mtk = Rmtk.getText();
        String ipas = Ripas.getText();
        String sejarah = Rsejarah.getText();
        String seni = Rseni.getText();
                
        
        labelname.setText(rname);
        akhirNama.setText (rname);
        labelbirth.setText(rbirth);
        
        labelschool.setText(rschool);
        
        labelMtk.setText(mtk);
        labelRipas.setText(ipas);
        labelSejarah.setText(seni);
        labelSeni.setText(seni);
    }
    
    public void bgroup(){
        if(man.isSelected())
            labelgender.setText("MAN");
        else labelgender.setText("WOMAN");
        
        if(R2020.isSelected())
            labelgraduate.setText("2020");
        else if(R2019.isSelected())
            labelgraduate.setText("2019");
        else if(R2018.isSelected())
            labelgraduate.setText("2018");
        else if(R2017.isSelected())
            labelgraduate.setText("2017");
    }
    
    public void showdate(){
        Date date = new Date();
                SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
                date.getTime();
                labelwaktu.setText(s.format(date));
//                System.out.println("waktu sekarang adalah"+date.toString());
    }
    
    public ImageIcon ResizeImage(String ImagePath){
        ImageIcon myimage = new ImageIcon(ImagePath);
        Image img = myimage.getImage();
        Image newImg = img.getScaledInstance(labelgambar.getWidth(),labelgambar.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon Image = new ImageIcon(newImg);
        return Image;
    }
    
    public void perhitungan(){
        if (fakultas1.getSelectedItem().equals("POTION")) {
            labelfirstfaculty.setText("POTION");
            akhirPilihan1.setText("POTION");
            
            if (hasilrapot>=80&Integer.parseInt(Rmtk.getText())>=82&Integer.parseInt(Ripas.getText())>=81){
                hasilakhir="LULUS DI JURUSAN POTION";
                akhirKeputusan.setText(hasilakhir);
            }
            else{
                perhitungan2();
        }
        }
        else if (fakultas1.getSelectedItem().equals("DIVINATION")) {
            labelfirstfaculty.setText("DIVINATION");
            akhirPilihan1.setText("DIVINATION");
            
            if ((hasilrapot>=77)&&(Integer.parseInt(Rmtk.getText())>=72)&&(Integer.parseInt(Rsejarah.getText())>=80)){
                hasilakhir="LULUS DI JURUSAN DIVINATION";
                akhirKeputusan.setText(hasilakhir);
            }
            else{
                perhitungan2();}
        }
        
        else if (fakultas1.getSelectedItem().equals("CHARM")) {
            labelfirstfaculty.setText("CHARM");
            akhirPilihan1.setText("CHARM");
            
            if ((hasilrapot>=70)&&(Integer.parseInt(Rseni.getText())>=83)){
                hasilakhir="LULUS DI JURUSAN CHARM";
                akhirKeputusan.setText(hasilakhir);
            }
            else{
                perhitungan2();}
        }
        else if (fakultas1.getSelectedItem().equals("HISTORY OF MAGIC")) {
            labelfirstfaculty.setText("HISTORY OF MAGIC");
            akhirPilihan1.setText("HISTORY OF MAGIC");
            
            if ((hasilrapot>=74)&&(Integer.parseInt(Rsejarah.getText())>=85)){
                hasilakhir="LULUS DI JURUSAN HISTORY OF MAGIC";
                akhirKeputusan.setText(hasilakhir);
            }
            else{
                perhitungan2();}
        }
        else if (fakultas1.getSelectedItem().equals("DEFENCE AGAINST THE DARK ARTS")) {
            labelfirstfaculty.setText("DEFENCE AGAINST THE DARK ARTS");
            akhirPilihan1.setText("DEFENCE AGAINST THE DARK ARTS");
            
            if ((hasilrapot>=84)){
                hasilakhir="LULUS DI JURUSAN DEFENCE AGAINST THE DARK ARTS";
                akhirKeputusan.setText(hasilakhir);
            }
            else{
                perhitungan2();}
        }
        else if (fakultas1.getSelectedItem().equals("ARITHMANCY")) {
            labelfirstfaculty.setText("ARITHMANCY");
            akhirPilihan1.setText("ARITHMANCY");
            
            if ((hasilrapot>=76)&&(Integer.parseInt(Rmtk.getText())>=85)){
                hasilakhir="LULUS DI JURUSAN ARITHMANCY";
                akhirKeputusan.setText(hasilakhir);
            }
            else{
                perhitungan2();}
        }
        
    }
    
    public void perhitungan2(){
        if (fakultas2.getSelectedItem().equals("POTION")) {
            labelsecondfaculty.setText("POTION");
            akhirPilihan2.setText("POTION");
            
            if ((hasilrapot>=80)&&(Integer.parseInt(Rmtk.getText())>=82)&&(Integer.parseInt(Ripas.getText())>=81)){
                hasilakhir="LULUS DI JURUSAN POTION";
                akhirKeputusan.setText(hasilakhir);
            }
            else{
                hasilakhir="GAGAL";
                akhirKeputusan.setText(hasilakhir);}
        }
        else if (fakultas2.getSelectedItem().equals("DIVINATION")) {
            labelsecondfaculty.setText("DIVINATION");
            akhirPilihan2.setText("DIVINATION");
            
            if ((hasilrapot>=77)&&(Integer.parseInt(Rmtk.getText())>=72)&&(Integer.parseInt(Rsejarah.getText())>=80)){
                hasilakhir="LULUS DI JURUSAN DIVINATION";
                akhirKeputusan.setText(hasilakhir);
            }
            else{
                hasilakhir="GAGAL";
                akhirKeputusan.setText(hasilakhir);}
        }
        
        else if (fakultas2.getSelectedItem().equals("CHARM")) {
            labelsecondfaculty.setText("CHARM");
            akhirPilihan2.setText("CHARM");
            
            if ((hasilrapot>=70)&&(Integer.parseInt(Rseni.getText())>=83)){
                hasilakhir="LULUS DI JURUSAN CHARM";
                akhirKeputusan.setText(hasilakhir);
            }
            else{
                hasilakhir="GAGAL";
                akhirKeputusan.setText(hasilakhir);}
        }
        else if (fakultas2.getSelectedItem().equals("HISTORY OF MAGIC")) {
            labelsecondfaculty.setText("HISTORY OF MAGIC");
            akhirPilihan2.setText("HISTORY OF MAGIC");
            
            if ((hasilrapot>=74)&&(Integer.parseInt(Rsejarah.getText())>=85)){
                hasilakhir="LULUS DI JURUSAN HISTORY OF MAGIC";
                akhirKeputusan.setText(hasilakhir);
            }
            else{
                hasilakhir="GAGAL";
                akhirKeputusan.setText(hasilakhir);}
        }
        else if (fakultas2.getSelectedItem().equals("DEFENCE AGAINST THE DARK ARTS")) {
            labelsecondfaculty.setText("DEFENCE AGAINST THE DARK ARTS");
            akhirPilihan2.setText("DEFENCE AGAINST THE DARK ARTS");
            
            if ((hasilrapot>=84)){
                hasilakhir="LULUS DI JURUSAN DEFENCE AGAINST THE DARK ARTS";
                akhirKeputusan.setText(hasilakhir);
            }
            else{
                hasilakhir="GAGAL";
                akhirKeputusan.setText(hasilakhir);}
        }
        else if (fakultas2.getSelectedItem().equals("ARITHMANCY")) {
            labelsecondfaculty.setText("ARITHMANCY");
            akhirPilihan2.setText("ARITHMANCY");
            
            if ((hasilrapot>=76)&&(Integer.parseInt(Rmtk.getText())>=85)){
                hasilakhir="LULUS DI JURUSAN ARITHMANCY";
                akhirKeputusan.setText(hasilakhir);
            }
            else{
                hasilakhir="GAGAL";
                akhirKeputusan.setText(hasilakhir);}
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

        gender = new javax.swing.ButtonGroup();
        tahun = new javax.swing.ButtonGroup();
        grup1 = new javax.swing.ButtonGroup();
        grup2 = new javax.swing.ButtonGroup();
        grup3 = new javax.swing.ButtonGroup();
        grup4 = new javax.swing.ButtonGroup();
        musik = new javax.swing.ButtonGroup();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        menu = new javax.swing.JPanel();
        btnhome = new keeptoo.KButton();
        btnjurusan = new keeptoo.KButton();
        btnexit = new keeptoo.KButton();
        btnasrama = new keeptoo.KButton();
        btndaftar = new keeptoo.KButton();
        jLabel1 = new javax.swing.JLabel();
        labelnama = new javax.swing.JLabel();
        btnabout = new keeptoo.KButton();
        labelwaktu = new javax.swing.JLabel();
        isi = new javax.swing.JPanel();
        panelhome = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        gerak = new javax.swing.JLabel();
        isihome = new javax.swing.JPanel();
        aboutUniversity = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        alumniHogwarts = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        alumniGryffindor = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        alumniHufflepuff = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        alumniRavenclaw = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        alumniSlytherin = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        hapusIsiHome = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        paneldormitory = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        panelasrama = new javax.swing.JPanel();
        pembukaanasrama = new javax.swing.JPanel();
        Gryffindor = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        Slytherin = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        Ravenlaw = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextPane4 = new javax.swing.JTextPane();
        Hufflepuff = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        jLabel49 = new javax.swing.JLabel();
        panelAwalDaftar = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        kButton7 = new keeptoo.KButton();
        jLabel45 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        paneldaftarkuliah = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        Rname = new javax.swing.JTextField();
        Rbirth = new javax.swing.JTextField();
        Rschool = new javax.swing.JTextField();
        man = new javax.swing.JRadioButton();
        woman = new javax.swing.JRadioButton();
        Rbuttonsubmit = new keeptoo.KButton();
        jLabel32 = new javax.swing.JLabel();
        R2020 = new javax.swing.JRadioButton();
        R2019 = new javax.swing.JRadioButton();
        R2018 = new javax.swing.JRadioButton();
        R2017 = new javax.swing.JRadioButton();
        fakultas1 = new javax.swing.JComboBox<>();
        fakultas2 = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        Rmtk = new javax.swing.JTextField();
        Ripas = new javax.swing.JTextField();
        Rsejarah = new javax.swing.JTextField();
        Rseni = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelKebenaran = new javax.swing.JTable();
        jLabel27 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        Rid = new javax.swing.JTextField();
        paneldaftarkuliah2 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        labelname = new javax.swing.JLabel();
        labelbirth = new javax.swing.JLabel();
        labelfirstfaculty = new javax.swing.JLabel();
        labelsecondfaculty = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        labelschool = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        labelgraduate = new javax.swing.JLabel();
        labelgender = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        labelMtk = new javax.swing.JLabel();
        labelRipas = new javax.swing.JLabel();
        labelSejarah = new javax.swing.JLabel();
        labelSeni = new javax.swing.JLabel();
        kButton1 = new keeptoo.KButton();
        panelfakultas = new javax.swing.JPanel();
        kButton2 = new keeptoo.KButton();
        labelgambar = new javax.swing.JLabel();
        kButton6 = new keeptoo.KButton();
        jLabel31 = new javax.swing.JLabel();
        paneldaftarkuliah4 = new javax.swing.JPanel();
        pertanyaan1 = new javax.swing.JLabel();
        pertanyaan2 = new javax.swing.JLabel();
        pertanyaan3 = new javax.swing.JLabel();
        pertanyaan4 = new javax.swing.JLabel();
        memasak = new javax.swing.JRadioButton();
        menulis = new javax.swing.JRadioButton();
        berkebun = new javax.swing.JRadioButton();
        berpergian = new javax.swing.JRadioButton();
        kButton3 = new keeptoo.KButton();
        soto = new javax.swing.JRadioButton();
        buburayam = new javax.swing.JRadioButton();
        mieinstan = new javax.swing.JRadioButton();
        sate = new javax.swing.JRadioButton();
        audio = new javax.swing.JRadioButton();
        visual = new javax.swing.JRadioButton();
        audiovisual = new javax.swing.JRadioButton();
        praktik = new javax.swing.JRadioButton();
        semi = new javax.swing.JRadioButton();
        panas = new javax.swing.JRadioButton();
        gugur = new javax.swing.JRadioButton();
        dingin = new javax.swing.JRadioButton();
        panelLulus = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        akhirNama = new javax.swing.JLabel();
        akhirPilihan1 = new javax.swing.JLabel();
        akhirPilihan2 = new javax.swing.JLabel();
        akhirRata = new javax.swing.JLabel();
        akhirAsrama = new javax.swing.JLabel();
        akhirKeputusan = new javax.swing.JLabel();
        akhirGambar = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        kButton4 = new keeptoo.KButton();
        panelCetak = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        panelcetak = new javax.swing.JTextArea();
        kButton5 = new keeptoo.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel2.setkEndColor(new java.awt.Color(197, 168, 112));
        kGradientPanel2.setkStartColor(new java.awt.Color(247, 240, 215));
        kGradientPanel2.setkTransparentControls(false);
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setBackground(new java.awt.Color(119, 103, 44));
        menu.setAlignmentX(2.0F);
        menu.setAlignmentY(2.0F);
        menu.setAutoscrolls(true);
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnhome.setBackground(new java.awt.Color(0, 0, 0));
        btnhome.setForeground(new java.awt.Color(0, 0, 0));
        btnhome.setText("HOME");
        btnhome.setToolTipText("");
        btnhome.setDefaultCapable(false);
        btnhome.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnhome.setkBorderRadius(50);
        btnhome.setkEndColor(new java.awt.Color(247, 240, 215));
        btnhome.setkForeGround(new java.awt.Color(0, 0, 0));
        btnhome.setkHoverEndColor(new java.awt.Color(37, 88, 31));
        btnhome.setkHoverForeGround(new java.awt.Color(204, 204, 204));
        btnhome.setkHoverStartColor(new java.awt.Color(37, 88, 31));
        btnhome.setkIndicatorThickness(5);
        btnhome.setkSelectedColor(new java.awt.Color(0, 255, 255));
        btnhome.setkStartColor(new java.awt.Color(197, 168, 112));
        btnhome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnhomeMouseClicked(evt);
            }
        });
        btnhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhomeActionPerformed(evt);
            }
        });
        menu.add(btnhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 115, -1));

        btnjurusan.setBackground(new java.awt.Color(0, 0, 0));
        btnjurusan.setForeground(new java.awt.Color(0, 0, 0));
        btnjurusan.setText("JURUSAN");
        btnjurusan.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnjurusan.setkBorderRadius(50);
        btnjurusan.setkEndColor(new java.awt.Color(247, 240, 215));
        btnjurusan.setkForeGround(new java.awt.Color(0, 0, 0));
        btnjurusan.setkHoverEndColor(new java.awt.Color(37, 88, 31));
        btnjurusan.setkHoverForeGround(new java.awt.Color(204, 204, 204));
        btnjurusan.setkHoverStartColor(new java.awt.Color(37, 88, 31));
        btnjurusan.setkIndicatorThickness(5);
        btnjurusan.setkSelectedColor(new java.awt.Color(0, 255, 255));
        btnjurusan.setkStartColor(new java.awt.Color(197, 168, 112));
        btnjurusan.setOpaque(false);
        btnjurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnjurusanActionPerformed(evt);
            }
        });
        menu.add(btnjurusan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 115, -1));

        btnexit.setBackground(new java.awt.Color(0, 0, 0));
        btnexit.setForeground(new java.awt.Color(0, 0, 0));
        btnexit.setText("EXIT");
        btnexit.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnexit.setkBorderRadius(50);
        btnexit.setkEndColor(new java.awt.Color(247, 240, 215));
        btnexit.setkForeGround(new java.awt.Color(0, 0, 0));
        btnexit.setkHoverEndColor(new java.awt.Color(37, 88, 31));
        btnexit.setkHoverForeGround(new java.awt.Color(204, 204, 204));
        btnexit.setkHoverStartColor(new java.awt.Color(37, 88, 31));
        btnexit.setkIndicatorThickness(5);
        btnexit.setkSelectedColor(new java.awt.Color(0, 255, 255));
        btnexit.setkStartColor(new java.awt.Color(197, 168, 112));
        btnexit.setOpaque(false);
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        menu.add(btnexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 115, -1));

        btnasrama.setBackground(new java.awt.Color(0, 0, 0));
        btnasrama.setForeground(new java.awt.Color(0, 0, 0));
        btnasrama.setText("ASRAMA");
        btnasrama.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnasrama.setkBorderRadius(50);
        btnasrama.setkEndColor(new java.awt.Color(247, 240, 215));
        btnasrama.setkForeGround(new java.awt.Color(0, 0, 0));
        btnasrama.setkHoverEndColor(new java.awt.Color(37, 88, 31));
        btnasrama.setkHoverForeGround(new java.awt.Color(204, 204, 204));
        btnasrama.setkHoverStartColor(new java.awt.Color(37, 88, 31));
        btnasrama.setkIndicatorThickness(5);
        btnasrama.setkSelectedColor(new java.awt.Color(0, 255, 255));
        btnasrama.setkStartColor(new java.awt.Color(197, 168, 112));
        btnasrama.setOpaque(false);
        btnasrama.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnasramaMouseClicked(evt);
            }
        });
        btnasrama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnasramaActionPerformed(evt);
            }
        });
        menu.add(btnasrama, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 115, -1));

        btndaftar.setBackground(new java.awt.Color(0, 0, 0));
        btndaftar.setForeground(new java.awt.Color(0, 0, 0));
        btndaftar.setText("DAFTAR");
        btndaftar.setToolTipText("");
        btndaftar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btndaftar.setkBorderRadius(50);
        btndaftar.setkEndColor(new java.awt.Color(247, 240, 215));
        btndaftar.setkForeGround(new java.awt.Color(0, 0, 0));
        btndaftar.setkHoverEndColor(new java.awt.Color(37, 88, 31));
        btndaftar.setkHoverForeGround(new java.awt.Color(204, 204, 204));
        btndaftar.setkHoverStartColor(new java.awt.Color(37, 88, 31));
        btndaftar.setkIndicatorThickness(5);
        btndaftar.setkSelectedColor(new java.awt.Color(0, 255, 255));
        btndaftar.setkStartColor(new java.awt.Color(197, 168, 112));
        btndaftar.setOpaque(false);
        btndaftar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btndaftarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btndaftarMouseEntered(evt);
            }
        });
        btndaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndaftarActionPerformed(evt);
            }
        });
        menu.add(btndaftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 115, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/logo universitas (kecil).png"))); // NOI18N
        menu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        labelnama.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        labelnama.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/icon_user.png"))); // NOI18N
        labelnama.setText("nama");
        menu.add(labelnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, -1));

        btnabout.setBackground(new java.awt.Color(0, 0, 0));
        btnabout.setForeground(new java.awt.Color(0, 0, 0));
        btnabout.setText("ABOUT");
        btnabout.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnabout.setkBorderRadius(50);
        btnabout.setkEndColor(new java.awt.Color(247, 240, 215));
        btnabout.setkForeGround(new java.awt.Color(0, 0, 0));
        btnabout.setkHoverEndColor(new java.awt.Color(37, 88, 31));
        btnabout.setkHoverForeGround(new java.awt.Color(204, 204, 204));
        btnabout.setkHoverStartColor(new java.awt.Color(37, 88, 31));
        btnabout.setkIndicatorThickness(5);
        btnabout.setkSelectedColor(new java.awt.Color(0, 255, 255));
        btnabout.setkStartColor(new java.awt.Color(197, 168, 112));
        btnabout.setOpaque(false);
        btnabout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnaboutMouseClicked(evt);
            }
        });
        btnabout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaboutActionPerformed(evt);
            }
        });
        menu.add(btnabout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 115, -1));

        labelwaktu.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        labelwaktu.setText("waktu");
        menu.add(labelwaktu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 10));

        kGradientPanel2.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 490));

        isi.setOpaque(false);
        isi.setLayout(new java.awt.CardLayout());

        panelhome.setOpaque(false);
        panelhome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Group -1.png"))); // NOI18N
        jLabel28.setToolTipText("");
        jLabel28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });
        panelhome.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, -1, -1));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Group -3.png"))); // NOI18N
        jLabel30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel30MouseEntered(evt);
            }
        });
        panelhome.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, -1, 50));

        gerak.setBackground(new java.awt.Color(0, 0, 0));
        gerak.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        gerak.setForeground(new java.awt.Color(255, 255, 255));
        gerak.setText("           HOGWART  UNIVERSITY  OF  PONTIANAK  ");
        gerak.setOpaque(true);
        panelhome.add(gerak, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 480, -1));

        isihome.setBackground(new java.awt.Color(119, 103, 44));
        isihome.setOpaque(false);
        isihome.setLayout(new java.awt.CardLayout());

        aboutUniversity.setBackground(new java.awt.Color(114, 103, 44));
        aboutUniversity.setOpaque(false);
        aboutUniversity.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Group 567.png"))); // NOI18N
        aboutUniversity.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        isihome.add(aboutUniversity, "card2");

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Griffindor.png"))); // NOI18N
        jLabel25.setToolTipText("");
        jLabel25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Ravenclaw.png"))); // NOI18N
        jLabel29.setToolTipText("");
        jLabel29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, -1));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Hufflepuff.png"))); // NOI18N
        jLabel35.setToolTipText("");
        jLabel35.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel35MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Slytherin.png"))); // NOI18N
        jLabel36.setToolTipText("");
        jLabel36.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel36MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, -1, -1));

        alumniHogwarts.setOpaque(false);
        alumniHogwarts.setLayout(new java.awt.CardLayout());
        alumniHogwarts.add(jLabel54, "card6");

        alumniGryffindor.setOpaque(false);
        alumniGryffindor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Group 570.png"))); // NOI18N
        alumniGryffindor.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        alumniHogwarts.add(alumniGryffindor, "card5");

        alumniHufflepuff.setOpaque(false);
        alumniHufflepuff.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Group 568.png"))); // NOI18N
        alumniHufflepuff.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, -1));

        alumniHogwarts.add(alumniHufflepuff, "card4");

        alumniRavenclaw.setOpaque(false);
        alumniRavenclaw.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Group 571.png"))); // NOI18N
        alumniRavenclaw.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        alumniHogwarts.add(alumniRavenclaw, "card3");

        alumniSlytherin.setOpaque(false);
        alumniSlytherin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Group 569.png"))); // NOI18N
        alumniSlytherin.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        alumniHogwarts.add(alumniSlytherin, "card2");

        jPanel3.add(alumniHogwarts, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 350, 410));

        isihome.add(jPanel3, "card4");

        hapusIsiHome.setBackground(new java.awt.Color(119, 103, 44));
        hapusIsiHome.setOpaque(false);

        javax.swing.GroupLayout hapusIsiHomeLayout = new javax.swing.GroupLayout(hapusIsiHome);
        hapusIsiHome.setLayout(hapusIsiHomeLayout);
        hapusIsiHomeLayout.setHorizontalGroup(
            hapusIsiHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );
        hapusIsiHomeLayout.setVerticalGroup(
            hapusIsiHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        isihome.add(hapusIsiHome, "card5");

        panelhome.add(isihome, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 450, 410));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/logo universitas.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        panelhome.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, -1));

        isi.add(panelhome, "card3");

        paneldormitory.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FACULTY IN HOGWARTS UNIVERSITY", javax.swing.border.TitledBorder.TRAILING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        paneldormitory.setOpaque(false);
        paneldormitory.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Griffindor.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        paneldormitory.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Hufflepuff.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        paneldormitory.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Ravenclaw.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        paneldormitory.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Slytherin.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        paneldormitory.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, -1, -1));

        panelasrama.setOpaque(false);
        panelasrama.setLayout(new java.awt.CardLayout());

        pembukaanasrama.setOpaque(false);

        javax.swing.GroupLayout pembukaanasramaLayout = new javax.swing.GroupLayout(pembukaanasrama);
        pembukaanasrama.setLayout(pembukaanasramaLayout);
        pembukaanasramaLayout.setHorizontalGroup(
            pembukaanasramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        pembukaanasramaLayout.setVerticalGroup(
            pembukaanasramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        panelasrama.add(pembukaanasrama, "card6");

        Gryffindor.setOpaque(false);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/CGryffindor.png"))); // NOI18N

        jTextPane1.setEditable(false);
        jTextPane1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jTextPane1.setText("Gryffindor menghargai keberanian, keberanian, keberanian, dan ksatria. Hewan lambangnya adalah singa dan warnanya merah dan emas. Minerva McGonagall adalah Kepala Gryffindor terbaru. Sir Nicholas de Mimsy-Porpington, juga dikenal sebagai \"Nick Tanpa Kepala Tanpa Kepala\", adalah hantu rumah. Pendiri rumah itu adalah Godric Gryffindor. Gryffindor sesuai dengan elemen Api. Ruang bersama terletak di salah satu menara tertinggi di Hogwarts, pintu masuknya terletak di lantai tujuh di sayap timur kastil dan dijaga oleh potret The Fat Lady. Dia mengizinkan masuk jika diberi kata sandi yang benar, yang diubah berkali-kali sepanjang tahun sekolah. Gryffindor terkenal termasuk Albus Dumbledore, Harry Potter, dan Minerva McGonagall.");
        jScrollPane1.setViewportView(jTextPane1);

        javax.swing.GroupLayout GryffindorLayout = new javax.swing.GroupLayout(Gryffindor);
        Gryffindor.setLayout(GryffindorLayout);
        GryffindorLayout.setHorizontalGroup(
            GryffindorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GryffindorLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                .addContainerGap())
        );
        GryffindorLayout.setVerticalGroup(
            GryffindorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GryffindorLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(GryffindorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE))
        );

        panelasrama.add(Gryffindor, "card3");

        Slytherin.setOpaque(false);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/CSlytherin.png"))); // NOI18N

        jTextPane2.setEditable(false);
        jTextPane2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jTextPane2.setText("Rumah Slytherin menghargai ambisi, kelicikan dan kecerdikan dan didirikan oleh Salazar Slytherin. Hewan lambangnya adalah ular, dan warnanya hijau zamrud dan perak. Profesor Horace Slughorn adalah Kepala Slytherin selama tahun ajaran 1997-1998, menggantikan Severus Snape, yang juga menggantikan Slughorn sebagai Profesor Ramuan ketika dia pensiun untuk pertama kalinya beberapa tahun sebelumnya. The Bloody Baron adalah hantu rumah. Pendiri rumah adalah Salazar Slytherin. Slytherin kira-kira sesuai dengan unsur air. Asrama Slytherin dan ruang bersama dicapai melalui dinding batu kosong di Dungeons. Ruang bersama Slytherin terletak di bawah Danau Hitam. Ini adalah ruang bawah tanah yang panjang dan rendah dengan dinding batu kasar dan lampu perak yang tergantung di langit-langit. Slytherins yang terkenal termasuk Merlin, Tom Riddle, dan Dolores Umbridge.");
        jScrollPane5.setViewportView(jTextPane2);

        javax.swing.GroupLayout SlytherinLayout = new javax.swing.GroupLayout(Slytherin);
        Slytherin.setLayout(SlytherinLayout);
        SlytherinLayout.setHorizontalGroup(
            SlytherinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SlytherinLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                .addContainerGap())
        );
        SlytherinLayout.setVerticalGroup(
            SlytherinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SlytherinLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SlytherinLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelasrama.add(Slytherin, "card4");

        Ravenlaw.setOpaque(false);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/CRavenclaw.png"))); // NOI18N

        jTextPane4.setEditable(false);
        jTextPane4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jTextPane4.setText("Ravenclaw menghargai kecerdasan, pengetahuan, dan kecerdasan. Hewan lambangnya adalah elang, dan warnanya biru dan perunggu. Kepala Rumah Ravenclaw pada 1990-an adalah Filius Flitwick. Hantu Ravenclaw adalah Grey Lady, yang merupakan putri Rowena Ravenclaw, pendiri rumah. Ravenclaw sesuai dengan elemen udara. Ruang bersama dan asrama Ravenclaw terletak di sebuah menara di sisi barat kastil. Siswa Ravenclaw harus menjawab teka-teki alih-alih memberikan kata sandi untuk memasuki asrama mereka. Teka-teki ini, bagaimanapun, dapat dijawab oleh non-Ravenclaws. Ravenclaws yang terkenal termasuk Gilderoy Lockheart, Ignatia Wildsmith (penemu bubuk Floo), dan Garrick Ollivander. Dikabarkan bahwa Alastor \"Mad-Eye\" Moody adalah Ravenclaw.");
        jTextPane4.setToolTipText("");
        jScrollPane6.setViewportView(jTextPane4);

        javax.swing.GroupLayout RavenlawLayout = new javax.swing.GroupLayout(Ravenlaw);
        Ravenlaw.setLayout(RavenlawLayout);
        RavenlawLayout.setHorizontalGroup(
            RavenlawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RavenlawLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                .addContainerGap())
        );
        RavenlawLayout.setVerticalGroup(
            RavenlawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RavenlawLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(RavenlawLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelasrama.add(Ravenlaw, "card5");

        Hufflepuff.setName(""); // NOI18N
        Hufflepuff.setOpaque(false);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/CHufflepuff.png"))); // NOI18N

        jTextPane3.setEditable(false);
        jTextPane3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jTextPane3.setText(" Hufflepuff adalah salah satu dari empat Rumah Sekolah Sihir dan Hogwarts. Pendirinya adalah penyihir abad pertengahan Helga Hufflepuff. Hufflepuff adalah yang paling inklusif di antara empat rumah; menghargai kerja keras, dedikasi, kesabaran, kesetiaan, dan permainan yang adil daripada bakat khusus dalam anggotanya. Hewan lambang adalah musang, dan kuning dan hitam adalah warnanya. Kepala Hufflepuff adalah Pomona Sprout dan Fat Friar adalah hantu pelindung House. Hufflepuff berkorespondensi secara kasar dengan unsur bumi, [5] dan karena alasan itulah warna House dipilih: kuning mewakili gandum, sedangkan hitam melambangkan tanah. [6] Jam pasir titik Hufflepuff berisi berlian kuning. [7] Siswa yang disortir menjadi Hufflepuff sering menunjukkan kemampuan luar biasa dalam Herbologi, karena korespondensi mereka dengan bumi.");
        jScrollPane2.setViewportView(jTextPane3);

        javax.swing.GroupLayout HufflepuffLayout = new javax.swing.GroupLayout(Hufflepuff);
        Hufflepuff.setLayout(HufflepuffLayout);
        HufflepuffLayout.setHorizontalGroup(
            HufflepuffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HufflepuffLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                .addContainerGap())
        );
        HufflepuffLayout.setVerticalGroup(
            HufflepuffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HufflepuffLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(HufflepuffLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelasrama.add(Hufflepuff, "card2");

        paneldormitory.add(panelasrama, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 550, 360));

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/logo universitas.png"))); // NOI18N
        jLabel49.setText("jLabel49");
        jLabel49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel49MouseClicked(evt);
            }
        });
        paneldormitory.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, -1, -1));

        isi.add(paneldormitory, "card2");

        panelAwalDaftar.setOpaque(false);
        panelAwalDaftar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Harry P", 0, 24)); // NOI18N
        jLabel20.setText("MASUKAN ID ANDA");
        panelAwalDaftar.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 180, -1));

        search.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });
        panelAwalDaftar.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 330, 40));

        kButton7.setText("SELANJUTNYA");
        kButton7.setFont(new java.awt.Font("Harry P", 0, 14)); // NOI18N
        kButton7.setkEndColor(new java.awt.Color(119, 103, 44));
        kButton7.setkHoverEndColor(new java.awt.Color(119, 103, 44));
        kButton7.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton7.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        kButton7.setkStartColor(new java.awt.Color(119, 103, 44));
        kButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton7ActionPerformed(evt);
            }
        });
        panelAwalDaftar.add(kButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 190, -1));

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/sorting hat.png"))); // NOI18N
        panelAwalDaftar.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, -1));

        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/sorting hat.png"))); // NOI18N
        panelAwalDaftar.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, -1, -1));

        jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/sorting hat.png"))); // NOI18N
        panelAwalDaftar.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/sorting hat.png"))); // NOI18N
        panelAwalDaftar.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, -1, -1));

        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/sorting hat.png"))); // NOI18N
        panelAwalDaftar.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/sorting hat.png"))); // NOI18N
        panelAwalDaftar.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, -1, -1));

        isi.add(panelAwalDaftar, "card10");

        paneldaftarkuliah.setBackground(new java.awt.Color(197, 168, 112));
        paneldaftarkuliah.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REGISTER", javax.swing.border.TitledBorder.TRAILING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        paneldaftarkuliah.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel11.setText("NAMA");
        paneldaftarkuliah.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel12.setText("LAHIR");
        paneldaftarkuliah.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel13.setText("ASAL SEKOLAH");
        paneldaftarkuliah.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel14.setText("LULUS");
        paneldaftarkuliah.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));
        paneldaftarkuliah.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 157, -1, -1));

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel16.setText("JENIS KELAMIN");
        paneldaftarkuliah.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel17.setText("PILIHAN PERTAMA");
        paneldaftarkuliah.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel18.setText("JURUSAN");
        paneldaftarkuliah.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, -1));

        jLabel21.setBackground(new java.awt.Color(0, 0, 0));
        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel21.setText("PILIHAN KEDUA");
        paneldaftarkuliah.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel22.setText("JURUSAN");
        paneldaftarkuliah.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, -1, -1));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/REGISTER BLACK.png"))); // NOI18N
        paneldaftarkuliah.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        Rname.setEnabled(false);
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
        paneldaftarkuliah.add(Rname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 270, -1));

        Rbirth.setEnabled(false);
        Rbirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbirthActionPerformed(evt);
            }
        });
        paneldaftarkuliah.add(Rbirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 270, -1));

        Rschool.setEnabled(false);
        paneldaftarkuliah.add(Rschool, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 270, -1));

        gender.add(man);
        man.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        man.setSelected(true);
        man.setText("MAN");
        man.setOpaque(false);
        paneldaftarkuliah.add(man, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        gender.add(woman);
        woman.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        woman.setText("WOMAN");
        woman.setOpaque(false);
        woman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                womanActionPerformed(evt);
            }
        });
        paneldaftarkuliah.add(woman, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, -1, -1));

        Rbuttonsubmit.setText("SUBMIT");
        Rbuttonsubmit.setFocusable(false);
        Rbuttonsubmit.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Rbuttonsubmit.setkBorderRadius(50);
        Rbuttonsubmit.setkForeGround(new java.awt.Color(0, 0, 0));
        Rbuttonsubmit.setkStartColor(new java.awt.Color(254, 169, 1));
        Rbuttonsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbuttonsubmitActionPerformed(evt);
            }
        });
        paneldaftarkuliah.add(Rbuttonsubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, 80, 30));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/sorting hat.png"))); // NOI18N
        paneldaftarkuliah.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, -1, -1));

        tahun.add(R2020);
        R2020.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        R2020.setSelected(true);
        R2020.setText("2020");
        R2020.setToolTipText("");
        R2020.setOpaque(false);
        paneldaftarkuliah.add(R2020, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 60, 20));

        tahun.add(R2019);
        R2019.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        R2019.setText("2019");
        R2019.setToolTipText("");
        R2019.setOpaque(false);
        paneldaftarkuliah.add(R2019, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 60, 20));

        tahun.add(R2018);
        R2018.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        R2018.setText("2018");
        R2018.setToolTipText("");
        R2018.setOpaque(false);
        paneldaftarkuliah.add(R2018, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 60, 20));

        tahun.add(R2017);
        R2017.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        R2017.setText("2017");
        R2017.setToolTipText("");
        R2017.setOpaque(false);
        paneldaftarkuliah.add(R2017, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 60, 20));

        fakultas1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        fakultas1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PILIHAN PERTAMA", "POTION", "DIVINATION", "CHARM", "HISTORY OF MAGIC", "DEFENCE AGAINST THE DARK ARTS", "ARITHMANCY" }));
        fakultas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fakultas1ActionPerformed(evt);
            }
        });
        paneldaftarkuliah.add(fakultas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 270, -1));

        fakultas2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        fakultas2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PILIHAN KEDUA", "POTION", "DIVINATION", "CHARM", "HISTORY OF MAGIC", "DEFENCE AGAINST THE DARK ARTS", "ARITHMANCY" }));
        fakultas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fakultas2ActionPerformed(evt);
            }
        });
        paneldaftarkuliah.add(fakultas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 270, -1));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel19.setText("NILAI RAPOR (RATA-RATA SEMESTER 1-5)");
        paneldaftarkuliah.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, 20));

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel23.setText("MATEMATIKA");
        paneldaftarkuliah.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, -1, 20));

        jLabel56.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel56.setText("PELAJARAN SAINTEK/SOSHUM");
        paneldaftarkuliah.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, -1, 20));

        jLabel57.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel57.setText("SEJARAH INDONESIA");
        paneldaftarkuliah.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, -1, 20));

        jLabel58.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel58.setText("SENI");
        paneldaftarkuliah.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, -1, 20));

        Rmtk.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        Rmtk.setToolTipText("");
        Rmtk.setEnabled(false);
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
        paneldaftarkuliah.add(Rmtk, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 90, 20));

        Ripas.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        Ripas.setToolTipText("");
        Ripas.setEnabled(false);
        Ripas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RipasKeyTyped(evt);
            }
        });
        paneldaftarkuliah.add(Ripas, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 90, -1));

        Rsejarah.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        Rsejarah.setToolTipText("");
        Rsejarah.setEnabled(false);
        Rsejarah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RsejarahKeyTyped(evt);
            }
        });
        paneldaftarkuliah.add(Rsejarah, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 90, -1));

        Rseni.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        Rseni.setToolTipText("");
        Rseni.setEnabled(false);
        Rseni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RseniKeyTyped(evt);
            }
        });
        paneldaftarkuliah.add(Rseni, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, 90, -1));

        jLabel59.setText("(0-100)");
        paneldaftarkuliah.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, -1, -1));

        jLabel60.setText("(0-100)");
        paneldaftarkuliah.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 420, -1, -1));

        jLabel61.setText("(0-100)");
        paneldaftarkuliah.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, -1, -1));

        jLabel62.setText("(0-100)");
        paneldaftarkuliah.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 460, -1, -1));

        tabelKebenaran.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAMA", "LAHIR", "SEKOLAH", "MTK", "IPAS", "SEJARAH", "SENI"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelKebenaran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelKebenaranMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tabelKebenaran);

        paneldaftarkuliah.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 530, 50));

        jLabel27.setText("(Tekan ID anda terlebih dahulu)");
        paneldaftarkuliah.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 10));

        jLabel77.setText("(JIKA TABEL KOSONG ID ANDA SALAH, SILAKAN KEMBALI)");
        paneldaftarkuliah.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, 20));

        jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/back.png"))); // NOI18N
        jLabel78.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel78MouseClicked(evt);
            }
        });
        paneldaftarkuliah.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel79.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel79.setText("ID");
        paneldaftarkuliah.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        Rid.setEnabled(false);
        paneldaftarkuliah.add(Rid, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 270, -1));

        isi.add(paneldaftarkuliah, "card4");

        paneldaftarkuliah2.setBackground(new java.awt.Color(197, 168, 112));
        paneldaftarkuliah2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel34.setText("NAMA");
        paneldaftarkuliah2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel38.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel38.setText("LAHIR");
        paneldaftarkuliah2.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel39.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel39.setText("PILIHAN PERTAMA");
        paneldaftarkuliah2.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel40.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel40.setText("JURUSAN");
        paneldaftarkuliah2.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel42.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel42.setText("PILIHAN KEDUA");
        paneldaftarkuliah2.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel43.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel43.setText("JURUSAN");
        paneldaftarkuliah2.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        labelname.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        labelname.setText("nama");
        labelname.setFocusCycleRoot(true);
        labelname.setFocusTraversalPolicyProvider(true);
        paneldaftarkuliah2.add(labelname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, -1, -1));

        labelbirth.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        labelbirth.setText("waktu lahir");
        paneldaftarkuliah2.add(labelbirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, -1));

        labelfirstfaculty.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        labelfirstfaculty.setText("jLabel49");
        paneldaftarkuliah2.add(labelfirstfaculty, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, -1));

        labelsecondfaculty.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        labelsecondfaculty.setText("jLabel52");
        paneldaftarkuliah2.add(labelsecondfaculty, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, -1));

        jLabel46.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel46.setText("ASAL SEKOLAH");
        paneldaftarkuliah2.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        labelschool.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        labelschool.setText("sekolah");
        paneldaftarkuliah2.add(labelschool, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        jLabel47.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel47.setText("JENIS KELAMIN");
        paneldaftarkuliah2.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel48.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel48.setText("LULUS");
        paneldaftarkuliah2.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        labelgraduate.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        labelgraduate.setText("kapan lulus?");
        paneldaftarkuliah2.add(labelgraduate, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, -1));

        labelgender.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        labelgender.setText("cewek atau cowok");
        paneldaftarkuliah2.add(labelgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/sorting hat.png"))); // NOI18N
        paneldaftarkuliah2.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, -1));

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/MINISTRY OF MAGICPONTIANAK.png"))); // NOI18N
        paneldaftarkuliah2.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        paneldaftarkuliah2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 550, 10));

        jLabel63.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel63.setText("NILAI RAPOR");
        jLabel63.setToolTipText("");
        paneldaftarkuliah2.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        jLabel64.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel64.setText("MATEMATIKA");
        paneldaftarkuliah2.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jLabel65.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel65.setText("PELAJARAN SAINTEK/SOSHUM");
        paneldaftarkuliah2.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jLabel66.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel66.setText("SEJARAH INDONESIA");
        paneldaftarkuliah2.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        jLabel67.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel67.setText("SENI");
        paneldaftarkuliah2.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        labelMtk.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        labelMtk.setText("jLabel68");
        paneldaftarkuliah2.add(labelMtk, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, -1, -1));

        labelRipas.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        labelRipas.setText("jLabel69");
        paneldaftarkuliah2.add(labelRipas, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, -1, -1));

        labelSejarah.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        labelSejarah.setText("jLabel70");
        paneldaftarkuliah2.add(labelSejarah, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, -1, -1));

        labelSeni.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        labelSeni.setText("jLabel71");
        paneldaftarkuliah2.add(labelSeni, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, -1, -1));

        kButton1.setText("NEXT");
        kButton1.setFont(new java.awt.Font("Harry P", 0, 14)); // NOI18N
        kButton1.setkEndColor(new java.awt.Color(119, 103, 44));
        kButton1.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton1.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton1.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        kButton1.setkPressedColor(new java.awt.Color(0, 0, 0));
        kButton1.setkStartColor(new java.awt.Color(119, 103, 44));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        paneldaftarkuliah2.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, 80, 40));

        isi.add(paneldaftarkuliah2, "card7");

        panelfakultas.setBackground(new java.awt.Color(197, 168, 112));
        panelfakultas.setLayout(null);

        kButton2.setText("SUBMIT");
        kButton2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        kButton2.setkEndColor(new java.awt.Color(119, 103, 44));
        kButton2.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton2.setkHoverEndColor(new java.awt.Color(247, 240, 215));
        kButton2.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton2.setkHoverStartColor(new java.awt.Color(247, 240, 215));
        kButton2.setkPressedColor(new java.awt.Color(37, 88, 31));
        kButton2.setkSelectedColor(new java.awt.Color(247, 240, 215));
        kButton2.setkStartColor(new java.awt.Color(119, 103, 44));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });
        panelfakultas.add(kButton2);
        kButton2.setBounds(420, 360, 93, 45);

        labelgambar.setForeground(new java.awt.Color(255, 255, 255));
        labelgambar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelgambar.setText("foto calon mahastudent");
        labelgambar.setToolTipText("");
        labelgambar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        panelfakultas.add(labelgambar);
        labelgambar.setBounds(220, 160, 120, 150);

        kButton6.setText("NEXT");
        kButton6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        kButton6.setkEndColor(new java.awt.Color(119, 103, 44));
        kButton6.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton6.setkHoverEndColor(new java.awt.Color(247, 240, 215));
        kButton6.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton6.setkHoverStartColor(new java.awt.Color(247, 240, 215));
        kButton6.setkPressedColor(new java.awt.Color(37, 88, 31));
        kButton6.setkSelectedColor(new java.awt.Color(247, 240, 215));
        kButton6.setkStartColor(new java.awt.Color(119, 103, 44));
        kButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton6ActionPerformed(evt);
            }
        });
        panelfakultas.add(kButton6);
        kButton6.setBounds(420, 420, 93, 45);

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/logo universitas.png"))); // NOI18N
        panelfakultas.add(jLabel31);
        jLabel31.setBounds(0, -20, 640, 630);

        isi.add(panelfakultas, "card8");

        paneldaftarkuliah4.setBackground(new java.awt.Color(197, 168, 112));
        paneldaftarkuliah4.setLayout(null);

        pertanyaan1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pertanyaan1.setText("HAL APA YANG LEBIH KAMU SUKAI");
        paneldaftarkuliah4.add(pertanyaan1);
        pertanyaan1.setBounds(30, 40, 390, 17);

        pertanyaan2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pertanyaan2.setText("MAKANAN APA YANG KAMU SUKAI");
        paneldaftarkuliah4.add(pertanyaan2);
        pertanyaan2.setBounds(30, 120, 250, 17);

        pertanyaan3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pertanyaan3.setText("CARA BELAJAR YANG DISUKAI");
        paneldaftarkuliah4.add(pertanyaan3);
        pertanyaan3.setBounds(30, 200, 300, 17);

        pertanyaan4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pertanyaan4.setText("MUSIM MANA YANG KAMU SUKAI");
        paneldaftarkuliah4.add(pertanyaan4);
        pertanyaan4.setBounds(30, 290, 260, 17);

        grup1.add(memasak);
        memasak.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        memasak.setSelected(true);
        memasak.setText("MEMASAK");
        memasak.setOpaque(false);
        memasak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memasakActionPerformed(evt);
            }
        });
        paneldaftarkuliah4.add(memasak);
        memasak.setBounds(30, 70, 110, 23);

        grup1.add(menulis);
        menulis.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        menulis.setText("MENULIS");
        menulis.setOpaque(false);
        menulis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menulisActionPerformed(evt);
            }
        });
        paneldaftarkuliah4.add(menulis);
        menulis.setBounds(150, 70, 100, 23);

        grup1.add(berkebun);
        berkebun.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        berkebun.setText("BERKEBUN");
        berkebun.setOpaque(false);
        berkebun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                berkebunActionPerformed(evt);
            }
        });
        paneldaftarkuliah4.add(berkebun);
        berkebun.setBounds(260, 70, 110, 23);

        grup1.add(berpergian);
        berpergian.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        berpergian.setText("BERPERGIAN");
        berpergian.setOpaque(false);
        berpergian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                berpergianActionPerformed(evt);
            }
        });
        paneldaftarkuliah4.add(berpergian);
        berpergian.setBounds(370, 70, 120, 23);

        kButton3.setText("SUBMIT");
        kButton3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        kButton3.setkEndColor(new java.awt.Color(119, 103, 44));
        kButton3.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton3.setkHoverEndColor(new java.awt.Color(247, 240, 215));
        kButton3.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton3.setkHoverStartColor(new java.awt.Color(247, 240, 215));
        kButton3.setkPressedColor(new java.awt.Color(37, 88, 31));
        kButton3.setkSelectedColor(new java.awt.Color(247, 240, 215));
        kButton3.setkStartColor(new java.awt.Color(119, 103, 44));
        kButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton3ActionPerformed(evt);
            }
        });
        paneldaftarkuliah4.add(kButton3);
        kButton3.setBounds(420, 420, 93, 45);

        grup2.add(soto);
        soto.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        soto.setSelected(true);
        soto.setText("SOTO");
        soto.setOpaque(false);
        soto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sotoActionPerformed(evt);
            }
        });
        paneldaftarkuliah4.add(soto);
        soto.setBounds(30, 150, 90, 23);

        grup2.add(buburayam);
        buburayam.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        buburayam.setText("BUBUR AYAM");
        buburayam.setOpaque(false);
        buburayam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buburayamActionPerformed(evt);
            }
        });
        paneldaftarkuliah4.add(buburayam);
        buburayam.setBounds(150, 150, 120, 23);

        grup2.add(mieinstan);
        mieinstan.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        mieinstan.setText("MIE INSTAN");
        mieinstan.setOpaque(false);
        mieinstan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mieinstanActionPerformed(evt);
            }
        });
        paneldaftarkuliah4.add(mieinstan);
        mieinstan.setBounds(270, 150, 120, 23);

        grup2.add(sate);
        sate.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        sate.setText("SATE");
        sate.setOpaque(false);
        sate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sateActionPerformed(evt);
            }
        });
        paneldaftarkuliah4.add(sate);
        sate.setBounds(390, 150, 80, 23);

        grup3.add(audio);
        audio.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        audio.setSelected(true);
        audio.setText("AUDIO");
        audio.setOpaque(false);
        audio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                audioActionPerformed(evt);
            }
        });
        paneldaftarkuliah4.add(audio);
        audio.setBounds(30, 240, 90, 23);

        grup3.add(visual);
        visual.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        visual.setText("VISUAL");
        visual.setOpaque(false);
        visual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualActionPerformed(evt);
            }
        });
        paneldaftarkuliah4.add(visual);
        visual.setBounds(150, 240, 90, 23);

        grup3.add(audiovisual);
        audiovisual.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        audiovisual.setText("AUDIO VISUAL");
        audiovisual.setOpaque(false);
        audiovisual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                audiovisualActionPerformed(evt);
            }
        });
        paneldaftarkuliah4.add(audiovisual);
        audiovisual.setBounds(250, 240, 130, 23);

        grup3.add(praktik);
        praktik.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        praktik.setText("PRAKTIK");
        praktik.setOpaque(false);
        praktik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                praktikActionPerformed(evt);
            }
        });
        paneldaftarkuliah4.add(praktik);
        praktik.setBounds(390, 240, 100, 23);

        grup4.add(semi);
        semi.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        semi.setSelected(true);
        semi.setText("SEMI");
        semi.setOpaque(false);
        semi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semiActionPerformed(evt);
            }
        });
        paneldaftarkuliah4.add(semi);
        semi.setBounds(30, 330, 80, 23);

        grup4.add(panas);
        panas.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        panas.setText("PANAS");
        panas.setOpaque(false);
        panas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panasActionPerformed(evt);
            }
        });
        paneldaftarkuliah4.add(panas);
        panas.setBounds(150, 330, 90, 23);

        grup4.add(gugur);
        gugur.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        gugur.setText("GUGUR");
        gugur.setOpaque(false);
        gugur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gugurActionPerformed(evt);
            }
        });
        paneldaftarkuliah4.add(gugur);
        gugur.setBounds(270, 330, 90, 23);

        grup4.add(dingin);
        dingin.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        dingin.setText("DINGIN");
        dingin.setOpaque(false);
        dingin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dinginActionPerformed(evt);
            }
        });
        paneldaftarkuliah4.add(dingin);
        dingin.setBounds(400, 330, 90, 23);

        isi.add(paneldaftarkuliah4, "card9");

        panelLulus.setBackground(new java.awt.Color(197, 168, 112));
        panelLulus.setLayout(null);

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/MINISTRY OF MAGICPONTIANAK.png"))); // NOI18N
        panelLulus.add(jLabel41);
        jLabel41.setBounds(170, 0, 150, 100);

        jLabel44.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel44.setText("NAMA");
        panelLulus.add(jLabel44);
        jLabel44.setBounds(140, 140, 90, 15);

        jLabel72.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel72.setText("PILIHAN PERTAMA");
        panelLulus.add(jLabel72);
        jLabel72.setBounds(140, 170, 150, 15);

        jLabel73.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel73.setText("PILIHAN KEDUA");
        panelLulus.add(jLabel73);
        jLabel73.setBounds(140, 200, 130, 15);

        jLabel75.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel75.setText("RATA-RATA NILAI RAPOT");
        panelLulus.add(jLabel75);
        jLabel75.setBounds(140, 230, 150, 15);

        jLabel76.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel76.setText("DITERIMA DI ASRAMA ");
        panelLulus.add(jLabel76);
        jLabel76.setBounds(140, 290, 140, 15);

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel26.setText("ANDA DINYATAKAN");
        panelLulus.add(jLabel26);
        jLabel26.setBounds(140, 260, 130, 15);

        akhirNama.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        akhirNama.setText("jLabel77");
        panelLulus.add(akhirNama);
        akhirNama.setBounds(300, 140, 240, 15);

        akhirPilihan1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        akhirPilihan1.setText("jLabel78");
        panelLulus.add(akhirPilihan1);
        akhirPilihan1.setBounds(300, 170, 240, 15);

        akhirPilihan2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        akhirPilihan2.setText("jLabel79");
        panelLulus.add(akhirPilihan2);
        akhirPilihan2.setBounds(300, 200, 240, 15);

        akhirRata.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        akhirRata.setText("jLabel81");
        panelLulus.add(akhirRata);
        akhirRata.setBounds(300, 230, 240, 15);

        akhirAsrama.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        akhirAsrama.setText("jLabel82");
        panelLulus.add(akhirAsrama);
        akhirAsrama.setBounds(300, 290, 240, 15);

        akhirKeputusan.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        akhirKeputusan.setText("jLabel83");
        panelLulus.add(akhirKeputusan);
        akhirKeputusan.setBounds(300, 260, 240, 15);

        akhirGambar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        akhirGambar.setText("foto calon mahastudent");
        akhirGambar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelLulus.add(akhirGambar);
        akhirGambar.setBounds(10, 110, 120, 150);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setToolTipText("");
        panelLulus.add(jSeparator2);
        jSeparator2.setBounds(0, 82, 550, 10);

        kButton4.setText("NEXT");
        kButton4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        kButton4.setkEndColor(new java.awt.Color(119, 103, 44));
        kButton4.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton4.setkHoverEndColor(new java.awt.Color(247, 240, 215));
        kButton4.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton4.setkHoverStartColor(new java.awt.Color(247, 240, 215));
        kButton4.setkPressedColor(new java.awt.Color(37, 88, 31));
        kButton4.setkSelectedColor(new java.awt.Color(247, 240, 215));
        kButton4.setkStartColor(new java.awt.Color(119, 103, 44));
        kButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton4ActionPerformed(evt);
            }
        });
        panelLulus.add(kButton4);
        kButton4.setBounds(420, 420, 93, 45);

        isi.add(panelLulus, "card5");

        panelCetak.setBackground(new java.awt.Color(197, 168, 112));
        panelCetak.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelcetak.setEditable(false);
        panelcetak.setBackground(new java.awt.Color(197, 168, 112));
        panelcetak.setColumns(20);
        panelcetak.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        panelcetak.setLineWrap(true);
        panelcetak.setRows(5);
        panelcetak.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "HASIL ANDA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jScrollPane3.setViewportView(panelcetak);

        panelCetak.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 530, 410));

        kButton5.setText("CETAK");
        kButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton5ActionPerformed(evt);
            }
        });
        panelCetak.add(kButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 435, 90, 40));

        isi.add(panelCetak, "card6");

        kGradientPanel2.add(isi, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 550, 490));

        getContentPane().add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnjurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnjurusanActionPerformed
        // TODO adv your handling code here:
        faculty f = new faculty();
        f.setVisible(true);
    }//GEN-LAST:event_btnjurusanActionPerformed

    private void btnaboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnaboutMouseClicked
        // TODO add your handling code here:
                
    }//GEN-LAST:event_btnaboutMouseClicked

    private void btnaboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaboutActionPerformed
        // TODO add your handling code here:
        about abouut = new about();
                abouut.setVisible(true);
    }//GEN-LAST:event_btnaboutActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        JOptionPane.showMessageDialog(null, "SAMPAI JUMPA LAGI");
        System.exit(0);
    }//GEN-LAST:event_btnexitActionPerformed

    private void btnasramaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnasramaMouseClicked
        // TODO add your handling code here:
        //remove
        isi.removeAll();
        isi.repaint();
        isi.revalidate();
        //add
        isi.add(paneldormitory);
        isi.repaint();
        isi.revalidate();
    }//GEN-LAST:event_btnasramaMouseClicked

    private void btnasramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnasramaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnasramaActionPerformed

    private void btndaftarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndaftarMouseClicked
        BufferedReader br = null;
        try {
            // TODO add your handling code here:
            String filePath = (f+"\\Data Mahastudent.txt");
            File file = new File(filePath);
            br = new BufferedReader(new FileReader(filePath));
            DefaultTableModel model = (DefaultTableModel) tabelKebenaran.getModel();
            Object [] tableLines = br.lines().toArray();
            for (int i = 0; i < tableLines.length; i++) {
                String line = tableLines[i].toString().trim();
                String [] dataRow = line.split("/");
                
                model.addRow(dataRow);
            }
                    //remove
                    isi.removeAll();
                    isi.repaint();
                    isi.revalidate();
                    //add
                    isi.add(panelAwalDaftar);
                    isi.repaint();
                    isi.revalidate();
                    
//        menu.removeAll();
//        menu.repaint();
//        menu.revalidate();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btndaftarMouseClicked

    private void btndaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndaftarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btndaftarActionPerformed

    private void womanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_womanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_womanActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        panelasrama.removeAll();
        panelasrama.repaint();
        panelasrama.revalidate();
        //add
        panelasrama.add(Gryffindor);
        panelasrama.repaint();
        panelasrama.revalidate();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        panelasrama.removeAll();
        panelasrama.repaint();
        panelasrama.revalidate();
        //add
        panelasrama.add(Hufflepuff);
        panelasrama.repaint();
        panelasrama.revalidate();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        panelasrama.removeAll();
        panelasrama.repaint();
        panelasrama.revalidate();
        //add
        panelasrama.add(Ravenlaw);
        panelasrama.repaint();
        panelasrama.revalidate();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        panelasrama.removeAll();
        panelasrama.repaint();
        panelasrama.revalidate();
        //add
        panelasrama.add(Slytherin);
        panelasrama.repaint();
        panelasrama.revalidate();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        // TODO add your handling code here:
        isihome.removeAll();
        isihome.repaint();
        isihome.revalidate();
        //add
        isihome.add(aboutUniversity);
        isihome.repaint();
        isihome.revalidate();
    }//GEN-LAST:event_jLabel28MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked

    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
        // TODO add your handling code here:
        isihome.removeAll();
        isihome.repaint();
        isihome.revalidate();
        //add
        isihome.add(jPanel3);
        jPanel3.add(alumniHogwarts);
        isihome.repaint();
        isihome.revalidate();
        
        
    }//GEN-LAST:event_jLabel30MouseClicked

    private void RbuttonsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbuttonsubmitActionPerformed
        // TODO add your handling code here:
        if(Rname.getText().trim().isEmpty()||Rbirth.getText().trim().isEmpty()||Rschool.getText().trim().isEmpty()||Rmtk.getText().trim().isEmpty()||Ripas.getText().trim().isEmpty()||Rsejarah.getText().trim().isEmpty()||Rseni.getText().trim().isEmpty())
            JOptionPane.showMessageDialog(null, "somethingwrong i can feel it");
        else if (Integer.parseInt(Rmtk.getText())>100&&Integer.parseInt(Ripas.getText())>100&&Integer.parseInt(Rsejarah.getText())>100&&Integer.parseInt(Rseni.getText())>100) {
            JOptionPane.showMessageDialog(null,"NILAI LEBIH DARI 100");
        }
        else if (fakultas1.getSelectedIndex()==0&&fakultas2.getSelectedIndex()==0) {
            JOptionPane.showMessageDialog(null, "SILAKAN PILIH JURUSAN");
        }
        else if (Integer.parseInt(Rmtk.getText())>100||Integer.parseInt(Ripas.getText())>100||Integer.parseInt(Rsejarah.getText())>100||Integer.parseInt(Rseni.getText())>100) {
            JOptionPane.showMessageDialog(null, "NILAI LEBIHH DARI 100");
        }
        else{               
                isi.removeAll();
                isi.repaint();
                isi.revalidate();
                //add
                isi.add(paneldaftarkuliah2);
                isi.repaint();
                isi.revalidate();
                datapeserta();
                bgroup();
                
        
                hasilrapot=(int) ((Float.parseFloat(Rmtk.getText())+Float.parseFloat(Ripas.getText())+Float.parseFloat(Rsejarah.getText())+Float.parseFloat(Rseni.getText()))/4);
                akhirRata.setText(String.valueOf(hasilrapot));
                perhitungan();
        
        
        }

    }//GEN-LAST:event_RbuttonsubmitActionPerformed

    private void RnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RnameActionPerformed

    private void jLabel49MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel49MouseClicked
        // TODO add your handling code here:
        panelasrama.removeAll();
        panelasrama.repaint();
        panelasrama.revalidate();
        //add
        panelasrama.add(pembukaanasrama);
        panelasrama.repaint();
        panelasrama.revalidate();
    }//GEN-LAST:event_jLabel49MouseClicked

    private void jLabel30MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel30MouseEntered

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        // TODO add your handling code here:
        alumniHogwarts.removeAll();
        alumniHogwarts.repaint();
        alumniHogwarts.revalidate();
        //add
        alumniHogwarts.add(alumniGryffindor);
        alumniHogwarts.repaint();
        alumniHogwarts.revalidate();
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseClicked
        // TODO add your handling code here:
        alumniHogwarts.removeAll();
        alumniHogwarts.repaint();
        alumniHogwarts.revalidate();
        //add
        alumniHogwarts.add(alumniHufflepuff);
        alumniHogwarts.repaint();
        alumniHogwarts.revalidate();
    }//GEN-LAST:event_jLabel35MouseClicked

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
        // TODO add your handling code here:
        alumniHogwarts.removeAll();
        alumniHogwarts.repaint();
        alumniHogwarts.revalidate();
        //add
        alumniHogwarts.add(alumniRavenclaw);
        alumniHogwarts.repaint();
        alumniHogwarts.revalidate();
    }//GEN-LAST:event_jLabel29MouseClicked

    private void jLabel36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseClicked
        // TODO add your handling code here:
        alumniHogwarts.removeAll();
        alumniHogwarts.repaint();
        alumniHogwarts.revalidate();
        //add
        alumniHogwarts.add(alumniSlytherin);
        alumniHogwarts.repaint();
        alumniHogwarts.revalidate();
    }//GEN-LAST:event_jLabel36MouseClicked

    private void btnhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnhomeActionPerformed

    private void btnhomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhomeMouseClicked
        //remove
        isi.removeAll();
        isi.repaint();
        isi.revalidate();
        //add
        isi.add(panelhome);
        isi.repaint();
        isi.revalidate();
    }//GEN-LAST:event_btnhomeMouseClicked

    private void fakultas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fakultas1ActionPerformed
     
    }//GEN-LAST:event_fakultas1ActionPerformed

    private void RmtkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RmtkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RmtkActionPerformed

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        // TODO add your handling code here:
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.images","jpg","png","gif");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);
            if (result==JFileChooser.APPROVE_OPTION){
                File selectedFile = file.getSelectedFile();
                String path = selectedFile.getAbsolutePath();
                labelgambar.setIcon(ResizeImage(path));
                akhirGambar.setIcon(ResizeImage(path));
                
            }
            else if(result==JFileChooser.CANCEL_OPTION){
                JOptionPane.showMessageDialog(null,"NO FILE SELECTED");
            }
            

    }//GEN-LAST:event_kButton2ActionPerformed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        // TODO add your handling code here:
        isi.removeAll();
        isi.repaint();
        isi.revalidate();
        //add
        isi.add(panelfakultas);
        isi.repaint();
        isi.revalidate();
                                
    }//GEN-LAST:event_kButton1ActionPerformed

    private void menulisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menulisActionPerformed
        // TODO add your handling code here:
        if (menulis.isSelected()) {
            tanya1=40;
        }
    }//GEN-LAST:event_menulisActionPerformed

    private void fakultas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fakultas2ActionPerformed
        // TODO add your handling code here:
        if (fakultas2.getSelectedItem().equals("POTION")) {
            labelsecondfaculty.setText("POTION");
            akhirPilihan2.setText("POTION");
            
            if ((hasilrapot>=80)&&(Integer.parseInt(Rmtk.getText())>=82)&&(Integer.parseInt(Ripas.getText())>=81)){
                hasilakhir="LULUS";
                akhirKeputusan.setText(hasilakhir);
            }
            else{
                hasilakhir="GAGAL";
                akhirKeputusan.setText(hasilakhir);}
        }
        else if (fakultas2.getSelectedItem().equals("DIVINATION")) {
            labelsecondfaculty.setText("DIVINATION");
            akhirPilihan2.setText("DIVINATION");
            
            if ((hasilrapot>=77)&&(Integer.parseInt(Rmtk.getText())>=72)&&(Integer.parseInt(Rsejarah.getText())>=80)){
                hasilakhir="LULUS";
                akhirKeputusan.setText(hasilakhir);
            }
//            else{
//                hasilakhir="GAGAL";
//                akhirKeputusan.setText(hasilakhir);}
        }
        
        else if (fakultas2.getSelectedItem().equals("CHARM")) {
            labelsecondfaculty.setText("CHARM");
            akhirPilihan2.setText("CHARM");
            
            if ((hasilrapot>=70)&&(Integer.parseInt(Rseni.getText())>=83)){
                hasilakhir="LULUS";
                akhirKeputusan.setText(hasilakhir);
            }
            else{
                hasilakhir="GAGAL";
                akhirKeputusan.setText(hasilakhir);}
        }
        else if (fakultas2.getSelectedItem().equals("HISTORY OF MAGIC")) {
            labelsecondfaculty.setText("HISTORY OF MAGIC");
            akhirPilihan2.setText("HISTORY OF MAGIC");
            
            if ((hasilrapot>=74)&&(Integer.parseInt(Rsejarah.getText())>=85)){
                hasilakhir="LULUS";
                akhirKeputusan.setText(hasilakhir);
            }
            else{
                hasilakhir="GAGAL";
                akhirKeputusan.setText(hasilakhir);}
        }
        else if (fakultas2.getSelectedItem().equals("DEFENCE AGAINST THE DARK ARTS")) {
            labelsecondfaculty.setText("DEFENCE AGAINST THE DARK ARTS");
            akhirPilihan2.setText("DEFENCE AGAINST THE DARK ARTS");
            
            if ((hasilrapot>=84)){
                hasilakhir="LULUS";
                akhirKeputusan.setText(hasilakhir);
            }
            else{
                hasilakhir="GAGAL";
                akhirKeputusan.setText(hasilakhir);}
        }
        else if (fakultas2.getSelectedItem().equals("ARITHMANCY")) {
            labelsecondfaculty.setText("ARITHMANCY");
            akhirPilihan2.setText("ARITHMANCY");
            
            if ((hasilrapot>=76)&&(Integer.parseInt(Rmtk.getText())>=85)){
                hasilakhir="LULUS";
                akhirKeputusan.setText(hasilakhir);
            }
            else{
                hasilakhir="GAGAL";
                akhirKeputusan.setText(hasilakhir);}
        }
    }//GEN-LAST:event_fakultas2ActionPerformed

    private void RnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RnameKeyTyped
        // TODO add your handling code here:
        if (Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_RnameKeyTyped

    private void RmtkKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RmtkKeyTyped
        // TODO add your handling code here:
        if (Character.isAlphabetic(evt.getKeyChar())) {
//            if () {
//                JOptionPane.showMessageDialog(null, "NILAI LEBIH DARI 100");
//                evt.consume();
//            }
            evt.consume();
        }
    }//GEN-LAST:event_RmtkKeyTyped

    private void RipasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RipasKeyTyped
        // TODO add your handling code here:
        if (Character.isAlphabetic(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_RipasKeyTyped

    private void RsejarahKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RsejarahKeyTyped
        // TODO add your handling code here:
        if (Character.isAlphabetic(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_RsejarahKeyTyped

    private void RseniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RseniKeyTyped
        // TODO add your handling code here:
        if (Character.isAlphabetic(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_RseniKeyTyped

    private void kButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton3ActionPerformed
        // TODO add your handling code here:
        hasilasrama=(tanya1+tanya2+tanya3+tanya4);
        if (hasilasrama>=290) {
            akhirAsrama.setText("RAVENCLAW");
        }
        else if (hasilasrama>=210) {
            akhirAsrama.setText("GRYFFINDOR");
        }
        else if (hasilasrama>=150) {
            akhirAsrama.setText("HUFFLEPUFF");
        }
        else if (hasilasrama>=0) {
            akhirAsrama.setText("SLYTHERIN");
        }
        
        
        //remove
        isi.removeAll();
        isi.repaint();
        isi.revalidate();
        //add
        isi.add(panelLulus);
        isi.repaint();
        isi.revalidate();
    }//GEN-LAST:event_kButton3ActionPerformed

    private void kButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton4ActionPerformed
        // TODO add your handling code here:
        panelcetak.setText(
                  "                HOGWARTS COLLEGE        "
                + "\n"
                + "                   MENYATAKAN           "
                + "\n"
                + "\n"
                + "\n"
                + "\n"
                + "NAMA               : "+Rname.getText()+"\n"
                + "PILIHAN PERTAMA    : "+labelfirstfaculty.getText()+"\n"
                + "PILIHAN KEDUA      : "+labelsecondfaculty.getText()+"\n"
                + "RATA RATA NILAI    : "+String.valueOf(hasilrapot)+"\n"
                + "LULUS DI FAKULTAS  : "+String.valueOf(hasilakhir)+"\n"
                + "DITERIMA DI ASRAMA : "+"\n"
                + "\n"
                + "\n"
                + "\n"
                + "\n"
                + "\n"
                + "\n"
                + "\n"
                + "\n"
                + "Terimakasih atas partisipasinya selamat bergabung bagi yang lulus dan jangan menyerah bagi yang gagal"
        );
        isi.removeAll();
        isi.repaint();
        isi.revalidate();
        //add
        isi.add(panelCetak);
        isi.repaint();
        isi.revalidate();
    }//GEN-LAST:event_kButton4ActionPerformed

    private void kButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton5ActionPerformed
        try {
            // TODO add your handling code here:
            panelcetak.print();
        } catch (PrinterException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_kButton5ActionPerformed

    private void kButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton6ActionPerformed
        // TODO add your handling code here:
                isi.removeAll();
                isi.repaint();
                isi.revalidate();
        
                isi.add(paneldaftarkuliah4);
                isi.repaint();
                isi.revalidate();
    }//GEN-LAST:event_kButton6ActionPerformed

    private void kButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton7ActionPerformed
        // TODO add your handling code here:
            int a = tabelKebenaran.getModel().getRowCount();
                if (search.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Wajib terisi");
                }
                else{
                isi.removeAll();
                isi.repaint();
                isi.revalidate();
        
                isi.add(paneldaftarkuliah);
                isi.repaint();
                isi.revalidate();}
    }//GEN-LAST:event_kButton7ActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tabelKebenaran.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel> (model);
        tabelKebenaran.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search.getText().trim()));
    }//GEN-LAST:event_searchKeyReleased

    private void tabelKebenaranMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelKebenaranMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tabelKebenaran.getModel();
        int number = tabelKebenaran.getSelectedRow();
        Rid.setText((String) tabelKebenaran.getValueAt(number, 0));
        Rname.setText((String) tabelKebenaran.getValueAt(number, 1));
        Rbirth.setText((String) tabelKebenaran.getValueAt(number, 2));
        Rschool.setText((String) tabelKebenaran.getValueAt(number, 3));
        Rmtk.setText((String) tabelKebenaran.getValueAt(number, 4));
        Ripas.setText((String) tabelKebenaran.getValueAt(number, 5));
        Rsejarah.setText((String) tabelKebenaran.getValueAt(number, 6));
        Rseni.setText((String) tabelKebenaran.getValueAt(number, 7));
    }//GEN-LAST:event_tabelKebenaranMouseClicked

    private void sotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sotoActionPerformed
        // TODO add your handling code here:
        if (soto.isSelected()) {
            tanya2=20;
        }
    }//GEN-LAST:event_sotoActionPerformed

    private void semiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semiActionPerformed
        // TODO add your handling code here:
        if (semi.isSelected()) {
            tanya4=20;
        }
    }//GEN-LAST:event_semiActionPerformed

    private void dinginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dinginActionPerformed
        // TODO add your handling code here:
        if (dingin.isSelected()) {
            tanya4=80;
        }
    }//GEN-LAST:event_dinginActionPerformed

    private void memasakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memasakActionPerformed
        // TODO add your handling code here:
        if (memasak.isSelected()) {
            tanya1=20;
        }
    }//GEN-LAST:event_memasakActionPerformed

    private void berkebunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_berkebunActionPerformed
        // TODO add your handling code here:
        if (berkebun.isSelected()) {
            tanya1=60;
        }
    }//GEN-LAST:event_berkebunActionPerformed

    private void berpergianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_berpergianActionPerformed
        // TODO add your handling code here:
        if (berpergian.isSelected()) {
            tanya1=80;
        }
    }//GEN-LAST:event_berpergianActionPerformed

    private void buburayamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buburayamActionPerformed
        // TODO add your handling code here:
        if (buburayam.isSelected()) {
            tanya2=40;
        }
    }//GEN-LAST:event_buburayamActionPerformed

    private void mieinstanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mieinstanActionPerformed
        // TODO add your handling code here:
        if (mieinstan.isSelected()) {
            tanya2=60;
        }
    }//GEN-LAST:event_mieinstanActionPerformed

    private void sateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sateActionPerformed
        // TODO add your handling code here:
        if (sate.isSelected()) {
            tanya2=80;
        }
    }//GEN-LAST:event_sateActionPerformed

    private void audioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_audioActionPerformed
        // TODO add your handling code here:
        if (audio.isSelected()) {
            tanya3=20;
        }
    }//GEN-LAST:event_audioActionPerformed

    private void visualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualActionPerformed
        // TODO add your handling code here:
        if (visual.isSelected()) {
            tanya3=40;
        }
    }//GEN-LAST:event_visualActionPerformed

    private void audiovisualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_audiovisualActionPerformed
        // TODO add your handling code here:
        if (audiovisual.isSelected()) {
            tanya3=60;
        }
    }//GEN-LAST:event_audiovisualActionPerformed

    private void praktikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_praktikActionPerformed
        // TODO add your handling code here:
        if (praktik.isSelected()) {
            tanya3=80;
        }
    }//GEN-LAST:event_praktikActionPerformed

    private void panasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panasActionPerformed
        // TODO add your handling code here:
        if (panas.isSelected()) {
            tanya4=40;
        }
    }//GEN-LAST:event_panasActionPerformed

    private void gugurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gugurActionPerformed
        // TODO add your handling code here:
        if (gugur.isSelected()) {
            tanya4=60;
        }
    }//GEN-LAST:event_gugurActionPerformed

    private void btndaftarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndaftarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btndaftarMouseEntered

    private void jLabel78MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel78MouseClicked
        // TODO add your handling code here:
                    isi.removeAll();
                    isi.repaint();
                    isi.revalidate();
                    //add
                    isi.add(panelAwalDaftar);
                    isi.repaint();
                    isi.revalidate();
    }//GEN-LAST:event_jLabel78MouseClicked

    private void RbirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbirthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RbirthActionPerformed

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home(nama).setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Gryffindor;
    private javax.swing.JPanel Hufflepuff;
    private javax.swing.JRadioButton R2017;
    private javax.swing.JRadioButton R2018;
    private javax.swing.JRadioButton R2019;
    private javax.swing.JRadioButton R2020;
    private javax.swing.JPanel Ravenlaw;
    private javax.swing.JTextField Rbirth;
    private keeptoo.KButton Rbuttonsubmit;
    private javax.swing.JTextField Rid;
    private javax.swing.JTextField Ripas;
    private javax.swing.JTextField Rmtk;
    private javax.swing.JTextField Rname;
    private javax.swing.JTextField Rschool;
    private javax.swing.JTextField Rsejarah;
    private javax.swing.JTextField Rseni;
    private javax.swing.JPanel Slytherin;
    private javax.swing.JPanel aboutUniversity;
    private javax.swing.JLabel akhirAsrama;
    private javax.swing.JLabel akhirGambar;
    private javax.swing.JLabel akhirKeputusan;
    private javax.swing.JLabel akhirNama;
    private javax.swing.JLabel akhirPilihan1;
    private javax.swing.JLabel akhirPilihan2;
    private javax.swing.JLabel akhirRata;
    private javax.swing.JPanel alumniGryffindor;
    private javax.swing.JPanel alumniHogwarts;
    private javax.swing.JPanel alumniHufflepuff;
    private javax.swing.JPanel alumniRavenclaw;
    private javax.swing.JPanel alumniSlytherin;
    private javax.swing.JRadioButton audio;
    private javax.swing.JRadioButton audiovisual;
    private javax.swing.JRadioButton berkebun;
    private javax.swing.JRadioButton berpergian;
    private keeptoo.KButton btnabout;
    private keeptoo.KButton btnasrama;
    private keeptoo.KButton btndaftar;
    private keeptoo.KButton btnexit;
    private keeptoo.KButton btnhome;
    private keeptoo.KButton btnjurusan;
    private javax.swing.JRadioButton buburayam;
    private javax.swing.JRadioButton dingin;
    private javax.swing.JComboBox<String> fakultas1;
    private javax.swing.JComboBox<String> fakultas2;
    private javax.swing.ButtonGroup gender;
    private javax.swing.JLabel gerak;
    private javax.swing.ButtonGroup grup1;
    private javax.swing.ButtonGroup grup2;
    private javax.swing.ButtonGroup grup3;
    private javax.swing.ButtonGroup grup4;
    private javax.swing.JRadioButton gugur;
    private javax.swing.JPanel hapusIsiHome;
    private javax.swing.JPanel isi;
    private javax.swing.JPanel isihome;
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
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JTextPane jTextPane4;
    private keeptoo.KButton kButton1;
    private keeptoo.KButton kButton2;
    private keeptoo.KButton kButton3;
    private keeptoo.KButton kButton4;
    private keeptoo.KButton kButton5;
    private keeptoo.KButton kButton6;
    private keeptoo.KButton kButton7;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JLabel labelMtk;
    private javax.swing.JLabel labelRipas;
    private javax.swing.JLabel labelSejarah;
    private javax.swing.JLabel labelSeni;
    private javax.swing.JLabel labelbirth;
    private javax.swing.JLabel labelfirstfaculty;
    private javax.swing.JLabel labelgambar;
    private javax.swing.JLabel labelgender;
    private javax.swing.JLabel labelgraduate;
    private javax.swing.JLabel labelnama;
    private javax.swing.JLabel labelname;
    private javax.swing.JLabel labelschool;
    private javax.swing.JLabel labelsecondfaculty;
    private javax.swing.JLabel labelwaktu;
    private javax.swing.JRadioButton man;
    private javax.swing.JRadioButton memasak;
    private javax.swing.JPanel menu;
    private javax.swing.JRadioButton menulis;
    private javax.swing.JRadioButton mieinstan;
    private javax.swing.ButtonGroup musik;
    private javax.swing.JRadioButton panas;
    private javax.swing.JPanel panelAwalDaftar;
    private javax.swing.JPanel panelCetak;
    private javax.swing.JPanel panelLulus;
    private javax.swing.JPanel panelasrama;
    private javax.swing.JTextArea panelcetak;
    private javax.swing.JPanel paneldaftarkuliah;
    private javax.swing.JPanel paneldaftarkuliah2;
    private javax.swing.JPanel paneldaftarkuliah4;
    private javax.swing.JPanel paneldormitory;
    private javax.swing.JPanel panelfakultas;
    private javax.swing.JPanel panelhome;
    private javax.swing.JPanel pembukaanasrama;
    private javax.swing.JLabel pertanyaan1;
    private javax.swing.JLabel pertanyaan2;
    private javax.swing.JLabel pertanyaan3;
    private javax.swing.JLabel pertanyaan4;
    private javax.swing.JRadioButton praktik;
    private javax.swing.JRadioButton sate;
    private javax.swing.JTextField search;
    private javax.swing.JRadioButton semi;
    private javax.swing.JRadioButton soto;
    private javax.swing.JTable tabelKebenaran;
    private javax.swing.ButtonGroup tahun;
    private javax.swing.JRadioButton visual;
    private javax.swing.JRadioButton woman;
    // End of variables declaration//GEN-END:variables
}
