import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.StyleConstants;
public class CurrencyConverter extends javax.swing.JFrame {
double US_Dollar = 1.31,Nigerian_Naira = 476.57,Brazilian_Real = 5.47,Canadian_Dollar = 1.71,Indonesian_Rupiah = 19554.94, Indian_Rupee = 95.21,Philippine_Pisco = 71.17,Pakistani_Rupee = 162.74;
String[] currencyUnits = {"Units","US Dollar","Nigerian Naira","Brazilian Real","Canadian Dollar","Indonesian Rupiah","Indian Rupee","Philippine Pisco","Paskistani Rupee"};
    public CurrencyConverter() {
        initComponents(); }

    @SuppressWarnings("checked")  

private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        firstCountry = new javax.swing.JComboBox<>();
        secondCountry = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton1.setBackground(Color.green);
        jButton2 = new javax.swing.JButton();
        jButton2.setBackground(Color.green);
        jButton3 = new javax.swing.JButton();
        jButton3.setBackground(Color.green);
        secondCurrencyUnit = new javax.swing.JLabel();
        firstCurrencyUnit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.BLUE);
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 0, 0), 50));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("--- CURRENCY CONVERTER---");
        
        

        firstCountry.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        firstCountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose One...", "INDIA", "NIGERIA", "BRAZIL", "CANADA", "INDONESIA", "USA", "PHILLIPINE", "PAKISTAN" }));
        firstCountry.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                firstCountryItemStateChanged(evt);} });
        firstCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstCountryActionPerformed(evt);} });

        secondCountry.setFont(new java.awt.Font("Times New Roman", 1, 18));
        secondCountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose One...", "INDIA", "NIGERIA", "BRAZIL", "CANADA", "INDONESIA", "USA", "PHILLIPINE", "PAKISTAN" }));
        secondCountry.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                secondCountryItemStateChanged(evt);}});
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 16));
        jLabel2.setText("From currency Of");
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 16));
        jLabel3.setText("To currency Of");
        t1.setFont(new java.awt.Font("Times New Roman", 1, 18));
        t2.setFont(new java.awt.Font("Times New Roman", 1, 18));
        jButton1.setFont(new java.awt.Font("TTimes New Roman", 1, 18));
        jButton1.setText("Convert Currency");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {jButton1ActionPerformed(evt); }});

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18));
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt); } });

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18));
        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);}});

        secondCurrencyUnit.setFont(new java.awt.Font("Times New Roman", 1, 16));
        secondCurrencyUnit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        secondCurrencyUnit.setText("units");
        firstCurrencyUnit.setFont(new java.awt.Font("Times New Roman", 1, 16));
        firstCurrencyUnit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        firstCurrencyUnit.setText("units");
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jLabel1).addGap(290, 290, 290)).addGroup(jPanel1Layout.createSequentialGroup().addGap(93, 93, 93).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jButton1).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(firstCountry, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(t1) .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(firstCurrencyUnit, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE))).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(81, 81, 81).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(jLabel3).addComponent(secondCountry, 0, 272, Short.MAX_VALUE).addComponent(t2)).addComponent(secondCurrencyUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))).addGroup(jPanel1Layout.createSequentialGroup().addGap(11, 11, 11).addComponent(jButton2).addGap(94, 94, 94).addComponent(jButton3))).addContainerGap(114, Short.MAX_VALUE)));
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap().addComponent(jLabel1).addGap(28, 28, 28).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jLabel2).addComponent(jLabel3)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
            .addComponent(firstCountry, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE).addComponent(secondCountry)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
            .addComponent(t1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE).addComponent(t2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(secondCurrencyUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addComponent(firstCurrencyUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18))).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jButton1).addComponent(jButton2).addComponent(jButton3)).addContainerGap(57, Short.MAX_VALUE)));
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap()));
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)) );
        pack();
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) { 
    
        System.exit(0);
        
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        
        firstCountry.setSelectedIndex(0);
        secondCountry.setSelectedIndex(0);
        t1.setText("");
        t2.setText("");}
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)
     { double amountToChange=Double.parseDouble(t1.getText());
        double amountChanged=0.0;
        double amountInPounds=0.0;
      switch(firstCountry.getSelectedItem().toString())
        {
            case "USA": amountInPounds = amountToChange/US_Dollar;
            break;
            case "NIGERIA":amountInPounds = amountToChange/Nigerian_Naira;
            break;
            case "BRAZIL":amountInPounds = amountToChange/Brazilian_Real;
            break;
            case "CANADA":amountInPounds = amountToChange/Canadian_Dollar;
            break;
            case "INDONESIA":amountInPounds = amountToChange/Indonesian_Rupiah;
            break;
            case "INDIA":amountInPounds = amountToChange/Indian_Rupee;
            break;
            case "PHILLI[INE]":amountInPounds = amountToChange/Philippine_Pisco;
            break;
            case "PAKISTAN":amountInPounds = amountToChange/Pakistani_Rupee;
            break;
	default:amountInPounds = 0.0; }
        
        switch(secondCountry.getSelectedItem().toString())
            {
                case "USA":amountChanged = amountInPounds * US_Dollar;
                break;
                case "NIGERIA":amountChanged = amountInPounds * Nigerian_Naira;
                break;
                case "BRAZIL":amountChanged = amountInPounds * Brazilian_Real;
                break;
                case "CANADA":amountChanged = amountInPounds * Canadian_Dollar;
                break;
                case "INDONESIA":amountChanged = amountInPounds * Indonesian_Rupiah;
                break;
                case "INDIA":amountChanged = amountInPounds * Indian_Rupee;
                break;
                case "PHILLIPINE":amountChanged = amountInPounds * Philippine_Pisco;
                break;
                case "PAKISTAN":amountChanged = amountInPounds * Pakistani_Rupee;
                break;
	default:amountChanged = amountInPounds * 0.0;
        }
        String value = String.format("%.2f",amountChanged);
        t2.setText(value);
    }

    private void firstCountryActionPerformed(java.awt.event.ActionEvent evt) {}

    private void firstCountryItemStateChanged(java.awt.event.ItemEvent evt) {
        firstCurrencyUnit.setText(currencyUnits[firstCountry.getSelectedIndex()]);}

    private void secondCountryItemStateChanged(java.awt.event.ItemEvent evt) {
        secondCurrencyUnit.setText(currencyUnits[secondCountry.getSelectedIndex()]);}

       public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } 
        catch (ClassNotFoundException ex) {java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);} 
        catch (InstantiationException ex) {java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);} 
        catch (IllegalAccessException ex) {java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);} 
        catch (javax.swing.UnsupportedLookAndFeelException ex) {java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);}
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CurrencyConverter().setVisible(true);
            }
        });
    }
    private javax.swing.JComboBox<String> firstCountry;
    private javax.swing.JLabel firstCurrencyUnit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> secondCountry;
    private javax.swing.JLabel secondCurrencyUnit;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
}