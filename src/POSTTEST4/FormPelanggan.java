/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POSTTEST4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author user
 */
public class FormPelanggan extends javax.swing.JFrame {
java.util.Date sekarang = new java.util.Date();
private SimpleDateFormat smpdtfmt = new SimpleDateFormat("dd MM yyyy", Locale.getDefault());
//diatas adalah pengaturan format penulisan, bisa diubah sesuai keinginan.
private String tanggal = smpdtfmt.format(sekarang);
    private Object ubah;

    /**
     * Creates new form FormPelanggan
     */
    public FormPelanggan() {
        initComponents();
        lbltanggal.setText(tanggal);
        setJam();
    }
public final void setJam(){
ActionListener taskPerformer = new ActionListener() {
        @Override
public void actionPerformed(ActionEvent evt) {
String nol_jam = "", nol_menit = "",nol_detik = "";

java.util.Date dateTime = new java.util.Date();
int nilai_jam = dateTime.getHours();
int nilai_menit = dateTime.getMinutes();
int nilai_detik = dateTime.getSeconds();

if(nilai_jam <= 9) nol_jam= "0";
if(nilai_menit <= 9) nol_menit= "0";
if(nilai_detik <= 9) nol_detik= "0";

String jam = nol_jam + Integer.toString(nilai_jam);
String menit = nol_menit + Integer.toString(nilai_menit);
String detik = nol_detik + Integer.toString(nilai_detik);

lblwaktu.setText(jam+":"+menit+":"+detik+"");
        }
        };
new Timer(1000, taskPerformer).start();
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txttelp = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtberat = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        sliderdiskon = new javax.swing.JSlider();
        jLabel6 = new javax.swing.JLabel();
        regular = new javax.swing.JRadioButton();
        express = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        setting = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        btnproses = new javax.swing.JButton();
        btnulangi = new javax.swing.JButton();
        btnkeluar = new javax.swing.JButton();
        lbltanggal = new javax.swing.JLabel();
        lblwaktu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel8.setText("Form Pelanggan");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Nama");

        txtnama.setBackground(new java.awt.Color(204, 255, 255));
        txtnama.setText("jTextField1");
        txtnama.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtnamaCaretUpdate(evt);
            }
        });
        txtnama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnamaKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("No. Telepon");

        txttelp.setBackground(new java.awt.Color(204, 255, 255));
        txttelp.setText("jTextField2");
        txttelp.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txttelpCaretUpdate(evt);
            }
        });
        txttelp.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                txttelpMouseMoved(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Berat Barang");

        txtberat.setBackground(new java.awt.Color(204, 255, 255));
        txtberat.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtberatCaretUpdate(evt);
            }
        });
        txtberat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtberatKeyReleased(evt);
            }
        });

        jLabel4.setText("Kg");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnama)
                    .addComponent(txttelp)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtberat, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3))
                        .addGap(0, 116, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txttelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtberat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Atur Diskon");

        sliderdiskon.setMajorTickSpacing(10);
        sliderdiskon.setPaintLabels(true);
        sliderdiskon.setPaintTicks(true);
        sliderdiskon.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderdiskonStateChanged(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Jenis Jasa");

        buttonGroup1.add(regular);
        regular.setText("Reguler");

        buttonGroup1.add(express);
        express.setText("Express");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Total Harga");

        setting.setText("90%");

        txttotal.setBackground(new java.awt.Color(204, 255, 255));
        txttotal.setText("jTextField4");
        txttotal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(regular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(express))
                    .addComponent(jLabel7)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(sliderdiskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(setting, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sliderdiskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(setting)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regular)
                    .addComponent(express))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnproses.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnproses.setText("Proses");
        btnproses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprosesActionPerformed(evt);
            }
        });

        btnulangi.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnulangi.setText("Ulangi");
        btnulangi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnulangiActionPerformed(evt);
            }
        });

        btnkeluar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnkeluar.setText("Keluar");
        btnkeluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnkeluarMouseClicked(evt);
            }
        });

        lbltanggal.setText("tgl");

        lblwaktu.setText("waktu");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbltanggal)
                .addGap(37, 37, 37)
                .addComponent(lblwaktu)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnproses)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnulangi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnkeluar))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnproses)
                    .addComponent(btnulangi)
                    .addComponent(btnkeluar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltanggal)
                    .addComponent(lblwaktu, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
String Nama,No_telp,Jenis;
int slider;
Float Total,Bayar,DiskonTotal;
    private void btnprosesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprosesActionPerformed
        Nama= txtnama.getText();
        No_telp=txttelp.getText();
        slider=sliderdiskon.getValue();
        
        if (regular.isSelected()) {
            Jenis= this.regular.getText();
            DiskonTotal =Float.valueOf(sliderdiskon.getValue());
            Total = 11500*(Float.valueOf(txtberat.getText()))-((DiskonTotal/100)*11500);
            Bayar = Total;
        }
        else if (express.isSelected()) {

            Jenis= this.express.getText();
            DiskonTotal =Float.valueOf(sliderdiskon.getValue());
            Total = 11500*(Float.valueOf(txtberat.getText()))-((DiskonTotal/100)*11500);
            Bayar = (Total*1.5F);
        }
        txttotal.setText("Rp  " +Bayar);
    }//GEN-LAST:event_btnprosesActionPerformed

    private void btnkeluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnkeluarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnkeluarMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        txtnama.setText("");
        txttelp.setText("");
        txtberat.setText("");
        sliderdiskon.setValue(0);
        txttotal.setText("");
    }//GEN-LAST:event_formWindowOpened

    private void txtnamaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtnamaCaretUpdate
        if(txtnama.getText().length()==0 && txtnama.getText().equals("0")){
            btnproses.setEnabled(false);
        }
        else if(txtnama.getText().length() !=0 && txttelp.getText().length() !=0 && txtberat.getText().length()!=0){
            btnproses.setEnabled(true);
        }
    }//GEN-LAST:event_txtnamaCaretUpdate

    private void txttelpCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txttelpCaretUpdate
        if (txttelp.getText().length()==0 && txttelp.getText().equals("0")){
            btnproses.setEnabled(false);
        }
        else if (txttelp.getText().length() !=0 && txtnama.getText().length() !=0 && txtberat.getText().length() !=0){
            btnproses.setEnabled(true);
        }
    }//GEN-LAST:event_txttelpCaretUpdate

    private void txtberatCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtberatCaretUpdate
        if(txtberat.getText().length() ==0 || txtberat.getText().equals("0") ){
            btnproses.setEnabled(false);    
        }
        else if(txtberat.getText().length() !=0 && txtnama.getText().length() !=0 && txttelp.getText().length() !=0){
            btnproses.setEnabled(true);
    }//GEN-LAST:event_txtberatCaretUpdate
    }
    private void sliderdiskonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderdiskonStateChanged
        setting.setText(String.valueOf(sliderdiskon.getValue())+"%");
    }//GEN-LAST:event_sliderdiskonStateChanged

    private void btnulangiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnulangiActionPerformed
        txtnama.setText("");
        txttelp.setText("");
        txtberat.setText("");
        buttonGroup1.clearSelection();
        sliderdiskon.setValue(0);
        txttotal.setText("");
        
    }//GEN-LAST:event_btnulangiActionPerformed

    private void txtberatKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtberatKeyReleased
//        String berat = txtberat.getText();
//        if(berat.length()!=0){
//            JOptionPane.showMessageDialog(rootPane, "Berat tidak boleh kurang dari 1 kg");
//            txtberat.setText("");
//        }
    }//GEN-LAST:event_txtberatKeyReleased

    private void txttelpMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txttelpMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelpMouseMoved

    private void txtnamaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnamaKeyPressed
        if (evt.getKeyCode() ==evt.VK_ENTER)
        {
        if (txtnama.getText().length()== 0)
        {
            JOptionPane.showMessageDialog(null,"Nama Tidak Boleh Kosong Yaaa","Konfirmasi",JOptionPane.INFORMATION_MESSAGE);
            txtnama.requestFocus();
            return;
        }
            btnproses.requestFocus();
            
        }
    }//GEN-LAST:event_txtnamaKeyPressed
       
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
            java.util.logging.Logger.getLogger(FormPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPelanggan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnkeluar;
    private javax.swing.JButton btnproses;
    private javax.swing.JButton btnulangi;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton express;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbltanggal;
    private javax.swing.JLabel lblwaktu;
    private javax.swing.JRadioButton regular;
    private javax.swing.JLabel setting;
    private javax.swing.JSlider sliderdiskon;
    private javax.swing.JTextField txtberat;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txttelp;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables

   // private void setJam() {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  //  }

    private String Uang() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
