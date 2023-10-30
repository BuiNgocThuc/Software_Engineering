/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import BUS.TaiKhoanBUS;
import Util.sharedFunction;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author NGOC THUC
 */
public class DangNhapGUI extends javax.swing.JFrame {

    /**
     * Creates new form DangNhapGUI
     */
    private int mouseX, mouseY;

    public DangNhapGUI() {
        initComponents();

        sharedFunction.moveLayout(this, jPanelOverview);
        setResizable(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        addPlaceholderStyle(txtUsername, "Username");
        addPlaceholderStyle(txtPassword, "Password");
    }

    public JPasswordField getTxtPassword() {
        return txtPassword;
    }

    public void setTxtPassword(JPasswordField txtPassword) {
        this.txtPassword = txtPassword;
    }

    public JTextField getTxtUsername() {
        return txtUsername;
    }

    public void setTxtUsername(JTextField txtUsername) {
        this.txtUsername = txtUsername;
    }

    public void moveLayout() {

        jPanelOverview.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                mouseX = e.getX();
                mouseY = e.getY();
            }
        });

        jPanelOverview.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                int x = e.getXOnScreen();
                int y = e.getYOnScreen();
                setLocation(x - mouseX, y - mouseY);
            }
        });
    }

    private void addPlaceholderStyle(JTextField textField, String name) {
        Font customFont = new Font("Tahoma", Font.BOLD, 16);
        textField.setFont(customFont);
        textField.setForeground(new Color(157, 185, 223));
        textField.setText(name);
    }

    public void removePlaceholderStyle(JTextField textFiled) {
        textFiled.setForeground(Color.black);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelOverview = new javax.swing.JPanel();
        jPanelDangNhap = new javax.swing.JPanel();
        jLabelLogo = new javax.swing.JLabel();
        jLabelDangNhap = new javax.swing.JLabel();
        jButtonCancel = new javax.swing.JButton();
        BTNdangNhap = new Components.ButtonRadius();
        jpanelUsername = new Components.Jpanel();
        txtUsername = new javax.swing.JTextField();
        jLabelUsername1 = new javax.swing.JLabel();
        jpanelPassword = new Components.Jpanel();
        jLabelUsername2 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        eyePassword = new javax.swing.JButton();
        jPanelPoster = new javax.swing.JPanel();
        jLabelPoster = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanelOverview.setBackground(new java.awt.Color(159, 189, 226));
        jPanelOverview.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelOverview.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanelOverviewMouseDragged(evt);
            }
        });
        jPanelOverview.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelOverviewMousePressed(evt);
            }
        });

        jPanelDangNhap.setBackground(new java.awt.Color(255, 255, 255));

        jLabelLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/logo/login_logo.png"))); // NOI18N

        jLabelDangNhap.setFont(new java.awt.Font("Josefin Sans SemiBold", 1, 24)); // NOI18N
        jLabelDangNhap.setForeground(new java.awt.Color(134, 172, 218));
        jLabelDangNhap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDangNhap.setText("Đăng nhập");

        jButtonCancel.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icon_24px/cancel.png"))); // NOI18N
        jButtonCancel.setBorder(null);
        jButtonCancel.setBorderPainted(false);
        jButtonCancel.setContentAreaFilled(false);
        jButtonCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonCancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonCancelMouseExited(evt);
            }
        });
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        BTNdangNhap.setBackground(new java.awt.Color(251, 233, 189));
        BTNdangNhap.setBorder(null);
        BTNdangNhap.setForeground(new java.awt.Color(152, 179, 214));
        BTNdangNhap.setText("Đăng nhập ");
        BTNdangNhap.setFont(new java.awt.Font("Josefin Sans SemiBold", 0, 18)); // NOI18N
        BTNdangNhap.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTNdangNhap.setMargin(new java.awt.Insets(2, 0, 8, 0));
        BTNdangNhap.setPreferredSize(new java.awt.Dimension(124, 35));
        BTNdangNhap.setRadius(40);
        BTNdangNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTNdangNhapMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTNdangNhapMouseExited(evt);
            }
        });
        BTNdangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNdangNhapActionPerformed(evt);
            }
        });

        jpanelUsername.setBackground(new java.awt.Color(243, 243, 244));
        jpanelUsername.setPreferredSize(new java.awt.Dimension(208, 37));
        jpanelUsername.setRoundBottomLeft(40);
        jpanelUsername.setRoundBottomRight(40);
        jpanelUsername.setRoundTopLeft(40);
        jpanelUsername.setRoundTopRight(40);

        txtUsername.setBackground(new java.awt.Color(243, 243, 244));
        txtUsername.setFont(new java.awt.Font("Josefin Sans SemiBold", 1, 16)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(149, 181, 221));
        txtUsername.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtUsername.setText("Username");
        txtUsername.setBorder(null);
        txtUsername.setPreferredSize(new java.awt.Dimension(65, 20));
        txtUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsernameFocusLost(evt);
            }
        });
        txtUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUsernameMouseClicked(evt);
            }
        });
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        jLabelUsername1.setBackground(new java.awt.Color(243, 243, 244));
        jLabelUsername1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelUsername1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icon_24px/username.png"))); // NOI18N
        jLabelUsername1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jpanelUsernameLayout = new javax.swing.GroupLayout(jpanelUsername);
        jpanelUsername.setLayout(jpanelUsernameLayout);
        jpanelUsernameLayout.setHorizontalGroup(
            jpanelUsernameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelUsernameLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabelUsername1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jpanelUsernameLayout.setVerticalGroup(
            jpanelUsernameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelUsername1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpanelUsernameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpanelPassword.setBackground(new java.awt.Color(243, 243, 244));
        jpanelPassword.setPreferredSize(new java.awt.Dimension(208, 37));
        jpanelPassword.setRoundBottomLeft(40);
        jpanelPassword.setRoundBottomRight(40);
        jpanelPassword.setRoundTopLeft(40);
        jpanelPassword.setRoundTopRight(40);
        jpanelPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jpanelPasswordFocusLost(evt);
            }
        });

        jLabelUsername2.setBackground(new java.awt.Color(243, 243, 244));
        jLabelUsername2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelUsername2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icon_24px/password.png"))); // NOI18N
        jLabelUsername2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtPassword.setBackground(new java.awt.Color(243, 243, 244));
        txtPassword.setFont(new java.awt.Font("Josefin Sans SemiBold", 0, 16)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(149, 181, 221));
        txtPassword.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPassword.setText("Password");
        txtPassword.setBorder(null);
        txtPassword.setEchoChar('\u0000');
        txtPassword.setPreferredSize(new java.awt.Dimension(65, 20));
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordFocusLost(evt);
            }
        });

        eyePassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icon_24px/eye_open.png"))); // NOI18N
        eyePassword.setBorder(null);
        eyePassword.setContentAreaFilled(false);
        eyePassword.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        eyePassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eyePasswordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eyePasswordMouseExited(evt);
            }
        });
        eyePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eyePasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelPasswordLayout = new javax.swing.GroupLayout(jpanelPassword);
        jpanelPassword.setLayout(jpanelPasswordLayout);
        jpanelPasswordLayout.setHorizontalGroup(
            jpanelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelPasswordLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabelUsername2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(eyePassword, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpanelPasswordLayout.setVerticalGroup(
            jpanelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelUsername2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(eyePassword, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addGroup(jpanelPasswordLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelDangNhapLayout = new javax.swing.GroupLayout(jPanelDangNhap);
        jPanelDangNhap.setLayout(jPanelDangNhapLayout);
        jPanelDangNhapLayout.setHorizontalGroup(
            jPanelDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDangNhapLayout.createSequentialGroup()
                .addGroup(jPanelDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelDangNhapLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelDangNhapLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonCancel))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelDangNhapLayout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabelDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(77, 77, 77))
            .addGroup(jPanelDangNhapLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanelDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpanelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpanelUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDangNhapLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BTNdangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
        );
        jPanelDangNhapLayout.setVerticalGroup(
            jPanelDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDangNhapLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonCancel)
                .addGap(34, 34, 34)
                .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpanelUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jpanelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(BTNdangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jPanelPoster.setBackground(new java.awt.Color(255, 255, 255));

        jLabelPoster.setBackground(new java.awt.Color(255, 255, 255));
        jLabelPoster.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/poster/login_poster.png"))); // NOI18N

        javax.swing.GroupLayout jPanelPosterLayout = new javax.swing.GroupLayout(jPanelPoster);
        jPanelPoster.setLayout(jPanelPosterLayout);
        jPanelPosterLayout.setHorizontalGroup(
            jPanelPosterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPosterLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabelPoster, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanelPosterLayout.setVerticalGroup(
            jPanelPosterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelPoster, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelOverviewLayout = new javax.swing.GroupLayout(jPanelOverview);
        jPanelOverview.setLayout(jPanelOverviewLayout);
        jPanelOverviewLayout.setHorizontalGroup(
            jPanelOverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOverviewLayout.createSequentialGroup()
                .addComponent(jPanelDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPoster, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelOverviewLayout.setVerticalGroup(
            jPanelOverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPoster, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelDangNhap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelOverview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelOverview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void myBTN1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myBTN1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_myBTN1MouseClicked

    private void myBTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myBTN1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myBTN1ActionPerformed

    private void BTNdangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNdangNhapActionPerformed
        // TODO add your handling code here:
        String username = txtUsername.getText();
        String password = new String(txtPassword.getPassword());
        if (username.equals("Username") && password.equals("Password")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập thông tin tài khoản.");
        } else if (username.equals("Username")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập username.");
        } else if (password.equals("Password")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mật khẩu.");
        } else {
            new TaiKhoanBUS().DangNhap(DangNhapGUI.this);

        }
    }//GEN-LAST:event_BTNdangNhapActionPerformed

    private void txtUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusGained
        // TODO add your handling code here:
        if (txtUsername.getText().equals("Username")) {
            txtUsername.setText("");
            removePlaceholderStyle(txtUsername);
        }
    }//GEN-LAST:event_txtUsernameFocusGained

    private void txtUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusLost
        // TODO add your handling code here:
        if (txtUsername.getText().equals("")) {
            addPlaceholderStyle(txtUsername, "Username");
        }
    }//GEN-LAST:event_txtUsernameFocusLost

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void jpanelPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpanelPasswordFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jpanelPasswordFocusLost

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        // TODO add your handling code here:
        if (txtPassword.getText().equals("Password")) {
            txtPassword.setText("");
            txtPassword.requestFocus();
            txtPassword.setEchoChar('\u25CF');
            removePlaceholderStyle(txtPassword);
        }
    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        // TODO add your handling code here:
        if (txtPassword.getText().equals("")) {
            txtPassword.setEchoChar('\u0000');
            addPlaceholderStyle(txtPassword, "Password");
        }
    }//GEN-LAST:event_txtPasswordFocusLost

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void eyePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eyePasswordActionPerformed
        // TODO add your handling code here:
        String password = new String(txtPassword.getPassword());
        if (password.equals("Password") || password.equals("")) {
            // Nếu mật khẩu rỗng hoặc là "Password", không thay đổi EchoChar
        } else {
            if (txtPassword.getEchoChar() == 0) {
                txtPassword.setEchoChar('\u25CF'); // Hiển thị mật khẩu 
                eyePassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("./../Assets/icon_24px/eye_open.png")));
            } else {
                txtPassword.setEchoChar((char) 0); // Ẩn mật khẩu
                eyePassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("./../Assets/icon_24px/eye_close.png")));
            }
        }
    }//GEN-LAST:event_eyePasswordActionPerformed

    private void BTNdangNhapMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNdangNhapMouseEntered
        // TODO add your handling code here:
        BTNdangNhap.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_BTNdangNhapMouseEntered

    private void BTNdangNhapMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNdangNhapMouseExited
        // TODO add your handling code here:
        BTNdangNhap.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_BTNdangNhapMouseExited

    private void eyePasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eyePasswordMouseEntered
        // TODO add your handling code here:
        eyePassword.setCursor(new Cursor(Cursor.HAND_CURSOR));

    }//GEN-LAST:event_eyePasswordMouseEntered

    private void eyePasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eyePasswordMouseExited
        // TODO add your handling code here:
        eyePassword.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_eyePasswordMouseExited

    private void jButtonCancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelMouseEntered
        // TODO add your handling code here:
        jButtonCancel.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jButtonCancelMouseEntered

    private void jButtonCancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelMouseExited
        // TODO add your handling code here:
        jButtonCancel.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_jButtonCancelMouseExited

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:


    }//GEN-LAST:event_formMousePressed

    private void jPanelOverviewMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelOverviewMouseDragged
        // TODO add your handling code here:


    }//GEN-LAST:event_jPanelOverviewMouseDragged

    private void jPanelOverviewMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelOverviewMousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_jPanelOverviewMousePressed

    private void txtUsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsernameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameMouseClicked

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowGainedFocus

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
            java.util.logging.Logger.getLogger(DangNhapGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhapGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhapGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhapGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhapGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Components.ButtonRadius BTNdangNhap;
    private javax.swing.JButton eyePassword;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JLabel jLabelDangNhap;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelPoster;
    private javax.swing.JLabel jLabelUsername1;
    private javax.swing.JLabel jLabelUsername2;
    private javax.swing.JPanel jPanelDangNhap;
    private javax.swing.JPanel jPanelOverview;
    private javax.swing.JPanel jPanelPoster;
    private Components.Jpanel jpanelPassword;
    private Components.Jpanel jpanelUsername;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
