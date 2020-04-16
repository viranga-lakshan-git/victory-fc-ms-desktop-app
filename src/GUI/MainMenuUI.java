package GUI;

import java.awt.Toolkit;
import javax.swing.ImageIcon;
import Functions.*;
import Objects.*;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.filechooser.FileNameExtensionFilter;
import net.proteanit.sql.DbUtils;
//import net.sf.jasperreports.engine;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author Laksh
 */
public class MainMenuUI extends javax.swing.JFrame {
    
   int updateFromPlayerID,updateFromItemID,updateStatisticFromPlayerID,updateAchivementByID,updateFixturesFromID,updateFromGalleryID;
   String updateFromUsername=null;
   Connection conn;
   byte[] imageBrowsed=null;
   String playerImagePath,galleryImagePath,managerImagePath,merchandiseImagePath;
   Blob updatePlayerImage=null,updateGalleryImage=null,updateMerchandiseImage=null,updateManagerImage;
   ResultSet playerDetailsForStatistics;
   static String loggedUser;
    public MainMenuUI(String loggedUser) {
        initComponents();
        this.loggedUser=loggedUser;
        lblLoggedUser.setText("<html>Welcome...<br>You are Logged in as,<br><b>"+loggedUser+"</b></html>");
        setSize(1232, 945);
        setResizable(false);
        setIcon();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        showDate();
        showTime();
        
        btnManageFixtures.setContentAreaFilled(false);
        btnManageMerchandise.setContentAreaFilled(false);
        btnManagePlayers.setContentAreaFilled(false);
        btnManageUsers.setContentAreaFilled(false);
        btnUpdateStatistics.setContentAreaFilled(false);
        btnManagerDetails.setContentAreaFilled(false);
        btnGallery.setContentAreaFilled(false);
        btnAchivements.setContentAreaFilled(false);
        
        jPanelManagePlayers.setVisible(false);
        jPanelManageUsers.setVisible(false);
        jPanelManageMerchandise.setVisible(false);
        jPanelUpdateFixtures.setVisible(false);
        jPanelUpdateStatictics.setVisible(false);
        jPanelManagerDetails.setVisible(false);
        jPanelUpdateGallery.setVisible(false);
        jPanelAchivements.setVisible(false);
    }

    void showDate(){
        Date date=new Date();
        SimpleDateFormat sdf= new SimpleDateFormat("dd-MMM-yyyy");
        lblDate.setText(sdf.format(date));
    }
    
    void showTime(){
        new Timer(0,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                Date date=new Date();
                SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss a");
                lblTime.setText(sdf.format(date));
            }
        }).start();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelHeader = new javax.swing.JPanel();
        jLabelHeader = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lblLoggedUser = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        jPanelMainButtons = new javax.swing.JPanel();
        btnManagerDetails = new javax.swing.JButton();
        btnGallery = new javax.swing.JButton();
        btnManagePlayers = new javax.swing.JButton();
        btnManageMerchandise = new javax.swing.JButton();
        btnManageFixtures = new javax.swing.JButton();
        btnManageUsers = new javax.swing.JButton();
        btnUpdateStatistics = new javax.swing.JButton();
        btnAchivements = new javax.swing.JButton();
        jPanelUpdateFixtures = new javax.swing.JPanel();
        txtOpponetTeam = new javax.swing.JTextField();
        txtVenue = new javax.swing.JTextField();
        txtViewMatchID = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableFixtures = new javax.swing.JTable();
        lblTeamA = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        ComboBoxGround = new javax.swing.JComboBox<>();
        btnAddFixtures = new javax.swing.JButton();
        btnDeleteFixtures = new javax.swing.JButton();
        btnUpdateFixtures = new javax.swing.JButton();
        btnClearFixtures = new javax.swing.JButton();
        btnCloseFixtures = new javax.swing.JButton();
        btnPrintFixtures = new javax.swing.JButton();
        btnViewFixtures = new javax.swing.JButton();
        comboHours = new javax.swing.JComboBox<>();
        comboAmPm = new javax.swing.JComboBox<>();
        comboMinutes = new javax.swing.JComboBox<>();
        btnMakeNext = new javax.swing.JButton();
        jPanelUpdateStatictics = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        txtViewPlayerStatisticID = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtViewPlayerStatisticsName = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableStatistics = new javax.swing.JTable();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        lblReplyID = new javax.swing.JLabel();
        lblStatisticsImage = new javax.swing.JLabel();
        txtStatisticMatches = new javax.swing.JTextField();
        txtStatisticGoals = new javax.swing.JTextField();
        txtStatisticAssists = new javax.swing.JTextField();
        txtStatisticRedCards = new javax.swing.JTextField();
        txtStatisticYellowCards = new javax.swing.JTextField();
        btnViewStatistics = new javax.swing.JButton();
        btnAddStatistics = new javax.swing.JButton();
        btnDeleteStatistics = new javax.swing.JButton();
        btnUpdateStatistic = new javax.swing.JButton();
        btnClearStatistic = new javax.swing.JButton();
        btnCloseStatistics = new javax.swing.JButton();
        btnStatistics = new javax.swing.JButton();
        lblStatisticsPlayerName = new javax.swing.JLabel();
        jPanelManageMerchandise = new javax.swing.JPanel();
        lblItemName = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        lblItemId1 = new javax.swing.JLabel();
        lblMerchandiseImage = new javax.swing.JLabel();
        lblItemName1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableMerchandise = new javax.swing.JTable();
        txtItemName = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtViewItemId = new javax.swing.JTextField();
        txtViewItemName = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        btnAddItem = new javax.swing.JButton();
        btnClearItem = new javax.swing.JButton();
        btnDeleteItem = new javax.swing.JButton();
        btnUpdateItem = new javax.swing.JButton();
        btnViewItem = new javax.swing.JButton();
        btnPrintMerchandise = new javax.swing.JButton();
        btnCloseItem = new javax.swing.JButton();
        btnBrowseMerchandiseImage = new javax.swing.JButton();
        jPanelManageUsers = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableUsers = new javax.swing.JTable();
        txtViewUsername = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtUserPassword = new javax.swing.JPasswordField();
        txtConfirmPassword = new javax.swing.JPasswordField();
        txtUserType = new javax.swing.JComboBox<>();
        btnAddUser = new javax.swing.JButton();
        btnClearUser = new javax.swing.JButton();
        btnCloseUser = new javax.swing.JButton();
        btnUpdateUser = new javax.swing.JButton();
        btnDeleteUser = new javax.swing.JButton();
        btnViewUser = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        txtViewUserType = new javax.swing.JComboBox<>();
        jPanelManagePlayers = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblDOB = new javax.swing.JLabel();
        lblPosition = new javax.swing.JLabel();
        lblHeight = new javax.swing.JLabel();
        lblWeight = new javax.swing.JLabel();
        lblId1 = new javax.swing.JLabel();
        txtUsernameView = new javax.swing.JTextField();
        txtNameView = new javax.swing.JTextField();
        txtHeight = new javax.swing.JTextField();
        txtWeight = new javax.swing.JTextField();
        txtPlayerPassword = new javax.swing.JPasswordField();
        lblUsername1 = new javax.swing.JLabel();
        lblName1 = new javax.swing.JLabel();
        lblPlayerImage = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPlayerName = new javax.swing.JTextField();
        txtPlayerUsername = new javax.swing.JTextField();
        txtViewPlayerID = new javax.swing.JTextField();
        txtPosition = new javax.swing.JComboBox<>();
        btnAddPlayer = new javax.swing.JButton();
        btnDeletePlayer = new javax.swing.JButton();
        btnUpdatePlayer = new javax.swing.JButton();
        btnClosePlayer = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnPrintPlayers = new javax.swing.JButton();
        btnClearPlayer = new javax.swing.JButton();
        btnBrowseImage = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePlayers = new javax.swing.JTable();
        jPanelUpdateGallery = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        txtImageDescription = new javax.swing.JTextField();
        lblImageView = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        btnBrowseGalleryImage = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTableGallery = new javax.swing.JTable();
        btnUpload = new javax.swing.JButton();
        btnCloseGallery = new javax.swing.JButton();
        btnDeleteGallery = new javax.swing.JButton();
        txtDeleteImageID = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        btnClearGallery = new javax.swing.JButton();
        btnViewGalleryByID = new javax.swing.JButton();
        btnUpdateGallery = new javax.swing.JButton();
        jPanelManagerDetails = new javax.swing.JPanel();
        lblManagerIcon = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        txtManagerMatches = new javax.swing.JTextField();
        txtManagerWins = new javax.swing.JTextField();
        txtManagerTrophies = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        txtManagerName = new javax.swing.JTextField();
        txtManagerCountry = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtManagerQuote = new javax.swing.JTextArea();
        jLabel42 = new javax.swing.JLabel();
        btnBrowseManagerImage = new javax.swing.JButton();
        btnAddManager = new javax.swing.JButton();
        btnClearManager = new javax.swing.JButton();
        btnCloseManager = new javax.swing.JButton();
        btnViewCurrentManager = new javax.swing.JButton();
        btnUpdateManager = new javax.swing.JButton();
        jPanelAchivements = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTableAchivements = new javax.swing.JTable();
        btnCloseAchivements = new javax.swing.JButton();
        btnDeleteAchivement = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAchivementYear = new javax.swing.JTextField();
        txtAchivementDescription = new javax.swing.JTextField();
        txtAchivementPlace = new javax.swing.JComboBox<>();
        btnAddAchivement = new javax.swing.JButton();
        btnUpdateAchivement = new javax.swing.JButton();
        btnClearAchivement = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtAchivementID = new javax.swing.JTextField();
        btnViewAchivement = new javax.swing.JButton();
        jPanelBlankPage = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Victory Football Club Management System");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanelHeader.setBackground(new java.awt.Color(51, 255, 255));
        jPanelHeader.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelHeader.setToolTipText("Victory Football Club Management System");
        jPanelHeader.setPreferredSize(new java.awt.Dimension(9140, 115));

        jLabelHeader.setFont(new java.awt.Font("SansSerif", 0, 58)); // NOI18N
        jLabelHeader.setText("Victory FC Management System");

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo1.png"))); // NOI18N

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        lblDate.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblDate.setIconTextGap(1);

        lblTime.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lblTime.setIconTextGap(1);

        javax.swing.GroupLayout jPanelHeaderLayout = new javax.swing.GroupLayout(jPanelHeader);
        jPanelHeader.setLayout(jPanelHeaderLayout);
        jPanelHeaderLayout.setHorizontalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelHeader)
                    .addGroup(jPanelHeaderLayout.createSequentialGroup()
                        .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblLoggedUser, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8169, 8169, 8169))
        );
        jPanelHeaderLayout.setVerticalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addGroup(jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHeaderLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLoggedUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanelHeaderLayout.createSequentialGroup()
                        .addComponent(jLabelHeader)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addComponent(jLabelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelMainButtons.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMainButtons.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelMainButtons.setToolTipText("Select an option.");
        jPanelMainButtons.setPreferredSize(new java.awt.Dimension(239, 795));
        jPanelMainButtons.setVerifyInputWhenFocusTarget(false);

        btnManagerDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menuCoach.png"))); // NOI18N
        btnManagerDetails.setText("Manager Details");
        btnManagerDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnManagerDetails.setPreferredSize(new java.awt.Dimension(203, 85));
        btnManagerDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagerDetailsActionPerformed(evt);
            }
        });

        btnGallery.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menuGallery.png"))); // NOI18N
        btnGallery.setText("Update Gallery");
        btnGallery.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGallery.setIconTextGap(10);
        btnGallery.setPreferredSize(new java.awt.Dimension(203, 83));
        btnGallery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGalleryActionPerformed(evt);
            }
        });

        btnManagePlayers.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnManagePlayers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menuPlayers.png"))); // NOI18N
        btnManagePlayers.setText("Manage Players");
        btnManagePlayers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnManagePlayers.setIconTextGap(10);
        btnManagePlayers.setMaximumSize(new java.awt.Dimension(55, 25));
        btnManagePlayers.setMinimumSize(new java.awt.Dimension(55, 25));
        btnManagePlayers.setPreferredSize(new java.awt.Dimension(203, 83));
        btnManagePlayers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePlayersActionPerformed(evt);
            }
        });

        btnManageMerchandise.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnManageMerchandise.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menuMerchandise.png"))); // NOI18N
        btnManageMerchandise.setText("Merchandise");
        btnManageMerchandise.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnManageMerchandise.setIconTextGap(25);
        btnManageMerchandise.setMaximumSize(new java.awt.Dimension(55, 25));
        btnManageMerchandise.setMinimumSize(new java.awt.Dimension(55, 25));
        btnManageMerchandise.setPreferredSize(new java.awt.Dimension(203, 83));
        btnManageMerchandise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageMerchandiseActionPerformed(evt);
            }
        });

        btnManageFixtures.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnManageFixtures.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menuFixtures.png"))); // NOI18N
        btnManageFixtures.setText("Update Fixtures");
        btnManageFixtures.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnManageFixtures.setIconTextGap(10);
        btnManageFixtures.setMaximumSize(new java.awt.Dimension(55, 25));
        btnManageFixtures.setMinimumSize(new java.awt.Dimension(55, 25));
        btnManageFixtures.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageFixturesActionPerformed(evt);
            }
        });

        btnManageUsers.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnManageUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menuUsers.png"))); // NOI18N
        btnManageUsers.setText("Manage Users");
        btnManageUsers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnManageUsers.setIconTextGap(12);
        btnManageUsers.setMaximumSize(new java.awt.Dimension(55, 25));
        btnManageUsers.setMinimumSize(new java.awt.Dimension(55, 25));
        btnManageUsers.setPreferredSize(new java.awt.Dimension(203, 83));
        btnManageUsers.setVerifyInputWhenFocusTarget(false);
        btnManageUsers.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnManageUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageUsersActionPerformed(evt);
            }
        });

        btnUpdateStatistics.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnUpdateStatistics.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menuStatistics.png"))); // NOI18N
        btnUpdateStatistics.setText("Update Statistics");
        btnUpdateStatistics.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdateStatistics.setMaximumSize(new java.awt.Dimension(55, 25));
        btnUpdateStatistics.setMinimumSize(new java.awt.Dimension(55, 25));
        btnUpdateStatistics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateStatisticsActionPerformed(evt);
            }
        });

        btnAchivements.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menuAchivments.png"))); // NOI18N
        btnAchivements.setText("Achivements");
        btnAchivements.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAchivements.setIconTextGap(15);
        btnAchivements.setPreferredSize(new java.awt.Dimension(203, 83));
        btnAchivements.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAchivementsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMainButtonsLayout = new javax.swing.GroupLayout(jPanelMainButtons);
        jPanelMainButtons.setLayout(jPanelMainButtonsLayout);
        jPanelMainButtonsLayout.setHorizontalGroup(
            jPanelMainButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMainButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMainButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnAchivements, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnManageMerchandise, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnGallery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMainButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelMainButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelMainButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnManagePlayers, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnManageFixtures, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnManageUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnUpdateStatistics, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnManagerDetails, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        jPanelMainButtonsLayout.setVerticalGroup(
            jPanelMainButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainButtonsLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btnManageUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnManagerDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnManagePlayers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdateStatistics, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnManageFixtures, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnManageMerchandise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGallery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAchivements, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanelUpdateFixtures.setBackground(new java.awt.Color(255, 255, 255));
        jPanelUpdateFixtures.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Update Fixtures", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N
        jPanelUpdateFixtures.setPreferredSize(new java.awt.Dimension(989, 795));

        txtOpponetTeam.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtViewMatchID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtViewMatchIDActionPerformed(evt);
            }
        });

        jTableFixtures.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Match ID", "Date", "Time", "Venue", "Team", "Ground"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTableFixtures);

        lblTeamA.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTeamA.setText("Victory FC");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("vs");

        jLabel15.setText("Venue");

        jLabel16.setText("Date");

        jLabel17.setText("Time");

        jLabel7.setText("Match ID");

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/versus.png"))); // NOI18N

        ComboBoxGround.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Home", "Away" }));
        ComboBoxGround.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxGroundActionPerformed(evt);
            }
        });

        btnAddFixtures.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAddFixtures.setText("Add");
        btnAddFixtures.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFixturesActionPerformed(evt);
            }
        });

        btnDeleteFixtures.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnDeleteFixtures.setText("Delete");
        btnDeleteFixtures.setMaximumSize(new java.awt.Dimension(55, 25));
        btnDeleteFixtures.setMinimumSize(new java.awt.Dimension(55, 25));
        btnDeleteFixtures.setPreferredSize(new java.awt.Dimension(55, 25));
        btnDeleteFixtures.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteFixturesActionPerformed(evt);
            }
        });

        btnUpdateFixtures.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnUpdateFixtures.setText("Update");
        btnUpdateFixtures.setMaximumSize(new java.awt.Dimension(55, 25));
        btnUpdateFixtures.setMinimumSize(new java.awt.Dimension(55, 25));
        btnUpdateFixtures.setPreferredSize(new java.awt.Dimension(55, 25));
        btnUpdateFixtures.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateFixturesActionPerformed(evt);
            }
        });

        btnClearFixtures.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnClearFixtures.setText("Clear");
        btnClearFixtures.setMaximumSize(new java.awt.Dimension(55, 25));
        btnClearFixtures.setMinimumSize(new java.awt.Dimension(55, 25));
        btnClearFixtures.setPreferredSize(new java.awt.Dimension(55, 25));
        btnClearFixtures.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearFixturesActionPerformed(evt);
            }
        });

        btnCloseFixtures.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCloseFixtures.setText("Close");
        btnCloseFixtures.setMaximumSize(new java.awt.Dimension(55, 25));
        btnCloseFixtures.setMinimumSize(new java.awt.Dimension(55, 25));
        btnCloseFixtures.setPreferredSize(new java.awt.Dimension(55, 25));
        btnCloseFixtures.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseFixturesActionPerformed(evt);
            }
        });

        btnPrintFixtures.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnPrintFixtures.setText("Print");
        btnPrintFixtures.setMaximumSize(new java.awt.Dimension(55, 25));
        btnPrintFixtures.setMinimumSize(new java.awt.Dimension(55, 25));
        btnPrintFixtures.setPreferredSize(new java.awt.Dimension(55, 25));
        btnPrintFixtures.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintFixturesActionPerformed(evt);
            }
        });

        btnViewFixtures.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnViewFixtures.setText("View");
        btnViewFixtures.setMaximumSize(new java.awt.Dimension(55, 25));
        btnViewFixtures.setMinimumSize(new java.awt.Dimension(55, 25));
        btnViewFixtures.setPreferredSize(new java.awt.Dimension(55, 25));
        btnViewFixtures.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewFixturesActionPerformed(evt);
            }
        });

        comboHours.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        comboAmPm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "PM" }));

        comboMinutes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "05", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55" }));
        comboMinutes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMinutesActionPerformed(evt);
            }
        });

        btnMakeNext.setText("Make the Next Match");
        btnMakeNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMakeNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelUpdateFixturesLayout = new javax.swing.GroupLayout(jPanelUpdateFixtures);
        jPanelUpdateFixtures.setLayout(jPanelUpdateFixturesLayout);
        jPanelUpdateFixturesLayout.setHorizontalGroup(
            jPanelUpdateFixturesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelUpdateFixturesLayout.createSequentialGroup()
                .addGroup(jPanelUpdateFixturesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelUpdateFixturesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAddFixtures, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteFixtures, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdateFixtures, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelUpdateFixturesLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel33))
                    .addGroup(jPanelUpdateFixturesLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanelUpdateFixturesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTeamA)
                            .addGroup(jPanelUpdateFixturesLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(ComboBoxGround, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtOpponetTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelUpdateFixturesLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanelUpdateFixturesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelUpdateFixturesLayout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(comboHours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboMinutes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboAmPm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelUpdateFixturesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel16)
                                .addGroup(jPanelUpdateFixturesLayout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtVenue, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanelUpdateFixturesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelUpdateFixturesLayout.createSequentialGroup()
                        .addComponent(btnMakeNext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClearFixtures, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                        .addComponent(btnPrintFixtures, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCloseFixtures, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelUpdateFixturesLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txtViewMatchID, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnViewFixtures, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelUpdateFixturesLayout.setVerticalGroup(
            jPanelUpdateFixturesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUpdateFixturesLayout.createSequentialGroup()
                .addGroup(jPanelUpdateFixturesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelUpdateFixturesLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel33)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelUpdateFixturesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtOpponetTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(lblTeamA, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addComponent(ComboBoxGround, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(jPanelUpdateFixturesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtVenue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16)
                        .addGap(20, 20, 20)
                        .addGroup(jPanelUpdateFixturesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(comboHours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboAmPm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboMinutes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelUpdateFixturesLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanelUpdateFixturesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtViewMatchID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(btnViewFixtures, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanelUpdateFixturesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddFixtures)
                    .addComponent(btnDeleteFixtures, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateFixtures, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClearFixtures, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrintFixtures, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCloseFixtures, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMakeNext))
                .addContainerGap())
        );

        jPanelUpdateStatictics.setBackground(new java.awt.Color(255, 255, 255));
        jPanelUpdateStatictics.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Update Statistics", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N
        jPanelUpdateStatictics.setPreferredSize(new java.awt.Dimension(989, 795));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel20.setText("Player ID");

        txtViewPlayerStatisticID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtViewPlayerStatisticIDKeyReleased(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel21.setText("Name");

        jTableStatistics.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Player ID", "Name", "DoB", "Height", "Weight", "Matches", "Goals", "Assists", "Red Cards", "Yellow Cards"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTableStatistics);

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel27.setText("Matches");

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel28.setText("Goals");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel29.setText("Assists");

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel30.setText("Red Cards");

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel31.setText("Yellow Cards");

        btnViewStatistics.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnViewStatistics.setText("View");
        btnViewStatistics.setMaximumSize(new java.awt.Dimension(55, 25));
        btnViewStatistics.setMinimumSize(new java.awt.Dimension(55, 25));
        btnViewStatistics.setPreferredSize(new java.awt.Dimension(55, 25));
        btnViewStatistics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewStatisticsActionPerformed(evt);
            }
        });

        btnAddStatistics.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAddStatistics.setText("Add");
        btnAddStatistics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStatisticsActionPerformed(evt);
            }
        });

        btnDeleteStatistics.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnDeleteStatistics.setText("Delete");
        btnDeleteStatistics.setMaximumSize(new java.awt.Dimension(55, 25));
        btnDeleteStatistics.setMinimumSize(new java.awt.Dimension(55, 25));
        btnDeleteStatistics.setPreferredSize(new java.awt.Dimension(55, 25));
        btnDeleteStatistics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteStatisticsActionPerformed(evt);
            }
        });

        btnUpdateStatistic.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnUpdateStatistic.setText("Update");
        btnUpdateStatistic.setMaximumSize(new java.awt.Dimension(55, 25));
        btnUpdateStatistic.setMinimumSize(new java.awt.Dimension(55, 25));
        btnUpdateStatistic.setPreferredSize(new java.awt.Dimension(55, 25));
        btnUpdateStatistic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateStatisticActionPerformed(evt);
            }
        });

        btnClearStatistic.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnClearStatistic.setText("Clear");
        btnClearStatistic.setMaximumSize(new java.awt.Dimension(55, 25));
        btnClearStatistic.setMinimumSize(new java.awt.Dimension(55, 25));
        btnClearStatistic.setPreferredSize(new java.awt.Dimension(55, 25));
        btnClearStatistic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearStatisticActionPerformed(evt);
            }
        });

        btnCloseStatistics.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCloseStatistics.setText("Close");
        btnCloseStatistics.setMaximumSize(new java.awt.Dimension(55, 25));
        btnCloseStatistics.setMinimumSize(new java.awt.Dimension(55, 25));
        btnCloseStatistics.setPreferredSize(new java.awt.Dimension(55, 25));
        btnCloseStatistics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseStatisticsActionPerformed(evt);
            }
        });

        btnStatistics.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnStatistics.setText("Print");
        btnStatistics.setMaximumSize(new java.awt.Dimension(55, 25));
        btnStatistics.setMinimumSize(new java.awt.Dimension(55, 25));
        btnStatistics.setPreferredSize(new java.awt.Dimension(55, 25));
        btnStatistics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatisticsActionPerformed(evt);
            }
        });

        lblStatisticsPlayerName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPanelUpdateStaticticsLayout = new javax.swing.GroupLayout(jPanelUpdateStatictics);
        jPanelUpdateStatictics.setLayout(jPanelUpdateStaticticsLayout);
        jPanelUpdateStaticticsLayout.setHorizontalGroup(
            jPanelUpdateStaticticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUpdateStaticticsLayout.createSequentialGroup()
                .addGroup(jPanelUpdateStaticticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelUpdateStaticticsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelUpdateStaticticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelUpdateStaticticsLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel20)
                                .addGap(18, 18, 18)
                                .addComponent(txtViewPlayerStatisticID, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblReplyID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 308, Short.MAX_VALUE)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtViewPlayerStatisticsName, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(btnViewStatistics, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelUpdateStaticticsLayout.createSequentialGroup()
                                .addComponent(btnAddStatistics, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDeleteStatistics, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUpdateStatistic, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnClearStatistic, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnStatistics, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCloseStatistics, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelUpdateStaticticsLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(jPanelUpdateStaticticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelUpdateStaticticsLayout.createSequentialGroup()
                                .addComponent(lblStatisticsImage)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblStatisticsPlayerName, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addGroup(jPanelUpdateStaticticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel31))
                        .addGap(35, 35, 35)
                        .addGroup(jPanelUpdateStaticticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtStatisticGoals, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStatisticMatches, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStatisticAssists, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStatisticRedCards, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStatisticYellowCards, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 234, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelUpdateStaticticsLayout.setVerticalGroup(
            jPanelUpdateStaticticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUpdateStaticticsLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanelUpdateStaticticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtViewPlayerStatisticID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(txtViewPlayerStatisticsName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewStatistics, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(lblReplyID))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelUpdateStaticticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelUpdateStaticticsLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanelUpdateStaticticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblStatisticsImage)
                            .addGroup(jPanelUpdateStaticticsLayout.createSequentialGroup()
                                .addComponent(lblStatisticsPlayerName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))))
                    .addGroup(jPanelUpdateStaticticsLayout.createSequentialGroup()
                        .addGroup(jPanelUpdateStaticticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStatisticMatches, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelUpdateStaticticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStatisticGoals, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelUpdateStaticticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStatisticAssists, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29))
                        .addGap(16, 16, 16)
                        .addGroup(jPanelUpdateStaticticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStatisticRedCards, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelUpdateStaticticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtStatisticYellowCards, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(jPanelUpdateStaticticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelUpdateStaticticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAddStatistics)
                        .addComponent(btnDeleteStatistics, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnUpdateStatistic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnClearStatistic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelUpdateStaticticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCloseStatistics, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnStatistics, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanelManageMerchandise.setBackground(new java.awt.Color(255, 255, 255));
        jPanelManageMerchandise.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Manage Merchandise", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N
        jPanelManageMerchandise.setPreferredSize(new java.awt.Dimension(989, 795));

        lblItemName.setText("Item Name");

        jLabel13.setText("Stock");

        lblPrice.setText("Price");

        lblItemId1.setText("Item Id");

        lblMerchandiseImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/merchandise.png"))); // NOI18N

        lblItemName1.setText("Item Name");

        jTableMerchandise.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Item ID", "Item Name", "Price", "Stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableMerchandise.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTableMerchandise);

        txtViewItemId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtViewItemIdActionPerformed(evt);
            }
        });

        btnAddItem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAddItem.setText("Add");
        btnAddItem.setMaximumSize(new java.awt.Dimension(55, 25));
        btnAddItem.setMinimumSize(new java.awt.Dimension(55, 25));
        btnAddItem.setPreferredSize(new java.awt.Dimension(55, 25));
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
            }
        });

        btnClearItem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnClearItem.setText("Clear");
        btnClearItem.setMaximumSize(new java.awt.Dimension(55, 25));
        btnClearItem.setMinimumSize(new java.awt.Dimension(55, 25));
        btnClearItem.setPreferredSize(new java.awt.Dimension(55, 25));
        btnClearItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearItemActionPerformed(evt);
            }
        });

        btnDeleteItem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnDeleteItem.setText("Delete");
        btnDeleteItem.setMaximumSize(new java.awt.Dimension(55, 25));
        btnDeleteItem.setMinimumSize(new java.awt.Dimension(55, 25));
        btnDeleteItem.setPreferredSize(new java.awt.Dimension(55, 25));
        btnDeleteItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteItemActionPerformed(evt);
            }
        });

        btnUpdateItem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnUpdateItem.setText("Update");
        btnUpdateItem.setMaximumSize(new java.awt.Dimension(55, 25));
        btnUpdateItem.setMinimumSize(new java.awt.Dimension(55, 25));
        btnUpdateItem.setPreferredSize(new java.awt.Dimension(55, 25));
        btnUpdateItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateItemActionPerformed(evt);
            }
        });

        btnViewItem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnViewItem.setText("View");
        btnViewItem.setMaximumSize(new java.awt.Dimension(55, 25));
        btnViewItem.setMinimumSize(new java.awt.Dimension(55, 25));
        btnViewItem.setPreferredSize(new java.awt.Dimension(55, 25));
        btnViewItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewItemActionPerformed(evt);
            }
        });

        btnPrintMerchandise.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnPrintMerchandise.setText("Print");
        btnPrintMerchandise.setMaximumSize(new java.awt.Dimension(55, 25));
        btnPrintMerchandise.setMinimumSize(new java.awt.Dimension(55, 25));
        btnPrintMerchandise.setPreferredSize(new java.awt.Dimension(55, 25));
        btnPrintMerchandise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintMerchandiseActionPerformed(evt);
            }
        });

        btnCloseItem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCloseItem.setText("Close");
        btnCloseItem.setMaximumSize(new java.awt.Dimension(55, 25));
        btnCloseItem.setMinimumSize(new java.awt.Dimension(55, 25));
        btnCloseItem.setPreferredSize(new java.awt.Dimension(55, 25));
        btnCloseItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseItemActionPerformed(evt);
            }
        });

        btnBrowseMerchandiseImage.setText("Browse Image");
        btnBrowseMerchandiseImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseMerchandiseImageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelManageMerchandiseLayout = new javax.swing.GroupLayout(jPanelManageMerchandise);
        jPanelManageMerchandise.setLayout(jPanelManageMerchandiseLayout);
        jPanelManageMerchandiseLayout.setHorizontalGroup(
            jPanelManageMerchandiseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelManageMerchandiseLayout.createSequentialGroup()
                .addGroup(jPanelManageMerchandiseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelManageMerchandiseLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btnAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteItem, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdateItem, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClearItem, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 325, Short.MAX_VALUE)
                        .addComponent(btnPrintMerchandise, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCloseItem, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelManageMerchandiseLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanelManageMerchandiseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelManageMerchandiseLayout.createSequentialGroup()
                                .addGroup(jPanelManageMerchandiseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelManageMerchandiseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelManageMerchandiseLayout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(lblMerchandiseImage)
                                .addGap(74, 74, 74))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelManageMerchandiseLayout.createSequentialGroup()
                                .addComponent(btnBrowseMerchandiseImage, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(jPanelManageMerchandiseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelManageMerchandiseLayout.createSequentialGroup()
                                .addComponent(lblItemId1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtViewItemId, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addComponent(lblItemName1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtViewItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(106, 106, 106)
                                .addComponent(btnViewItem, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)))
                .addContainerGap())
        );
        jPanelManageMerchandiseLayout.setVerticalGroup(
            jPanelManageMerchandiseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelManageMerchandiseLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanelManageMerchandiseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblItemId1)
                    .addComponent(txtViewItemId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblItemName1)
                    .addComponent(txtViewItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelManageMerchandiseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelManageMerchandiseLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(lblMerchandiseImage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBrowseMerchandiseImage)
                        .addGap(32, 32, 32)
                        .addGroup(jPanelManageMerchandiseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblItemName)
                            .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanelManageMerchandiseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrice)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanelManageMerchandiseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(337, Short.MAX_VALUE))
                    .addGroup(jPanelManageMerchandiseLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
                        .addGroup(jPanelManageMerchandiseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDeleteItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdateItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClearItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPrintMerchandise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCloseItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        jPanelManageUsers.setBackground(new java.awt.Color(255, 255, 255));
        jPanelManageUsers.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Manage Users", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N
        jPanelManageUsers.setPreferredSize(new java.awt.Dimension(989, 795));

        jLabel10.setText("Username");

        jLabel11.setText("Password");

        jLabel12.setText("Confirm Password");

        jLabel9.setText("User Type");

        jLabel18.setText("Username");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/users.png"))); // NOI18N

        jTableUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Username", "Type", "Password"
            }
        ));
        jScrollPane3.setViewportView(jTableUsers);

        txtViewUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtViewUsernameActionPerformed(evt);
            }
        });

        txtConfirmPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmPasswordActionPerformed(evt);
            }
        });

        txtUserType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Admin", "Player", "Fan" }));
        txtUserType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserTypeActionPerformed(evt);
            }
        });

        btnAddUser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAddUser.setText("Add");
        btnAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUserActionPerformed(evt);
            }
        });

        btnClearUser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnClearUser.setText("Clear");
        btnClearUser.setMaximumSize(new java.awt.Dimension(55, 25));
        btnClearUser.setMinimumSize(new java.awt.Dimension(55, 25));
        btnClearUser.setPreferredSize(new java.awt.Dimension(55, 25));
        btnClearUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearUserActionPerformed(evt);
            }
        });

        btnCloseUser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCloseUser.setText("Close");
        btnCloseUser.setMaximumSize(new java.awt.Dimension(55, 25));
        btnCloseUser.setMinimumSize(new java.awt.Dimension(55, 25));
        btnCloseUser.setPreferredSize(new java.awt.Dimension(55, 25));
        btnCloseUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseUserActionPerformed(evt);
            }
        });

        btnUpdateUser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnUpdateUser.setText("Update");
        btnUpdateUser.setMaximumSize(new java.awt.Dimension(55, 25));
        btnUpdateUser.setMinimumSize(new java.awt.Dimension(55, 25));
        btnUpdateUser.setPreferredSize(new java.awt.Dimension(55, 25));
        btnUpdateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateUserActionPerformed(evt);
            }
        });

        btnDeleteUser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnDeleteUser.setText("Delete");
        btnDeleteUser.setMaximumSize(new java.awt.Dimension(55, 25));
        btnDeleteUser.setMinimumSize(new java.awt.Dimension(55, 25));
        btnDeleteUser.setPreferredSize(new java.awt.Dimension(55, 25));
        btnDeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteUserActionPerformed(evt);
            }
        });

        btnViewUser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnViewUser.setText("View");
        btnViewUser.setMaximumSize(new java.awt.Dimension(55, 25));
        btnViewUser.setMinimumSize(new java.awt.Dimension(55, 25));
        btnViewUser.setPreferredSize(new java.awt.Dimension(55, 25));
        btnViewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewUserActionPerformed(evt);
            }
        });

        jLabel19.setText("User Type");

        txtViewUserType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Admin", "Player", "Fan" }));
        txtViewUserType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtViewUserTypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelManageUsersLayout = new javax.swing.GroupLayout(jPanelManageUsers);
        jPanelManageUsers.setLayout(jPanelManageUsersLayout);
        jPanelManageUsersLayout.setHorizontalGroup(
            jPanelManageUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelManageUsersLayout.createSequentialGroup()
                .addGroup(jPanelManageUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelManageUsersLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAddUser, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdateUser, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClearUser, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCloseUser, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelManageUsersLayout.createSequentialGroup()
                        .addGroup(jPanelManageUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelManageUsersLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanelManageUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelManageUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelManageUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtConfirmPassword)
                                        .addComponent(txtUserPassword)
                                        .addComponent(txtUserType, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanelManageUsersLayout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jLabel8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelManageUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
                            .addGroup(jPanelManageUsersLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel18)
                                .addGap(18, 18, 18)
                                .addComponent(txtViewUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel19)
                                .addGap(19, 19, 19)
                                .addComponent(txtViewUserType, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                                .addComponent(btnViewUser, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanelManageUsersLayout.setVerticalGroup(
            jPanelManageUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelManageUsersLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanelManageUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtViewUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(txtViewUserType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelManageUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelManageUsersLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel8)
                        .addGap(34, 34, 34)
                        .addGroup(jPanelManageUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanelManageUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(txtUserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanelManageUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanelManageUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(txtUserType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelManageUsersLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(jPanelManageUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddUser)
                    .addComponent(btnUpdateUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClearUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCloseUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanelManagePlayers.setBackground(new java.awt.Color(255, 255, 255));
        jPanelManagePlayers.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Manage Players", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N
        jPanelManagePlayers.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelManagePlayers.setPreferredSize(new java.awt.Dimension(989, 795));

        lblUsername.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblUsername.setText("Username");

        lblPassword.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblPassword.setText("Password");

        lblName.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblName.setText("Name");

        lblDOB.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblDOB.setText("Date of Birth");

        lblPosition.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblPosition.setText("Position");

        lblHeight.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblHeight.setText("Height");

        lblWeight.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblWeight.setText("Weight");

        lblId1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblId1.setText("Player ID");

        lblUsername1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblUsername1.setText("Username");

        lblName1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblName1.setText("Name");

        lblPlayerImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/player2.png"))); // NOI18N

        jLabel6.setText("kg");

        jLabel5.setText("ft");

        txtPosition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Goal Keeper", "Sweeper", "Centre-Back", "Full-Back", "Wing-Back", "Defensive-Midfielder", "Central-Midfielder", "Attacking-Midfielder", "Forward", "Winger", "Striker" }));

        btnAddPlayer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAddPlayer.setText("Add");
        btnAddPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPlayerActionPerformed(evt);
            }
        });

        btnDeletePlayer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnDeletePlayer.setText("Delete");
        btnDeletePlayer.setMaximumSize(new java.awt.Dimension(55, 25));
        btnDeletePlayer.setMinimumSize(new java.awt.Dimension(55, 25));
        btnDeletePlayer.setPreferredSize(new java.awt.Dimension(55, 25));
        btnDeletePlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletePlayerActionPerformed(evt);
            }
        });

        btnUpdatePlayer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnUpdatePlayer.setText("Update");
        btnUpdatePlayer.setMaximumSize(new java.awt.Dimension(55, 25));
        btnUpdatePlayer.setMinimumSize(new java.awt.Dimension(55, 25));
        btnUpdatePlayer.setPreferredSize(new java.awt.Dimension(55, 25));
        btnUpdatePlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePlayerActionPerformed(evt);
            }
        });

        btnClosePlayer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnClosePlayer.setText("Close");
        btnClosePlayer.setMaximumSize(new java.awt.Dimension(55, 25));
        btnClosePlayer.setMinimumSize(new java.awt.Dimension(55, 25));
        btnClosePlayer.setPreferredSize(new java.awt.Dimension(55, 25));
        btnClosePlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClosePlayerActionPerformed(evt);
            }
        });

        btnView.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnView.setText("View");
        btnView.setMaximumSize(new java.awt.Dimension(55, 25));
        btnView.setMinimumSize(new java.awt.Dimension(55, 25));
        btnView.setPreferredSize(new java.awt.Dimension(55, 25));
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnPrintPlayers.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnPrintPlayers.setText("Print");
        btnPrintPlayers.setMaximumSize(new java.awt.Dimension(55, 25));
        btnPrintPlayers.setMinimumSize(new java.awt.Dimension(55, 25));
        btnPrintPlayers.setPreferredSize(new java.awt.Dimension(55, 25));
        btnPrintPlayers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintPlayersActionPerformed(evt);
            }
        });

        btnClearPlayer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnClearPlayer.setText("Clear");
        btnClearPlayer.setMaximumSize(new java.awt.Dimension(55, 25));
        btnClearPlayer.setMinimumSize(new java.awt.Dimension(55, 25));
        btnClearPlayer.setPreferredSize(new java.awt.Dimension(55, 25));
        btnClearPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearPlayerActionPerformed(evt);
            }
        });

        btnBrowseImage.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBrowseImage.setText("Browse Image");
        btnBrowseImage.setMaximumSize(new java.awt.Dimension(55, 25));
        btnBrowseImage.setMinimumSize(new java.awt.Dimension(55, 25));
        btnBrowseImage.setPreferredSize(new java.awt.Dimension(55, 25));
        btnBrowseImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseImageActionPerformed(evt);
            }
        });

        jTablePlayers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTablePlayers);

        javax.swing.GroupLayout jPanelManagePlayersLayout = new javax.swing.GroupLayout(jPanelManagePlayers);
        jPanelManagePlayers.setLayout(jPanelManagePlayersLayout);
        jPanelManagePlayersLayout.setHorizontalGroup(
            jPanelManagePlayersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelManagePlayersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelManagePlayersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelManagePlayersLayout.createSequentialGroup()
                        .addComponent(btnAddPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeletePlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdatePlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClearPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPrintPlayers, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClosePlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelManagePlayersLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanelManagePlayersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBrowseImage, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelManagePlayersLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(lblPlayerImage)))
                        .addGap(31, 31, 31)
                        .addGroup(jPanelManagePlayersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelManagePlayersLayout.createSequentialGroup()
                                .addGroup(jPanelManagePlayersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblWeight))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelManagePlayersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelManagePlayersLayout.createSequentialGroup()
                                        .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6))
                                    .addGroup(jPanelManagePlayersLayout.createSequentialGroup()
                                        .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5))
                                    .addComponent(txtPlayerUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelManagePlayersLayout.createSequentialGroup()
                                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPlayerName, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addGroup(jPanelManagePlayersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDOB)
                            .addComponent(lblPosition))
                        .addGap(8, 8, 8)
                        .addGroup(jPanelManagePlayersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPlayerPassword)
                            .addComponent(txtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(126, 126, 126))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelManagePlayersLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lblId1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtViewPlayerID, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(lblName1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNameView, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblUsername1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsernameView, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanelManagePlayersLayout.setVerticalGroup(
            jPanelManagePlayersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelManagePlayersLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanelManagePlayersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId1)
                    .addComponent(txtViewPlayerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName1)
                    .addComponent(txtNameView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsername1)
                    .addComponent(txtUsernameView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                .addGap(25, 25, 25)
                .addGroup(jPanelManagePlayersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelManagePlayersLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel5))
                    .addGroup(jPanelManagePlayersLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanelManagePlayersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelManagePlayersLayout.createSequentialGroup()
                                .addGroup(jPanelManagePlayersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblName)
                                    .addComponent(txtPlayerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelManagePlayersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPlayerUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblUsername))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelManagePlayersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblHeight)
                                    .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelManagePlayersLayout.createSequentialGroup()
                                .addComponent(lblDOB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelManagePlayersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblPassword)
                                    .addComponent(txtPlayerPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelManagePlayersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblPosition)
                                    .addComponent(txtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelManagePlayersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelManagePlayersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addComponent(lblWeight)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelManagePlayersLayout.createSequentialGroup()
                        .addComponent(lblPlayerImage)
                        .addGap(17, 17, 17)
                        .addComponent(btnBrowseImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addGap(44, 44, 44)
                .addGroup(jPanelManagePlayersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClosePlayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrintPlayers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClearPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdatePlayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeletePlayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddPlayer))
                .addContainerGap())
        );

        jPanelUpdateGallery.setBackground(new java.awt.Color(255, 255, 255));
        jPanelUpdateGallery.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gallery", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N
        jPanelUpdateGallery.setPreferredSize(new java.awt.Dimension(989, 795));

        jLabel43.setText("Image Description");

        txtImageDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImageDescriptionActionPerformed(evt);
            }
        });

        lblImageView.setBackground(new java.awt.Color(255, 255, 255));
        lblImageView.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/galery.png"))); // NOI18N

        btnBrowseGalleryImage.setText("Browse Image");
        btnBrowseGalleryImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseGalleryImageActionPerformed(evt);
            }
        });

        jTableGallery.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(jTableGallery);

        btnUpload.setText("Upload to Gallery");
        btnUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadActionPerformed(evt);
            }
        });

        btnCloseGallery.setText("Close");
        btnCloseGallery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseGalleryActionPerformed(evt);
            }
        });

        btnDeleteGallery.setText("Delete");
        btnDeleteGallery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteGalleryActionPerformed(evt);
            }
        });

        txtDeleteImageID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeleteImageIDActionPerformed(evt);
            }
        });

        jLabel49.setText("Image ID");

        btnClearGallery.setText("Clear");
        btnClearGallery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearGalleryActionPerformed(evt);
            }
        });

        btnViewGalleryByID.setText("View Image");
        btnViewGalleryByID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewGalleryByIDActionPerformed(evt);
            }
        });

        btnUpdateGallery.setText("Update");
        btnUpdateGallery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateGalleryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelUpdateGalleryLayout = new javax.swing.GroupLayout(jPanelUpdateGallery);
        jPanelUpdateGallery.setLayout(jPanelUpdateGalleryLayout);
        jPanelUpdateGalleryLayout.setHorizontalGroup(
            jPanelUpdateGalleryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUpdateGalleryLayout.createSequentialGroup()
                .addGroup(jPanelUpdateGalleryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelUpdateGalleryLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel46)
                        .addGap(28, 28, 28)
                        .addComponent(lblImageView, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelUpdateGalleryLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel43)
                        .addGap(475, 475, 475)
                        .addComponent(btnBrowseGalleryImage)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelUpdateGalleryLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel49)
                .addGap(18, 18, 18)
                .addComponent(txtDeleteImageID, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(btnViewGalleryByID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
            .addGroup(jPanelUpdateGalleryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnUpload)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdateGallery, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelUpdateGalleryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelUpdateGalleryLayout.createSequentialGroup()
                        .addComponent(btnDeleteGallery, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClearGallery, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCloseGallery, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelUpdateGalleryLayout.createSequentialGroup()
                        .addComponent(txtImageDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelUpdateGalleryLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanelUpdateGalleryLayout.setVerticalGroup(
            jPanelUpdateGalleryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUpdateGalleryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelUpdateGalleryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(txtDeleteImageID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewGalleryByID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanelUpdateGalleryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelUpdateGalleryLayout.createSequentialGroup()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelUpdateGalleryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBrowseGalleryImage)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelUpdateGalleryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtImageDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel43)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblImageView, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelUpdateGalleryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUpdateGallery)
                            .addGroup(jPanelUpdateGalleryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnCloseGallery)
                                .addComponent(btnClearGallery)
                                .addComponent(btnDeleteGallery)
                                .addComponent(btnUpload)))
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelUpdateGalleryLayout.createSequentialGroup()
                        .addComponent(jLabel46)
                        .addGap(161, 161, 161))))
        );

        jPanelManagerDetails.setBackground(new java.awt.Color(255, 255, 255));
        jPanelManagerDetails.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Manager Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N
        jPanelManagerDetails.setPreferredSize(new java.awt.Dimension(989, 795));

        lblManagerIcon.setBackground(new java.awt.Color(255, 255, 255));
        lblManagerIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/manager.png"))); // NOI18N
        lblManagerIcon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblManagerIcon.setMaximumSize(new java.awt.Dimension(154, 154));
        lblManagerIcon.setMinimumSize(new java.awt.Dimension(154, 154));
        lblManagerIcon.setName(""); // NOI18N
        lblManagerIcon.setPreferredSize(new java.awt.Dimension(154, 145));

        jLabel35.setText("Matches");

        jLabel36.setText("Wins");

        jLabel37.setText("Trophies");

        jLabel38.setText("Name");

        jLabel39.setText("Date of Birth");

        jLabel40.setText("Country");

        jLabel41.setText("Quote");

        txtManagerQuote.setColumns(20);
        txtManagerQuote.setRows(5);
        jScrollPane6.setViewportView(txtManagerQuote);

        jLabel42.setText("Image");

        btnBrowseManagerImage.setText("Browse");
        btnBrowseManagerImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseManagerImageActionPerformed(evt);
            }
        });

        btnAddManager.setText("Add a New Manager");
        btnAddManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddManagerActionPerformed(evt);
            }
        });

        btnClearManager.setText("Clear");
        btnClearManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearManagerActionPerformed(evt);
            }
        });

        btnCloseManager.setText("Close");
        btnCloseManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseManagerActionPerformed(evt);
            }
        });

        btnViewCurrentManager.setText("View Current Manager");
        btnViewCurrentManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCurrentManagerActionPerformed(evt);
            }
        });

        btnUpdateManager.setText("Update Current Manager");
        btnUpdateManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateManagerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelManagerDetailsLayout = new javax.swing.GroupLayout(jPanelManagerDetails);
        jPanelManagerDetails.setLayout(jPanelManagerDetailsLayout);
        jPanelManagerDetailsLayout.setHorizontalGroup(
            jPanelManagerDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelManagerDetailsLayout.createSequentialGroup()
                .addGroup(jPanelManagerDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelManagerDetailsLayout.createSequentialGroup()
                        .addGroup(jPanelManagerDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelManagerDetailsLayout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addComponent(lblManagerIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelManagerDetailsLayout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(jPanelManagerDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanelManagerDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel37))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelManagerDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtManagerWins, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtManagerMatches, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtManagerTrophies, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(92, 92, 92)))
                        .addGroup(jPanelManagerDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelManagerDetailsLayout.createSequentialGroup()
                                .addGroup(jPanelManagerDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel41)
                                    .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelManagerDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtManagerCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelManagerDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtManagerName, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanelManagerDetailsLayout.createSequentialGroup()
                                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBrowseManagerImage, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 141, Short.MAX_VALUE))
                    .addGroup(jPanelManagerDetailsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAddManager)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdateManager)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClearManager, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCloseManager, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelManagerDetailsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnViewCurrentManager)))
                .addContainerGap())
        );
        jPanelManagerDetailsLayout.setVerticalGroup(
            jPanelManagerDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelManagerDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelManagerDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelManagerDetailsLayout.createSequentialGroup()
                        .addComponent(btnViewCurrentManager)
                        .addGap(31, 31, 31)
                        .addGroup(jPanelManagerDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelManagerDetailsLayout.createSequentialGroup()
                                .addGroup(jPanelManagerDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtManagerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel38))
                                .addGap(15, 15, 15)
                                .addComponent(jLabel39)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelManagerDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel40)
                                    .addComponent(txtManagerCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelManagerDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel41)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(jPanelManagerDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel42)
                                    .addComponent(btnBrowseManagerImage)))
                            .addGroup(jPanelManagerDetailsLayout.createSequentialGroup()
                                .addComponent(lblManagerIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addGroup(jPanelManagerDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel35)
                                    .addComponent(txtManagerMatches, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(jPanelManagerDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel36)
                                    .addComponent(txtManagerWins, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(jPanelManagerDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel37)
                                    .addComponent(txtManagerTrophies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 324, Short.MAX_VALUE)
                        .addGroup(jPanelManagerDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnClearManager)
                            .addComponent(btnCloseManager)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelManagerDetailsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanelManagerDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddManager)
                            .addComponent(btnUpdateManager))))
                .addContainerGap())
        );

        jPanelAchivements.setBackground(new java.awt.Color(255, 255, 255));
        jPanelAchivements.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Achivements", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N
        jPanelAchivements.setPreferredSize(new java.awt.Dimension(989, 795));

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/achivments.png"))); // NOI18N

        jTableAchivements.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane8.setViewportView(jTableAchivements);

        btnCloseAchivements.setText("Close");
        btnCloseAchivements.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseAchivementsActionPerformed(evt);
            }
        });

        btnDeleteAchivement.setText("Delete");
        btnDeleteAchivement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAchivementActionPerformed(evt);
            }
        });

        jLabel1.setText("Year");

        jLabel2.setText("Description");

        jLabel3.setText("Place");

        txtAchivementPlace.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Champions", "Runners Up", "", "" }));

        btnAddAchivement.setText("Add");
        btnAddAchivement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAchivementActionPerformed(evt);
            }
        });

        btnUpdateAchivement.setText("Update");
        btnUpdateAchivement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateAchivementActionPerformed(evt);
            }
        });

        btnClearAchivement.setText("Clear");
        btnClearAchivement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearAchivementActionPerformed(evt);
            }
        });

        jLabel4.setText("Achivement ID");

        txtAchivementID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAchivementIDActionPerformed(evt);
            }
        });

        btnViewAchivement.setText("View");
        btnViewAchivement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAchivementActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAchivementsLayout = new javax.swing.GroupLayout(jPanelAchivements);
        jPanelAchivements.setLayout(jPanelAchivementsLayout);
        jPanelAchivementsLayout.setHorizontalGroup(
            jPanelAchivementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAchivementsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAddAchivement, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeleteAchivement, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdateAchivement, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClearAchivement, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCloseAchivements, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanelAchivementsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel51)
                .addGap(133, 133, 133)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAchivementID, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnViewAchivement, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addGroup(jPanelAchivementsLayout.createSequentialGroup()
                .addGroup(jPanelAchivementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAchivementsLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelAchivementsLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanelAchivementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAchivementsLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(76, 76, 76)
                                .addGroup(jPanelAchivementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAchivementDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAchivementYear, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAchivementPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanelAchivementsLayout.setVerticalGroup(
            jPanelAchivementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAchivementsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAchivementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel51)
                    .addGroup(jPanelAchivementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtAchivementID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnViewAchivement)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(jPanelAchivementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtAchivementYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelAchivementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtAchivementDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelAchivementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtAchivementPlace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(jPanelAchivementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteAchivement)
                    .addComponent(btnCloseAchivements)
                    .addComponent(btnAddAchivement)
                    .addComponent(btnUpdateAchivement)
                    .addComponent(btnClearAchivement))
                .addGap(13, 13, 13))
        );

        jPanelBlankPage.setBackground(new java.awt.Color(255, 255, 255));
        jPanelBlankPage.setPreferredSize(new java.awt.Dimension(989, 795));

        javax.swing.GroupLayout jPanelBlankPageLayout = new javax.swing.GroupLayout(jPanelBlankPage);
        jPanelBlankPage.setLayout(jPanelBlankPageLayout);
        jPanelBlankPageLayout.setHorizontalGroup(
            jPanelBlankPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 989, Short.MAX_VALUE)
        );
        jPanelBlankPageLayout.setVerticalGroup(
            jPanelBlankPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 795, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelHeader, 9269, 9269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelMainButtons, 241, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanelManagePlayers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanelManageUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanelUpdateFixtures, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanelUpdateStatictics, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanelManageMerchandise, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanelManagerDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanelUpdateGallery, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanelAchivements, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanelBlankPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelManagePlayers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelMainButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelManageUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelUpdateStatictics, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelManageMerchandise, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelManagerDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelUpdateGallery, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelAchivements, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelUpdateFixtures, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelBlankPage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageUsersActionPerformed
        btnManageFixtures.setContentAreaFilled(false);
        btnManageMerchandise.setContentAreaFilled(false);
        btnManagePlayers.setContentAreaFilled(false);
        btnManageUsers.setContentAreaFilled(true);
        btnUpdateStatistics.setContentAreaFilled(false);
        btnManagerDetails.setContentAreaFilled(false);
        btnGallery.setContentAreaFilled(false);
        btnAchivements.setContentAreaFilled(false);
        
        jPanelManageMerchandise.setVisible(false);
        jPanelUpdateFixtures.setVisible(false);
        jPanelManagePlayers.setVisible(false);
        jPanelUpdateStatictics.setVisible(false);
        jPanelManageUsers.setVisible(true);
        jPanelManagerDetails.setVisible(false);
        jPanelUpdateGallery.setVisible(false);
        jPanelAchivements.setVisible(false);
        
        ManageUsers mu=new ManageUsers();
        ResultSet rs=mu.ViewAllUsers();
        fetchUsersTable(rs);
    }//GEN-LAST:event_btnManageUsersActionPerformed

    private void btnManagePlayersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePlayersActionPerformed
        btnManageFixtures.setContentAreaFilled(false);
        btnManageMerchandise.setContentAreaFilled(false);
        btnManagePlayers.setContentAreaFilled(true);
        btnManageUsers.setContentAreaFilled(false);
        btnUpdateStatistics.setContentAreaFilled(false);
        btnManagerDetails.setContentAreaFilled(false);
        btnGallery.setContentAreaFilled(false);
        btnAchivements.setContentAreaFilled(false);
        
        jPanelManageMerchandise.setVisible(false);
        jPanelUpdateFixtures.setVisible(false);
        jPanelManagePlayers.setVisible(true);
        jPanelUpdateStatictics.setVisible(false);
        jPanelManageUsers.setVisible(false);
        jPanelManagerDetails.setVisible(false);
        jPanelUpdateGallery.setVisible(false);
        jPanelAchivements.setVisible(false);

        fetchPlayersTable();
    }//GEN-LAST:event_btnManagePlayersActionPerformed

    private void btnManageMerchandiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageMerchandiseActionPerformed
        btnManageFixtures.setContentAreaFilled(false);
        btnManageMerchandise.setContentAreaFilled(true);
        btnManagePlayers.setContentAreaFilled(false);
        btnManageUsers.setContentAreaFilled(false); 
        btnUpdateStatistics.setContentAreaFilled(false);
        btnManagerDetails.setContentAreaFilled(false);
        btnGallery.setContentAreaFilled(false);
        btnManagerDetails.setContentAreaFilled(false);
        btnGallery.setContentAreaFilled(false);
        btnAchivements.setContentAreaFilled(false);

        jPanelManageMerchandise.setVisible(true);
        jPanelUpdateFixtures.setVisible(false);
        jPanelManagePlayers.setVisible(false);
        jPanelUpdateStatictics.setVisible(false);
        jPanelManageUsers.setVisible(false);
        jPanelManagerDetails.setVisible(false);
        jPanelUpdateGallery.setVisible(false);
        jPanelAchivements.setVisible(false);
        
        ManageMerchandise mm=new ManageMerchandise();
        fetchMerchandiseTable();
    }//GEN-LAST:event_btnManageMerchandiseActionPerformed

    private void btnManageFixturesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageFixturesActionPerformed
        btnManageFixtures.setContentAreaFilled(true);
        btnManageMerchandise.setContentAreaFilled(false);
        btnManagePlayers.setContentAreaFilled(false);
        btnManageUsers.setContentAreaFilled(false);
        btnManagerDetails.setContentAreaFilled(false);
        btnUpdateStatistics.setContentAreaFilled(false);
        btnAchivements.setContentAreaFilled(false);
        btnGallery.setContentAreaFilled(false);
        
        jPanelManageMerchandise.setVisible(false);
        jPanelUpdateFixtures.setVisible(true);
        jPanelManagePlayers.setVisible(false);
        jPanelUpdateStatictics.setVisible(false);
        jPanelManageUsers.setVisible(false);
        jPanelManagerDetails.setVisible(false);
        jPanelUpdateGallery.setVisible(false);
        jPanelAchivements.setVisible(false);
        
        ManageFixtures mf=new ManageFixtures();
        ResultSet rs=mf.ViewAllFixtures();
        fetchFixturesTable(rs);
    }//GEN-LAST:event_btnManageFixturesActionPerformed

    private void btnUpdatePlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePlayerActionPerformed
        Connection conn=null;
        PreparedStatement pstmnt=null,pstmnt2=null;
        FileInputStream fis=null;
        Blob image;
        ManagePlayer mp=new ManagePlayer();
        ResultSet rs;
        if(updateFromPlayerID==0){
            JOptionPane.showMessageDialog(null, "Select a Player first.","Oops!", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtPlayerUsername.getText().isEmpty()||txtPlayerPassword.getText().isEmpty()||txtPlayerName.getText().isEmpty()||
                txtPlayerDoB.getDate()==null||txtPosition.getSelectedItem().toString().isEmpty()||txtHeight.getText().isEmpty()||txtWeight.getText().isEmpty()||updatePlayerImage==null){
            JOptionPane.showMessageDialog(null, "Fill all fields.","Oops!", JOptionPane.ERROR_MESSAGE);
        }else if(!txtHeight.getText().matches("^([+-]?\\d*\\.?\\d*)$")){
            JOptionPane.showMessageDialog(null, "Invalid Height.","Oops!", JOptionPane.ERROR_MESSAGE);
        }else if(!txtWeight.getText().matches("^([+-]?\\d*\\.?\\d*)$")){
            JOptionPane.showMessageDialog(null, "Invalid Weight.","Oops!", JOptionPane.ERROR_MESSAGE);
        }else{
            rs=mp.ViewPlayerByUsername(txtPlayerUsername.getText());
            try {
                    rs.beforeFirst();
                    try{
                        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/victory_fc","root","");
                        String sql="UPDATE `players` SET `username` = ?, `pw` =?, `name` =?,`image`=?, `dob` = ?, `weight` =?, `height` =?, `position` =? WHERE `players`.`id` =?";
                        pstmnt=conn.prepareStatement(sql);
                        String sql2="UPDATE `users` SET `username` = ?, `user_type` = 'Fan', `pw` =? WHERE `users`.`username` =?";
                        pstmnt2=conn.prepareStatement(sql2);

                        String username=txtPlayerUsername.getText();
                        String pw=txtPlayerPassword.getText();
                        String name=txtPlayerName.getText();
                        String dob=DateFormat.getDateInstance().format(txtPlayerDoB.getDate());
                        String position=txtPosition.getSelectedItem().toString();
                        float height=Float.parseFloat(txtHeight.getText());
                        float weight=Float.parseFloat(txtWeight.getText());

                        image=updatePlayerImage;
                        pstmnt.setString(1, username);
                        pstmnt.setString(2, pw);
                        pstmnt.setString(3, name);
                        if(playerImagePath == null)
                            pstmnt.setBlob(4, image);
                        else{
                            fis=new FileInputStream(playerImagePath);
                            pstmnt.setBlob(4, fis);
                        }
                        pstmnt.setString(5, dob);
                        pstmnt.setFloat(6, weight);
                        pstmnt.setFloat(7, height);
                        pstmnt.setString(8, position);
                        pstmnt.setInt(9, updateFromPlayerID);

                        pstmnt.executeUpdate();

                        pstmnt2.setString(1, username);
                        pstmnt2.setString(2, pw);
                        pstmnt2.setString(3, updateFromUsername);

                        pstmnt2.executeUpdate();

                        JOptionPane.showMessageDialog(null, "Player Updated.","Success!", JOptionPane.INFORMATION_MESSAGE);

                    } catch (SQLException ex) {
                       Logger.getLogger(MainMenuUI.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (FileNotFoundException ex) {
                       Logger.getLogger(MainMenuUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    fetchPlayersTable();
                    txtViewPlayerID.setText("");
                    txtNameView.setText("");
                    txtUsernameView.setText("");
                    txtPlayerName.setText("");
                    txtPlayerUsername.setText("");
                    txtPlayerPassword.setText("");
                    txtPlayerDoB.setDate(null);
                    txtHeight.setText("");
                    txtWeight.setText("");
                    txtPosition.setSelectedItem("");
                    lblPlayerImage.setIcon(new ImageIcon("E:\\Viranga\\Victory FC\\System\\VictoryFC_ManagementSystem\\src\\Images\\player2.png"));
                    playerImagePath=null;
                    updatePlayerImage=null;
                    updateFromPlayerID=0;
            } catch (SQLException ex) {
                Logger.getLogger(MainMenuUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnUpdatePlayerActionPerformed

    private void btnAddPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPlayerActionPerformed
        Connection conn=null;
        PreparedStatement pstmnt=null,pstmnt2=null;
        FileInputStream fis=null;
        ManagePlayer mp=new ManagePlayer();
        ResultSet rs;
        if(txtPlayerUsername.getText().isEmpty()||txtPlayerPassword.getText().isEmpty()||txtPlayerName.getText().isEmpty()||
                txtPlayerDoB.getDate()==null||txtPosition.getSelectedItem().toString().isEmpty()||txtHeight.getText().isEmpty()||txtWeight.getText().isEmpty()||playerImagePath==null){
            JOptionPane.showMessageDialog(null, "Fill all fields.","Oops!", JOptionPane.ERROR_MESSAGE);
        }else if(!txtHeight.getText().matches("^([+-]?\\d*\\.?\\d*)$")){
            JOptionPane.showMessageDialog(null, "Invalid Height.","Oops!", JOptionPane.ERROR_MESSAGE);
        }else if(!txtWeight.getText().matches("^([+-]?\\d*\\.?\\d*)$")){
            JOptionPane.showMessageDialog(null, "Invalid Weight.","Oops!", JOptionPane.ERROR_MESSAGE);
        }else{
            rs=mp.ViewPlayerByUsername(txtPlayerUsername.getText());
            try {
                if(rs.next()){
                    JOptionPane.showMessageDialog(null, "This Username has already taken.","Oops!", JOptionPane.ERROR_MESSAGE);
                }else{
                    rs.beforeFirst();
                    try{
                        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/victory_fc","root","");
                        
                        String sql="INSERT INTO `players` (`id`, `username`, `pw`, `name`,`image`, `dob`, `weight`, `height`, `position`, `status`) VALUES (NULL,?,?,?,?,?,?,?,?,'1')";
                        pstmnt=conn.prepareStatement(sql);
                        String sql2="INSERT INTO `users` (`username`, `user_type`, `pw`, `status`) VALUES (?,'Player',?,'1')";
                        pstmnt2=conn.prepareStatement(sql2);
                        
                        String username=txtPlayerUsername.getText();
                        String pw=txtPlayerPassword.getText();
                        String name=txtPlayerName.getText();
                        String dob=DateFormat.getDateInstance().format(txtPlayerDoB.getDate());
                        String position=txtPosition.getSelectedItem().toString();
                        float height=Float.parseFloat(txtHeight.getText());
                        float weight=Float.parseFloat(txtWeight.getText());
                        fis=new FileInputStream(playerImagePath);
                        
                        pstmnt.setString(1, username);
                        pstmnt.setString(2, pw);
                        pstmnt.setString(3, name);
                        pstmnt.setBlob(4, fis);
                        pstmnt.setString(5, dob);
                        pstmnt.setFloat(6, weight);
                        pstmnt.setFloat(7, height);
                        pstmnt.setString(8, position);
                        
                        pstmnt.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Player Added.","Success!", JOptionPane.INFORMATION_MESSAGE);
                        
                        pstmnt2.setString(1, username);
                        pstmnt2.setString(2, pw);
                        
                        pstmnt2.executeUpdate();
                        playerImagePath=null;
                        
                        
                    } catch (SQLException | FileNotFoundException ex) {
                        Logger.getLogger(MainMenuUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    txtPlayerName.setText("");
                    txtPlayerUsername.setText("");
                    txtPlayerPassword.setText("");
                    txtPlayerDoB.setDate(null);
                    txtHeight.setText("");
                    txtWeight.setText("");
                    txtPosition.setSelectedItem("");
                    lblPlayerImage.setIcon(new ImageIcon("E:\\Viranga\\Victory FC\\System\\VictoryFC_ManagementSystem\\src\\Images\\player2.png"));
                    playerImagePath=null;
                    updatePlayerImage=null;
                    fetchPlayersTable();
                }   } catch (SQLException ex) {
                Logger.getLogger(MainMenuUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnAddPlayerActionPerformed

    private void btnClearPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearPlayerActionPerformed
        txtViewPlayerID.setText("");
        txtNameView.setText("");
        txtUsernameView.setText("");
        txtPlayerName.setText("");
        txtPlayerUsername.setText("");
        txtPlayerPassword.setText("");
        txtPlayerDoB.setDate(null);
        txtHeight.setText("");
        txtWeight.setText("");
        txtPosition.setSelectedItem("");
        lblPlayerImage.setIcon(new ImageIcon("E:\\Viranga\\Victory FC\\System\\VictoryFC_ManagementSystem\\src\\Images\\player2.png"));
        playerImagePath=null;
        updatePlayerImage=null;
        updateFromPlayerID=0;
    }//GEN-LAST:event_btnClearPlayerActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        ManagePlayer mp=new ManagePlayer();
        ResultSet rs;
        if(txtViewPlayerID.getText().isEmpty() && txtNameView.getText().isEmpty() && txtUsernameView.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Enter a Player ID, Name or Username.","Oops!", JOptionPane.ERROR_MESSAGE);
        }
        else if(!txtViewPlayerID.getText().isEmpty() && txtNameView.getText().isEmpty() && txtUsernameView.getText().isEmpty()){
            if(!txtViewPlayerID.getText().matches("[0-9]+")){
                JOptionPane.showMessageDialog(null, "Invalid Player ID.","Oops!", JOptionPane.ERROR_MESSAGE);
            }else{
                rs=mp.ViewPlayerByID(Integer.parseInt(txtViewPlayerID.getText()));
                try {
                    if(!rs.next()){
                        JOptionPane.showMessageDialog(null, "Player not found.","Oops!", JOptionPane.ERROR_MESSAGE);
                    }else{
                        rs.beforeFirst();
                        displayPlayerDetails(rs);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(MainMenuUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        else if(txtViewPlayerID.getText().isEmpty() && !txtNameView.getText().isEmpty() && txtUsernameView.getText().isEmpty()){
            rs=mp.ViewPlayerByName(txtNameView.getText());
            try {
                if(!rs.next()){
                    JOptionPane.showMessageDialog(null, "Player not found.","Oops!", JOptionPane.ERROR_MESSAGE);
                }else{
                    rs.beforeFirst();
                    displayPlayerDetails(rs);
                }
            } catch (SQLException ex) {
                Logger.getLogger(MainMenuUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(txtViewPlayerID.getText().isEmpty() && txtNameView.getText().isEmpty() && !txtUsernameView.getText().isEmpty()){
            rs=mp.ViewPlayerByUsername(txtUsernameView.getText());
            try {
                if(!rs.next()){
                    JOptionPane.showMessageDialog(null, "Player not found.","Oops!", JOptionPane.ERROR_MESSAGE);
                }else{
                    rs.beforeFirst();
                    displayPlayerDetails(rs);
                }
            } catch (SQLException ex) {
                Logger.getLogger(MainMenuUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(!txtViewPlayerID.getText().isEmpty() && !txtNameView.getText().isEmpty() && txtUsernameView.getText().isEmpty()){
            if(!txtViewPlayerID.getText().matches("[0-9]+")){
                JOptionPane.showMessageDialog(null, "Invalid Player ID.","Oops!", JOptionPane.ERROR_MESSAGE);
            }else{
                rs=mp.ViewPlayerByIDAndName(Integer.parseInt(txtViewPlayerID.getText()),txtNameView.getText());
                try {
                    if(!rs.next()){
                        JOptionPane.showMessageDialog(null, "Player not found.","Oops!", JOptionPane.ERROR_MESSAGE);
                    }else{
                        rs.beforeFirst();
                        displayPlayerDetails(rs);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(MainMenuUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        else if(!txtViewPlayerID.getText().isEmpty() && txtNameView.getText().isEmpty() && !txtUsernameView.getText().isEmpty()){
            if(!txtViewPlayerID.getText().matches("[0-9]+")){
                JOptionPane.showMessageDialog(null, "Invalid Player ID.","Oops!", JOptionPane.ERROR_MESSAGE);
            }else{
                rs=mp.ViewPlayerByIDAndUsername(Integer.parseInt(txtViewPlayerID.getText()),txtUsernameView.getText());
                try {
                    if(!rs.next()){
                        JOptionPane.showMessageDialog(null, "Player not found.","Oops!", JOptionPane.ERROR_MESSAGE);
                    }else{
                        rs.beforeFirst();
                        displayPlayerDetails(rs);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(MainMenuUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        else if(txtViewPlayerID.getText().isEmpty() && !txtNameView.getText().isEmpty() && !txtUsernameView.getText().isEmpty()){
            rs=mp.ViewPlayerByNameAndUsername(txtNameView.getText(),txtUsernameView.getText());
            try {
                if(!rs.next()){
                    JOptionPane.showMessageDialog(null, "Player not found.","Oops!", JOptionPane.ERROR_MESSAGE);
                }else{
                    rs.beforeFirst();
                    displayPlayerDetails(rs);
                }
            } catch (SQLException ex) {
                Logger.getLogger(MainMenuUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnViewActionPerformed

    public void displayPlayerDetails(ResultSet rs){
        try {
                while(rs.next()){
                txtPlayerName.setText(rs.getString("Name"));
                txtPlayerUsername.setText(rs.getString("Username"));
                txtPlayerPassword.setText(rs.getString("Password"));
                String date=rs.getString("Date of Birth");
                java.util.Date date2 = new SimpleDateFormat("MMM dd, yyyy").parse(date);
                txtPlayerDoB.setDate(date2);
                txtHeight.setText(rs.getString("Height"));
                txtWeight.setText(rs.getString("Weight"));
                txtPosition.setSelectedItem(rs.getString("Position"));
                updateFromPlayerID=Integer.parseInt(rs.getString("ID"));
                updateFromUsername=rs.getString("Username");
                Blob blob=rs.getBlob("Image");
                updatePlayerImage=blob;
                InputStream in = blob.getBinaryStream();
                BufferedImage image = ImageIO.read(in);
                Image newImage = image.getScaledInstance(lblPlayerImage.getWidth(), lblPlayerImage.getHeight(),Image.SCALE_SMOOTH);
                ImageIcon imageR = new ImageIcon(newImage);
                lblPlayerImage.setIcon(imageR);
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            } catch (ParseException | IOException ex) {
                Logger.getLogger(MainMenuUI.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    private void btnClosePlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClosePlayerActionPerformed
        jPanelManagePlayers.setVisible(false);
        btnManagePlayers.setContentAreaFilled(false);
    }//GEN-LAST:event_btnClosePlayerActionPerformed

    private void btnDeletePlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletePlayerActionPerformed
        if(updateFromPlayerID==0){
            JOptionPane.showMessageDialog(null, "Select a Player first.","Oops!", JOptionPane.ERROR_MESSAGE);
        }else{
            int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this Player?", "Confirm",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.YES_OPTION) {
                ManagePlayer mp=new ManagePlayer();
                mp.DeletePlayer(updateFromPlayerID);
                JOptionPane.showMessageDialog(null, "Player Deleted.","Success!", JOptionPane.INFORMATION_MESSAGE);
                fetchPlayersTable();
                txtViewPlayerID.setText("");
                txtNameView.setText("");
                txtUsernameView.setText("");
                txtPlayerName.setText("");
                txtPlayerUsername.setText("");
                txtPlayerPassword.setText("");
                txtPlayerDoB.setDate(null);
                txtHeight.setText("");
                txtWeight.setText("");
                txtPosition.setSelectedItem("");
                lblPlayerImage.setIcon(new ImageIcon("E:\\Viranga\\Victory FC\\System\\VictoryFC_ManagementSystem\\src\\Images\\player2.png"));
                playerImagePath=null;
                updatePlayerImage=null;
                updateFromPlayerID=0;
            }
        }
    }//GEN-LAST:event_btnDeletePlayerActionPerformed

    private void btnAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUserActionPerformed
        String username=txtUsername.getText();
        String pw=txtUserPassword.getText();
        String cpw=txtConfirmPassword.getText();
        String type=txtUserType.getSelectedItem().toString();
        ManageUsers mu=new ManageUsers();
        ResultSet rs=mu.ViewUserByUsername(username);
        if(username.isEmpty() || pw.isEmpty() || cpw.isEmpty() || type.isEmpty()){
            JOptionPane.showMessageDialog(null, "Fill all Fields.","Oops!", JOptionPane.ERROR_MESSAGE);
        }
        else if(!pw.equals(cpw)){
            JOptionPane.showMessageDialog(null, "Passwords don\'t match.","Oops!", JOptionPane.ERROR_MESSAGE);
        }
        else try {
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "This Username has used.","Oops!", JOptionPane.ERROR_MESSAGE);
            }
            else{
                rs.beforeFirst();
                User newUser=new User(username,type,pw);
                mu.AddUser(neswUser);
                JOptionPane.showMessageDialog(null, "User Added.","Success!", JOptionPane.INFORMATION_MESSAGE);
                
                txtUsername.setText("");
                txtUserPassword.setText("");
                txtConfirmPassword.setText("");
                txtUserType.setSelectedItem("");
                rs=mu.ViewAllUsers();
                fetchUsersTable(rs);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MainMenuUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddUserActionPerformed

    private void btnClearUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearUserActionPerformed
        txtUsername.setText("");
        txtUserPassword.setText("");
        txtConfirmPassword.setText("");
        txtUserType.setSelectedItem("");
        txtViewUsername.setText("");
        txtViewUserType.setSelectedItem("");
    }//GEN-LAST:event_btnClearUserActionPerformed

    private void btnCloseUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseUserActionPerformed
        jPanelManageUsers.setVisible(false);
        btnManageUsers.setContentAreaFilled(false);
    }//GEN-LAST:event_btnCloseUserActionPerformed

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
        Connection conn;
        PreparedStatement pstmnt;
        FileInputStream fis;
        
        if(txtItemName.getText().isEmpty() || txtPrice.getText().isEmpty() || txtQuantity.getText().isEmpty() || merchandiseImagePath==null){
            JOptionPane.showMessageDialog(null, "Fill all fields.","Oops!", JOptionPane.ERROR_MESSAGE);
        }
        else if(!txtPrice.getText().matches("^([+-]?\\d*\\.?\\d*)$")){
            JOptionPane.showMessageDialog(null, "Invalid Price Value.","Oops!", JOptionPane.ERROR_MESSAGE);
        }
        else if(!txtQuantity.getText().matches("[0-9]+")){
            JOptionPane.showMessageDialog(null, "Invalid Quantity Value.","Oops!", JOptionPane.ERROR_MESSAGE);
        }
        else{
            try {
                conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/victory_fc","root","");

                String sql="INSERT INTO `merchandise` (`item_id`, `image`, `item_name`, `item_price`, `quantity`, `status`) VALUES (NULL, ?, ?, ?, ?, '1')";
                pstmnt=conn.prepareStatement(sql);

                String itemName=txtItemName.getText();
                float price=Float.parseFloat(txtPrice.getText());
                int quantity=Integer.parseInt(txtQuantity.getText());
                fis=new FileInputStream(merchandiseImagePath);

                pstmnt.setBlob(1, fis);
                pstmnt.setString(2, itemName);
                pstmnt.setFloat(3, price);
                pstmnt.setInt(4, quantity);

                pstmnt.executeUpdate();

                merchandiseImagePath=null;
                JOptionPane.showMessageDialog(null, "Item Added.","Success!", JOptionPane.INFORMATION_MESSAGE);

            } catch (SQLException ex) {
               Logger.getLogger(MainMenuUI.class.getName()).log(Level.SEVERE, null, ex);
            } catch (FileNotFoundException ex) {
               Logger.getLogger(MainMenuUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            txtItemName.setText("");
            txtPrice.setText("");
            txtQuantity.setText("");
            lblMerchandiseImage.setIcon(new ImageIcon("E:\\Viranga\\Victory FC\\System\\VictoryFC_ManagementSystem\\src\\Images\\merchandise.png"));
            merchandiseImagePath=null;
            updateMerchandiseImage=null;
            fetchMerchandiseTable();
        }
    }//GEN-LAST:event_btnAddItemActionPerformed

    private void btnClearItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearItemActionPerformed
        txtViewItemId.setText("");
        txtViewItemName.setText("");
        txtItemName.setText("");
        txtPrice.setText("");
        txtQuantity.setText("");
        lblMerchandiseImage.setIcon(new ImageIcon("E:\\Viranga\\Victory FC\\System\\VictoryFC_ManagementSystem\\src\\Images\\merchandise.png"));
    }//GEN-LAST:event_btnClearItemActionPerformed

    private void btnDeleteItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteItemActionPerformed
        if(txtViewItemId.getText().isEmpty() && txtViewItemName.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Enter an Item ID or an Item Name.","Oops!", JOptionPane.ERROR_MESSAGE);
        }
        else if(!txtViewItemId.getText().matches("[0-9]+")){
            JOptionPane.showMessageDialog(null, "Invalid Item ID","Oops!", JOptionPane.ERROR_MESSAGE);
        }else{
            int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this item?", "Confirm",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.YES_OPTION) {
                ManageMerchandise mm=new ManageMerchandise();
                mm.DeleteMerchandise(updateFromItemID);
                JOptionPane.showMessageDialog(null, "Item Deleted.","Success!", JOptionPane.INFORMATION_MESSAGE);
                fetchMerchandiseTable();
                txtViewItemId.setText("");
                txtViewItemName.setText("");
                txtItemName.setText("");
                txtPrice.setText("");
                txtQuantity.setText("");
                lblMerchandiseImage.setIcon(new ImageIcon("E:\\Viranga\\Victory FC\\System\\VictoryFC_ManagementSystem\\src\\Images\\merchandise.png"));
            }
        }
    }//GEN-LAST:event_btnDeleteItemActionPerformed

    private void btnUpdateItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateItemActionPerformed
        Connection conn=null;
        PreparedStatement pstmnt=null;
        FileInputStream fis=null;
        Blob image=null;
        
        if(txtViewItemId.getText().isEmpty() && txtViewItemName.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Enter an Item ID or an Item Name first.","Oops!", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtItemName.getText().isEmpty() || txtPrice.getText().isEmpty() || txtQuantity.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Fill all fields.","Oops!", JOptionPane.ERROR_MESSAGE);
        }
        else if(!txtPrice.getText().matches("^([+-]?\\d*\\.?\\d*)$")){
            JOptionPane.showMessageDialog(null, "Invalid Price Value.","Oops!", JOptionPane.ERROR_MESSAGE);
        }
        else if(!txtQuantity.getText().matches("[0-9]+")){
            JOptionPane.showMessageDialog(null, "Invalid Quantity Value.","Oops!", JOptionPane.ERROR_MESSAGE);
        }
        else{
            try {
                conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/victory_fc","root","");
                String sql="UPDATE `merchandise` SET `item_name` =?, `item_price` =?, `quantity` =?, `image`=? WHERE `merchandise`.`item_id` =?;";
                pstmnt=conn.prepareStatement(sql);

                String itemName=txtItemName.getText();
                Float price=Float.parseFloat(txtPrice.getText());
                int quantitiy=Integer.parseInt(txtQuantity.getText());

                image=updateMerchandiseImage;
                pstmnt.setString(1, itemName);
                pstmnt.setFloat(2, price);
                pstmnt.setInt(3, quantitiy);
                if(merchandiseImagePath==null)
                    pstmnt.setBlob(4, image);
                else{
                    fis=new FileInputStream(merchandiseImagePath);
                    pstmnt.setBlob(4, fis);
                }
                pstmnt.setInt(5, updateFromItemID);

                pstmnt.executeUpdate();

                JOptionPane.showMessageDialog(null, "Item Updated.","Success!", JOptionPane.INFORMATION_MESSAGE);

            } catch (SQLException | FileNotFoundException ex) {
               Logger.getLogger(MainMenuUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            txtViewItemId.setText("");
            txtViewItemName.setText("");
            txtItemName.setText("");
            txtPrice.setText("");
            txtQuantity.setText("");
            lblMerchandiseImage.setIcon(new ImageIcon("E:\\Viranga\\Victory FC\\System\\VictoryFC_ManagementSystem\\src\\Images\\merchandise.png"));
            fetchMerchandiseTable();
        }
    }//GEN-LAST:event_btnUpdateItemActionPerformed

    private void txtViewItemIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtViewItemIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtViewItemIdActionPerformed

    private void btnCloseItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseItemActionPerformed
        jPanelManageMerchandise.setVisible(false);
        btnManageMerchandise.setContentAreaFilled(false);
    }//GEN-LAST:event_btnCloseItemActionPerformed

    private void btnViewItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewItemActionPerformed
        ManageMerchandise mm=new ManageMerchandise();
        ResultSet rs;
        int itemID;
        String itemName=txtViewItemName.getText();
        if(txtViewItemId.getText().isEmpty() && txtViewItemName.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Enter an Item ID or an Item Name.","Oops!", JOptionPane.ERROR_MESSAGE);
        }
        else if(!txtViewItemId.getText().matches("[0-9]+")){
            JOptionPane.showMessageDialog(null, "Invalid Item ID","Oops!", JOptionPane.ERROR_MESSAGE);
        }
        else if(!txtViewItemId.getText().isEmpty() && !txtViewItemName.getText().isEmpty()){
            itemID=Integer.parseInt(txtViewItemId.getText());
            rs=mm.ViewItemByNameAndID(itemID, itemName);
            try {
                if(!rs.next()){
                    JOptionPane.showMessageDialog(null, "Invalid Item ID or Item Name.","Oops!", JOptionPane.ERROR_MESSAGE);
                }else{
                    rs.beforeFirst();
                    displayMerchandiseDetails(rs);
                }
            } catch (SQLException ex) {
                Logger.getLogger(MainMenuUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(!txtViewItemId.getText().isEmpty() && txtViewItemName.getText().isEmpty()){
            rs=mm.ViewItemByID(Integer.parseInt(txtViewItemId.getText()));
            try {
                if(!rs.next()){
                    JOptionPane.showMessageDialog(null, "Invalid Item ID","Oops!", JOptionPane.ERROR_MESSAGE);
                }else{
                    rs.beforeFirst();
                    displayMerchandiseDetails(rs);
                }
            } catch (SQLException ex) {
                Logger.getLogger(MainMenuUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
        else if(txtViewItemId.getText().isEmpty() && !txtViewItemName.getText().isEmpty()){
            rs=mm.ViewItemByName(txtViewItemName.getText());
            try {
                if(!rs.next()){
                    JOptionPane.showMessageDialog(null, "Invalid Item Name","Oops!", JOptionPane.ERROR_MESSAGE);
                }else{
                    rs.beforeFirst();  
                    displayMerchandiseDetails(rs);
                }
            } catch (SQLException ex) {
                Logger.getLogger(MainMenuUI.class.getName()).log(Level.SEVERE, null, ex);
            }  
        }
    }//GEN-LAST:event_btnViewItemActionPerformed

    public void displayMerchandiseDetails(ResultSet rs){
        try {
            while(rs.next()){
                txtItemName.setText(rs.getString("item_name"));
                txtPrice.setText(rs.getString("item_price"));
                txtQuantity.setText(rs.getString("quantity"));
                Blob blob=rs.getBlob("Image");
                updateMerchandiseImage=blob;
                InputStream in = blob.getBinaryStream();
                BufferedImage image = ImageIO.read(in);
                Image newImage = image.getScaledInstance(lblMerchandiseImage.getWidth(), lblMerchandiseImage.getHeight(),Image.SCALE_SMOOTH);
                ImageIcon imageR = new ImageIcon(newImage);
                lblMerchandiseImage.setIcon(imageR);
                updateFromItemID=Integer.parseInt(rs.getString("item_id"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(MainMenuUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void btnViewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewUserActionPerformed
        ManageUsers mu=new ManageUsers();
        ResultSet rs;
        if(txtViewUsername.getText().isEmpty() && txtViewUserType.getSelectedItem().toString().equals("")){
            rs=mu.ViewAllUsers();
            fetchUsersTable(rs);
        }
        else if(!txtViewUserType.getSelectedItem().toString().equals("")){
            rs=mu.ViewUserByUserType(txtViewUserType.getSelectedItem().toString());
            fetchUsersTable(rs);
        }
        else if(txtViewUserType.getSelectedItem().toString().equals("") && txtViewUsername.getText().isEmpty()){
            rs=mu.ViewAllUsers();
            fetchUsersTable(rs);
        }
        else{
            rs=mu.ViewUserByUsername(txtViewUsername.getText());
            try {
                if(!rs.next()){
                    JOptionPane.showMessageDialog(null, "User not found.","Oops!", JOptionPane.ERROR_MESSAGE);
                }else{
                    rs.beforeFirst();
                    try {
                        while(rs.next()){
                            txtUsername.setText(rs.getString("Username"));
                            txtUserPassword.setText(rs.getString("Password"));
                            txtUserType.setSelectedItem((rs.getString("User Type")));
                            updateFromUsername=rs.getString("Username");
                        }
                    } catch (SQLException ex) {
                        System.out.println(ex.getMessage());
                    }
                }   } catch (SQLException ex) {
                Logger.getLogger(MainMenuUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_btnViewUserActionPerformed

    private void btnDeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteUserActionPerformed
        if(updateFromUsername.isEmpty()){
            JOptionPane.showMessageDialog(null, "Enter a Username first.","Oops!", JOptionPane.ERROR_MESSAGE);
        }
        else{
            int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this user?", "Confirm",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.YES_OPTION) {
                ManageUsers mu=new ManageUsers();
                mu.DeleteUser(updateFromUsername);
                JOptionPane.showMessageDialog(null, "User Deleted.","Success!", JOptionPane.INFORMATION_MESSAGE);
                ResultSet rs=mu.ViewAllUsers();
                fetchUsersTable(rs);
                
                txtUsername.setText("");
                txtUserPassword.setText("");
                txtConfirmPassword.setText("");
                txtUserType.setSelectedItem("");
                txtViewUsername.setText("");
                txtViewUserType.setSelectedItem("");
            }
        }
    }//GEN-LAST:event_btnDeleteUserActionPerformed

    private void btnUpdateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateUserActionPerformed
        ManageUsers mu=new ManageUsers();
        ResultSet rs;

        String username=txtUsername.getText();
        String pw=txtUserPassword.getText();
        String cpw=txtConfirmPassword.getText();
        String type=txtUserType.getSelectedItem().toString();
        
        if(updateFromUsername.isEmpty()){
            JOptionPane.showMessageDialog(null, "Enter a Username first.","Oops!", JOptionPane.ERROR_MESSAGE);
        }
        rs=mu.ViewUserByUsername(username);
        if(username.isEmpty() || pw.isEmpty() || cpw.isEmpty() || type.isEmpty()){
            JOptionPane.showMessageDialog(null, "Fill all Fields.","Oops!", JOptionPane.ERROR_MESSAGE);
        }
        else if(!pw.equals(cpw)){
            JOptionPane.showMessageDialog(null, "Passwords don\'t match.","Oops!", JOptionPane.ERROR_MESSAGE);
        }
        else{
//            if(rs.next()){
//                //JOptionPane.showMessageDialog(null, "This Username has used.","Oops!", JOptionPane.ERROR_MESSAGE);
//            }
//            else{
//                rs.beforeFirst();
                User newUser=new User(username,type,pw);
                mu.UpdateUser(newUser, updateFromUsername);
                JOptionPane.showMessageDialog(null, "User Updated.","Success!", JOptionPane.INFORMATION_MESSAGE);
                
                txtUsername.setText("");
                txtUserPassword.setText("");
                txtConfirmPassword.setText("");
                txtUserType.setSelectedItem("");
                rs=mu.ViewAllUsers();
                fetchUsersTable(rs);
            }
//        } catch (SQLException ex) {
//            Logger.getLogger(MainMenuUI.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_btnUpdateUserActionPerformed

    private void btnUpdateStatisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateStatisticsActionPerformed
        btnManageFixtures.setContentAreaFilled(false);
        btnManageMerchandise.setContentAreaFilled(false);
        btnManagePlayers.setContentAreaFilled(false);
        btnManageUsers.setContentAreaFilled(false); 
        btnUpdateStatistics.setContentAreaFilled(true);
        btnManagerDetails.setContentAreaFilled(false);
        btnGallery.setContentAreaFilled(false);
        btnAchivements.setContentAreaFilled(false);
        
        jPanelManageMerchandise.setVisible(false);
        jPanelUpdateFixtures.setVisible(false);
        jPanelManagePlayers.setVisible(false);
        jPanelUpdateStatictics.setVisible(true);
        jPanelManageUsers.setVisible(false);
        jPanelManagerDetails.setVisible(false);
        jPanelUpdateGallery.setVisible(false);
        jPanelAchivements.setVisible(false);
        
        ManageStatistics ms=new ManageStatistics();
        ResultSet rs=ms.ViewAllStatistics();
        fetchStatisticsTable(rs);
    }//GEN-LAST:event_btnUpdateStatisticsActionPerformed

    private void btnUpdateStatisticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateStatisticActionPerformed
        ManageStatistics ms=new ManageStatistics();
        ManagePlayer mp=new ManagePlayer();
        ResultSet rs;
        if(txtViewPlayerStatisticID.getText().isEmpty() && txtViewPlayerStatisticsName.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Enter a Player ID or a Name first.","Oops!", JOptionPane.ERROR_MESSAGE);
        }
        else if(!txtViewPlayerStatisticID.getText().isEmpty() && txtViewPlayerStatisticsName.getText().isEmpty()){
            if(!txtViewPlayerStatisticID.getText().matches("[0-9]+")){
                JOptionPane.showMessageDialog(null, "Invalid Player ID.","Oops!", JOptionPane.ERROR_MESSAGE);
            }else{
                rs=mp.ViewPlayerByID(Integer.parseInt(txtViewPlayerStatisticID.getText()));
                try {
                    if(!rs.next()){
                        JOptionPane.showMessageDialog(null, "Player not found.","Oops!", JOptionPane.ERROR_MESSAGE);
                    }else{
                        rs.beforeFirst();
                        while(rs.next()){
                            updateStatisticFromPlayerID=Integer.parseInt(rs.getString("ID"));
                        }
                        updateStatistics();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(MainMenuUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        else if(txtViewPlayerStatisticID.getText().isEmpty() && !txtViewPlayerStatisticsName.getText().isEmpty()){
            rs=ms.ViewStatisticByName(txtViewPlayerStatisticsName.getText());
            updateStatistics();;
        }
        else if(!txtViewPlayerStatisticID.getText().isEmpty() && !txtViewPlayerStatisticsName.getText().isEmpty()){
            if(!txtViewPlayerStatisticID.getText().matches("[0-9]+")){
                JOptionPane.showMessageDialog(null, "Invalid Player ID.","Oops!", JOptionPane.ERROR_MESSAGE);
            }else{
                rs=mp.ViewPlayerByID(Integer.parseInt(txtViewPlayerStatisticID.getText()));
                try {
                    if(!rs.next()){
                        JOptionPane.showMessageDialog(null, "Player not found.","Oops!", JOptionPane.ERROR_MESSAGE);
                    }else{
                        rs.beforeFirst();
                        while(rs.next()){
                            updateStatisticFromPlayerID=Integer.parseInt(rs.getString("ID"));
                        }
                        updateStatistics();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(MainMenuUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnUpdateStatisticActionPerformed

    public void updateStatistics(){
        ManageStatistics ms=new ManageStatistics();
        ManagePlayer mp=new ManagePlayer();
        ResultSet rs=mp.ViewPlayerByID(updateStatisticFromPlayerID);
        
        if(txtStatisticMatches.getText().isEmpty() || txtStatisticGoals.getText().isEmpty() || txtStatisticAssists.getText().isEmpty() || txtStatisticRedCards.getText().isEmpty() || txtStatisticYellowCards.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Fill all fields.","Oops!", JOptionPane.ERROR_MESSAGE);
        }
        else if(!txtStatisticMatches.getText().matches("[0-9]+")){
            JOptionPane.showMessageDialog(null, "Invalid Matches count.","Oops!", JOptionPane.ERROR_MESSAGE);
        }
        else if(!txtStatisticGoals.getText().matches("[0-9]+")){
            JOptionPane.showMessageDialog(null, "Invalid Goals count.","Oops!", JOptionPane.ERROR_MESSAGE);
        }
        else if(!txtStatisticAssists.getText().matches("[0-9]+")){
            JOptionPane.showMessageDialog(null, "Invalid Assists count.","Oops!", JOptionPane.ERROR_MESSAGE);
        }
        else if(!txtStatisticRedCards.getText().matches("[0-9]+")){
            JOptionPane.showMessageDialog(null, "Invalid Red Cards count.","Oops!", JOptionPane.ERROR_MESSAGE);
        }
        else if(!txtStatisticYellowCards.getText().matches("[0-9]+")){
            JOptionPane.showMessageDialog(null, "Invalid Yellow Cards count.","Oops!", JOptionPane.ERROR_MESSAGE);
        }
        else{
            try {
                while(rs.next()){
                    int id=updateStatisticFromPlayerID;
                    String name = rs.getString("Name");
                    String dob=rs.getString("Date of Birth");
                    String position=rs.getString("Position");
                    Float height=rs.getFloat("Height");
                    Float weight=rs.getFloat("Weight");
                    int matches=Integer.parseInt(txtStatisticMatches.getText());
                    int goals=Integer.parseInt(txtStatisticGoals.getText());
                    int assists=Integer.parseInt(txtStatisticAssists.getText());
                    int red=Integer.parseInt(txtStatisticRedCards.getText());
                    int yellow=Integer.parseInt(txtStatisticYellowCards.getText());

                    Statistics newStatistic=new Statistics(id,name,dob,position,height,weight,matches,goals,assists,red,yellow);

                    ms.UpdateStatistics(newStatistic, updateStatisticFromPlayerID);
                    JOptionPane.showMessageDialog(null, "Statistics Updated.","Success!", JOptionPane.INFORMATION_MESSAGE);
                
                    clearStatisticsForm();
                }
            } catch (SQLException ex) {
               Logger.getLogger(MainMenuUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            rs=ms.ViewAllStatistics();
            fetchStatisticsTable(rs);
        }
    }
    
    private void btnCloseStatisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseStatisticsActionPerformed
        jPanelUpdateStatictics.setVisible(false);
        btnUpdateStatistics.setContentAreaFilled(false);
    }//GEN-LAST:event_btnCloseStatisticsActionPerformed

    private void btnAddStatisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStatisticsActionPerformed
        ManageStatistics ms= new ManageStatistics();
        ManagePlayer mp= new ManagePlayer();
        ResultSet rs;
        if(updateStatisticFromPlayerID==0){
            JOptionPane.showMessageDialog(null, "Select a Player first.","Oops!", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtStatisticMatches.getText().isEmpty() || txtStatisticGoals.getText().isEmpty() || txtStatisticAssists.getText().isEmpty() || txtStatisticRedCards.getText().isEmpty() || txtStatisticYellowCards.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Fill all fields.","Oops!", JOptionPane.ERROR_MESSAGE);
        }
        else if(!txtStatisticMatches.getText().matches("[0-9]+")){
            JOptionPane.showMessageDialog(null, "Invalid Matches count.","Oops!", JOptionPane.ERROR_MESSAGE);
        }
        else if(!txtStatisticGoals.getText().matches("[0-9]+")){
            JOptionPane.showMessageDialog(null, "Invalid Goals count.","Oops!", JOptionPane.ERROR_MESSAGE);
        }
        else if(!txtStatisticAssists.getText().matches("[0-9]+")){
            JOptionPane.showMessageDialog(null, "Invalid Assists count.","Oops!", JOptionPane.ERROR_MESSAGE);
        }
        else if(!txtStatisticRedCards.getText().matches("[0-9]+")){
            JOptionPane.showMessageDialog(null, "Invalid Red Cards count.","Oops!", JOptionPane.ERROR_MESSAGE);
        }
        else if(!txtStatisticYellowCards.getText().matches("[0-9]+")){
            JOptionPane.showMessageDialog(null, "Invalid Yellow Cards count.","Oops!", JOptionPane.ERROR_MESSAGE);
        }
        else{
            try {
                rs=ms.ViewStatisticByID(updateStatisticFromPlayerID);
                if(rs.next()){
                    JOptionPane.showMessageDialog(null, "This Player\'s Statistics have already added.","Oops!", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    rs=mp.ViewPlayerByID(updateStatisticFromPlayerID);
                    while(rs.next()){
                        int id=updateStatisticFromPlayerID;
                        String name = rs.getString("Name");
                        String dob=rs.getString("Date of Birth");
                        String position=rs.getString("Position");
                        Float height=rs.getFloat("Height");
                        Float weight=rs.getFloat("Weight");
                        int matches=Integer.parseInt(txtStatisticMatches.getText());
                        int goals=Integer.parseInt(txtStatisticGoals.getText());
                        int assists=Integer.parseInt(txtStatisticAssists.getText());
                        int red=Integer.parseInt(txtStatisticRedCards.getText());
                        int yellow=Integer.parseInt(txtStatisticYellowCards.getText());
                        Statistics newStatistic=new Statistics(id,name,dob,position,height,weight,matches,goals,assists,red,yellow);
                        ms.AddStatistics(newStatistic);
                        
                        JOptionPane.showMessageDialog(null, "Statistics Added.","Success!", JOptionPane.INFORMATION_MESSAGE);
                        
                        clearStatisticsForm();
                    }
                }
                
            } catch (SQLException ex) {
                System.out.println("ERROR");
                Logger.getLogger(MainMenuUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            rs=ms.ViewAllStatistics();
            fetchStatisticsTable(rs);
        }
    }//GEN-LAST:event_btnAddStatisticsActionPerformed
    
    private void btnViewStatisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewStatisticsActionPerformed
        ManageStatistics ms=new ManageStatistics();
        ManagePlayer mp=new ManagePlayer();
        ResultSet rs;
        if(txtViewPlayerStatisticID.getText().isEmpty() && txtViewPlayerStatisticsName.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Enter a Player ID or a Name.","Oops!", JOptionPane.ERROR_MESSAGE);
        }
        else if(!txtViewPlayerStatisticID.getText().isEmpty() && txtViewPlayerStatisticsName.getText().isEmpty()){
            if(!txtViewPlayerStatisticID.getText().matches("[0-9]+")){
                JOptionPane.showMessageDialog(null, "Invalid Player ID.","Oops!", JOptionPane.ERROR_MESSAGE);
            }else{
                rs=mp.ViewPlayerByID(Integer.parseInt(txtViewPlayerStatisticID.getText()));
                try {
                    if(!rs.next()){
                        JOptionPane.showMessageDialog(null, "Player not found.","Oops!", JOptionPane.ERROR_MESSAGE);
                    }else{
                        rs.beforeFirst();
                        while(rs.next()){
                            updateStatisticFromPlayerID=Integer.parseInt(rs.getString("ID"));
                        }
                        rs=ms.ViewStatisticByID(Integer.parseInt(txtViewPlayerStatisticID.getText()));
                        showStatistics(rs);
                        okButton();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(MainMenuUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        else if(txtViewPlayerStatisticID.getText().isEmpty() && !txtViewPlayerStatisticsName.getText().isEmpty()){
            rs=ms.ViewStatisticByName(txtViewPlayerStatisticsName.getText());
            showStatistics(rs);
            okButton();
        }
        else if(!txtViewPlayerStatisticID.getText().isEmpty() && !txtViewPlayerStatisticsName.getText().isEmpty()){
            if(!txtViewPlayerStatisticID.getText().matches("[0-9]+")){
                JOptionPane.showMessageDialog(null, "Invalid Player ID.","Oops!", JOptionPane.ERROR_MESSAGE);
            }else{
                rs=mp.ViewPlayerByID(Integer.parseInt(txtViewPlayerStatisticID.getText()));
                try {
                    if(!rs.next()){
                        JOptionPane.showMessageDialog(null, "Player not found.","Oops!", JOptionPane.ERROR_MESSAGE);
                    }else{
                        rs.beforeFirst();
                        while(rs.next()){
                            updateStatisticFromPlayerID=Integer.parseInt(rs.getString("ID"));
                        }
                        rs=ms.ViewStatisticByIDAndName(Integer.parseInt(txtViewPlayerStatisticID.getText()),txtViewPlayerStatisticsName.getText());
                        showStatistics(rs);
                        okButton();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(MainMenuUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnViewStatisticsActionPerformed

    public void showStatistics(ResultSet rs){
        try {
                if(!rs.next()){
                    JOptionPane.showMessageDialog(null, "Player Statistics not found.","Oops!", JOptionPane.INFORMATION_MESSAGE);
                    updateStatisticFromPlayerID=Integer.parseInt(txtViewPlayerStatisticID.getText());
                }else{
                    rs.beforeFirst();
                    try {
                        while(rs.next()){
                            txtStatisticMatches.setText(rs.getString("Matches"));
                            txtStatisticGoals.setText(rs.getString("Goals"));
                            txtStatisticAssists.setText(rs.getString("Assists"));
                            txtStatisticRedCards.setText(rs.getString("Red Cards"));
                            txtStatisticYellowCards.setText(rs.getString("Yellow Cards"));
                            updateStatisticFromPlayerID=Integer.parseInt(rs.getString("ID"));
                            fetchPlayersTable();
                        }
                    } catch (SQLException ex) {
                        System.out.println(ex.getMessage());
                    }
                }
            }catch (SQLException ex) {
                Logger.getLogger(MainMenuUI.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    public void okButton(){
        ResultSet rs=null;
        int playerId;
        if(updateStatisticFromPlayerID!=0){
            playerId=updateStatisticFromPlayerID;
        }else{
            playerId=Integer.parseInt(txtViewPlayerStatisticID.getText());
        }
        ManagePlayer mp=new ManagePlayer();
        rs=mp.ViewPlayerByID(playerId);
        try {
           if(!rs.next()){
               lblStatisticsPlayerName.setText("Invalid Player ID.");
               lblStatisticsImage.setIcon(new ImageIcon("/E:/Viranga/Victory FC/System/VictoryFC_ManagementSystem/src/Images/player.png"));
               playerDetailsForStatistics=null;
           }else{
               rs.beforeFirst();
               playerDetailsForStatistics = rs;
               Blob blob;
               try {
                   while(rs.next()){
                       try {
                           blob = rs.getBlob("Image");
                           InputStream in = blob.getBinaryStream();
                           BufferedImage image = ImageIO.read(in);
                           Image newImage = image.getScaledInstance(lblStatisticsImage.getWidth(), lblStatisticsImage.getHeight(),Image.SCALE_SMOOTH);
                           ImageIcon imageR = new ImageIcon(newImage);
                           lblStatisticsImage.setIcon(imageR);
                           String name=rs.getString("Name");
                           lblStatisticsPlayerName.setText(name);
                       } catch (SQLException | IOException ex) {
                           Logger.getLogger(MainMenuUI.class.getName()).log(Level.SEVERE, null, ex);
                       }
                   }
               } catch (SQLException ex) {
                   Logger.getLogger(MainMenuUI.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
       } catch (SQLException ex) {
           Logger.getLogger(MainMenuUI.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    
    private void btnDeleteStatisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteStatisticsActionPerformed
        ManageStatistics ms=new ManageStatistics();
        ManagePlayer mp=new ManagePlayer();
        ResultSet rs;
        if(txtViewPlayerStatisticID.getText().isEmpty() && txtViewPlayerStatisticsName.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Enter a Player ID or a Name First.","Oops!", JOptionPane.ERROR_MESSAGE);
        }
        else if(!txtViewPlayerStatisticID.getText().isEmpty() && txtViewPlayerStatisticsName.getText().isEmpty()){
            if(!txtViewPlayerStatisticID.getText().matches("[0-9]+")){
                JOptionPane.showMessageDialog(null, "Invalid Player ID.","Oops!", JOptionPane.ERROR_MESSAGE);
            }else{
                rs=mp.ViewPlayerByID(Integer.parseInt(txtViewPlayerStatisticID.getText()));
                try {
                    if(!rs.next()){
                        JOptionPane.showMessageDialog(null, "Player not found.","Oops!", JOptionPane.ERROR_MESSAGE);
                    }else{
                        rs.beforeFirst();
                        while(rs.next()){
                            updateStatisticFromPlayerID=Integer.parseInt(rs.getString("ID"));
                        }
                        int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to Delete this Statisctics?", "Confirm",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                        if (response == JOptionPane.YES_OPTION) {
                            deleteStatistics();
                        }
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(MainMenuUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        else if(txtViewPlayerStatisticID.getText().isEmpty() && !txtViewPlayerStatisticsName.getText().isEmpty()){
            rs=ms.ViewStatisticByName(txtViewPlayerStatisticsName.getText());
            showStatistics(rs);
            okButton();
        }
        else if(!txtViewPlayerStatisticID.getText().isEmpty() && !txtViewPlayerStatisticsName.getText().isEmpty()){
            if(!txtViewPlayerStatisticID.getText().matches("[0-9]+")){
                JOptionPane.showMessageDialog(null, "Invalid Player ID.","Oops!", JOptionPane.ERROR_MESSAGE);
            }else{
                rs=mp.ViewPlayerByID(Integer.parseInt(txtViewPlayerStatisticID.getText()));
                try {
                    if(!rs.next()){
                        JOptionPane.showMessageDialog(null, "Player not found.","Oops!", JOptionPane.ERROR_MESSAGE);
                    }else{
                        rs.beforeFirst();
                        while(rs.next()){
                            updateStatisticFromPlayerID=Integer.parseInt(rs.getString("ID"));
                        }
                        int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to Delete this Statisctics?", "Confirm",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                        if (response == JOptionPane.YES_OPTION) {
                            deleteStatistics();
                        }
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(MainMenuUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnDeleteStatisticsActionPerformed

    public void deleteStatistics(){
        ManageStatistics ms=new ManageStatistics();
        ms.DeleteStatistic(updateStatisticFromPlayerID);
        ResultSet rs=ms.ViewAllStatistics();
        fetchStatisticsTable(rs);
        
        clearStatisticsForm();
    }
    
    private void btnClearStatisticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearStatisticActionPerformed
        clearStatisticsForm();
    }//GEN-LAST:event_btnClearStatisticActionPerformed
    
    public void clearStatisticsForm(){
        txtViewPlayerStatisticID.setText("");
        txtViewPlayerStatisticsName.setText("");
        txtStatisticMatches.setText("");
        txtStatisticGoals.setText("");
        txtStatisticAssists.setText("");
        txtStatisticRedCards.setText("");
        txtStatisticYellowCards.setText("");
        lblStatisticsPlayerName.setText("");
        txtViewPlayerStatisticID.setText("");
        txtViewPlayerStatisticsName.setText("");
        lblStatisticsImage.setIcon(new ImageIcon("/E:/Viranga/Victory FC/System/VictoryFC_ManagementSystem/src/Images/player.png"));
        lblStatisticsPlayerName.setText("");
        playerDetailsForStatistics=null;
        updateStatisticFromPlayerID=0;  
    }
    
    private void btnPrintPlayersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintPlayersActionPerformed
        try{
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/victory_fc","root","");
            InputStream file;
            file = new FileInputStream(new File("E:\\Viranga\\Victory FC\\System\\VictoryFC_ManagementSystem\\src\\Reports\\players.jrxml"));
            JasperDesign jd=JRXmlLoader.load(file);
            JasperReport jr= JasperCompileManager.compileReport(jd);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, conn);
            JasperViewer.viewReport(jp, false);
        }catch(Exception ex){
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnPrintPlayersActionPerformed

    private void ComboBoxGroundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxGroundActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxGroundActionPerformed

    private void btnAddFixturesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFixturesActionPerformed
        String venue=txtVenue.getText();
        String time=comboHours.getSelectedItem().toString()+":"+comboMinutes.getSelectedItem().toString()+":"+comboAmPm.getSelectedItem().toString();
        String team=txtOpponetTeam.getText();
        String ground=ComboBoxGround.getSelectedItem().toString();
        
        if(txtDate.getDate()==null || venue.isEmpty() || time.isEmpty() || team.isEmpty() || ground.isEmpty()){
            JOptionPane.showMessageDialog(null, "Fill all fields.","Oops!", JOptionPane.ERROR_MESSAGE);
        }
        else{
            int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to add this fixture?", "Confirm",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(response == JOptionPane.YES_OPTION) {
                String date=DateFormat.getDateInstance().format(txtDate.getDate());
                Fixtures newFixture=new Fixtures(date, venue, time, team, ground);
                ManageFixtures mf = new ManageFixtures();
                mf.AddFixtures(newFixture);
                JOptionPane.showMessageDialog(null, "Fixtures Added.","Successful!", JOptionPane.INFORMATION_MESSAGE);
                txtDate.setDate(null);
                txtVenue.setText("");
                comboHours.setSelectedItem("00");
                comboMinutes.setSelectedItem("00");
                comboAmPm.setSelectedItem("AM");
                txtOpponetTeam.setText("");
                ComboBoxGround.setSelectedItem("Home");
                
                ResultSet rs=mf.ViewAllFixtures();
                fetchFixturesTable(rs);
            }
        }
    }//GEN-LAST:event_btnAddFixturesActionPerformed
    
    private void btnUpdateFixturesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateFixturesActionPerformed
        ManageFixtures mf=new ManageFixtures();
        ResultSet rs;

        String venue=txtVenue.getText();
        String time=comboHours.getSelectedItem().toString()+":"+comboMinutes.getSelectedItem().toString()+":"+comboAmPm.getSelectedItem().toString();
        String team=txtOpponetTeam.getText();
        String ground=ComboBoxGround.getSelectedItem().toString();
        
        if(txtDate.getDate()==null || venue.isEmpty() || time.isEmpty() || team.isEmpty() || ground.isEmpty()){
            JOptionPane.showMessageDialog(null, "Fill all fields.","Oops!", JOptionPane.ERROR_MESSAGE);
        }
        else{
            String date=DateFormat.getDateInstance().format(txtDate.getDate());
            Fixtures fix=new Fixtures(date, venue, time, team, ground);
            mf.UpdateFixtures(fix,updateFixturesFromID);
            JOptionPane.showMessageDialog(null, "Fixtures Updated.","Success!", JOptionPane.INFORMATION_MESSAGE);
            txtDate.setDate(null);
            txtVenue.setText("");
            comboHours.setSelectedItem("00");
            comboMinutes.setSelectedItem("00");
            comboAmPm.setSelectedItem("AM");
            txtOpponetTeam.setText("");
            ComboBoxGround.setSelectedItem("Home");

            rs=mf.ViewAllFixtures();
            fetchFixturesTable(rs);
        }
    }//GEN-LAST:event_btnUpdateFixturesActionPerformed

    private void btnDeleteFixturesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteFixturesActionPerformed
        ManageFixtures mf=new ManageFixtures();
        if(txtViewMatchID.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Enter a Match ID","Oops!", JOptionPane.ERROR_MESSAGE);
        }
        else{
            int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete?", "Confirm",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(response == JOptionPane.YES_OPTION) {
                int matchid=Integer.parseInt(txtViewMatchID.getText());
                mf.DeleteFixtures(matchid);
                JOptionPane.showMessageDialog(null, "Match no."+matchid+" is Deleted.","Success!", JOptionPane.INFORMATION_MESSAGE);
                txtDate.setDate(null);
                txtVenue.setText("");
                comboHours.setSelectedItem("00");
                comboMinutes.setSelectedItem("00");
                comboAmPm.setSelectedItem("AM");
                txtOpponetTeam.setText("");
                ComboBoxGround.setSelectedItem("Home");
                txtViewMatchID.setText("");
            }            
        }
    }//GEN-LAST:event_btnDeleteFixturesActionPerformed

    private void txtViewMatchIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtViewMatchIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtViewMatchIDActionPerformed

    private void txtConfirmPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmPasswordActionPerformed

    private void txtUserTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserTypeActionPerformed

    private void txtViewPlayerStatisticIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtViewPlayerStatisticIDKeyReleased

    }//GEN-LAST:event_txtViewPlayerStatisticIDKeyReleased

    public ImageIcon ResizeImage(String imgPath){
        ImageIcon MyImage = new ImageIcon(imgPath);
        Image img = MyImage.getImage();
        Image newImage = img.getScaledInstance(lblPlayerImage.getWidth(), lblPlayerImage.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon imageR = new ImageIcon(newImage);
        return imageR;
    }
    
        public ImageIcon ResizeGalleryImage(String imgPath){
        ImageIcon MyImage = new ImageIcon(imgPath);
        Image img = MyImage.getImage();
        Image newImage = img.getScaledInstance(lblImageView.getWidth(), lblImageView.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon imageR = new ImageIcon(newImage);
        return imageR;
    }
        
        public ImageIcon ResizeManagerImage(String imgPath){
        ImageIcon MyImage = new ImageIcon(imgPath);
        Image img = MyImage.getImage();
        Image newImage = img.getScaledInstance(lblManagerIcon.getWidth(), lblManagerIcon.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon imageR = new ImageIcon(newImage);
        return imageR;
    }    
       
    private void btnBrowseImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseImageActionPerformed
        JFileChooser fileChooser= new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter=new FileNameExtensionFilter("*IMAGE", "jpg" , "png" );
        fileChooser.addChoosableFileFilter(filter);
        int result=fileChooser.showSaveDialog(null);
        if(result==JFileChooser.APPROVE_OPTION){
            File selectedFile=fileChooser.getSelectedFile();
            String path=selectedFile.getAbsolutePath();
            lblPlayerImage.setIcon(ResizeImage(path));
            playerImagePath=path;
        }
        else if(result==JFileChooser.CANCEL_OPTION){
            System.out.println("No data.");
        }
    }//GEN-LAST:event_btnBrowseImageActionPerformed

    private void btnClearFixturesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearFixturesActionPerformed
        txtDate.setDate(null);
        txtVenue.setText("");
        comboHours.setSelectedItem("00");
        comboMinutes.setSelectedItem("00");
        comboAmPm.setSelectedItem("AM");
        txtOpponetTeam.setText("");
        ComboBoxGround.setSelectedItem("Home");
        txtViewMatchID.setText("");
    }//GEN-LAST:event_btnClearFixturesActionPerformed

    private void txtViewUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtViewUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtViewUsernameActionPerformed

    private void btnPrintFixturesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintFixturesActionPerformed
        try{
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/victory_fc","root","");
            InputStream file;
            file = new FileInputStream(new File("E:\\Viranga\\Victory FC\\System\\VictoryFC_ManagementSystem\\src\\Reports\\fixtures.jrxml"));
            JasperDesign jd=JRXmlLoader.load(file);
            JasperReport jr= JasperCompileManager.compileReport(jd);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, conn);
            JasperViewer.viewReport(jp, false);
        }catch(Exception ex){
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnPrintFixturesActionPerformed

    private void btnBrowseGalleryImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseGalleryImageActionPerformed
        JFileChooser fileChooser= new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter=new FileNameExtensionFilter("*IMAGE", "jpg" , "png" );
        fileChooser.addChoosableFileFilter(filter);
        int result=fileChooser.showSaveDialog(null);
        if(result==JFileChooser.APPROVE_OPTION){
            File selectedFile=fileChooser.getSelectedFile();
            String imagePath=selectedFile.getAbsolutePath();
            lblImageView.setIcon(ResizeGalleryImage(imagePath));
            galleryImagePath=imagePath;
        }
        else if(result==JFileChooser.CANCEL_OPTION){
            System.out.println("No data.");
        }
    }//GEN-LAST:event_btnBrowseGalleryImageActionPerformed

    private void btnDeleteGalleryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteGalleryActionPerformed
        int id;
        ManageGallery mg=new ManageGallery();
        ResultSet rs;
        if(txtDeleteImageID.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Enter an Image ID first.","Oops!", JOptionPane.ERROR_MESSAGE);
        }
        else if(!txtDeleteImageID.getText().matches("[0-9]+")){
            JOptionPane.showMessageDialog(null, "Invalid Image ID.","Oops!", JOptionPane.ERROR_MESSAGE);
        }
        else try {
            rs=mg.ViewGalleryByID(Integer.parseInt(txtDeleteImageID.getText()));
            if(!rs.next()){
                JOptionPane.showMessageDialog(null, "Couldn\'t find image.","Oops!", JOptionPane.ERROR_MESSAGE);
            }        
            else{
                int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this image?", "Confirm",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (response == JOptionPane.YES_OPTION) {
                    rs.beforeFirst();
                    id=Integer.parseInt(txtDeleteImageID.getText());
                    mg.DeleteGallery(id);

                    JOptionPane.showMessageDialog(null, "Image Deleted.","Success!", JOptionPane.INFORMATION_MESSAGE);

                    txtImageDescription.setText("");
                    lblImageView.setIcon(null);
                    txtDeleteImageID.setText("");
                    fetchGalleryTable();
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(MainMenuUI.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }//GEN-LAST:event_btnDeleteGalleryActionPerformed

    private void btnManagerDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagerDetailsActionPerformed
        btnManageFixtures.setContentAreaFilled(false);
        btnManageMerchandise.setContentAreaFilled(false);
        btnManagePlayers.setContentAreaFilled(false);
        btnManageUsers.setContentAreaFilled(false); 
        btnUpdateStatistics.setContentAreaFilled(false);
        btnManagerDetails.setContentAreaFilled(true);
        btnGallery.setContentAreaFilled(false);
        btnAchivements.setContentAreaFilled(false);
        
        jPanelManageMerchandise.setVisible(false);
        jPanelUpdateFixtures.setVisible(false);
        jPanelManagePlayers.setVisible(false);
        jPanelUpdateStatictics.setVisible(false);
        jPanelManageUsers.setVisible(false);
        jPanelManagerDetails.setVisible(true);
        jPanelUpdateGallery.setVisible(false);
        jPanelAchivements.setVisible(false);
        
        txtManagerName.setText("");
        txtManagerDoB.setDate(null);
        txtManagerCountry.setText("");
        txtManagerQuote.setText("");
        txtManagerMatches.setText("");
        txtManagerWins.setText("");
        txtManagerTrophies.setText("");
        lblManagerIcon.setIcon(new ImageIcon("E:\\Viranga\\Victory FC\\System\\VictoryFC_ManagementSystem\\src\\Images\\manager.png"));
    }//GEN-LAST:event_btnManagerDetailsActionPerformed

    private void btnGalleryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGalleryActionPerformed
        btnManageFixtures.setContentAreaFilled(false);
        btnManageMerchandise.setContentAreaFilled(false);
        btnManagePlayers.setContentAreaFilled(false);
        btnManageUsers.setContentAreaFilled(false); 
        btnUpdateStatistics.setContentAreaFilled(false);
        btnManagerDetails.setContentAreaFilled(false);
        btnGallery.setContentAreaFilled(true);
        btnAchivements.setContentAreaFilled(false);
        
        jPanelManageMerchandise.setVisible(false);
        jPanelUpdateFixtures.setVisible(false);
        jPanelManagePlayers.setVisible(false);
        jPanelUpdateStatictics.setVisible(false);
        jPanelManageUsers.setVisible(false);
        jPanelManagerDetails.setVisible(false);
        jPanelUpdateGallery.setVisible(true);
        jPanelAchivements.setVisible(false);
        
        fetchGalleryTable();
    }//GEN-LAST:event_btnGalleryActionPerformed

    private void btnAchivementsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAchivementsActionPerformed
        btnManageFixtures.setContentAreaFilled(false);
        btnManageMerchandise.setContentAreaFilled(false);
        btnManagePlayers.setContentAreaFilled(false);
        btnManageUsers.setContentAreaFilled(false); 
        btnUpdateStatistics.setContentAreaFilled(false);
        btnManagerDetails.setContentAreaFilled(false);
        btnGallery.setContentAreaFilled(false);
        btnAchivements.setContentAreaFilled(true);
        
        jPanelManageMerchandise.setVisible(false);
        jPanelUpdateFixtures.setVisible(false);
        jPanelManagePlayers.setVisible(false);
        jPanelUpdateStatictics.setVisible(false);
        jPanelManageUsers.setVisible(false);
        jPanelManagerDetails.setVisible(false);
        jPanelUpdateGallery.setVisible(false);
        jPanelAchivements.setVisible(true);
        
        ManageAchivements ma=new ManageAchivements();
        ResultSet rs=ma.ViewAllAchivement();
        fetchAchivementsTable(rs);
    }//GEN-LAST:event_btnAchivementsActionPerformed

    private void btnCloseGalleryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseGalleryActionPerformed
        jPanelUpdateGallery.setVisible(false);
        btnGallery.setContentAreaFilled(false);
    }//GEN-LAST:event_btnCloseGalleryActionPerformed

    private void btnCloseManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseManagerActionPerformed
        jPanelManagerDetails.setVisible(false);
        btnManagerDetails.setContentAreaFilled(false);
    }//GEN-LAST:event_btnCloseManagerActionPerformed

    private void btnDeleteAchivementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAchivementActionPerformed
        ManageAchivements ma=new ManageAchivements();
        
        if(txtAchivementID.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Enter an Achivement ID first.","Oops!", JOptionPane.ERROR_MESSAGE);
        }
        else if(!txtAchivementID.getText().matches("[0-9]+")){
            JOptionPane.showMessageDialog(null, "Invalid Achivement ID.","Oops!", JOptionPane.ERROR_MESSAGE);
        }
        else try {
            ResultSet rs=ma.ViewAchivementByID(Integer.parseInt(txtAchivementID.getText()));;
            if(!rs.next()){
                JOptionPane.showMessageDialog(null, "Achivement not found.","Oops!", JOptionPane.ERROR_MESSAGE);
            }
            else{
                rs.beforeFirst();
                int response = JOptionPane.showConfirmDialog(null, "Are you sure you want t delete this Achivement?", "Confirm",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (response == JOptionPane.YES_OPTION) {
                    int achive_id=Integer.parseInt(txtAchivementID.getText());
                    ma =new ManageAchivements();
                    ma.DeleteAchivement(achive_id);
                    rs=ma.ViewAllAchivement();
                    fetchAchivementsTable(rs);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(MainMenuUI.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }//GEN-LAST:event_btnDeleteAchivementActionPerformed

    private void btnCloseAchivementsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseAchivementsActionPerformed
        jPanelAchivements.setVisible(false);
        btnAchivements.setContentAreaFilled(false);
    }//GEN-LAST:event_btnCloseAchivementsActionPerformed

    private void btnAddAchivementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAchivementActionPerformed
        Calendar now = Calendar.getInstance();
        if(txtAchivementYear.getText().isEmpty() || txtAchivementDescription.getText().isEmpty() || txtAchivementPlace.getSelectedItem().toString().isEmpty()){
            JOptionPane.showMessageDialog(null, "Fill all fields.","Oops!", JOptionPane.ERROR_MESSAGE);
        }
        else if(!txtAchivementYear.getText().matches("[0-9]+")){
            JOptionPane.showMessageDialog(null, "Invalid year.","Oops!", JOptionPane.ERROR_MESSAGE);
        }
        else if(Integer.parseInt(txtAchivementYear.getText())<1942 || Integer.parseInt(txtAchivementYear.getText())>now.get(Calendar.YEAR)){
            JOptionPane.showMessageDialog(null, "Invalid year.","Oops!", JOptionPane.ERROR_MESSAGE);
        }else{
            int year=Integer.parseInt(txtAchivementYear.getText());

            String desc=txtAchivementDescription.getText();
            String place=txtAchivementPlace.getSelectedItem().toString();

            Achivement achive=new Achivement(year,desc,place);
            ManageAchivements ma=new ManageAchivements();
            ma.AddAchivement(achive);
            
            JOptionPane.showMessageDialog(null, "Achivement Added.","Success!", JOptionPane.INFORMATION_MESSAGE);
            
            ResultSet rs=ma.ViewAllAchivement();
            fetchAchivementsTable(rs);
            
            txtAchivementID.setText("");
            txtAchivementYear.setText("");
            txtAchivementDescription.setText("");
            txtAchivementPlace.setSelectedItem("");
        }
    }//GEN-LAST:event_btnAddAchivementActionPerformed

    private void btnClearGalleryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearGalleryActionPerformed
        txtImageDescription.setText("");
        lblImageView.setIcon(null);
        txtDeleteImageID.setText("");
    }//GEN-LAST:event_btnClearGalleryActionPerformed

    private void txtAchivementIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAchivementIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAchivementIDActionPerformed

    private void btnClearAchivementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearAchivementActionPerformed
        txtAchivementID.setText("");
        txtAchivementYear.setText("");
        txtAchivementDescription.setText("");
        txtAchivementPlace.setSelectedItem("");
    }//GEN-LAST:event_btnClearAchivementActionPerformed

    private void btnAddManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddManagerActionPerformed
        if(txtManagerName.getText().isEmpty()||DateFormat.getDateInstance().format(txtManagerDoB.getDate()).isEmpty()||txtManagerCountry.getText().isEmpty()
                ||txtManagerQuote.getText().isEmpty()||txtManagerMatches.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Essential fields are Empty.","Oops!", JOptionPane.ERROR_MESSAGE);
        }
        else if(!txtManagerMatches.getText().matches("[0-9]+")){
            JOptionPane.showMessageDialog(null, "Invalid matches count.","Oops!", JOptionPane.ERROR_MESSAGE);
        }
        else if(!txtManagerWins.getText().matches("[0-9]+")){
            JOptionPane.showMessageDialog(null, "Invalid matches count.","Oops!", JOptionPane.ERROR_MESSAGE);
        }
        else if(!txtManagerTrophies.getText().matches("[0-9]+")){
            JOptionPane.showMessageDialog(null, "Invalid matches count.","Oops!", JOptionPane.ERROR_MESSAGE);
        }else{
            String name=txtManagerName.getText();
            String dob=DateFormat.getDateInstance().format(txtManagerDoB.getDate());
            String country=txtManagerCountry.getText();
            String quote=txtManagerQuote.getText();
            int matches=Integer.parseInt(txtManagerMatches.getText());
            int wins=Integer.parseInt(txtManagerWins.getText());
            int trophies=Integer.parseInt(txtManagerTrophies.getText());
            Blob image=null;
            Connection conn=null;
            PreparedStatement pstmnt=null;
            FileInputStream fis=null;

            try {
               conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/victory_fc","root","");

               String sql="INSERT INTO `manager` (`id`, `name`, `dob`, `country`, `quote`, `image`, `matches`, `wins`, `trophies`, `status`) VALUES (NULL,?,?,?,?,?,?,?,?, '1');";
               pstmnt=conn.prepareStatement(sql);

               image=updateManagerImage;
               pstmnt.setString(1, name);
               pstmnt.setString(2, dob);
               pstmnt.setString(3, country);
               pstmnt.setString(4, quote);
               if(managerImagePath == null)
                    pstmnt.setBlob(5, image);
                else{
                    fis=new FileInputStream(managerImagePath);
                    pstmnt.setBlob(5, fis);
                }
               pstmnt.setInt(6, matches);
               pstmnt.setInt(7, wins);
               pstmnt.setInt(8, trophies);

               pstmnt.executeUpdate();
               JOptionPane.showMessageDialog(null, "New Manager Added.","Success!", JOptionPane.INFORMATION_MESSAGE);

            } catch (SQLException ex) {
               Logger.getLogger(MainMenuUI.class.getName()).log(Level.SEVERE, null, ex);
            } catch (FileNotFoundException ex) {         
               Logger.getLogger(MainMenuUI.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
    }//GEN-LAST:event_btnAddManagerActionPerformed

    private void btnUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadActionPerformed
        String desc=txtImageDescription.getText();
        
        Connection conn=null;
        PreparedStatement pstmnt=null;
        FileInputStream fis=null;
        
        if(txtImageDescription.getText().isEmpty() || galleryImagePath==null){
            JOptionPane.showMessageDialog(null, "Browse a Image and enter a Description.","Oops!", JOptionPane.ERROR_MESSAGE);
        }else{
            try {
               conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/victory_fc","root","");

               String sql="INSERT INTO `gallery` (`id`, `description`, `image`, `status`) VALUES (NULL,?,?,'1')";
               pstmnt=conn.prepareStatement(sql);

               File image=new File(galleryImagePath);
               fis=new FileInputStream(image);
               pstmnt.setString(1, desc);
               pstmnt.setBlob(2, fis);

               pstmnt.executeUpdate();
               
               JOptionPane.showMessageDialog(null, "Image Uploaded.","Success!", JOptionPane.INFORMATION_MESSAGE);

            } catch (SQLException | FileNotFoundException ex) {
               Logger.getLogger(MainMenuUI.class.getName()).log(Level.SEVERE, null, ex);
            }
           galleryImagePath=null;
           fetchGalleryTable();
        }
    }//GEN-LAST:event_btnUploadActionPerformed

    private void btnClearManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearManagerActionPerformed
        managerImagePath=null;
        txtManagerName.setText("");
        txtManagerDoB.setDate(null);
        txtManagerCountry.setText("");
        txtManagerQuote.setText("");
        txtManagerMatches.setText("");
        txtManagerWins.setText("");
        txtManagerTrophies.setText("");
        lblManagerIcon.setIcon(new ImageIcon("E:\\Viranga\\Victory FC\\System\\VictoryFC_ManagementSystem\\src\\Images\\manager.png"));
    }//GEN-LAST:event_btnClearManagerActionPerformed

    private void btnCloseFixturesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseFixturesActionPerformed
        jPanelUpdateFixtures.setVisible(false);
        btnManageFixtures.setContentAreaFilled(false);
    }//GEN-LAST:event_btnCloseFixturesActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        this.dispose();
        LoginUI login=new LoginUI();
        login.setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnBrowseManagerImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseManagerImageActionPerformed
        JFileChooser fileChooser= new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter=new FileNameExtensionFilter("*IMAGE", "jpg" , "png" );
        fileChooser.addChoosableFileFilter(filter);
        int result=fileChooser.showSaveDialog(null);
        if(result==JFileChooser.APPROVE_OPTION){
            File selectedFile=fileChooser.getSelectedFile();
            String imagePath=selectedFile.getAbsolutePath();
            lblManagerIcon.setIcon(ResizeManagerImage(imagePath));
            managerImagePath=imagePath;
        }
        else if(result==JFileChooser.CANCEL_OPTION){
            System.out.println("No data.");
        }        
    }//GEN-LAST:event_btnBrowseManagerImageActionPerformed

    private void btnViewCurrentManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCurrentManagerActionPerformed
        ManageManager mm=new ManageManager();
        ResultSet rs=mm.ViewCurrentManager();
        
        try {
            while(rs.next()){
                txtManagerName.setText(rs.getString("Name"));
                String date=rs.getString("Date of Birth");
                java.util.Date date2 = new SimpleDateFormat("MMM dd, yyyy").parse(date);
                txtManagerDoB.setDate(date2);
                txtManagerCountry.setText(rs.getString("Country"));
                txtManagerQuote.setText(rs.getString("Quote"));
                Blob blob=rs.getBlob("Image");
                updateManagerImage=blob;
                InputStream in = blob.getBinaryStream();  
                BufferedImage image = ImageIO.read(in);
                Image newImage = image.getScaledInstance(lblManagerIcon.getWidth(), lblManagerIcon.getHeight(),Image.SCALE_SMOOTH);
                ImageIcon imageR = new ImageIcon(newImage);
                lblManagerIcon.setIcon(imageR);
                txtManagerMatches.setText(rs.getString("Matches"));
                txtManagerWins.setText(rs.getString("Wins"));
                txtManagerTrophies.setText(rs.getString("Trophies"));
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            } catch (ParseException ex) {
           Logger.getLogger(MainMenuUI.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
           Logger.getLogger(MainMenuUI.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_btnViewCurrentManagerActionPerformed

    private void btnViewFixturesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewFixturesActionPerformed
        String stringMatchID=txtViewMatchID.getText();
        ManageFixtures mf=new ManageFixtures();
        ResultSet rs;
        if(stringMatchID.isEmpty()){
            JOptionPane.showMessageDialog(null, "Enter a Match ID.","Oops!", JOptionPane.ERROR_MESSAGE);
        }else if(!txtViewMatchID.getText().matches("[0-9]+")){
            JOptionPane.showMessageDialog(null, "Invalid Match ID","Oops!", JOptionPane.ERROR_MESSAGE);
        }
        else{
            int matchID=Integer.parseInt(stringMatchID);
            rs=mf.ViewFixturesByID(matchID);
            try {
                if(!rs.next()){
                    JOptionPane.showMessageDialog(null, "Match not found.","Oops!", JOptionPane.ERROR_MESSAGE);
                }else{
                    rs.beforeFirst();
                    try {
                        while(rs.next()){
                            updateFixturesFromID=rs.getInt("match_id");
                            txtOpponetTeam.setText(rs.getString("Team"));
                            ComboBoxGround.setSelectedItem(rs.getString("Ground"));
                            txtVenue.setText(rs.getString("Venue"));
                            String date=rs.getString("Date");
                            java.util.Date date2 = new SimpleDateFormat("MMM dd, yyyy").parse(date);
                            txtDate.setDate(date2);
                            String time[]=(rs.getString("Time")).split(":");
                            comboHours.setSelectedItem(time[0]);
                            comboMinutes.setSelectedItem(time[1]);
                            comboAmPm.setSelectedItem(time[2]);
                        }
                    } catch (SQLException ex) {
                        System.out.println(ex.getMessage());
                    } catch (ParseException ex) {
                        Logger.getLogger(MainMenuUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(MainMenuUI.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
    }//GEN-LAST:event_btnViewFixturesActionPerformed

    private void comboMinutesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMinutesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboMinutesActionPerformed

    private void btnViewAchivementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAchivementActionPerformed
        ManageAchivements ma=new ManageAchivements();
        
        if(txtAchivementID.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Enter an Achivement ID.","Oops!", JOptionPane.ERROR_MESSAGE);
        }
        else if(!txtAchivementID.getText().matches("[0-9]+")){
            JOptionPane.showMessageDialog(null, "Invalid Achivement ID.","Oops!", JOptionPane.ERROR_MESSAGE);
        }
        else try {
            ResultSet rs=ma.ViewAchivementByID(Integer.parseInt(txtAchivementID.getText()));;
            if(!rs.next()){
                JOptionPane.showMessageDialog(null, "Achivement not found.","Oops!", JOptionPane.ERROR_MESSAGE);
            }
            else{
                rs.beforeFirst();
                try {
                    while(rs.next()){
                        txtAchivementYear.setText(rs.getString("Year"));
                        txtAchivementDescription.setText(rs.getString("Description"));
                        txtAchivementPlace.setSelectedItem(rs.getString("Place"));
                        updateAchivementByID=Integer.parseInt(rs.getString("Achivement ID"));
                    }
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(MainMenuUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnViewAchivementActionPerformed

    private void btnUpdateAchivementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateAchivementActionPerformed
        ManageAchivements ma=new ManageAchivements();
        ResultSet rs;
        if(txtAchivementID.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Enter an Achivement ID first.","Oops!", JOptionPane.ERROR_MESSAGE);
        }
        else if(!txtAchivementID.getText().matches("[0-9]+")){
            JOptionPane.showMessageDialog(null, "Invalid Achivement ID.","Oops!", JOptionPane.ERROR_MESSAGE);
        }
        else try {
            rs=ma.ViewAchivementByID(Integer.parseInt(txtAchivementID.getText()));;
            if(!rs.next()){
                JOptionPane.showMessageDialog(null, "Achivement not found.","Oops!", JOptionPane.ERROR_MESSAGE);
            }
            else{
                int year=Integer.parseInt(txtAchivementYear.getText());
                String desc=txtAchivementDescription.getText();
                String place=txtAchivementPlace.getSelectedItem().toString();

                Achivement achive=new Achivement(year,desc,place);
                ma=new ManageAchivements();
                ma.UpdateAchivement(achive,updateAchivementByID);
                
                JOptionPane.showMessageDialog(null, "Achivement Updated.","Success!", JOptionPane.INFORMATION_MESSAGE);
                
                rs=ma.ViewAllAchivement();
                fetchAchivementsTable(rs);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MainMenuUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUpdateAchivementActionPerformed

    private void btnViewGalleryByIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewGalleryByIDActionPerformed
        ManageGallery mg=new ManageGallery();
        ResultSet rs;
        if(txtDeleteImageID.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Enter a Image ID.","Oops!", JOptionPane.ERROR_MESSAGE);
        }
        else if(!txtDeleteImageID.getText().matches("[0-9]+")){
            JOptionPane.showMessageDialog(null, "Invalid Image ID.","Oops!", JOptionPane.ERROR_MESSAGE);
        }
        else try {
            rs=mg.ViewGalleryByID(Integer.parseInt(txtDeleteImageID.getText()));
            if(!rs.next()){
                JOptionPane.showMessageDialog(null, "Image not found.","Oops!", JOptionPane.ERROR_MESSAGE);
            }
            else{
                rs.beforeFirst();
                try {
                    while(rs.next()){
                        txtImageDescription.setText(rs.getString("Description"));
                        updateFromGalleryID=Integer.parseInt(rs.getString("Image ID"));
                        Blob blob=rs.getBlob("Image");
                        updateGalleryImage=blob;
                        InputStream in = blob.getBinaryStream();
                        BufferedImage image = ImageIO.read(in);
                        Image newImage = image.getScaledInstance(lblImageView.getWidth(), lblImageView.getHeight(),Image.SCALE_SMOOTH);
                        ImageIcon imageR = new ImageIcon(newImage);
                        lblImageView.setIcon(imageR);
                    }
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                } catch (IOException ex) {
                    Logger.getLogger(MainMenuUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(MainMenuUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnViewGalleryByIDActionPerformed

    private void btnUpdateGalleryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateGalleryActionPerformed
        Connection conn=null;
        PreparedStatement pstmnt=null;
        FileInputStream fis=null;
        Blob image=null;

        if(updateFromGalleryID==0){
            JOptionPane.showMessageDialog(null, "Enter an Image ID first.","Oops!", JOptionPane.ERROR_MESSAGE);
        }else{
            try {
                conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/victory_fc","root","");
                String sql="UPDATE `gallery` SET `description` =?, `image` =? WHERE `id` =?";
                pstmnt=conn.prepareStatement(sql);
                String desc=txtImageDescription.getText();
                image=updateGalleryImage;
                pstmnt.setString(1, desc);
                if(galleryImagePath==null)
                    pstmnt.setBlob(2, image);
                else{
                    fis=new FileInputStream(galleryImagePath);
                    pstmnt.setBlob(2, fis);
                }
                    pstmnt.setInt(3, updateFromGalleryID);

                pstmnt.executeUpdate();

                JOptionPane.showMessageDialog(null, "Gallery Updated.","Success!", JOptionPane.INFORMATION_MESSAGE);

            } catch (SQLException | FileNotFoundException ex) {
               Logger.getLogger(MainMenuUI.class.getName()).log(Level.SEVERE, null, ex);
            }
                txtImageDescription.setText("");
                lblImageView.setIcon(null);
                galleryImagePath=null;
                updateGalleryImage=null;
           fetchGalleryTable();
        }
    }//GEN-LAST:event_btnUpdateGalleryActionPerformed

    private void btnBrowseMerchandiseImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseMerchandiseImageActionPerformed
        JFileChooser fileChooser= new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter=new FileNameExtensionFilter("*IMAGE", "jpg" , "png" );
        fileChooser.addChoosableFileFilter(filter);
        int result=fileChooser.showSaveDialog(null);
        if(result==JFileChooser.APPROVE_OPTION){
            File selectedFile=fileChooser.getSelectedFile();
            String path=selectedFile.getAbsolutePath();
            lblMerchandiseImage.setIcon(ResizeImage(path));
            merchandiseImagePath=path;
        }
        else if(result==JFileChooser.CANCEL_OPTION){
            System.out.println("No data.");
        }
    }//GEN-LAST:event_btnBrowseMerchandiseImageActionPerformed

    private void txtViewUserTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtViewUserTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtViewUserTypeActionPerformed

    private void txtImageDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImageDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImageDescriptionActionPerformed

    private void btnMakeNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakeNextActionPerformed
        ManageFixtures mf=new ManageFixtures();
        if(updateFixturesFromID==0){
            JOptionPane.showMessageDialog(null, "Enter a Match ID.","Oops!", JOptionPane.ERROR_MESSAGE);
        }
        else{
            mf.MakeNextMatch(updateFixturesFromID);
            JOptionPane.showMessageDialog(null, "Match no."+updateFixturesFromID+" has made as the next Match.","Success!",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnMakeNextActionPerformed
    
    private void btnUpdateManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateManagerActionPerformed
        if(txtManagerName.getText().isEmpty() || txtManagerDoB.getDate()==null || txtManagerCountry.getText().isEmpty()
                || txtManagerQuote.getText().isEmpty() || txtManagerMatches.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Essential fields are Empty.","Oops!", JOptionPane.ERROR_MESSAGE);
        }else if(!txtManagerMatches.getText().matches("[0-9]+")){
            JOptionPane.showMessageDialog(null, "Invalid matches count.","Oops!", JOptionPane.ERROR_MESSAGE);
        }
        else if(!txtManagerWins.getText().matches("[0-9]+")){
            JOptionPane.showMessageDialog(null, "Invalid matches count.","Oops!", JOptionPane.ERROR_MESSAGE);
        }
        else if(!txtManagerTrophies.getText().matches("[0-9]+")){
            JOptionPane.showMessageDialog(null, "Invalid matches count.","Oops!", JOptionPane.ERROR_MESSAGE);
        }else{
            String name=txtManagerName.getText();
            String dob=DateFormat.getDateInstance().format(txtManagerDoB.getDate());
            String country=txtManagerCountry.getText();
            String quote=txtManagerQuote.getText();
            int matches=Integer.parseInt(txtManagerMatches.getText());
            int wins=Integer.parseInt(txtManagerWins.getText());
            int trophies=Integer.parseInt(txtManagerTrophies.getText());
            Blob image=null;
            Connection conn=null;
            PreparedStatement pstmnt=null;
            FileInputStream fis=null;

            try {
               conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/victory_fc","root","");
               String sql="UPDATE `manager` SET `name` =?, `dob` =?, `country` =?, `quote` =?, `image`=?, `matches` =?, `wins` =?, `trophies` =? ORDER BY `id` DESC LIMIT 1;";
               pstmnt=conn.prepareStatement(sql);

               image=updateManagerImage;
               pstmnt.setString(1, name);
               pstmnt.setString(2, dob);
               pstmnt.setString(3, country);
               pstmnt.setString(4, quote);
               if(managerImagePath == null)
                    pstmnt.setBlob(5, image);
                else{
                    fis=new FileInputStream(managerImagePath);
                    pstmnt.setBlob(5, fis);
                }
               pstmnt.setInt(6, matches);
               pstmnt.setInt(7, wins);
               pstmnt.setInt(8, trophies);
               
               pstmnt.executeUpdate();
               JOptionPane.showMessageDialog(null, "Manager Updated.","Success!", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
               Logger.getLogger(MainMenuUI.class.getName()).log(Level.SEVERE, null, ex);
            } catch (FileNotFoundException ex) {         
               Logger.getLogger(MainMenuUI.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
    }//GEN-LAST:event_btnUpdateManagerActionPerformed

    private void txtDeleteImageIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeleteImageIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeleteImageIDActionPerformed

    private void btnStatisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatisticsActionPerformed
        try{
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/victory_fc","root","");
            InputStream file;
            file = new FileInputStream(new File("E:\\Viranga\\Victory FC\\System\\VictoryFC_ManagementSystem\\src\\Reports\\statistics.jrxml"));
            JasperDesign jd=JRXmlLoader.load(file);
            JasperReport jr= JasperCompileManager.compileReport(jd);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, conn);
            JasperViewer.viewReport(jp, false);
        }catch(Exception ex){
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnStatisticsActionPerformed

    private void btnPrintMerchandiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintMerchandiseActionPerformed
        try{
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/victory_fc","root","");
            InputStream file;
            file = new FileInputStream(new File("E:\\Viranga\\Victory FC\\System\\VictoryFC_ManagementSystem\\src\\Reports\\merchandise.jrxml"));
            JasperDesign jd=JRXmlLoader.load(file);
            JasperReport jr= JasperCompileManager.compileReport(jd);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, conn);
            JasperViewer.viewReport(jp, false);
        }catch(Exception ex){
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnPrintMerchandiseActionPerformed
    
    private void fetchPlayersTable(){
        ManagePlayer mp=new ManagePlayer();
        ArrayList<Player> list=mp.BindPlayersTable();
        String[] columnName = {"ID","Username","Name","Image","Date of Birth","Height","Weight","Position"};
        Object[][] rows = new Object[list.size()][9];
        for(int i = 0; i < list.size(); i++){
            rows[i][0] = list.get(i).id;
            rows[i][1] = list.get(i).username;
            rows[i][2] = list.get(i).name;
            
            if(list.get(i).image!= null){
                ImageIcon imageI = new ImageIcon(new ImageIcon(list.get(i).image).getImage().getScaledInstance(150, 120, Image.SCALE_SMOOTH) );   
                rows[i][3] = imageI;
            }
            else{
                rows[i][4] = null;
            }
                        
            rows[i][4] = list.get(i).dob;
            rows[i][5] = list.get(i).height;
            rows[i][6] = list.get(i).weight;
            rows[i][7] = list.get(i).position;
            
        }
        
        PlayersTableModel model = new PlayersTableModel(rows, columnName);
        jTablePlayers.setModel(model);
        jTablePlayers.setRowHeight(120);
        jTablePlayers.getColumnModel().getColumn(3).setPreferredWidth(150);
    }
    
    private void fetchGalleryTable(){
        ManageGallery mg=new ManageGallery();
        ArrayList<Gallery> list=mg.BindGalleryTable();
        String[] columnName = {"Id","Description","Image"};
        Object[][] rows = new Object[list.size()][9];
        for(int i = 0; i < list.size(); i++){
            rows[i][0] = list.get(i).id;
            rows[i][1] = list.get(i).description;
            
            if(list.get(i).image!= null){
                ImageIcon imageI = new ImageIcon(new ImageIcon(list.get(i).image).getImage().getScaledInstance(150, 120, Image.SCALE_SMOOTH) );   
                rows[i][2] = imageI;
            }
            else{
                rows[i][2] = null;
            }            
        }
        
        GalleryTableModel model = new GalleryTableModel(rows, columnName);
        jTableGallery.setModel(model);
        jTableGallery.setRowHeight(150);
        jTableGallery.getColumnModel().getColumn(0).setPreferredWidth(25);
        jTableGallery.getColumnModel().getColumn(2).setPreferredWidth(120);
    }
    
    private void fetchMerchandiseTable(){ 
        ManageMerchandise mm=new ManageMerchandise();
        ArrayList<Merchandise> list=mm.BindMerchandiseTable();
        String[] columnName = {"Item ID","Item Name","Price","Stock","Image"};
        Object[][] rows = new Object[list.size()][9];
        for(int i = 0; i < list.size(); i++){
            rows[i][0] = list.get(i).itemID;
            rows[i][1] = list.get(i).name;
            rows[i][2] = list.get(i).price;
            rows[i][3] = list.get(i).quantity;          
            
            if(list.get(i).image!= null){
                ImageIcon imageI = new ImageIcon(new ImageIcon(list.get(i).image).getImage().getScaledInstance(150, 120, Image.SCALE_SMOOTH));   
                rows[i][4] = imageI;
            }
            else{
                rows[i][4] = null;
            }
        }
        
        MerchandiseTableModel model = new MerchandiseTableModel(rows, columnName);
        jTableMerchandise.setModel(model);
        jTableMerchandise.setRowHeight(120);
        jTableMerchandise.getColumnModel().getColumn(4).setPreferredWidth(150);
    }
    
    private void fetchUsersTable(ResultSet rs){
        jTableUsers.setModel(DbUtils.resultSetToTableModel(rs));
    }
    
    private void fetchStatisticsTable(ResultSet rs){
        jTableStatistics.setModel(DbUtils.resultSetToTableModel(rs));
    }
    
    private void fetchFixturesTable(ResultSet rs){
        jTableFixtures.setModel(DbUtils.resultSetToTableModel(rs));
    }
    
    private void fetchAchivementsTable(ResultSet rs){
        jTableAchivements.setModel(DbUtils.resultSetToTableModel(rs));
    }
    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenuUI(loggedUser).setVisible(true);
            }
        });
    }
    
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logoIcon.png")));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxGround;
    private javax.swing.JButton btnAchivements;
    private javax.swing.JButton btnAddAchivement;
    private javax.swing.JButton btnAddFixtures;
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnAddManager;
    private javax.swing.JButton btnAddPlayer;
    private javax.swing.JButton btnAddStatistics;
    private javax.swing.JButton btnAddUser;
    private javax.swing.JButton btnBrowseGalleryImage;
    private javax.swing.JButton btnBrowseImage;
    private javax.swing.JButton btnBrowseManagerImage;
    private javax.swing.JButton btnBrowseMerchandiseImage;
    private javax.swing.JButton btnClearAchivement;
    private javax.swing.JButton btnClearFixtures;
    private javax.swing.JButton btnClearGallery;
    private javax.swing.JButton btnClearItem;
    private javax.swing.JButton btnClearManager;
    private javax.swing.JButton btnClearPlayer;
    private javax.swing.JButton btnClearStatistic;
    private javax.swing.JButton btnClearUser;
    private javax.swing.JButton btnCloseAchivements;
    private javax.swing.JButton btnCloseFixtures;
    private javax.swing.JButton btnCloseGallery;
    private javax.swing.JButton btnCloseItem;
    private javax.swing.JButton btnCloseManager;
    private javax.swing.JButton btnClosePlayer;
    private javax.swing.JButton btnCloseStatistics;
    private javax.swing.JButton btnCloseUser;
    private javax.swing.JButton btnDeleteAchivement;
    private javax.swing.JButton btnDeleteFixtures;
    private javax.swing.JButton btnDeleteGallery;
    private javax.swing.JButton btnDeleteItem;
    private javax.swing.JButton btnDeletePlayer;
    private javax.swing.JButton btnDeleteStatistics;
    private javax.swing.JButton btnDeleteUser;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGallery;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMakeNext;
    private javax.swing.JButton btnManageFixtures;
    private javax.swing.JButton btnManageMerchandise;
    private javax.swing.JButton btnManagePlayers;
    private javax.swing.JButton btnManageUsers;
    private javax.swing.JButton btnManagerDetails;
    private javax.swing.JButton btnPrintFixtures;
    private javax.swing.JButton btnPrintMerchandise;
    private javax.swing.JButton btnPrintPlayers;
    private javax.swing.JButton btnStatistics;
    private javax.swing.JButton btnUpdateAchivement;
    private javax.swing.JButton btnUpdateFixtures;
    private javax.swing.JButton btnUpdateGallery;
    private javax.swing.JButton btnUpdateItem;
    private javax.swing.JButton btnUpdateManager;
    private javax.swing.JButton btnUpdatePlayer;
    private javax.swing.JButton btnUpdateStatistic;
    private javax.swing.JButton btnUpdateStatistics;
    private javax.swing.JButton btnUpdateUser;
    private javax.swing.JButton btnUpload;
    private javax.swing.JButton btnView;
    private javax.swing.JButton btnViewAchivement;
    private javax.swing.JButton btnViewCurrentManager;
    private javax.swing.JButton btnViewFixtures;
    private javax.swing.JButton btnViewGalleryByID;
    private javax.swing.JButton btnViewItem;
    private javax.swing.JButton btnViewStatistics;
    private javax.swing.JButton btnViewUser;
    private javax.swing.JComboBox<String> comboAmPm;
    private javax.swing.JComboBox<String> comboHours;
    private javax.swing.JComboBox<String> comboMinutes;
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
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
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
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelHeader;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JPanel jPanelAchivements;
    private javax.swing.JPanel jPanelBlankPage;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JPanel jPanelMainButtons;
    private javax.swing.JPanel jPanelManageMerchandise;
    private javax.swing.JPanel jPanelManagePlayers;
    private javax.swing.JPanel jPanelManageUsers;
    private javax.swing.JPanel jPanelManagerDetails;
    private javax.swing.JPanel jPanelUpdateFixtures;
    private javax.swing.JPanel jPanelUpdateGallery;
    private javax.swing.JPanel jPanelUpdateStatictics;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTable jTableAchivements;
    private javax.swing.JTable jTableFixtures;
    private javax.swing.JTable jTableGallery;
    private javax.swing.JTable jTableMerchandise;
    private javax.swing.JTable jTablePlayers;
    private javax.swing.JTable jTableStatistics;
    private javax.swing.JTable jTableUsers;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblHeight;
    private javax.swing.JLabel lblId1;
    private javax.swing.JLabel lblImageView;
    private javax.swing.JLabel lblItemId1;
    private javax.swing.JLabel lblItemName;
    private javax.swing.JLabel lblItemName1;
    private javax.swing.JLabel lblLoggedUser;
    private javax.swing.JLabel lblManagerIcon;
    private javax.swing.JLabel lblMerchandiseImage;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPlayerImage;
    private javax.swing.JLabel lblPosition;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblReplyID;
    private javax.swing.JLabel lblStatisticsImage;
    private javax.swing.JLabel lblStatisticsPlayerName;
    private javax.swing.JLabel lblTeamA;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblUsername1;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JTextField txtAchivementDescription;
    private javax.swing.JTextField txtAchivementID;
    private javax.swing.JComboBox<String> txtAchivementPlace;
    private javax.swing.JTextField txtAchivementYear;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JTextField txtDeleteImageID;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtImageDescription;
    private javax.swing.JTextField txtItemName;
    private javax.swing.JTextField txtManagerCountry;
    private javax.swing.JTextField txtManagerMatches;
    private javax.swing.JTextField txtManagerName;
    private javax.swing.JTextArea txtManagerQuote;
    private javax.swing.JTextField txtManagerTrophies;
    private javax.swing.JTextField txtManagerWins;
    private javax.swing.JTextField txtNameView;
    private javax.swing.JTextField txtOpponetTeam;
    private javax.swing.JTextField txtPlayerName;
    private javax.swing.JPasswordField txtPlayerPassword;
    private javax.swing.JTextField txtPlayerUsername;
    private javax.swing.JComboBox<String> txtPosition;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtStatisticAssists;
    private javax.swing.JTextField txtStatisticGoals;
    private javax.swing.JTextField txtStatisticMatches;
    private javax.swing.JTextField txtStatisticRedCards;
    private javax.swing.JTextField txtStatisticYellowCards;
    private javax.swing.JPasswordField txtUserPassword;
    private javax.swing.JComboBox<String> txtUserType;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtUsernameView;
    private javax.swing.JTextField txtVenue;
    private javax.swing.JTextField txtViewItemId;
    private javax.swing.JTextField txtViewItemName;
    private javax.swing.JTextField txtViewMatchID;
    private javax.swing.JTextField txtViewPlayerID;
    private javax.swing.JTextField txtViewPlayerStatisticID;
    private javax.swing.JTextField txtViewPlayerStatisticsName;
    private javax.swing.JComboBox<String> txtViewUserType;
    private javax.swing.JTextField txtViewUsername;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables

    
}
