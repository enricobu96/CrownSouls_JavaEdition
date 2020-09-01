package com.crownsoulsJE;

import javax.swing.*;

public class MainWindow extends JDialog {
  private JPanel contentPane;
  private JTabbedPane tabbedPane1;
  private JButton buttonOK;

  public MainWindow() {
    setContentPane(contentPane);
    setModal(true);
    getRootPane().setDefaultButton(buttonOK);
  }

  public static void main(String[] args) {
    MainWindow dialog = new MainWindow();
    dialog.pack();
    dialog.setVisible(true);
    System.exit(0);
  }
}
