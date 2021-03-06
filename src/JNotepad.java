/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author noe
 */



import edit.JFrameFind;
import edit.JFrameReplace;
import format.JFrameFont;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.ImageIcon;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.Document;
import javax.swing.undo.UndoManager;



public class JNotepad extends javax.swing.JFrame {
    
    public static final int NEW_FILE = 0;
    public static final int NOT_NEW_FILE = 1;
    public static final int OPEN_FILE = 3;
    public static final boolean SAVE = true;
    public static final boolean NOT_SAVE = false;
    
    public static final boolean SHOWN_STATUS_BAR= true;
    public static final boolean NOT_SHOWN_STATUS_BAR= false;
    
    private String pathArgumentConsole;
   
    private int fileCreated = NOT_NEW_FILE; 
    private boolean statusFileSave = NOT_SAVE; 
    
    private File file;
    private Document document;
    private UndoManager undo;
    
    private JFrameFind jframeFind; 
    private JFrameReplace jframeReplace;
    private JFrameFont jframefont;
    
    private boolean showStatusBar = NOT_SHOWN_STATUS_BAR;
    private int lineNum = 1;
    private int colNum = 1;
    
    private ImageIcon img;
    
    public JNotepad() {
        initComponents();
        this.img = new ImageIcon("iconApp.png");
        this.setIconImage(img.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jFileChooserSaveAS = new javax.swing.JFileChooser();
        jFileChooserOpenFile = new javax.swing.JFileChooser();
        jFontChooser = new javax.swing.JFrame();
        jPanelFontChooser = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPaneFontStyle = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jScrollPaneFontSize = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        jTextFieldSelectFont = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanelButtons = new javax.swing.JPanel();
        jButtonAccept = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanelSample = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanelStatusBar = new javax.swing.JPanel();
        jTextFieldStatus = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuFileNew = new javax.swing.JMenuItem();
        jMenuFileOpen = new javax.swing.JMenuItem();
        jMenuFileSave = new javax.swing.JMenuItem();
        jMenuFileSaveAs = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuFileExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuEditUndo = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuEditCut = new javax.swing.JMenuItem();
        jMenuEditCopy = new javax.swing.JMenuItem();
        jMenuEditPaste = new javax.swing.JMenuItem();
        jMenuEditDel = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuIEditFind = new javax.swing.JMenuItem();
        jMenuFindNext = new javax.swing.JMenuItem();
        jMenuEditReplace = new javax.swing.JMenuItem();
        jMenuEditGoTo = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuEditSelectAll = new javax.swing.JMenuItem();
        jMenuEditTimeDate = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuFormatWordWrap = new javax.swing.JMenuItem();
        jMenuFormatFont = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuViewStatusBar = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuHelpViewHelp = new javax.swing.JMenuItem();
        jMenuHelpAboutJNotepad = new javax.swing.JMenuItem();

        jFileChooserSaveAS.setDialogType(javax.swing.JFileChooser.SAVE_DIALOG);

        jFontChooser.setTitle("Font");
        jFontChooser.setMinimumSize(new java.awt.Dimension(400, 450));
        jFontChooser.setResizable(false);
        jFontChooser.setSize(new java.awt.Dimension(200, 500));

        jPanelFontChooser.setBackground(java.awt.Color.white);
        jPanelFontChooser.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setLayout(new java.awt.BorderLayout());

        jScrollPaneFontStyle.setBorder(javax.swing.BorderFactory.createTitledBorder("Font Style"));
        jScrollPaneFontStyle.setPreferredSize(new java.awt.Dimension(40, 158));

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList2.setPreferredSize(new java.awt.Dimension(40, 85));
        jScrollPaneFontStyle.setViewportView(jList2);

        jPanel1.add(jScrollPaneFontStyle, java.awt.BorderLayout.CENTER);

        jScrollPaneFontSize.setBorder(javax.swing.BorderFactory.createTitledBorder("Size"));
        jScrollPaneFontSize.setPreferredSize(new java.awt.Dimension(60, 158));

        jList3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPaneFontSize.setViewportView(jList3);

        jPanel1.add(jScrollPaneFontSize, java.awt.BorderLayout.EAST);

        jPanel3.setBackground(java.awt.Color.white);
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Font"));
        jPanel3.setPreferredSize(new java.awt.Dimension(150, 32));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jTextFieldSelectFont.setText("jTextField1");
        jPanel3.add(jTextFieldSelectFont, java.awt.BorderLayout.NORTH);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "item 6", "item 7", "item 8", "item 10", "item 11", "item 12", "item 13", "item 14" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        jPanel3.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel3, java.awt.BorderLayout.WEST);

        jPanelFontChooser.add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanelButtons.setBackground(java.awt.Color.white);
        jPanelButtons.setLayout(new java.awt.GridBagLayout());

        jButtonAccept.setText("Accept");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 15, -100);
        jPanelButtons.add(jButtonAccept, gridBagConstraints);

        jButtonCancel.setText("Cancel");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 15, -280);
        jPanelButtons.add(jButtonCancel, gridBagConstraints);

        jPanelFontChooser.add(jPanelButtons, java.awt.BorderLayout.SOUTH);

        jPanel2.setBackground(java.awt.Color.white);
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanelSample.setBackground(java.awt.Color.white);
        jPanelSample.setBorder(javax.swing.BorderFactory.createTitledBorder("Sample"));
        jPanelSample.setPreferredSize(new java.awt.Dimension(220, 100));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("AaBbYyZz");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setPreferredSize(new java.awt.Dimension(150, 15));
        jPanelSample.add(jLabel1);

        jPanel2.add(jPanelSample, java.awt.BorderLayout.NORTH);

        jPanelFontChooser.add(jPanel2, java.awt.BorderLayout.EAST);

        jFontChooser.getContentPane().add(jPanelFontChooser, java.awt.BorderLayout.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("JNoted");
        setMinimumSize(new java.awt.Dimension(450, 400));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextArea1KeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanelStatusBar.setLayout(new java.awt.BorderLayout());

        jTextFieldStatus.setEditable(false);
        jTextFieldStatus.setText("jTextField1");
        jTextFieldStatus.setPreferredSize(new java.awt.Dimension(100, 25));
        jPanelStatusBar.add(jTextFieldStatus, java.awt.BorderLayout.EAST);

        getContentPane().add(jPanelStatusBar, java.awt.BorderLayout.SOUTH);

        jMenu1.setText("File");

        jMenuFileNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuFileNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/add-new-document.png"))); // NOI18N
        jMenuFileNew.setText("New");
        jMenuFileNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFileNewActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuFileNew);

        jMenuFileOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuFileOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/open-archive.png"))); // NOI18N
        jMenuFileOpen.setText("Open...");
        jMenuFileOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFileOpenActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuFileOpen);

        jMenuFileSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuFileSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/save-file-option.png"))); // NOI18N
        jMenuFileSave.setText("Save");
        jMenuFileSave.setEnabled(false);
        jMenuFileSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFileSaveActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuFileSave);

        jMenuFileSaveAs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/folderSavweAs.png"))); // NOI18N
        jMenuFileSaveAs.setText("Save As ...");
        jMenuFileSaveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFileSaveAsActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuFileSaveAs);
        jMenu1.add(jSeparator1);

        jMenuFileExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuFileExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/close.png"))); // NOI18N
        jMenuFileExit.setText("Close");
        jMenuFileExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFileExitActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuFileExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuEditUndo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        jMenuEditUndo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/undo.png"))); // NOI18N
        jMenuEditUndo.setText("Undo");
        jMenuEditUndo.setEnabled(false);
        jMenuEditUndo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEditUndoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuEditUndo);
        jMenu2.add(jSeparator2);

        jMenuEditCut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuEditCut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/cut.png"))); // NOI18N
        jMenuEditCut.setText("Cut");
        jMenuEditCut.setEnabled(false);
        jMenuEditCut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEditCutActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuEditCut);

        jMenuEditCopy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuEditCopy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/copy-document.png"))); // NOI18N
        jMenuEditCopy.setText("Copy");
        jMenuEditCopy.setEnabled(false);
        jMenuEditCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEditCopyActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuEditCopy);

        jMenuEditPaste.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuEditPaste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/paste-from-clipboard.png"))); // NOI18N
        jMenuEditPaste.setText("Paste");
        jMenuEditPaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEditPasteActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuEditPaste);

        jMenuEditDel.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        jMenuEditDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/rubbish-bin-delete-button.png"))); // NOI18N
        jMenuEditDel.setText("Delete");
        jMenuEditDel.setEnabled(false);
        jMenuEditDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEditDelActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuEditDel);
        jMenu2.add(jSeparator3);

        jMenuIEditFind.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuIEditFind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/find.png"))); // NOI18N
        jMenuIEditFind.setText("Find...");
        jMenuIEditFind.setEnabled(false);
        jMenuIEditFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuIEditFindActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuIEditFind);

        jMenuFindNext.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jMenuFindNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/findNext.png"))); // NOI18N
        jMenuFindNext.setText("Find Next");
        jMenuFindNext.setEnabled(false);
        jMenuFindNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFindNextActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuFindNext);

        jMenuEditReplace.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuEditReplace.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/replace.png"))); // NOI18N
        jMenuEditReplace.setText("Replace...");
        jMenuEditReplace.setEnabled(false);
        jMenuEditReplace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEditReplaceActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuEditReplace);

        jMenuEditGoTo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuEditGoTo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/going-to-work.png"))); // NOI18N
        jMenuEditGoTo.setText("Go To...");
        jMenuEditGoTo.setEnabled(false);
        jMenuEditGoTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEditGoToActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuEditGoTo);
        jMenu2.add(jSeparator4);

        jMenuEditSelectAll.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuEditSelectAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/selectAll.png"))); // NOI18N
        jMenuEditSelectAll.setText("Select All");
        jMenuEditSelectAll.setEnabled(false);
        jMenuEditSelectAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEditSelectAllActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuEditSelectAll);

        jMenuEditTimeDate.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jMenuEditTimeDate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/time.png"))); // NOI18N
        jMenuEditTimeDate.setText("Time/Date");
        jMenuEditTimeDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEditTimeDateActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuEditTimeDate);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Format");

        jMenuFormatWordWrap.setText("Word Wrap");
        jMenuFormatWordWrap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFormatWordWrapActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuFormatWordWrap);

        jMenuFormatFont.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/font.png"))); // NOI18N
        jMenuFormatFont.setText("Font...");
        jMenuFormatFont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFormatFontActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuFormatFont);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("View");

        jMenuViewStatusBar.setText("Status Bar");
        jMenuViewStatusBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuViewStatusBarActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuViewStatusBar);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Help");

        jMenuHelpViewHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/help.png"))); // NOI18N
        jMenuHelpViewHelp.setText("View Help");
        jMenuHelpViewHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuHelpViewHelpActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuHelpViewHelp);

        jMenuHelpAboutJNotepad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/iconApp.png"))); // NOI18N
        jMenuHelpAboutJNotepad.setText("About JNotepad");
        jMenuHelpAboutJNotepad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuHelpAboutJNotepadActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuHelpAboutJNotepad);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuFileNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFileNewActionPerformed
         
        switch (this.fileCreated){
            case NEW_FILE:
                saveAs();
                break;
            case OPEN_FILE:
                saveFile();
                break;
            case NOT_NEW_FILE:
                break;
        }
        this.jTextArea1.append(null);
        this.fileCreated = NOT_NEW_FILE;
        this.statusFileSave = NOT_SAVE;
        this.file = null;
        setNotVisibleMenu();
    }//GEN-LAST:event_jMenuFileNewActionPerformed

    private void jMenuEditUndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEditUndoActionPerformed
       undo.undo();
    }//GEN-LAST:event_jMenuEditUndoActionPerformed

    private void jMenuEditGoToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEditGoToActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuEditGoToActionPerformed

    private void jMenuEditSelectAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEditSelectAllActionPerformed
        this.jTextArea1.selectAll();
    }//GEN-LAST:event_jMenuEditSelectAllActionPerformed

    private void jMenuFormatWordWrapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFormatWordWrapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuFormatWordWrapActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        checkFileBeforeExit();
    }//GEN-LAST:event_formWindowClosing

    private void jMenuFileExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFileExitActionPerformed
        checkFileBeforeExit();
    }//GEN-LAST:event_jMenuFileExitActionPerformed

    private void jMenuFileSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFileSaveActionPerformed
        switch (this.fileCreated){
            case NEW_FILE:
                saveAs();
                break;
            case OPEN_FILE:
                saveFile();
                break;
            case NOT_NEW_FILE:
                saveFile();
                break;
        }
        this.statusFileSave = SAVE;
        this.fileCreated = OPEN_FILE;
    }//GEN-LAST:event_jMenuFileSaveActionPerformed

    private void jMenuFileSaveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFileSaveAsActionPerformed
        saveAs();
        this.statusFileSave = SAVE;
        this.fileCreated = OPEN_FILE;
    }//GEN-LAST:event_jMenuFileSaveAsActionPerformed

    private void jTextArea1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea1KeyTyped
        setVisibleMenu();
        if(this.fileCreated == NOT_NEW_FILE){
            this.fileCreated = NEW_FILE;
            this.setTitle("Untitled - JNotepad");
        }
        this.statusFileSave = NOT_SAVE;
         try{
            int caretPos = this.jTextArea1.getCaretPosition();
            lineNum = this.jTextArea1.getLineOfOffset(caretPos);
            colNum = caretPos - this.jTextArea1.getLineStartOffset(lineNum);
            lineNum += 1;
            updateStatus(lineNum, colNum);
         }catch(Exception ex){
                updateStatus(lineNum, colNum);
        }
    }//GEN-LAST:event_jTextArea1KeyTyped
    
    private void jMenuFileOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFileOpenActionPerformed
        int option = this.jFileChooserOpenFile.showOpenDialog(this);
         switch(option){
             case JFileChooser.APPROVE_OPTION:
                 this.file = this.jFileChooserOpenFile.getSelectedFile();
                    try{
                        BufferedReader br = new BufferedReader(new FileReader(this.file));
                        this.jTextArea1.read(br,null);
                        br.close();
                        this.jTextArea1.requestFocus();
                        this.fileCreated = OPEN_FILE;
                        this.statusFileSave = SAVE;
                        this.setTitle(this.file.getName() + " - JNotepad");
                    }catch(IOException ex)
                    {
                      System.out.print("Error :"+ex);
                    }
                    break;
         }
    }//GEN-LAST:event_jMenuFileOpenActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.jPanelStatusBar.setVisible(showStatusBar);
        this.undo = new UndoManager();
        this.document = this.jTextArea1.getDocument();
        this.document.addUndoableEditListener(new UndoableEditListener() {
            @Override
            public void undoableEditHappened(UndoableEditEvent e) {
                undo.addEdit(e.getEdit());
            }
        });

    }//GEN-LAST:event_formWindowOpened

    private void jMenuEditCutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEditCutActionPerformed
        this.jTextArea1.cut();
    }//GEN-LAST:event_jMenuEditCutActionPerformed

    private void jMenuEditCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEditCopyActionPerformed
        this.jTextArea1.copy();
    }//GEN-LAST:event_jMenuEditCopyActionPerformed

    private void jMenuEditPasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEditPasteActionPerformed
        this.jTextArea1.paste();
    }//GEN-LAST:event_jMenuEditPasteActionPerformed

    private void jMenuEditDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEditDelActionPerformed
        this.jTextArea1.replaceSelection("");
    }//GEN-LAST:event_jMenuEditDelActionPerformed

    private void jMenuIEditFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuIEditFindActionPerformed
        this.jframeFind = new JFrameFind();
        this.jframeFind.setjTextAreaToFind(this.jTextArea1);
        this.jframeFind.setVisible(true);
        this.jMenuFindNext.setEnabled(true);
    }//GEN-LAST:event_jMenuIEditFindActionPerformed

    private void jMenuFindNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFindNextActionPerformed
        this.jframeFind.find();
    }//GEN-LAST:event_jMenuFindNextActionPerformed

    private void jMenuEditReplaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEditReplaceActionPerformed
        this.jframeReplace = new JFrameReplace();
        this.jframeReplace.setjTextAreaToReplace(this.jTextArea1);
        this.jframeReplace.setVisible(true);
    }//GEN-LAST:event_jMenuEditReplaceActionPerformed

    private void jMenuEditTimeDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEditTimeDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuEditTimeDateActionPerformed

    private void jMenuFormatFontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFormatFontActionPerformed
        this.jframefont = new JFrameFont();
        this.jframefont.setTextArea(this.jTextArea1);
        this.jframefont.setVisible(true);
        //this.jFontChooser.setVisible(true);
        
    }//GEN-LAST:event_jMenuFormatFontActionPerformed

    private void jMenuViewStatusBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuViewStatusBarActionPerformed
        this.jPanelStatusBar.setVisible(true);
        this.jTextFieldStatus.setText("L: "+this.jTextArea1.getRows()+"C: "+this.jTextArea1.getColumns());
    }//GEN-LAST:event_jMenuViewStatusBarActionPerformed

    private void jMenuHelpViewHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuHelpViewHelpActionPerformed
        if (Desktop.isDesktopSupported()) {
            try{
                Desktop.getDesktop().browse(new URI("https://github.com/NoeVG/JNotepad"));
            }catch (IOException | URISyntaxException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jMenuHelpViewHelpActionPerformed

    private void jMenuHelpAboutJNotepadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuHelpAboutJNotepadActionPerformed
        if (Desktop.isDesktopSupported()) {
            try{
                Desktop.getDesktop().browse(new URI("https://github.com/NoeVG/JNotepad"));
            }catch (IOException | URISyntaxException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jMenuHelpAboutJNotepadActionPerformed
    public void checkFileBeforeExit(){
        if( (this.fileCreated == NEW_FILE)||(this.fileCreated == OPEN_FILE) ){
            if(this.statusFileSave == NOT_SAVE){
                int optionSave = JOptionPane.showConfirmDialog(null,
                    "Do you want to save the  changes before closing ?");
                switch(optionSave){
                    case JOptionPane.CANCEL_OPTION:
                        break;
                    case JOptionPane.OK_OPTION:
                        if(this.fileCreated == OPEN_FILE){              
                            saveFile();
                        }else{
                            saveAs();           
                        }
                        close();
                        break;
                    case JOptionPane.NO_OPTION:
                        close();
                        break;
                }            
            }else{
                close();
            }
        }else{
            close();
        }
    }
    private void saveAs(){
        int option = this.jFileChooserSaveAS.showSaveDialog(this);
        switch(option){
            case JFileChooser.APPROVE_OPTION:
                if(this.jFileChooserSaveAS.getSelectedFile().exists()){
                    int overwriteFile = JOptionPane.showConfirmDialog(null,
                            "A file named "+this.jFileChooserSaveAS.getSelectedFile().getName()+" already"
                                    + "exist. Do you want to replace it?");
                    switch(overwriteFile){
                        case JOptionPane.CANCEL_OPTION:
                            saveAs();
                            break;
                        case JOptionPane.OK_OPTION:
                            this.file = this.jFileChooserSaveAS.getSelectedFile();
                            saveFile();
                            break;
                        case JOptionPane.NO_OPTION:
                            break;
                    }
                }else{
                    this.file = this.jFileChooserSaveAS.getSelectedFile();
                    saveFile();
                }            
                break;
            case JFileChooser.CANCEL_OPTION:
                break;
        }
        this.setTitle(this.jFileChooserSaveAS.getSelectedFile().getName()+" - JNotepad");
    }
    public void saveFile(){
        try{
            BufferedWriter out = new BufferedWriter(new FileWriter(this.file)); 
            this.jTextArea1.write(out);
            out.close();
            this.statusFileSave = SAVE;
        }catch(IOException ex)
        {
          System.out.print("Error :"+ex);
        }
    }
    private void updateStatus(int linenumber, int columnnumber) {
        this.jTextFieldStatus.setText("L: " + linenumber + " C: " + columnnumber);
    }
    private void setVisibleMenu(){
        this.jMenuFileSave.setEnabled(true);
        this.jMenuEditSelectAll.setEnabled(true);
        this.jMenuEditUndo.setEnabled(true);
        this.jMenuEditCut.setEnabled(true);
        this.jMenuEditCopy.setEnabled(true);
        this.jMenuIEditFind.setEnabled(true);
        this.jMenuEditReplace.setEnabled(true);
        this.jMenuEditGoTo.setEnabled(true);
        this.jMenuEditDel.setEnabled(true);        
    }
    private void setNotVisibleMenu(){
        this.jMenuFileSave.setEnabled(false);
        this.jMenuEditSelectAll.setEnabled(false);
        this.jMenuEditUndo.setEnabled(false);
        this.jMenuEditCut.setEnabled(false);
        this.jMenuEditCopy.setEnabled(false);
        this.jMenuIEditFind.setEnabled(false);
        this.jMenuFindNext.setEnabled(false);
        this.jMenuEditReplace.setEnabled(false);
        this.jMenuEditGoTo.setEnabled(false);
        this.jMenuEditDel.setEnabled(false);        
    }
    private void close(){
        this.dispose();
        System.exit(0);
    }
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
            java.util.logging.Logger.getLogger(JNotepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JNotepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JNotepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JNotepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JNotepad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAccept;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JFileChooser jFileChooserOpenFile;
    private javax.swing.JFileChooser jFileChooserSaveAS;
    private javax.swing.JFrame jFontChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuEditCopy;
    private javax.swing.JMenuItem jMenuEditCut;
    private javax.swing.JMenuItem jMenuEditDel;
    private javax.swing.JMenuItem jMenuEditGoTo;
    private javax.swing.JMenuItem jMenuEditPaste;
    private javax.swing.JMenuItem jMenuEditReplace;
    private javax.swing.JMenuItem jMenuEditSelectAll;
    private javax.swing.JMenuItem jMenuEditTimeDate;
    private javax.swing.JMenuItem jMenuEditUndo;
    private javax.swing.JMenuItem jMenuFileExit;
    private javax.swing.JMenuItem jMenuFileNew;
    private javax.swing.JMenuItem jMenuFileOpen;
    private javax.swing.JMenuItem jMenuFileSave;
    private javax.swing.JMenuItem jMenuFileSaveAs;
    private javax.swing.JMenuItem jMenuFindNext;
    private javax.swing.JMenuItem jMenuFormatFont;
    private javax.swing.JMenuItem jMenuFormatWordWrap;
    private javax.swing.JMenuItem jMenuHelpAboutJNotepad;
    private javax.swing.JMenuItem jMenuHelpViewHelp;
    private javax.swing.JMenuItem jMenuIEditFind;
    private javax.swing.JMenuItem jMenuViewStatusBar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelButtons;
    private javax.swing.JPanel jPanelFontChooser;
    private javax.swing.JPanel jPanelSample;
    private javax.swing.JPanel jPanelStatusBar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPaneFontSize;
    private javax.swing.JScrollPane jScrollPaneFontStyle;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldSelectFont;
    private javax.swing.JTextField jTextFieldStatus;
    // End of variables declaration//GEN-END:variables
}
