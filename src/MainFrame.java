package com.devproductions.dev.devpad;

import javax.swing.*;
import java.nio.file.Paths;
import java.awt.Font;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.Desktop;
import java.net.URI;
import java.io.*;
import java.nio.file.Files;

/**
 *
 * @author deV (github.com/dev7060)
 */
public class MainFrame extends javax.swing.JFrame {

    private boolean open = false;
    private String globalname = "";
    static boolean ww = false;
    MainFrame obj;

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jMenu6 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem11 = new javax.swing.JMenuItem();

        jMenu6.setText("jMenu6");

        jMenuItem6.setText("jMenuItem6");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jMenu2.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("New");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setText("Open...");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setText("Save");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Save As...");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);
        jMenu2.add(jSeparator1);

        jMenuItem9.setText("Page Setup...");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem5.setText("Print...");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);
        jMenu2.add(jSeparator2);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem7.setText("Exit");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Edit");

        jMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem12.setText("Undo");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem12);
        jMenu1.add(jSeparator4);

        jMenuItem14.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem14.setText("Cut");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem14);

        jMenuItem15.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem15.setText("Copy");
        jMenu1.add(jMenuItem15);

        jMenuItem17.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem17.setText("Paste");
        jMenu1.add(jMenuItem17);

        jMenuItem16.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        jMenuItem16.setText("Delete");
        jMenu1.add(jMenuItem16);
        jMenu1.add(jSeparator5);

        jMenuItem18.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem18.setText("Find...");
        jMenu1.add(jMenuItem18);

        jMenuItem19.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jMenuItem19.setText("Find Next");
        jMenu1.add(jMenuItem19);

        jMenuItem20.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem20.setText("Replace...");
        jMenu1.add(jMenuItem20);

        jMenuItem21.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem21.setText("Go To...");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem21);
        jMenu1.add(jSeparator6);

        jMenuItem22.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem22.setText("Select All...");
        jMenu1.add(jMenuItem22);

        jMenuItem23.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jMenuItem23.setText("Time/Date");
        jMenu1.add(jMenuItem23);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Format");

        jRadioButtonMenuItem1.setText("Word Wrap");
        jRadioButtonMenuItem1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButtonMenuItem1StateChanged(evt);
            }
        });
        jRadioButtonMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jRadioButtonMenuItem1);

        jMenuItem13.setText("Font...");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem13);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("View");

        jMenuItem8.setText("Status Bar");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);
        jMenuItem8.setEnabled(false);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Help");

        jMenuItem10.setText("View Help");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem10);
        jMenu5.add(jSeparator3);

        jMenuItem11.setText("About");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem11);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        new MainFrame().setVisible(true);
    }                                          

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        if (open == false && !(jTextArea1.getText().equals(""))) {
            int ch = JOptionPane.showInternalConfirmDialog(null, "Do you want to save changes?", "deVpad", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
            if (ch == 0) {
                //yes
                JFileChooser fileChooser = new JFileChooser();
                int option = fileChooser.showSaveDialog(this);
                if (option == JFileChooser.APPROVE_OPTION) {
                    //File file = fileChooser.getSelectedFile();
                    //this.setText("File Saved as: " + file.getName());

                    //FileUtils.writeStringToFile(new File(fileChooser.getSelectedFile().getAbsolutePath()), jTextArea1.getText());
                    try {

                        PrintWriter out = new PrintWriter(fileChooser.getSelectedFile().getAbsolutePath());
                        globalname = fileChooser.getSelectedFile().getAbsolutePath();
                        //System.out.println(jTextArea1.getText());
                        //out.println(jTextArea1.getText());

                        for (String line : jTextArea1.getText().split("\\n")) {
                            out.println(line);
                        }
                        out.close();
                    } catch (Exception e) {
                        System.out.println("error 2");
                    }
                } else {
                    //label.setText("Save command canceled");
                }
                jTextArea1.setText("");
                open = true;
                JFileChooser chooser = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter("TxT", "txt");
                chooser.setFileFilter(filter);
                int returnVal = chooser.showOpenDialog(this);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    //System.out.println("You chose to open this file: " +
                    //       chooser.getSelectedFile().getAbsolutePath());
                    try {
                        /*
                BufferedReader br = new BufferedReader(new FileReader(chooser.getSelectedFile().getAbsolutePath()));
                String line;
                String whole="";
                while ((line = br.readLine()) != null) {
                     System.out.println(line);
                     whole+=line;
                }
                         */
                        String content = Files.readString(java.nio.file.Paths.get(chooser.getSelectedFile().getAbsolutePath()), java.nio.charset.StandardCharsets.US_ASCII);
                        jTextArea1.setText(content);
                        globalname = chooser.getSelectedFile().getAbsolutePath();
                    } catch (Exception e) {
                        System.out.println("error");
                    }
                }

            } else if (ch == 1) {
                jTextArea1.setText("");
                open = true;
                JFileChooser chooser = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter("TxT", "txt");
                chooser.setFileFilter(filter);
                int returnVal = chooser.showOpenDialog(this);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    //System.out.println("You chose to open this file: " +
                    //       chooser.getSelectedFile().getAbsolutePath());
                    try {
                        /*
                BufferedReader br = new BufferedReader(new FileReader(chooser.getSelectedFile().getAbsolutePath()));
                String line;
                String whole="";
                while ((line = br.readLine()) != null) {
                     System.out.println(line);
                     whole+=line;
                }
                         */
                        String content = Files.readString(java.nio.file.Paths.get(chooser.getSelectedFile().getAbsolutePath()), java.nio.charset.StandardCharsets.US_ASCII);
                        jTextArea1.setText(content);
                        globalname = chooser.getSelectedFile().getAbsolutePath();
                    } catch (Exception e) {
                        System.out.println("error");
                    }
                }
            } else {

            }

        }
        if (open == true) {
            //read getText
            String text = jTextArea1.getText();
            String content = "";
            //read file
            try {
                content = Files.readString(Paths.get(globalname), java.nio.charset.StandardCharsets.US_ASCII);
            } catch (Exception e) {
                System.out.println("error");
            }
            if (!(text.equals(content))) {
                // System.out.println("not equal");
                //obj=this;
                int ch = JOptionPane.showInternalConfirmDialog(null, "Do you want to save changes to " + globalname + "?", "deVpad", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
                if (ch == 0) {
                    //yes    

                    try {
                        PrintWriter out = new PrintWriter(globalname);
                        //System.out.println(jTextArea1.getText());
                        //out.println(jTextArea1.getText());

                        for (String line : jTextArea1.getText().split("\\n")) {
                            out.println(line);
                        }
                        out.close();
                        jTextArea1.setText("");
                        //this.dispose();
                    } catch (Exception e) {
                        System.out.println("error");
                    }

                } else if (ch == 1) {

                }
            }
            jTextArea1.setText("");
            open = true;
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("TxT", "txt");
            chooser.setFileFilter(filter);
            int returnVal = chooser.showOpenDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                //System.out.println("You chose to open this file: " +
                //       chooser.getSelectedFile().getAbsolutePath());
                try {
                    /*
                BufferedReader br = new BufferedReader(new FileReader(chooser.getSelectedFile().getAbsolutePath()));
                String line;
                String whole="";
                while ((line = br.readLine()) != null) {
                     System.out.println(line);
                     whole+=line;
                }
                     */
                    String content2 = Files.readString(java.nio.file.Paths.get(chooser.getSelectedFile().getAbsolutePath()), java.nio.charset.StandardCharsets.US_ASCII);
                    jTextArea1.setText(content2);
                    globalname = chooser.getSelectedFile().getAbsolutePath();
                } catch (Exception e) {
                    System.out.println("error");
                }
            }
        }

        ////////////////////////////////////////////////////
        if (open == false) {
            jTextArea1.setText("");
            open = true;
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("TxT", "txt");
            chooser.setFileFilter(filter);
            int returnVal = chooser.showOpenDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                //System.out.println("You chose to open this file: " +
                //       chooser.getSelectedFile().getAbsolutePath());
                try {
                    /*
                BufferedReader br = new BufferedReader(new FileReader(chooser.getSelectedFile().getAbsolutePath()));
                String line;
                String whole="";
                while ((line = br.readLine()) != null) {
                     System.out.println(line);
                     whole+=line;
                }
                     */
                    String content = Files.readString(java.nio.file.Paths.get(chooser.getSelectedFile().getAbsolutePath()), java.nio.charset.StandardCharsets.US_ASCII);
                    jTextArea1.setText(content);
                    globalname = chooser.getSelectedFile().getAbsolutePath();
                } catch (Exception e) {
                    System.out.println("error");
                }
            }

        }

    }                                          

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        if (open == true) {
            try {
                PrintWriter out = new PrintWriter(globalname);
                //System.out.println(jTextArea1.getText());
                //out.println(jTextArea1.getText());

                for (String line : jTextArea1.getText().split("\\n")) {
                    out.println(line);
                }
                out.close();
            } catch (Exception e) {
                System.out.println("error");
            }

        } else {
            open = true;
            JFileChooser fileChooser = new JFileChooser();
            int option = fileChooser.showSaveDialog(this);
            if (option == JFileChooser.APPROVE_OPTION) {
                //File file = fileChooser.getSelectedFile();
                //this.setText("File Saved as: " + file.getName());

                //FileUtils.writeStringToFile(new File(fileChooser.getSelectedFile().getAbsolutePath()), jTextArea1.getText());
                try {

                    PrintWriter out = new PrintWriter(fileChooser.getSelectedFile().getAbsolutePath());
                    //System.out.println(jTextArea1.getText());
                    //out.println(jTextArea1.getText());
                    globalname = fileChooser.getSelectedFile().getAbsolutePath();
                    for (String line : jTextArea1.getText().split("\\n")) {
                        out.println(line);
                    }
                    out.close();
                } catch (Exception e) {
                    System.out.println("error 2");
                }
            } else {
                //label.setText("Save command canceled");
            }
        }
        if (open == false) {
            open = true;
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("TxT", "txt");
            chooser.setFileFilter(filter);
            int returnVal = chooser.showOpenDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                //System.out.println("You chose to open this file: " +
                //       chooser.getSelectedFile().getAbsolutePath());
                try {
                    /*
                BufferedReader br = new BufferedReader(new FileReader(chooser.getSelectedFile().getAbsolutePath()));
                String line;
                String whole="";
                while ((line = br.readLine()) != null) {
                     System.out.println(line);
                     whole+=line;
                }
                     */
                    String content = Files.readString(java.nio.file.Paths.get(chooser.getSelectedFile().getAbsolutePath()), java.nio.charset.StandardCharsets.US_ASCII);
                    jTextArea1.setText(content);
                    globalname = chooser.getSelectedFile().getAbsolutePath();
                } catch (Exception e) {
                    System.out.println("error");
                }
            }
        }
    }                                          

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        try {
            jTextArea1.print();
        } catch (Exception e) {
        }
    }                                          

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        try {
            Desktop.getDesktop().browse(new URI("https://github.com/dev7060"));
        } catch (Exception e) {
            System.out.println("Exception caught!");
        }


    }                                           

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Programmed by deV (github.com/dev7060)", "About", JOptionPane.INFORMATION_MESSAGE, null);
    }                                           

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        new MenuFont(this).setVisible(true);
    }                                           

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        int option = fileChooser.showSaveDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            //File file = fileChooser.getSelectedFile();
            //this.setText("File Saved as: " + file.getName());

            //FileUtils.writeStringToFile(new File(fileChooser.getSelectedFile().getAbsolutePath()), jTextArea1.getText());
            try {

                PrintWriter out = new PrintWriter(fileChooser.getSelectedFile().getAbsolutePath());
                globalname = fileChooser.getSelectedFile().getAbsolutePath();
                //System.out.println(jTextArea1.getText());
                //out.println(jTextArea1.getText());

                for (String line : jTextArea1.getText().split("\\n")) {
                    out.println(line);
                }
                out.close();
            } catch (Exception e) {
                System.out.println("error 2");
            }
        } else {
            //label.setText("Save command canceled");
        }
    }                                          

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        if (open == false && jTextArea1.getText().equals("")) {
            this.dispose();
        }
        if (open == true && !(globalname.equals(""))) {
            //read getText
            String text = jTextArea1.getText();
            String content = "";
            //read file
            try {
                content = Files.readString(Paths.get(globalname), java.nio.charset.StandardCharsets.US_ASCII);
            } catch (Exception e) {
                System.out.println("error");
            }
            if (!(text.equals(content))) {
                // System.out.println("not equal");
                //obj=this;
                int ch = JOptionPane.showInternalConfirmDialog(null, "Do you want to save changes to " + globalname + "?", "deVpad", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
                if (ch == 0) {
                    //yes    

                    try {
                        PrintWriter out = new PrintWriter(globalname);
                        //System.out.println(jTextArea1.getText());
                        //out.println(jTextArea1.getText());

                        for (String line : jTextArea1.getText().split("\\n")) {
                            out.println(line);
                        }
                        out.close();
                        this.dispose();
                    } catch (Exception e) {
                        System.out.println("error");
                    }

                } else if (ch == 1) {
                    this.dispose();
                } else {
                }
            }

            //if not equal, alert box
        }
        if (open == false && !(jTextArea1.getText().equals(""))) {
            int ch = JOptionPane.showInternalConfirmDialog(null, "Do you want to save changes?", "deVpad", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
            if (ch == 0) {
                //yes    
                JFileChooser fileChooser = new JFileChooser();
                int option = fileChooser.showSaveDialog(this);
                if (option == JFileChooser.APPROVE_OPTION) {
                    //File file = fileChooser.getSelectedFile();
                    //this.setText("File Saved as: " + file.getName());

                    //FileUtils.writeStringToFile(new File(fileChooser.getSelectedFile().getAbsolutePath()), jTextArea1.getText());
                    try {

                        PrintWriter out = new PrintWriter(fileChooser.getSelectedFile().getAbsolutePath());
                        globalname = fileChooser.getSelectedFile().getAbsolutePath();
                        //System.out.println(jTextArea1.getText());
                        //out.println(jTextArea1.getText());

                        for (String line : jTextArea1.getText().split("\\n")) {
                            out.println(line);
                        }
                        out.close();
                    } catch (Exception e) {
                        System.out.println("error 2");
                    }
                    this.dispose();
                } else {
                    //label.setText("Save command canceled");
                }

            } else if (ch == 1) {
                this.dispose();
            } else {
            }
            // this.dispose();
        }
    }                                          

    private void jRadioButtonMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        // TODO add your handling code here:
        if (ww == false) {
            jTextArea1.setLineWrap(true);
            ww = true;
        } else {
            ww = false;
            jTextArea1.setLineWrap(false);
        }

    }                                                     

    private void jRadioButtonMenuItem1StateChanged(javax.swing.event.ChangeEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
        //new MainFrame().setVisible(true);
    }
//    public void fontChanger(String font, int val ){
//        jTextArea1.setFont(new Font(font, Font.BOLD, val));
//    }

    public JTextArea getTextAreaObj() {
        return this.jTextArea1;
    }                  
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration                   
}
