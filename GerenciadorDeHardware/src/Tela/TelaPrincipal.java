package Tela;

import java.awt.Desktop;

public class TelaPrincipal extends javax.swing.JFrame {
    
    public TelaPrincipal() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        Lab = new javax.swing.JMenu();
        SubMenuLabs = new javax.swing.JMenuItem();
        ManutencaoMenu = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        MenuPeca = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        menuEqui = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 748, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 422, Short.MAX_VALUE)
        );

        Lab.setText("Ver laboratorios");

        SubMenuLabs.setText("Labs");
        SubMenuLabs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuLabsActionPerformed(evt);
            }
        });
        Lab.add(SubMenuLabs);

        jMenuBar1.add(Lab);

        ManutencaoMenu.setText("Manutenção");
        ManutencaoMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManutencaoMenuMouseClicked(evt);
            }
        });

        jMenuItem5.setText("Manutenção");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        ManutencaoMenu.add(jMenuItem5);

        jMenuItem1.setText("Manutenção de peças");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        ManutencaoMenu.add(jMenuItem1);

        jMenuBar1.add(ManutencaoMenu);

        MenuPeca.setText("Ver peças");
        MenuPeca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuPecaMouseClicked(evt);
            }
        });

        jMenuItem3.setText("Peças");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        MenuPeca.add(jMenuItem3);

        jMenuBar1.add(MenuPeca);

        menuEqui.setText("Equipamentos");
        menuEqui.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuEquiMouseClicked(evt);
            }
        });

        jMenuItem4.setText("Maquinas");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        menuEqui.add(jMenuItem4);

        jMenuBar1.add(menuEqui);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Desktop)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Desktop)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ManutencaoMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManutencaoMenuMouseClicked
        
    }//GEN-LAST:event_ManutencaoMenuMouseClicked

    private void MenuPecaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuPecaMouseClicked
        
    }//GEN-LAST:event_MenuPecaMouseClicked

    private void menuEquiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuEquiMouseClicked
        
    }//GEN-LAST:event_menuEquiMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        TelaManutencaoPecas tManutencaoPecas = new TelaManutencaoPecas();
        tManutencaoPecas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void SubMenuLabsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuLabsActionPerformed
        TelaLabs tLabs = new TelaLabs();
        tLabs.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_SubMenuLabsActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        TelaPeca tPeca = new TelaPeca();
        tPeca.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        TelaManutenção tManutencao = new TelaManutenção();
        tManutencao.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        TelaMaquina tMaquina = new TelaMaquina();
        tMaquina.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Desktop;
    public static javax.swing.JMenu Lab;
    private javax.swing.JMenu ManutencaoMenu;
    private javax.swing.JMenu MenuPeca;
    public static javax.swing.JMenuItem SubMenuLabs;
    private javax.swing.JMenuBar jMenuBar1;
    public static javax.swing.JMenuItem jMenuItem1;
    public static javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    public static javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenu menuEqui;
    // End of variables declaration//GEN-END:variables
}
